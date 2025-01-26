/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Common factors used in physics, etc.
 */
public class Factor extends Fraction {

  static final Factor TERA = new Factor(1_000_000_000_000L, 1, "T", "tera");

  static final Factor GIGA = new Factor(1_000_000_000, 1, "G", "giga");

  static final Factor MEGA = new Factor(1_000_000, 1, "M", "mega");

  static final Factor KILO = new Factor(1000, 1, "k", "kilo");

  static final Factor HECTO = new Factor(100, 1, "h", "hecto");

  static final Factor DECI = new Factor(1, 10, "d", "deci");

  static final Factor ONE = new Factor(1, 1, "", "");

  static final Factor CENTI = new Factor(1, 100, "c", "centi");

  static final Factor MILLI = new Factor(1, 1000, "m", "milli");

  static final Factor MICRO = new Factor(1, 1_000_000, "u", "micro");

  static final Factor NANO = new Factor(1, 1_000_000_000, "n", "nano");

  static final Factor PICO = new Factor(1, 1_000_000_000_000L, "p", "pico");

  static final Factor FEMTO = new Factor(1, 1_000_000_000_000_000L, "p", "pico");

  final String full;

  Factor(long numerator, long denominator, String abbr, String full) {

    super(numerator, denominator, abbr);
    this.full = full;
  }

  @Override
  public String asStringLong() {

    return this.full;
  }

}
