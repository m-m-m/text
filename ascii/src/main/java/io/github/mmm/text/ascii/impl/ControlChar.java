/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Char} for control {@link Character}.
 */
class ControlChar extends Char {

  ControlChar(int c) {

    super((char) c);
    assert ((c >= 0) && (c < 0x20));
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    if (builder.config.includeControlChars) {
      builder.sb.append(this.c);
    }
    return next;
  }

}
