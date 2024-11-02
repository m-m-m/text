/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link Chars} for text (letters combined with other characters).
 */
class Division extends Word {

  final Word numerator;

  final Word denominator;

  Division(Word numerator, Word denominator) {

    super("");
    this.numerator = numerator;
    this.denominator = denominator;
  }

  @Override
  protected CodePointMapping doAppend(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    this.numerator.doAppend(builder, codePoint, next);
    builder.sb.append('/');
    this.denominator.doAppend(builder, codePoint, next);
    return next;
  }

}
