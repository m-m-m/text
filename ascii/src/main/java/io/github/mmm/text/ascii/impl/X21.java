/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+21xx (Letterlike Symbols, Number Forms, Arrows).
 */
final class X21 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Chars("a/c"), // 0x00
  new Chars("a/s"), // 0x01
  Letter.UP_C, // 0x02
  Unit.CELSIUS, // 0x03
  new Chars("CL"), // 0x04
  new Chars("c/o"), // 0x05
  new Chars("c/u"), // 0x06
  Letter.LO_E, // 0x07
  new Chars("(3)"), // 0x08
  Unit.FAHRENHEIT, // 0x09
  Letter.LO_G, // 0x0a
  Letter.UP_H, // 0x0b
  Letter.UP_H, // 0x0c
  Letter.UP_H, // 0x0d
  Unit.PLANCK_CONSTANT, // 0x0e
  Unit.PLANCK_CONSTANT_REDUCED, // 0x0f
  Letter.UP_I, // 0x10
  Letter.UP_I, // 0x11
  Letter.UP_L, // 0x12
  Letter.LO_L, // 0x13
  new Chars("lb"), // 0x14
  Letter.UP_N, // 0x15
  new Letters("No"), // 0x16
  new Chars("(P)"), // 0x17
  Letter.UP_P, // 0x18
  Letter.UP_P, // 0x19
  Letter.UP_Q, // 0x1a
  Letter.UP_R, // 0x1b
  Letter.UP_R, // 0x1c
  Letter.UP_R, // 0x1d
  new Chars("Px"), // 0x1e
  new Chars("R/"), // 0x1f
  new Chars("(SM)"), // 0x20
  new Chars("(TEL)"), // 0x21
  new Chars("(TM)"), // 0x22
  new Chars("V/"), // 0x23
  Letter.UP_Z, // 0x24
  null, // 0x25
  Unit.OHM, // 0x26
  new Chars("(inverted ohm)"), // 0x27
  Letter.UP_Z, // 0x28
  Letter.LO_I, // 0x29
  Unit.KELVIN, // 0x2a
  Letter.UP_A, // 0x2b
  Letter.UP_B, // 0x2c
  Letter.UP_C, // 0x2d
  Letter.LO_E, // 0x2e
  Letter.LO_E, // 0x2f
  Letter.LO_E, // 0x30
  Letter.UP_F, // 0x31
  Letter.UP_F, // 0x32
  Letter.UP_M, // 0x33
  Letter.LO_O, // 0x34
  Letter.UP_N, // 0x35
  new Letters("Bet"), // 0x36
  new Letters("Gimel"), // 0x37
  new Letters("Dalet"), // 0x38
  new Chars("(i)"), // 0x39
  new Chars("O'"), // 0x3a
  new Chars("(FAX)"), // 0x3b
  LO_PI, // 0x3c
  new Letters("gamma"), // 0x3d
  new Letters("Gamma"), // 0x3e
  new Letters("Pi"), // 0x3f
  new Letters("Sum"), // 0x40
  Letter.UP_G, // 0x41
  Letter.UP_L, // 0x42
  Letter.UP_L, // 0x43
  Letter.UP_Y, // 0x44
  Letter.UP_D, // 0x45
  Letter.LO_D, // 0x46
  Letter.LO_E, // 0x47
  Letter.LO_I, // 0x48
  Letter.LO_J, // 0x49
  new Letters("PL"), // 0x4a
  Char.AMP, // 0x4b
  new Word("per"), // 0x4c
  new Chars("A/S"), // 0x4d
  Letter.LO_F, // 0x4e
  new Word("source"), // 0x4f
  new Fraction(1, 7), // 0x50
  new Fraction(1, 9), // 0x51
  new Fraction(1, 10), // 0x52
  new Fraction(1, 3), // 0x53
  new Fraction(2, 3), // 0x54
  new Fraction(1, 5), // 0x55
  new Fraction(2, 5), // 0x56
  new Fraction(3, 5), // 0x57
  new Fraction(4, 5), // 0x58
  new Fraction(1, 6), // 0x59
  new Fraction(5, 6), // 0x5a
  new Fraction(1, 8), // 0x5b
  new Fraction(3, 8), // 0x5c
  new Fraction(5, 8), // 0x5d
  new Fraction(7, 8), // 0x5e
  new Fraction(1, 1, "1/"), // 0x5f
  new RomanNumber("I", 1), // 0x60
  new RomanNumber("II", 2), // 0x61
  new RomanNumber("III", 3), // 0x62
  new RomanNumber("IV", 4), // 0x63
  new RomanNumber("V", 5), // 0x64
  new RomanNumber("VI", 6), // 0x65
  new RomanNumber("VII", 7), // 0x66
  new RomanNumber("VIII", 8), // 0x67
  new RomanNumber("IX", 9), // 0x68
  new RomanNumber("X", 10), // 0x69
  new RomanNumber("XI", 11), // 0x6a
  new RomanNumber("XII", 12), // 0x6b
  new RomanNumber("L", 50), // 0x6c
  new RomanNumber("C", 100), // 0x6d
  new RomanNumber("D", 500), // 0x6e
  new RomanNumber("M", 1000), // 0x6f
  new RomanNumber("i", 1), // 0x70
  new RomanNumber("ii", 2), // 0x71
  new RomanNumber("iii", 3), // 0x72
  new RomanNumber("iv", 4), // 0x73
  new RomanNumber("v", 5), // 0x74
  new RomanNumber("vi", 6), // 0x75
  new RomanNumber("vii", 7), // 0x76
  new RomanNumber("viii", 8), // 0x77
  new RomanNumber("ix", 9), // 0x78
  new RomanNumber("x", 10), // 0x79
  new RomanNumber("xi", 11), // 0x7a
  new RomanNumber("xii", 12), // 0x7b
  new RomanNumber("l", 50), // 0x7c
  new RomanNumber("c", 100), // 0x7d
  new RomanNumber("d", 500), // 0x7e
  new RomanNumber("m", 1000), // 0x7f
  new RomanNumber("(D", 1000), // 0x80
  new RomanNumber("D)", 5000), // 0x81
  new RomanNumber("((|))", 10_000), // 0x82
  new RomanNumber(")", 100), // 0x83
  null, // 0x84
  new RomanNumber("C,)", 6), // 0x85
  new RomanNumber("\\|/", 50), // 0x86
  new RomanNumber("|)))", 50_000), // 0x87
  new RomanNumber("(((|)))", 100_000), // 0x88
  new Fraction(0, 3), // 0x89
  Digit._2, // 0x8a
  Digit._3, // 0x8b
  null, // 0x8c
  null, // 0x8d
  null, // 0x8e
  null, // 0x8f
  new Chars("<-"), // 0x90
  Char.CARET, // 0x91
  new Chars("->"), // 0x92
  new Chars("\\|/"), // 0x93
  new Chars("<->"), // 0x94
  new Chars("^\\|/"), // 0x95
  new Chars("^\\"), // 0x96
  new Chars("/^"), // 0x97
  new Chars("\\."), // 0x98
  new Chars("./"), // 0x99
  new Chars("</-"), // 0x9a
  new Chars("-/>"), // 0x9b
  new Chars("<~"), // 0x9c
  new Chars("~>"), // 0x9d
  new Chars("<<-"), // 0x9e
  new Chars("^^"), // 0x9f
  new Chars("->>"), // 0xa0
  new Chars("\\\\|//"), // 0xa1
  new Chars("<-<"), // 0xa2
  new Chars(">->"), // 0xa3
  new Chars("<-|"), // 0xa4
  new Chars("^_"), // 0xa5
  new Chars("|->"), // 0xa6
  new Chars("_\\|/"), // 0xa7
  new Chars("^\\|/_"), // 0xa8
  new Chars("<-'"), // 0xa9
  new Chars("'->"), // 0xaa
  new Chars("<-q"), // 0xab
  new Chars("q->"), // 0xac
  new Chars("<~~>"), // 0xad
  new Chars("<-/->"), // 0xae
  new Chars("|/|\\/"), // 0xaf
  new Chars("<-i"), // 0xb0
  new Chars("i->"), // 0xb1
  new Chars("<-l"), // 0xb2
  new Chars("l->"), // 0xb3
  new Chars("-i\\|/"), // 0xb4
  new Chars("<-l"), // 0xb5
  new Chars("\\|/n"), // 0xb6
  new Chars("n\\|/"), // 0xb7
  new Chars("-^\\"), // 0xb8
  new Chars("|<-\n->|"), // 0xb9
  new Chars("u^"), // 0xba
  new Chars("^u"), // 0xbb
  new Chars("/_"), // 0xbc
  new Chars("\\-"), // 0xbd
  new Chars("|\\"), // 0xbe
  new Chars("/|"), // 0xbf
  new Chars("_\\"), // 0xc0
  new Chars("-/"), // 0xc1
  new Chars("|/"), // 0xc2
  new Chars("\\|"), // 0xc3
  new Chars("->\n<-"), // 0xc4
  new Chars("^|\\|/"), // 0xc5
  new Chars("<-\n->"), // 0xc6
  new Chars("<-\n<-"), // 0xc7
  new Chars("^|^|"), // 0xc8
  new Chars("->\n->"), // 0xc9
  new Chars("\\|/\\|/"), // 0xca
  new Chars("/=\\"), // 0xcb
  new Chars("\\=/"), // 0xcc
  new Chars("<=/"), // 0xcd
  new Chars("<=/=>"), // 0xce
  new Chars("/=>"), // 0xcf
  new Chars("<="), // 0xd0
  new Chars("/||\\"), // 0xd1
  new Chars("=>"), // 0xd2
  new Chars("\\||/"), // 0xd3
  new Chars("<=>"), // 0xd4
  new Chars("<||>"), // 0xd5
  new Chars("^\\\\"), // 0xd6
  new Chars("//^"), // 0xd7
  new Chars("\\\\."), // 0xd8
  new Chars(".//"), // 0xd9
  new Chars("<=-"), // 0xda
  new Chars("-=>"), // 0xdb
  new Chars("<~~"), // 0xdc
  new Chars("~~>"), // 0xdd
  new Chars("^|="), // 0xde
  new Chars("=\\|/"), // 0xdf
  new Chars("<- - -"), // 0xe0
  new Chars("^:"), // 0xe1
  new Chars("- - ->"), // 0xe2
  new Chars(":\\|/"), // 0xe3
  new Chars("|<-"), // 0xe4
  new Chars("->|"), // 0xe5
  new Chars("<=|"), // 0xe6
  new Chars("^|_|"), // 0xe7
  new Chars("|=>"), // 0xe8
  new Chars("\\|-|/"), // 0xe9
  new Chars("^|=|"), // 0xea
  new Chars("_|^_L"), // 0xeb
  new Chars("_|^-_L"), // 0xec
  new Chars("_|^|_L"), // 0xed
  new Chars("^^|_|"), // 0xee
  new Chars("^_|^_L"), // 0xef
  new Chars("|=>"), // 0xf0
  new Chars("|^\\-"), // 0xf1
  new Chars("_\\.|"), // 0xf2
  new Chars("^||\\||/"), // 0xf3
  new Chars("-o->"), // 0xf4
  new Chars("\\|/^|"), // 0xf5
  new Chars("->\n->\n->"), // 0xf6
  new Chars("<-|-"), // 0xf7
  new Chars("-|->"), // 0xf8
  new Chars("<-|->"), // 0xf9
  new Chars("<-||-"), // 0xfa
  new Chars("-||->"), // 0xfb
  new Chars("<-||->"), // 0xfc
  new Chars("<|-"), // 0xfd
  new Chars("-|>"), // 0xfe
  new Chars("<|-|>"), // 0xff
  };
}
