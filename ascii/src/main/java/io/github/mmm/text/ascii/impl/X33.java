/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+33xx (CJK Compatibility).
 */
final class X33 extends Xxx {

  private static final UnitCombination KILO_GRAM = Unit.GRAM.with(Factor.KILO);

  private static final UnitCombination SQUARE_SECOND = Unit.SECOND.with(Factor.ONE, Power.SQUARE);

  private static final UnitCombination KILO_METER = Unit.METER.with(Factor.KILO);

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("apartment"), // 0x00
  new Word("alpha"), // 0x01
  Unit.AMPERE, // 0x02
  Unit.ARE, // 0x03
  new Unit("inning"), // 0x04
  Unit.INCH, // 0x05
  Currency.WON, // 0x06
  Currency.ESCUDO, // 0x07
  Unit.ACRE, // 0x08
  Unit.OUNCE, // 0x09
  Unit.OHM, // 0x0a
  Unit.NAUTIC_MILE, // 0x0b
  Unit.CARAT, // 0x0c
  Unit.CALORIE, // 0x0d
  Unit.GALLON, // 0x0e
  new Word("gamma"), // 0x0f
  Factor.GIGA, // 0x10
  Currency.GUINEA, // 0x11
  Unit.CURIE, // 0x12
  Currency.GUILDER, // 0x13
  Factor.KILO, // 0x14
  KILO_GRAM, // 0x15
  KILO_METER, // 0x16
  Unit.WATT, // 0x17
  Unit.GRAM, // 0x18
  Unit.TONNE, // 0x19
  Currency.CRUZEIRO, // 0x1a
  Currency.KRONE, // 0x1b
  new Word("case"), // 0x1c
  Currency.KORUNA, // 0x1d
  new Word("co-op"), // 0x1e
  new Word("turn"), // 0x1f
  Currency.CENTIME, // 0x20
  Currency.SHILLING, // 0x21
  new Fraction(1, 100, "centi"), // 0x22
  Currency.CENT, // 0x23
  new GenericNumber(12, "dozen"), // 0x24
  new Fraction(1, 10, "deci"), // 0x25
  Currency.DOLLAR, // 0x26
  Unit.TONNE, // 0x27
  Factor.NANO, // 0x28
  Unit.KNOT, // 0x29
  new Word("housing"), // 0x2a
  Char.PERCENT, // 0x2b
  Currency.BAHT, // 0x2c
  Unit.BARREL, // 0x2d
  Currency.PIASTER, // 0x2e
  Unit.PICUL, // 0x2f
  new Word("metric"), // 0x30
  new Word("building"), // 0x31
  Unit.FARAD, // 0x32
  Unit.FOOT, // 0x33
  Unit.BUSHEL, // 0x34
  Currency.FRANC, // 0x35
  Unit.HECTARE, // 0x36
  Currency.PESO, // 0x37
  Currency.PFENNIG, // 0x38
  Unit.HERTZ, // 0x39
  Currency.PENNY, // 0x3a
  new Word("page"), // 0x3b
  new Word("beta"), // 0x3c
  new Word("point"), // 0x3d
  Unit.VOLT, // 0x3e
  Unit.PHON, // 0x3f
  Currency.POUND, // 0x40
  new Word("hall"), // 0x41
  new Word("horn"), // 0x42
  Factor.MICRO, // 0x43
  Unit.MILE, // 0x44
  Unit.MACH, // 0x45
  Currency.MARK, // 0x46
  new Word("mansion"), // 0x47
  Unit.METER.with(Factor.MICRO), // 0x48
  Factor.MILLI, // 0x49
  Unit.BAR.with(Factor.MILLI), // 0x4a
  Factor.MEGA, // 0x4b
  Unit.TONNE.with(Factor.MEGA), // 0x4c
  Unit.METER, // 0x4d
  Unit.YARD, // 0x4e
  Unit.YARD, // 0x4f
  Currency.YUAN, // 0x50
  Unit.LITER, // 0x51
  Currency.LIRA, // 0x52
  Currency.RUPEE, // 0x53
  Currency.RUBLE, // 0x54
  Unit.REM, // 0x55
  Unit.ROENTGEN, // 0x56
  Unit.WATT, // 0x57
  new Chars("0h"), // 0x58
  new Chars("1h"), // 0x59
  new Chars("2h"), // 0x5a
  new Chars("3h"), // 0x5b
  new Chars("4h"), // 0x5c
  new Chars("5h"), // 0x5d
  new Chars("6h"), // 0x5e
  new Chars("7h"), // 0x5f
  new Chars("8h"), // 0x60
  new Chars("9h"), // 0x61
  new Chars("10h"), // 0x62
  new Chars("11h"), // 0x63
  new Chars("12h"), // 0x64
  new Chars("13h"), // 0x65
  new Chars("14h"), // 0x66
  new Chars("15h"), // 0x67
  new Chars("16h"), // 0x68
  new Chars("17h"), // 0x69
  new Chars("18h"), // 0x6a
  new Chars("19h"), // 0x6b
  new Chars("20h"), // 0x6c
  new Chars("21h"), // 0x6d
  new Chars("22h"), // 0x6e
  new Chars("23h"), // 0x6f
  new Chars("24h"), // 0x70
  Unit.PASCAL.with(Factor.HECTO), // 0x71
  new Word("da"), // 0x72
  Unit.AU, // 0x73
  Unit.BAR, // 0x74
  new Unit("oV", "basal body temperature"), // 0x75
  new Unit("pc", "parsec"), // 0x76
  Unit.METER.with(Factor.DECI), // 0x77
  Unit.METER.with(Factor.DECI, Power.SQUARE), // 0x78
  Unit.METER.with(Factor.DECI, Power.CUBIC), // 0x79
  new Unit("IU", "international unit"), // 0x7a
  new Word("Heisei"), // 0x7b
  new Word("Syouwa"), // 0x7c
  new Word("Taisyou"), // 0x7d
  new Word("Meiji"), // 0x7e
  new Word("Inc."), // 0x7f
  Unit.AMPERE.with(Factor.PICO), // 0x80
  Unit.AMPERE.with(Factor.NANO), // 0x81
  Unit.AMPERE.with(Factor.MICRO), // 0x82
  Unit.AMPERE.with(Factor.MILLI), // 0x83
  Unit.AMPERE.with(Factor.KILO), // 0x84
  Unit.BYTE.with(Factor.KILO), // 0x85
  Unit.BYTE.with(Factor.MEGA), // 0x86
  Unit.BYTE.with(Factor.GIGA), // 0x87
  Unit.CALORIE, // 0x88
  Unit.CALORIE.with(Factor.KILO), // 0x89
  Unit.FARAD.with(Factor.PICO), // 0x8a
  Unit.FARAD.with(Factor.NANO), // 0x8b
  Unit.FARAD.with(Factor.MICRO), // 0x8c
  Unit.GRAM.with(Factor.MICRO), // 0x8d
  Unit.GRAM.with(Factor.MILLI), // 0x8e
  Unit.GRAM.with(Factor.KILO), // 0x8f
  Unit.HERTZ, // 0x90
  Unit.HERTZ.with(Factor.KILO), // 0x91
  Unit.HERTZ.with(Factor.MEGA), // 0x92
  Unit.HERTZ.with(Factor.GIGA), // 0x93
  Unit.HERTZ.with(Factor.TERA), // 0x94
  Unit.LITER.with(Factor.MICRO), // 0x95
  Unit.LITER.with(Factor.MILLI), // 0x96
  Unit.LITER.with(Factor.DECI), // 0x97
  Unit.LITER.with(Factor.KILO), // 0x98
  Unit.METER.with(Factor.FEMTO), // 0x99
  Unit.METER.with(Factor.NANO), // 0x9a
  Unit.METER.with(Factor.MICRO), // 0x9b
  Unit.METER.with(Factor.MILLI), // 0x9c
  Unit.METER.with(Factor.CENTI), // 0x9d
  KILO_METER, // 0x9e
  Unit.METER.with(Factor.MILLI, Power.SQUARE), // 0x9f
  Unit.METER.with(Factor.CENTI, Power.SQUARE), // 0xa0
  Unit.METER.with(Factor.ONE, Power.SQUARE), // 0xa1
  Unit.METER.with(Factor.KILO, Power.SQUARE), // 0xa2
  Unit.METER.with(Factor.MILLI, Power.CUBIC), // 0xa3
  Unit.METER.with(Factor.CENTI, Power.CUBIC), // 0xa4
  Unit.METER.with(Factor.ONE, Power.CUBIC), // 0xa5
  Unit.METER.with(Factor.KILO, Power.CUBIC), // 0xa6
  new Division(Unit.METER, Unit.SECOND), // 0xa7
  new Division(Unit.METER, SQUARE_SECOND), // 0xa8
  Unit.PASCAL, // 0xa9
  Unit.PASCAL.with(Factor.KILO), // 0xaa
  Unit.PASCAL.with(Factor.MEGA), // 0xab
  Unit.PASCAL.with(Factor.GIGA), // 0xac
  Unit.RAD, // 0xad
  new Division(Unit.RAD, Unit.SECOND), // 0xae
  new Division(Unit.RAD, SQUARE_SECOND), // 0xaf
  LO_PS, // 0xb0
  Unit.SECOND.with(Factor.NANO), // 0xb1
  Unit.SECOND.with(Factor.MICRO), // 0xb2
  Unit.SECOND.with(Factor.MILLI), // 0xb3
  Unit.VOLT.with(Factor.PICO), // 0xb4
  Unit.VOLT.with(Factor.NANO), // 0xb5
  Unit.VOLT.with(Factor.MICRO), // 0xb6
  Unit.VOLT.with(Factor.MILLI), // 0xb7
  Unit.VOLT.with(Factor.KILO), // 0xb8
  Unit.VOLT.with(Factor.MEGA), // 0xb9
  Unit.WATT.with(Factor.PICO), // 0xba
  Unit.WATT.with(Factor.NANO), // 0xbb
  Unit.WATT.with(Factor.MICRO), // 0xbc
  Unit.WATT.with(Factor.MILLI), // 0xbd
  Unit.WATT.with(Factor.KILO), // 0xbe
  Unit.WATT.with(Factor.MEGA), // 0xbf
  Unit.OHM.with(Factor.KILO), // 0xc0
  Unit.WATT.with(Factor.MEGA), // 0xc1
  new Word("a.m."), // 0xc2
  new Unit("Bq", "becquerel"), // 0xc3
  Unit.METER.with(Factor.CENTI, Power.CUBIC), // 0xc4 - "cc"
  new Unit("cd", "candela"), // 0xc5
  new Division(Unit.COULOMB, KILO_GRAM), // 0xc6
  new StructuredWord("Co.", "company"), // 0xc7
  Unit.BEL.with(Factor.DECI), // 0xc8
  new Unit("Gy", "gray"), // 0xc9
  Unit.HECTARE, // 0xca
  new Unit("HP", "Brit. horse-power"), // 0xcb
  Unit.INCH, // 0xcc
  new StructuredWord("K.K.", "kabushiki kaisha"), // 0xcd
  new Word("KM"), // 0xce
  Unit.KNOT, // 0xcf
  new Unit("lm", "lumen"), // 0xd0
  new StructuredWord("ln", "natural logarithm"), // 0xd1
  new StructuredWord("log", "logarithm"), // 0xd2
  new Unit("lx", "lux"), // 0xd3
  Unit.BAR.with(Factor.MILLI), // 0xd4
  new Word("mil"), // 0xd5
  new Unit("mol", "mole"), // 0xd6
  new Word("pH"), // 0xd7
  new Word("p.m."), // 0xd8
  Unit.PPM, // 0xd9
  new StructuredWord("PR", "public-relations"), // 0xda
  new Unit("sr", "steradian"), // 0xdb
  new Unit("Sv", "sievert"), // 0xdc
  new Unit("Wb", "weber"), // 0xdd
  null, // 0xde
  null, // 0xdf
  new Chars("1d"), // 0xe0
  new Chars("2d"), // 0xe1
  new Chars("3d"), // 0xe2
  new Chars("4d"), // 0xe3
  new Chars("5d"), // 0xe4
  new Chars("6d"), // 0xe5
  new Chars("7d"), // 0xe6
  new Chars("8d"), // 0xe7
  new Chars("9d"), // 0xe8
  new Chars("10d"), // 0xe9
  new Chars("11d"), // 0xea
  new Chars("12d"), // 0xeb
  new Chars("13d"), // 0xec
  new Chars("14d"), // 0xed
  new Chars("15d"), // 0xee
  new Chars("16d"), // 0xef
  new Chars("17d"), // 0xf0
  new Chars("18d"), // 0xf1
  new Chars("19d"), // 0xf2
  new Chars("20d"), // 0xf3
  new Chars("21d"), // 0xf4
  new Chars("22d"), // 0xf5
  new Chars("23d"), // 0xf6
  new Chars("24d"), // 0xf7
  new Chars("25d"), // 0xf8
  new Chars("26d"), // 0xf9
  new Chars("27d"), // 0xfa
  new Chars("28d"), // 0xfb
  new Chars("29d"), // 0xfc
  new Chars("30d"), // 0xfd
  new Chars("31d"), // 0xfe
  Unit.GALLON // 0xff
  };
}