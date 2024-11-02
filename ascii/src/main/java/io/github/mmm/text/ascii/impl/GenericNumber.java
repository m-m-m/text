/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Generic implementation of {@link Number} that is not a fraction.
 */
class GenericNumber extends Chars implements Number {

  final int numerator;

  GenericNumber(int numerator) {

    super("+" + numerator + '+');
    this.numerator = numerator;
  }

  GenericNumber(int numerator, String s) {

    super(s);
    this.numerator = numerator;
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    if (builder.config.normalizeNumbers) {
      return new NumberState(this.numerator);
    }
    builder.sb.append(this.s);
    return next;
  }

  @Override
  public long getNumerator() {

    return this.numerator;
  }

}
