/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import java.util.Iterator;
import java.util.List;

import io.github.mmm.base.score.Score;
import io.github.mmm.text.search.NormalizedTextToken;
import io.github.mmm.text.search.PositionedTextToken;
import io.github.mmm.text.search.TextNormalizer;
import io.github.mmm.text.search.TextSearchDecomposer;
import io.github.mmm.text.search.TextTokenizer;
import io.github.mmm.text.search.hit.TextSearchHit;
import io.github.mmm.text.search.query.TextSearchQuery;
import io.github.mmm.text.search.spi.AbstractTextSearchEngine;

/**
 * Default in memory implementation of {@link AbstractTextSearchEngine}.
 *
 * @param <V> type of the values to index.
 * @param <P> type of the {@link TextSearchDecomposer#getProperties(Object) properties} of a value.
 */
public class TextSearchEngineMemory<V, P> extends AbstractTextSearchEngine<V, P> {

  private final IndexNode root;

  private final int treeWidth;

  private final int treeDepth;

  /**
   * The constructor.
   *
   * @param normalizer the {@link TextNormalizer}.
   * @param decomposer the {@link TextSearchDecomposer}.
   * @param tokenizer the {@link #getTokenizer() tokenizer}.
   * @param treeDepth the depth of the character tree. ATTENTION: Memory consumption grows exponentially with this value
   *        and is roughly {@code 4*(37^treeDepgth)} bytes so a value of {@code 4} leads to a maximum memory allocation
   *        of 7496644 bytes (~7.5 MB) when the tree is fully allocated. Reasonable values are 3 (low memory, slower
   *        infix searches), 4 (acceptable memory and infix searches), and 5 (high memory, fast infix searches). Please
   *        also consider that indexing is slightly slower with higher depth value.
   */
  public TextSearchEngineMemory(TextNormalizer normalizer, TextSearchDecomposer<V, P> decomposer,
      TextTokenizer tokenizer, int treeDepth) {

    super(normalizer, decomposer, tokenizer);
    this.treeDepth = treeDepth;
    this.treeWidth = normalizer.getMax() + 1;
    this.root = new IndexNode();
  }

  protected int hash(String normalizedWord) {

    int len = normalizedWord.length();
    int hash = 0;
    for (int i = 0; i < len; i++) {
      char c = normalizedWord.charAt(i);
      int code = this.normalizer.map(c);
      hash = hash * 31 + code;
    }
    hash = hash << 4;
    hash = hash | (len & 0xF);
    return hash;
  }

  @Override
  public boolean index(V value, Object id, String type, P property, String propertyName, Score propertyScore,
      String propertyText) {

    if (propertyText == null) {
      return false;
    }
    boolean added = false;
    Iterator<PositionedTextToken> tokenIterator = this.tokenizer.tokenize(propertyText);
    while (tokenIterator.hasNext()) {
      PositionedTextToken originalToken = tokenIterator.next();
      String originalWord = originalToken.get();
      String normalizedWord = this.normalizer.normalize(originalWord);
      int hash = hash(normalizedWord);
      NormalizedTextToken normalizedToken = new NormalizedTextTokenImpl(normalizedWord, hash);
      added |= insert(originalToken, normalizedToken);
    }
    return added;
  }

  private boolean insert(PositionedTextToken originalToken, NormalizedTextToken normalizedToken) {

    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean remove(Object id) {

    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Iterator<TextSearchHit> search(TextSearchQuery query) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Iterator<TextSearchHit> search(String query) {

    return null;
  }

  private class IndexHit extends TextSearchHitProperty {

    /** The full original text of {@code element}. */
    private final String text;

    /** The start {@link String#charAt(int) index} in {@code text}. */
    private final int start;

    private IndexHit(Object id, String type, Score score, String propertyName, String text, int start) {

      super(id, type, score, propertyName);
      this.text = text;
      this.start = start;
    }

  }

  private class IndexNode {

    private IndexNode[] children;

    private List<IndexHit> hits;

    private IndexNode() {

      super();
    }

    private IndexNode getChild(byte i) {

      if (this.children == null) {
        return null;
      }
      return this.children[i];
    }

    @SuppressWarnings("unchecked")
    private IndexNode getOrCreateChild(byte i) {

      if (this.children == null) {
        this.children = new TextSearchEngineMemory.IndexNode[TextSearchEngineMemory.this.treeWidth];
      }
      IndexNode node = this.children[i];
      if (node == null) {
        node = new IndexNode();
        this.children[i] = node;
      }
      return node;
    }
  }

}
