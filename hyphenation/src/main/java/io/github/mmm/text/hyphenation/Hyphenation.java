/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation;

/**
 * Interface for the result of a {@link Hyphenator#hyphenate(String) hyphenation}.
 *
 * @since 1.0.0
 */
public interface Hyphenation {

  /**
   * @return the number of hyphenation-points (e.g. {@code 0} for "I" or "egg" and {@code 1} for "im-pact").
   */
  int getHyphenationCount();

  /**
   * @param hyphenationIndex is the index of the hyphenation-point in the range from {@code 0} to <code>
   *        {@link #getHyphenationCount()} - 1</code>.
   * @return the index of the position in the {@link #getWord() word}.
   * @see #getHyphenationCount()
   */
  int getHyphenation(int hyphenationIndex);

  /**
   * Gets the greatest {@link #getHyphenation(int) hyphenation position} that is less to the given {@code offset}.
   *
   * @param offset is the {@link String#charAt(int) offset} in the {@link #getWord() word} where a hyphenation is
   *        desired.
   * @return the {@link #getHyphenation(int) hyphenation position} just before the given {@code offset} or {@code -1} if
   *         there is no such position.
   */
  int getHyphenationBefore(int offset);

  /**
   * @return the raw word that was be hyphenated without added hyphens.
   * @see Hyphenator#hyphenate(String)
   */
  CharSequence getWord();

  /**
   * @return the {@link Hyphenator#getHyphen() hyphen}.
   */
  String getHyphen();

  /**
   * The hyphenation of the according word (e.g. un-avail-able).
   */
  @Override
  String toString();

}
