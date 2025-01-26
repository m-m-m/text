/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import io.github.mmm.text.search.impl.LatinTextNormalizer;
import io.github.mmm.text.search.impl.TextSearchEngineMemory;

/**
 * Interface to {@link #normalize(String) normalize text} for searching. Typically this means converting from arbitrary
 * Unicode text to lower-case ASCII.
 */
public interface TextNormalizer {

  /**
   * @param text the {@link String} to normalize. May be of any length and can contain arbitrary unicode characters.
   * @return the normalized text. Typically complex unicode characters get replaced by simpler ones via
   *         {@link io.github.mmm.text.ascii.AsciiConverter#convert(CharSequence) transliteration and related
   *         mechanisms}.
   */
  String normalize(String text);

  /**
   * @param codePoint the {@link String#codePointAt(int) code point} to normalize.
   * @return the normalized {@link String} for the given {@code codePoint}.
   */
  String normalize(int codePoint);

  /**
   * @param c a {@link Character} from a {@link #normalize(String) normalized} {@link String}.
   * @return an index to map the character to in the range from {@code 0} to <code>{@link #getMax() max}</code> or
   *         {@code -1} to ignore this {@link Character}.
   */
  byte map(char c);

  /**
   * @return the maximum value returned by {@link #map(char)}. This needs to be a static positive number so sub-sequent
   *         calls to this method shall always return the same value greater zero. Also the returned number should be
   *         rather small since for each node in the {@link TextSearchEngineMemory} node-tree an array for child-nodes is
   *         allocated having this size.
   */
  byte getMax();

  /**
   * @return an instance of {@link TextNormalizer} that normalizes to Latin letters (case-insenstive) and Latin Arabic
   *         digits. As a result it will treat "grüßen01", "GRUESSEN01", "GRÜßEN01", etc. all as the same words.
   */
  static TextNormalizer getLatin() {

    return LatinTextNormalizer.get();
  }

}
