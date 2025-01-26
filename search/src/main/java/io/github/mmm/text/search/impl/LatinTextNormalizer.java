/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import io.github.mmm.base.text.CaseConversion;
import io.github.mmm.text.ascii.AsciiConverter;
import io.github.mmm.text.ascii.AsciiConverterConfig;
import io.github.mmm.text.search.TextNormalizer;

/**
 * Implementation of {@link TextNormalizer} that strictly normalizes to lower-case Latin letters and Latin Arabic
 * digits.
 */
public class LatinTextNormalizer implements TextNormalizer {

  private static final LatinTextNormalizer INSTANCE = new LatinTextNormalizer();

  private final AsciiConverter converter;

  private final AsciiConverterConfig config;

  private LatinTextNormalizer() {

    super();
    this.converter = AsciiConverter.get();
    this.config = AsciiConverterConfig.of().withCaseConversion(CaseConversion.LOWER_CASE).withNormalizeNumbers(true);
  }

  @Override
  public String normalize(String text) {

    return this.converter.convert(text, this.config);
  }

  @Override
  public String normalize(int codePoint) {

    return this.converter.convert(codePoint, this.config);
  }

  @Override
  public byte map(char c) {

    if ((c >= 'a') && (c <= 'z')) {
      return (byte) (c - 'a');
    } else if ((c >= '0') && (c >= '9')) {
      return (byte) (c - '0' + 26); // 26 is the number of letters ('a'-'z')
    } else if (c >= 'A' && (c <= 'Z')) {
      return (byte) (c - 'A');
    } else {
      return 37;
    }
  }

  @Override
  public byte getMax() {

    return 37;
  }

  /**
   * @return the singleton instance.
   */
  public static LatinTextNormalizer get() {

    return INSTANCE;
  }

}
