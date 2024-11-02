/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii;

import io.github.mmm.text.ascii.impl.AsciiConverterImpl;

/**
 * {@link AsciiConverter} converts Unicode to simple 7-bit ASCII characters. It strips diacritic marks and transliterates non-Latin letters and glyphs to ASCII.
 * It is optimized for performance and does not implement perfectly correct transliteration (e.g. it has no state to transliterate a code-point dependening on
 * its predecessors).<br>
 * However, it is very helpful to decode strings for use-cases like indexing and searching or if you want to build a {@link String} to be used for restricted
 * environments (names of files, folders, etc.) where special characters could cause problems.
 *
 * @since 1.0.0
 */
public interface AsciiConverter {

  /**
   * @param text the (unicode) {@link String} to convert.
   * @param codePoint the {@link String#codePointAt(int) codePoint} to convert.
   * @return the converted ASCII representation of the given {@link String#codePointAt(int) codePoint}.
   */
  String convert(int codePoint);

  /**
   * @param text the (unicode) {@link CharSequence} to convert.
   * @return the converted ASCII representation of the given {@code text}.
   */
  default String convert(CharSequence text) {

    return convert(text, AsciiConverterConfig.of());
  }

  /**
   * @param text the (unicode) {@link CharSequence} to convert.
   * @param config the {@link AsciiConverterConfig}.
   * @return the converted ASCII representation of the given {@code text}.
   */
  String convert(CharSequence text, AsciiConverterConfig config);

  /**
   * @return the singleton instance of {@link AsciiConverter}.
   */
  static AsciiConverter get() {

    return AsciiConverterImpl.INSTANCE;
  }

}
