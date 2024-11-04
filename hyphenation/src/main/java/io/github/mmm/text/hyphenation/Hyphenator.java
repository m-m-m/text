/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation;

import java.util.Locale;

import io.github.mmm.text.hyphenation.impl.HyphenatorBuilder;

/**
 * A {@link Hyphenator} is used to hyphenate words. If a word is too long to fit at the end of a line of text, it may be
 * hyphenated according to the {@link #getLocale() locale}. E.g. the English word {@code unavailable} will be hyphenated
 * to {@code un-avail-able}<br>
 * A {@link #get(Locale) provided implementation} will be thread-safe.
 *
 * @since 1.0.0
 */
public interface Hyphenator {

  /** The default {@link #getHyphen() hyphen}. */
  String HYPHEN_DEFAULT = "-";

  /**
   * @see #hyphenate(String, int, int)
   *
   * @param word is the word to hyphenate.
   * @return the {@link Hyphenation} for the given word.
   */
  Hyphenation hyphenate(String word);

  /**
   * @see #hyphenate(String, int, int)
   *
   * @param text is the text ending with the word to hyphenate.
   * @param start is the {@link String#indexOf(int) index} of the words first character.
   * @return the {@link Hyphenation} for the word given by <code>text.{@link String#substring(int, int)
   *          substring}(start)</code>
   */
  default Hyphenation hyphenate(String text, int start) {

    return hyphenate(text.substring(start));
  }

  /**
   * This method hyphenates the word from the given {@code text} from {@code start} to {@code end}. <br>
   * <b>ATTENTION:</b><br>
   * To ensure correct results you need to invoke this method for a single word of text. Please also note that word
   * detection is far from trivial for specific languages such as Thai. You should use
   * {@link java.text.BreakIterator#getWordInstance(Locale)} for word-separation.
   *
   * @param text is the text containing the word to hyphenate.
   * @param start is the {@link String#indexOf(int) index} of the words first character.
   * @param end is the exclusive end-index. The {@link String#indexOf(int) index} of the words last character is
   *        {@code end - 1}.
   * @return the {@link Hyphenation} for the word given by <code>text.{@link String#substring(int, int)
   *          substring}(start, end)</code>
   */
  default Hyphenation hyphenate(String text, int start, int end) {

    return hyphenate(text.substring(start, end));
  }

  /**
   * @return the {@link Locale} of this {@link Hyphenator}. It may differ from (be more general than) the {@link Locale}
   *         this {@link Hyphenator} was {@link #get(Locale) requested for}.
   * @see #get(Locale)
   */
  Locale getLocale();

  /**
   * @return the hyphen character used to separate the hyphenated parts of a word. This is typically
   *         {@link #HYPHEN_DEFAULT} ("-"). However it may differ for specific {@link Locale}s. Since {@code char} or
   *         {@link Character} cannot represent some unicode characters and using {@code int} for a
   *         {@link String#codePointAt(int) code-point} can confuse Java beginners, we use {@link String} here for
   *         simplicity. The returned {@link String} should have the {@link String#length() length} {@code 1}.
   */
  String getHyphen();

  /**
   * @return the {@link Hyphenator} for the {@link Locale#getDefault() default locale}.
   */
  static Hyphenator get() {

    return get(Locale.getDefault());
  }

  /**
   * @param locale the {@link #getLocale() locale} to use.
   * @return the {@link Hyphenator} for the given {@code locale}.
   */
  static Hyphenator get(Locale locale) {

    return HyphenatorBuilder.INSTANCE.getHyphenator(locale);
  }

}
