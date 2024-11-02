/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Implementation of {@link Number} as a fraction.
 */
class Fraction extends Chars implements Number {

  final long numerator;

  final long denominator;

  Fraction(long numerator, long denominator) {

    this(numerator, denominator, numerator + "/" + denominator);
  }

  Fraction(long numerator, long denominator, String text) {

    super(text);
    this.numerator = numerator;
    this.denominator = denominator;
  }

  @Override
  public long getNumerator() {

    return this.numerator;
  }

  @Override
  public long getDenominator() {

    return this.denominator;
  }

}
