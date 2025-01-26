/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link Word} for a structured term that has a {@link #asStringLong() long form} where as {@link #asString()}
 * typically is an abbreviation.
 */
public class StructuredWord extends Word {

  final String full;

  StructuredWord(String string) {

    this(string, string);
  }

  StructuredWord(String abbreviaton, String full) {

    super(abbreviaton);
    this.full = full;
  }

  @Override
  public String asStringLong() {

    return this.full;
  }

  @Override
  protected CodePointMapping doAppend(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    String word;
    if (builder.config.useLongForms) {
      word = this.full;
    } else {
      word = this.s;
    }
    builder.config.caseConversion.append(builder.sb, word);
    return next;
  }

}
