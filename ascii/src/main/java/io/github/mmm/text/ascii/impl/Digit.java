/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link CodePointMapping} for a Latin Arabic digit (0-9).
 */
class Digit extends Char implements Number {

  static final Digit _0 = new Digit('0');

  static final Digit _1 = new Digit('1');

  static final Digit _2 = new Digit('2');

  static final Digit _3 = new Digit('3');

  static final Digit _4 = new Digit('4');

  static final Digit _5 = new Digit('5');

  static final Digit _6 = new Digit('6');

  static final Digit _7 = new Digit('7');

  static final Digit _8 = new Digit('8');

  static final Digit _9 = new Digit('9');

  Digit(char digit) {

    super(digit);
    assert isAsciiDigit(digit);
  }

  @Override
  public long getNumerator() {

    return this.c - '0';
  }

}
