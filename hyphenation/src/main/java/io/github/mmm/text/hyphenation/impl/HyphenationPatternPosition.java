/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

/**
 * A {@link HyphenationPatternPosition} represents a {@link #ranking ranked} {@link #index index} position of a
 * potential hyphenation of a {@link HyphenationPattern}.
 *
 * @since 1.0.0
 */
public final class HyphenationPatternPosition {

  /**
   * the index of the hyphenation-position in the pattern (without numbers). A value of {@code 0} indicates a
   * hyphenation before the first character.
   */
  public final int index;

  /**
   * The ranking a hyphenation at the represented {@link #index}. A higher value over-rules a lower value of a previous
   * pattern. Odd values indicate a hyphenation while even values indicate
   */
  public final int ranking;

  /**
   * The constructor.
   *
   * @param index is the {@link #index}.
   * @param rankink is the {@link #ranking}.
   */
  public HyphenationPatternPosition(int index, int rankink) {

    super();
    this.index = index;
    this.ranking = rankink;
  }

}
