/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

/**
 * Interface for a {@link TextToken} containing the {@link #get() original token word} together with its
 * {@link #getStart() position} in the original text.
 *
 * @since 1.0.0
 * @see TextTokenizer
 */
public interface PositionedTextToken extends TextToken {

  /**
   * @return the inclusive start index of the {@link #get() token word} in the original text.
   * @see String#substring(int, int)
   */
  int getStart();

  /**
   * @return the exclusive end index of the {@link #getEnd() token word} in the original text.
   * @see String#substring(int, int)
   */
  default int getEnd() {

    return getStart() + get().length();
  }

}
