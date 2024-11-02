/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Interface for a power (exponent).
 */
public class Power extends GenericNumber {

  static final Power ONE = new Power(1, "");

  static final Power SQUARE = new Power(2, "square");

  static final Power CUBIC = new Power(3, "cubic");

  Power(int numerator, String s) {

    super(numerator, s);
  }

}
