/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+0Fxx (Tibetan).
 */
final class X0f extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("AUM"), // 0x00
  null, // 0x01
  null, // 0x02
  null, // 0x03
  null, // 0x04
  null, // 0x05
  null, // 0x06
  null, // 0x07
  new Chars(" // "), // 0x08
  new Chars(" * "), // 0x09
  null, // 0x0a
  Char.MINUS, // 0x0b
  new Chars(" / "), // 0x0c
  new Chars(" / "), // 0x0d
  new Chars(" // "), // 0x0e
  new Chars(" -/ "), // 0x0f
  new Chars(" +/ "), // 0x10
  new Chars(" X/ "), // 0x11
  new Chars(" /XX/ "), // 0x12
  new Chars(" /X/ "), // 0x13
  new Chars(", "), // 0x14
  null, // 0x15
  null, // 0x16
  null, // 0x17
  null, // 0x18
  null, // 0x19
  null, // 0x1a
  null, // 0x1b
  null, // 0x1c
  null, // 0x1d
  null, // 0x1e
  null, // 0x1f
  Digit._0, // 0x20
  Digit._1, // 0x21
  Digit._2, // 0x22
  Digit._3, // 0x23
  Digit._4, // 0x24
  Digit._5, // 0x25
  Digit._6, // 0x26
  Digit._7, // 0x27
  Digit._8, // 0x28
  Digit._9, // 0x29
  new Fraction(1, 2), // 0x2a
  new Fraction(3, 2), // 0x2b
  new Fraction(5, 2), // 0x2c
  new Fraction(7, 2), // 0x2d
  new Fraction(9, 2), // 0x2e
  new Fraction(11, 2), // 0x2f
  new Fraction(13, 2), // 0x30
  new Fraction(15, 2), // 0x31
  new Fraction(17, 2), // 0x32
  new Fraction(-1, 2), // 0x33
  Char.PLUS, // 0x34
  Char.ASTERISK, // 0x35
  Char.CARET, // 0x36
  Char.UNDSCORE, // 0x37
  null, // 0x38
  Char.TILDE, // 0x39
  null, // 0x3a
  Char.BRACKET1, // 0x3b
  new Chars("[["), // 0x3c
  new Chars("]]"), // 0x3d
  null, // 0x3e
  null, // 0x3f
  Letter.LO_K, // 0x40
  LO_KH, // 0x41
  Letter.LO_G, // 0x42
  LO_GH, // 0x43
  LO_NG, // 0x44
  Letter.LO_C, // 0x45
  LO_CH, // 0x46
  Letter.LO_J, // 0x47
  null, // 0x48
  LO_NY, // 0x49
  LO_TT, // 0x4a
  new Letters("tth"), // 0x4b
  LO_DD, // 0x4c
  new Letters("ddh"), // 0x4d
  LO_NN, // 0x4e
  Letter.LO_T, // 0x4f
  LO_TH, // 0x50
  Letter.LO_D, // 0x51
  LO_DH, // 0x52
  Letter.LO_N, // 0x53
  Letter.LO_P, // 0x54
  LO_PH, // 0x55
  Letter.LO_B, // 0x56
  LO_BH, // 0x57
  Letter.LO_M, // 0x58
  LO_TS, // 0x59
  new Letters("tsh"), // 0x5a
  LO_DZ, // 0x5b
  new Letters("dzh"), // 0x5c
  Letter.LO_W, // 0x5d
  LO_ZH, // 0x5e
  Letter.LO_Z, // 0x5f
  Char.QUOTE1, // 0x60
  Letter.LO_Y, // 0x61
  Letter.LO_R, // 0x62
  Letter.LO_L, // 0x63
  LO_SH, // 0x64
  new Letters("ssh"), // 0x65
  Letter.LO_S, // 0x66
  Letter.LO_H, // 0x67
  Letter.LO_A, // 0x68
  new Letters("kss"), // 0x69
  Letter.LO_R, // 0x6a
  null, // 0x6b
  null, // 0x6c
  null, // 0x6d
  null, // 0x6e
  null, // 0x6f
  null, // 0x70
  LO_AA, // 0x71
  Letter.LO_I, // 0x72
  LO_II, // 0x73
  Letter.LO_U, // 0x74
  LO_UU, // 0x75
  Letter.UP_R, // 0x76
  new Letters("RR"), // 0x77
  Letter.UP_L, // 0x78
  UP_LL, // 0x79
  Letter.LO_E, // 0x7a
  LO_EE, // 0x7b
  Letter.LO_O, // 0x7c
  LO_OO, // 0x7d
  Letter.UP_M, // 0x7e
  Letter.UP_H, // 0x7f
  Letter.LO_I, // 0x80
  LO_II, // 0x81
  null, // 0x82
  null, // 0x83
  null, // 0x84
  null, // 0x85
  null, // 0x86
  null, // 0x87
  null, // 0x88
  null, // 0x89
  null, // 0x8a
  null, // 0x8b
  null, // 0x8c
  null, // 0x8d
  null, // 0x8e
  null, // 0x8f
  Letter.LO_K, // 0x90
  LO_KH, // 0x91
  Letter.LO_G, // 0x92
  LO_GH, // 0x93
  LO_NG, // 0x94
  Letter.LO_C, // 0x95
  LO_CH, // 0x96
  Letter.LO_J, // 0x97
  null, // 0x98
  LO_NY, // 0x99
  LO_TT, // 0x9a
  new Letters("tth"), // 0x9b
  LO_DD, // 0x9c
  new Letters("ddh"), // 0x9d
  LO_NN, // 0x9e
  Letter.LO_T, // 0x9f
  LO_TH, // 0xa0
  Letter.LO_D, // 0xa1
  LO_DH, // 0xa2
  Letter.LO_N, // 0xa3
  Letter.LO_P, // 0xa4
  LO_PH, // 0xa5
  Letter.LO_B, // 0xa6
  LO_BH, // 0xa7
  Letter.LO_M, // 0xa8
  LO_TS, // 0xa9
  new Letters("tsh"), // 0xaa
  LO_DZ, // 0xab
  new Letters("dzh"), // 0xac
  Letter.LO_W, // 0xad
  LO_ZH, // 0xae
  Letter.LO_Z, // 0xaf
  Char.QUOTE1, // 0xb0
  Letter.LO_Y, // 0xb1
  Letter.LO_R, // 0xb2
  Letter.LO_L, // 0xb3
  LO_SH, // 0xb4
  LO_SS, // 0xb5
  Letter.LO_S, // 0xb6
  Letter.LO_H, // 0xb7
  Letter.LO_A, // 0xb8
  new Letters("kss"), // 0xb9
  Letter.LO_W, // 0xba
  Letter.LO_Y, // 0xbb
  Letter.LO_R, // 0xbc
  null, // 0xbd
  Letter.UP_X, // 0xbe
  new Chars(" :X: "), // 0xbf
  new Chars(" /O/ "), // 0xc0
  new Chars(" /o/ "), // 0xc1
  new Chars(" \\o\\ "), // 0xc2
  new Chars(" (O) "), // 0xc3
  null, // 0xc4
  null, // 0xc5
  null, // 0xc6
  null, // 0xc7
  null, // 0xc8
  null, // 0xc9
  null, // 0xca
  null, // 0xcb
  null, // 0xcc
  null, // 0xcd
  null, // 0xce
  null, // 0xcf
  null, // 0xd0
  null, // 0xd1
  null, // 0xd2
  null, // 0xd3
  null, // 0xd4
  null, // 0xd5
  null, // 0xd6
  null, // 0xd7
  null, // 0xd8
  null, // 0xd9
  null, // 0xda
  null, // 0xdb
  null, // 0xdc
  null, // 0xdd
  null, // 0xde
  null, // 0xdf
  null, // 0xe0
  null, // 0xe1
  null, // 0xe2
  null, // 0xe3
  null, // 0xe4
  null, // 0xe5
  null, // 0xe6
  null, // 0xe7
  null, // 0xe8
  null, // 0xe9
  null, // 0xea
  null, // 0xeb
  null, // 0xec
  null, // 0xed
  null, // 0xee
  null, // 0xef
  null, // 0xf0
  null, // 0xf1
  null, // 0xf2
  null, // 0xf3
  null, // 0xf4
  null, // 0xf5
  null, // 0xf6
  null, // 0xf7
  null, // 0xf8
  null, // 0xf9
  null, // 0xfa
  null, // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}
