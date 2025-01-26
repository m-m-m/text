package io.github.mmm.text.search.spi;

import io.github.mmm.text.search.TextNormalizer;
import io.github.mmm.text.search.TextSearchDecomposer;
import io.github.mmm.text.search.TextSearchEngine;
import io.github.mmm.text.search.TextTokenizer;

/**
 * Abstract base implementation of {@link TextSearchEngine}.
 *
 * @param <V> type of the values to index.
 * @param <P> type of the {@link TextSearchDecomposer#getProperties(Object) properties} of a value.
 */
public abstract class AbstractTextSearchEngine<V, P> implements TextSearchEngine<V, P> {

  /** @see #getNormalizer() */
  protected final TextNormalizer normalizer;

  /** @see #getDecomposer() */
  protected final TextSearchDecomposer<V, P> decomposer;

  /** @see #getTokenizer() */
  protected final TextTokenizer tokenizer;

  /**
   * The constructor.
   *
   * @param normalizer the {@link #getNormalizer() normalizer}.
   * @param decomposer the {@link #getDecomposer() decomposer}.
   * @param tokenizer the {@link #getTokenizer() tokenizer}.
   */
  public AbstractTextSearchEngine(TextNormalizer normalizer, TextSearchDecomposer<V, P> decomposer,
      TextTokenizer tokenizer) {

    super();
    this.normalizer = normalizer;
    this.decomposer = decomposer;
    this.tokenizer = tokenizer;
  }

  @Override
  public TextNormalizer getNormalizer() {

    return this.normalizer;
  }

  @Override
  public TextSearchDecomposer<V, P> getDecomposer() {

    return this.decomposer;
  }

  /**
   * @return the {@link TextTokenizer}.
   */
  public TextTokenizer getTokenizer() {

    return this.tokenizer;
  }

}
