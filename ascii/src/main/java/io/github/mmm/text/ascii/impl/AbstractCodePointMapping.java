/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Abstract base implementation of {@link CodePointMapping}.
 */
abstract class AbstractCodePointMapping implements CodePointMapping {

  protected static boolean isLatinLetter(int codePoint) {

    return isLowerLatinLetter(codePoint) || isUpperLatinLetter(codePoint);
  }

  protected static boolean isLowerLatinLetter(int codePoint) {

    return ((codePoint >= 'a') && (codePoint <= 'z'));
  }

  protected static boolean isUpperLatinLetter(int codePoint) {

    return ((codePoint >= 'A') && (codePoint <= 'Z'));
  }

  protected static boolean isAsciiDigit(int codePoint) {

    return ((codePoint >= '0') && (codePoint <= '9'));
  }

  @Override
  public String asString() {

    AsciiBuilder builder = new AsciiBuilder(3, AsciiConverterConfigImpl.DEFAULT);
    append(builder, 0, null);
    return builder.getAscii();
  }

  @Override
  public String toString() {

    return asString();
  }

}
