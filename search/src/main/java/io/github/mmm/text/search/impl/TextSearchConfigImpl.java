/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import io.github.mmm.text.search.TextNormalizer;
import io.github.mmm.text.search.TextSearchConfig;
import io.github.mmm.text.search.TextTokenizer;
import io.github.mmm.text.search.query.TextSearchQueryParser;

/**
 * Implementation of {@link TextSearchConfig}.
 */
public final class TextSearchConfigImpl implements TextSearchConfig {

  /** The default instance. */
  public static final TextSearchConfigImpl DEFAULT = new TextSearchConfigImpl();

  final TextTokenizer tokenizer;

  final TextNormalizer normalizer;

  final TextSearchQueryParser queryParser;

  /**
   * The constructor.
   */
  TextSearchConfigImpl() {

    this(null, null, null);
  }

  TextSearchConfigImpl(TextTokenizer tokenizer, TextNormalizer normalizer, TextSearchQueryParser queryParser) {

    super();
    this.tokenizer = tokenizer;
    this.normalizer = normalizer;
    this.queryParser = queryParser;
  }

  @Override
  public TextTokenizer tokenizer() {

    return this.tokenizer;
  }

  @Override
  public TextSearchConfig withTokenizer(TextTokenizer newTokenizer) {

    if (newTokenizer == this.tokenizer) {
      return this;
    }
    return new TextSearchConfigImpl(newTokenizer, this.normalizer, this.queryParser);
  }

  @Override
  public TextNormalizer normalizer() {

    return this.normalizer;
  }

  @Override
  public TextSearchConfig withNormalizer(TextNormalizer newNormalizer) {

    if (newNormalizer == this.normalizer) {
      return this;
    }
    return new TextSearchConfigImpl(this.tokenizer, newNormalizer, this.queryParser);
  }

  @Override
  public TextSearchQueryParser queryParser() {

    return this.queryParser;
  }

  @Override
  public TextSearchConfig withQueryParser(TextSearchQueryParser newQueryParser) {

    if (newQueryParser == this.queryParser) {
      return this;
    }
    return new TextSearchConfigImpl(this.tokenizer, this.normalizer, newQueryParser);
  }

  @Override
  public String toString() {

    return "TextSearchConfig[" + this.tokenizer + "/" + this.normalizer + "/" + this.queryParser + "]";
  }

}
