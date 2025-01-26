/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

/**
 * Interface for a single {@link NormalizedTextToken}.
 *
 * @since 1.0.0
 * @see TextTokenizer
 */
public interface NormalizedTextToken extends TextToken {

  /**
   * @return the {@link TextNormalizer#normalize(String) normalized} form of the {@link TextTokenizer#tokenize(String)
   *         original token word}.
   */
  @Override
  String get();

  /**
   * @return a hash derived from the {@link #get() normalized value}. This hash shall be stored and not recomputed on
   *         calls of this method. The computation shall be highly efficient and the value should have low collision
   *         probability.
   */
  @Override
  int hashCode();

}
