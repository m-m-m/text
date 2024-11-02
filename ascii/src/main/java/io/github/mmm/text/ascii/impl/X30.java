/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+30xx (CJK Symbols and Punctuation, Hiragana, Katakana).
 */
final class X30 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  Char.SPACE, // 0x00
  Char.COMMA, // 0x01
  Char.PERIOD, // 0x02
  new Word("ditto"), // 0x03
  new Chars("[JIS]"), // 0x04
  new Chars("[IdIt]"), // 0x05
  Char.SLASH, // 0x06
  Digit._0, // 0x07
  Char.LESS, // 0x08
  Char.GREATER, // 0x09
  new Chars("<<"), // 0x0a
  new Chars(">>"), // 0x0b
  Char.BRACKET0, // 0x0c
  Char.BRACKET1, // 0x0d
  Char.BRACKET0, // 0x0e
  Char.BRACKET1, // 0x0f
  new Chars("[("), // 0x10
  new Chars(")]"), // 0x11
  Char.AT, // 0x12
  new Chars("X "), // 0x13
  Char.BRACKET0, // 0x14
  Char.BRACKET1, // 0x15
  new Chars("[("), // 0x16
  new Chars(")]"), // 0x17
  new Chars("[|"), // 0x18
  new Chars("|]"), // 0x19
  new Chars("[["), // 0x1a
  new Chars("]]"), // 0x1b
  Char.TILDE, // 0x1c
  new Chars("``"), // 0x1d
  new Chars("\'\'"), // 0x1e
  new Chars(",,"), // 0x1f
  Char.AT, // 0x20
  new GenericNumber(1, "|"), // 0x21
  new GenericNumber(2, "||"), // 0x22
  new GenericNumber(3, "|||"), // 0x23
  new GenericNumber(4, "X"), // 0x24
  new GenericNumber(5, "y"), // 0x25
  new GenericNumber(6, "_|_"), // 0x26
  new GenericNumber(7, "=|="), // 0x27
  new GenericNumber(8, "_=|=_"), // 0x28
  new GenericNumber(9, "'-x"), // 0x29
  Char.PERIOD, // 0x2a
  Char.PERIOD, // 0x2b
  Char.PERIOD, // 0x2c
  Char.PERIOD, // 0x2d
  Char.PERIOD, // 0x2e
  Char.COLON, // 0x2f
  new Chars("~~"), // 0x30
  Char.LESS, // 0x31
  new Chars("<\""), // 0x32
  Char.SLASH, // 0x33
  new Chars("/\""), // 0x34
  Char.BKSLASH, // 0x35
  Char.AT, // 0x36
  new Chars(" XX\n"), // 0x37
  new GenericNumber(10, "+"), // 0x38
  new GenericNumber(20, "++"), // 0x39
  new GenericNumber(30, "+++"), // 0x3a
  new Chars("{IdIt}"), // 0x3b
  new Chars("[/]"), // 0x3c
  Char.PERIOD, // 0x3d
  null, // 0x3e
  new Chars("[X]"), // 0x3f
  null, // 0x40
  Letter.LO_A, // 0x41
  Letter.LO_A, // 0x42
  Letter.LO_I, // 0x43
  Letter.LO_I, // 0x44
  Letter.LO_U, // 0x45
  Letter.LO_U, // 0x46
  Letter.LO_E, // 0x47
  Letter.LO_E, // 0x48
  Letter.LO_O, // 0x49
  Letter.LO_O, // 0x4a
  LO_KA, // 0x4b
  LO_GA, // 0x4c
  LO_KI, // 0x4d
  LO_GI, // 0x4e
  LO_KU, // 0x4f
  LO_GU, // 0x50
  LO_KE, // 0x51
  LO_GE, // 0x52
  LO_KO, // 0x53
  LO_GO, // 0x54
  LO_SA, // 0x55
  LO_ZA, // 0x56
  LO_SI, // 0x57
  LO_ZI, // 0x58
  LO_SU, // 0x59
  LO_ZU, // 0x5a
  LO_SE, // 0x5b
  LO_ZE, // 0x5c
  LO_SO, // 0x5d
  LO_ZO, // 0x5e
  LO_TA, // 0x5f
  LO_DA, // 0x60
  LO_TI, // 0x61
  LO_DI, // 0x62
  LO_TU, // 0x63
  LO_TU, // 0x64
  LO_DU, // 0x65
  LO_TE, // 0x66
  LO_DE, // 0x67
  LO_TO, // 0x68
  LO_DO, // 0x69
  LO_NA, // 0x6a
  LO_NI, // 0x6b
  LO_NU, // 0x6c
  LO_NE, // 0x6d
  LO_NO, // 0x6e
  LO_HA, // 0x6f
  LO_BA, // 0x70
  LO_PA, // 0x71
  LO_HI, // 0x72
  LO_BI, // 0x73
  LO_PI, // 0x74
  LO_HU, // 0x75
  LO_BU, // 0x76
  LO_PU, // 0x77
  LO_HE, // 0x78
  LO_BE, // 0x79
  LO_PE, // 0x7a
  LO_HO, // 0x7b
  LO_BO, // 0x7c
  LO_PO, // 0x7d
  LO_MA, // 0x7e
  LO_MI, // 0x7f
  LO_MU, // 0x80
  LO_ME, // 0x81
  LO_MO, // 0x82
  LO_YA, // 0x83
  LO_YA, // 0x84
  LO_YU, // 0x85
  LO_YU, // 0x86
  LO_YO, // 0x87
  LO_YO, // 0x88
  LO_RA, // 0x89
  LO_RI, // 0x8a
  LO_RU, // 0x8b
  LO_RE, // 0x8c
  LO_RO, // 0x8d
  LO_WA, // 0x8e
  LO_WA, // 0x8f
  LO_WI, // 0x90
  LO_WE, // 0x91
  LO_WO, // 0x92
  Letter.LO_N, // 0x93
  LO_VU, // 0x94
  null, // 0x95
  null, // 0x96
  null, // 0x97
  null, // 0x98
  null, // 0x99
  null, // 0x9a
  null, // 0x9b
  null, // 0x9c
  Char.QUOTE2, // 0x9d
  Char.QUOTE2, // 0x9e
  null, // 0x9f
  null, // 0xa0
  Letter.LO_A, // 0xa1
  Letter.LO_A, // 0xa2
  Letter.LO_I, // 0xa3
  Letter.LO_I, // 0xa4
  Letter.LO_U, // 0xa5
  Letter.LO_U, // 0xa6
  Letter.LO_E, // 0xa7
  Letter.LO_E, // 0xa8
  Letter.LO_O, // 0xa9
  Letter.LO_O, // 0xaa
  LO_KA, // 0xab
  LO_GA, // 0xac
  LO_KI, // 0xad
  LO_GI, // 0xae
  LO_KU, // 0xaf
  LO_GU, // 0xb0
  LO_KE, // 0xb1
  LO_GE, // 0xb2
  LO_KO, // 0xb3
  LO_GO, // 0xb4
  LO_SA, // 0xb5
  LO_ZA, // 0xb6
  LO_SI, // 0xb7
  LO_ZI, // 0xb8
  LO_SU, // 0xb9
  LO_ZU, // 0xba
  LO_SE, // 0xbb
  LO_ZE, // 0xbc
  LO_SO, // 0xbd
  LO_ZO, // 0xbe
  LO_TA, // 0xbf
  LO_DA, // 0xc0
  LO_TI, // 0xc1
  LO_DI, // 0xc2
  LO_TU, // 0xc3
  LO_TU, // 0xc4
  LO_DU, // 0xc5
  LO_TE, // 0xc6
  LO_DE, // 0xc7
  LO_TO, // 0xc8
  LO_DO, // 0xc9
  LO_NA, // 0xca
  LO_NI, // 0xcb
  LO_NU, // 0xcc
  LO_NE, // 0xcd
  LO_NO, // 0xce
  LO_HA, // 0xcf
  LO_BA, // 0xd0
  LO_PA, // 0xd1
  LO_HI, // 0xd2
  LO_BI, // 0xd3
  LO_PI, // 0xd4
  LO_HU, // 0xd5
  LO_BU, // 0xd6
  LO_PU, // 0xd7
  LO_HE, // 0xd8
  LO_BE, // 0xd9
  LO_PE, // 0xda
  LO_HO, // 0xdb
  LO_BO, // 0xdc
  LO_PO, // 0xdd
  LO_MA, // 0xde
  LO_MI, // 0xdf
  LO_MU, // 0xe0
  LO_ME, // 0xe1
  LO_MO, // 0xe2
  LO_YA, // 0xe3
  LO_YA, // 0xe4
  LO_YU, // 0xe5
  LO_YU, // 0xe6
  LO_YO, // 0xe7
  LO_YO, // 0xe8
  LO_RA, // 0xe9
  LO_RI, // 0xea
  LO_RU, // 0xeb
  LO_RE, // 0xec
  LO_RO, // 0xed
  LO_WA, // 0xee
  LO_WA, // 0xef
  LO_WI, // 0xf0
  LO_WE, // 0xf1
  LO_WO, // 0xf2
  Letter.LO_N, // 0xf3
  LO_VU, // 0xf4
  LO_KA, // 0xf5
  LO_KE, // 0xf6
  LO_VA, // 0xf7
  LO_VI, // 0xf8
  LO_VE, // 0xf9
  LO_VO, // 0xfa
  null, // 0xfb
  null, // 0xfc
  Char.QUOTE2, // 0xfd
  Char.QUOTE2, // 0xfe
  new Letters("koto") // 0xff
  };
}
