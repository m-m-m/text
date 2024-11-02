/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Implementation of {@link CodePointMapping} for static {@link String}.
 */
class Chars extends AbstractCodePointMapping {

  final String s;

  Chars(String s) {

    super();
    this.s = s;
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    String word;
    if (builder.config.useLongForms) {
      word = asStringLong();
    } else {
      word = this.s;
    }
    builder.config.caseConversion.append(builder.sb, word);
    return next;
  }

  @Override
  public String asString() {

    return this.s;
  }

}
