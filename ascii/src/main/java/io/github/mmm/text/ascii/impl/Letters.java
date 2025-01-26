/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link Chars} for multiple latin letters. It typically represents a syllabe or sound (unlike a {@link Word}).
 */
public class Letters extends Chars {

  Letters(String s) {

    super(s);
    assert isLetters(s);
  }

  private boolean isLetters(String string) {

    int len = string.length();
    if (len < 2) {
      throw new IllegalArgumentException(string + " - expected at least two letters.");
    }
    for (int i = 0; i < len; i++) {
      int codePoint = string.codePointAt(i);
      if (!isLatinLetter(codePoint)) {
        throw new IllegalArgumentException(
            string + " - at index " + i + " illegal code point 0x" + Long.toHexString(codePoint));
      }
    }
    return true;
  }

  @Override
  public Type getType() {

    return Type.TEXT;
  }

}
