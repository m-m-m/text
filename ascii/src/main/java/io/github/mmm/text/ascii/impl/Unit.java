/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link Letters} for a (physical) unit.
 */
class Unit extends StructuredWord {

  static final Unit ACRE = new Unit("a", "acre");

  static final Unit AMPERE = new Unit("amp", "ampere");

  static final Unit CALORIE = new Unit("cal", "calorie");

  static final Unit CARAT = new Unit("ct", "carat");

  static final Unit CELSIUS = new Unit("C", "Celsius");

  static final Unit CURIE = new Unit("Ci", "curie");

  static final Unit FAHRENHEIT = new Unit("F", "Fahrenheit");

  static final Unit FARAD = new Unit("f", "farad");

  static final Unit GALLON = new Unit("gal", "gallon");

  static final Unit GRAM = new Unit("g", "gram");

  static final Unit HECTARE = new Unit("ha", "hectare");

  static final Unit ARE = new Unit("a", "are");

  static final Unit HERTZ = new Unit("hz", "hertz");

  static final Unit INCH = new Unit("''", "inch");

  static final Unit KELVIN = new Unit("K", "Kelvin");

  static final Unit KNOT = new Unit("kn", "knot");

  static final Unit LITER = new Unit("l", "liter");

  static final Unit NAUTIC_MILE = new Unit("nmi", "nautic-mile");

  static final Unit OHM = new Unit("ohm");

  static final Unit OUNCE = new Unit("ounce");

  static final Unit PLANCK_CONSTANT = new Unit("h", "Planck constant");

  static final Unit PLANCK_CONSTANT_REDUCED = new Unit("h/", "reduced Planck constant");

  static final Unit TONNE = new Unit("t", "tonne");

  static final Unit VOLT = new Unit("V", "volt");

  static final Unit WATT = new Unit("W", "watt");

  static final Unit YARD = new Unit("yard");

  static final Unit BARREL = new Unit("bbl", "barrel");

  static final Unit PICUL = new Unit("picul");

  static final Unit FOOT = new Unit("ft", "foot");

  static final Unit BUSHEL = new Unit("bu.", "bushel");

  static final Unit PHON = new Unit("phon");

  static final Unit MILE = new Unit("mi.", "mile");

  static final Unit MACH = new Unit("mach");

  static final Unit METER = new Unit("m", "meter");

  static final Unit REM = new Unit("rem", "roentgen equivalent man");

  static final Unit ROENTGEN = new Unit("R", "roentgen");

  static final Unit PASCAL = new Unit("Pa", "pascal");

  static final Unit AU = new Unit("AU", "astronomical unit");

  static final Unit BAR = new Unit("bar");

  static final Unit BYTE = new Unit("b", "byte");

  static final Unit SECOND = new Unit("s", "second");

  static final Unit RAD = new Unit("rad", "radian");

  static final Unit PPM = new Unit("PPM", "parts-per-million");

  static final Unit BEL = new Unit("B", "bel");

  static final Unit COULOMB = new Unit("C", "coulomb");

  Unit(String s) {

    this(s, s);
  }

  Unit(String s, String full) {

    super(s, full);
  }

  UnitCombination with(Factor factor) {

    return new UnitCombination(factor, this);
  }

  UnitCombination with(Factor factor, Power power) {

    return new UnitCombination(factor, this, power);
  }

}
