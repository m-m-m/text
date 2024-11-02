/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link Chars} for text (letters combined with other characters).
 */
class Text extends Chars {

  Text(String s) {

    super(s);
    assert isText(s);
  }

  private boolean isText(String text) {

    int len = text.length();
    if (len < 2) {
      throw new IllegalArgumentException(text + " - expected at least two letters.");
    }
    int codePoint = text.codePointAt(0);
    if (!isLatinLetter(codePoint)) {
      throw new IllegalArgumentException(text + " - must start with letter.");
    }
    return true;
  }

  @Override
  public Type getType() {

    return Type.TEXT;
  }

}
