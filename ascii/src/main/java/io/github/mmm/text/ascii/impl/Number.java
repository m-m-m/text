/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link CodePointMapping} for a numeric value sign.
 */
public interface Number extends CodePointMapping {

  /**
   * @return the numerator as {@code long}. The actual value is {@link #getNumerator()}/{@link #getDenominator()}.
   */
  long getNumerator();

  /**
   * @return the denominator. By default {@code 1} otherwise this is a fraction (e.g.
   */
  default long getDenominator() {

    return 1;
  }

  @Override
  default Type getType() {

    return Type.NUMBER;
  }

}
