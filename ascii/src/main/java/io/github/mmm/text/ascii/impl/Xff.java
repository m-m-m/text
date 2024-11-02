/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+FFxx (Halfwidth and Fullwidth Forms).
 */
final class Xff extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  null, // 0x00
  Char.EXCLAMATION, // 0x01
  Char.QUOTE2, // 0x02
  Char.HASH, // 0x03
  Char.DOLAR, // 0x04
  Char.PERCENT, // 0x05
  Char.AMP, // 0x06
  Char.QUOTE1, // 0x07
  Char.PARENT0, // 0x08
  Char.PARENT1, // 0x09
  Char.ASTERISK, // 0x0a
  Char.PLUS, // 0x0b
  Char.COMMA, // 0x0c
  Char.MINUS, // 0x0d
  Char.PERIOD, // 0x0e
  Char.SLASH, // 0x0f
  Digit._0, // 0x10
  Digit._1, // 0x11
  Digit._2, // 0x12
  Digit._3, // 0x13
  Digit._4, // 0x14
  Digit._5, // 0x15
  Digit._6, // 0x16
  Digit._7, // 0x17
  Digit._8, // 0x18
  Digit._9, // 0x19
  Char.COLON, // 0x1a
  Char.SEMICOL, // 0x1b
  Char.LESS, // 0x1c
  Char.EQUAL, // 0x1d
  Char.GREATER, // 0x1e
  Char.QUESTION, // 0x1f
  Char.AT, // 0x20
  Letter.UP_A, // 0x21
  Letter.UP_B, // 0x22
  Letter.UP_C, // 0x23
  Letter.UP_D, // 0x24
  Letter.UP_E, // 0x25
  Letter.UP_F, // 0x26
  Letter.UP_G, // 0x27
  Letter.UP_H, // 0x28
  Letter.UP_I, // 0x29
  Letter.UP_J, // 0x2a
  Letter.UP_K, // 0x2b
  Letter.UP_L, // 0x2c
  Letter.UP_M, // 0x2d
  Letter.UP_N, // 0x2e
  Letter.UP_O, // 0x2f
  Letter.UP_P, // 0x30
  Letter.UP_Q, // 0x31
  Letter.UP_R, // 0x32
  Letter.UP_S, // 0x33
  Letter.UP_T, // 0x34
  Letter.UP_U, // 0x35
  Letter.UP_V, // 0x36
  Letter.UP_W, // 0x37
  Letter.UP_X, // 0x38
  Letter.UP_Y, // 0x39
  Letter.UP_Z, // 0x3a
  Char.BRACKET0, // 0x3b
  Char.BKSLASH, // 0x3c
  Char.BRACKET1, // 0x3d
  Char.CARET, // 0x3e
  Char.UNDSCORE, // 0x3f
  Char.GRAVE, // 0x40
  Letter.LO_A, // 0x41
  Letter.LO_B, // 0x42
  Letter.LO_C, // 0x43
  Letter.LO_D, // 0x44
  Letter.LO_E, // 0x45
  Letter.LO_F, // 0x46
  Letter.LO_G, // 0x47
  Letter.LO_H, // 0x48
  Letter.LO_I, // 0x49
  Letter.LO_J, // 0x4a
  Letter.LO_K, // 0x4b
  Letter.LO_L, // 0x4c
  Letter.LO_M, // 0x4d
  Letter.LO_N, // 0x4e
  Letter.LO_O, // 0x4f
  Letter.LO_P, // 0x50
  Letter.LO_Q, // 0x51
  Letter.LO_R, // 0x52
  Letter.LO_S, // 0x53
  Letter.LO_T, // 0x54
  Letter.LO_U, // 0x55
  Letter.LO_V, // 0x56
  Letter.LO_W, // 0x57
  Letter.LO_X, // 0x58
  Letter.LO_Y, // 0x59
  Letter.LO_Z, // 0x5a
  Char.CURLY0, // 0x5b
  Char.PIPE, // 0x5c
  Char.CURLY1, // 0x5d
  Char.TILDE, // 0x5e
  null, // 0x5f
  null, // 0x60
  Char.PERIOD, // 0x61
  Char.BRACKET0, // 0x62
  Char.BRACKET1, // 0x63
  Char.COMMA, // 0x64
  Char.ASTERISK, // 0x65
  LO_WO, // 0x66
  Letter.LO_A, // 0x67
  Letter.LO_I, // 0x68
  Letter.LO_U, // 0x69
  Letter.LO_E, // 0x6a
  Letter.LO_O, // 0x6b
  LO_YA, // 0x6c
  LO_YU, // 0x6d
  LO_YO, // 0x6e
  LO_TU, // 0x6f
  Char.PLUS, // 0x70
  Letter.LO_A, // 0x71
  Letter.LO_I, // 0x72
  Letter.LO_U, // 0x73
  Letter.LO_E, // 0x74
  Letter.LO_O, // 0x75
  LO_KA, // 0x76
  LO_KI, // 0x77
  LO_KU, // 0x78
  LO_KE, // 0x79
  LO_KO, // 0x7a
  LO_SA, // 0x7b
  LO_SI, // 0x7c
  LO_SU, // 0x7d
  LO_SE, // 0x7e
  LO_SO, // 0x7f
  LO_TA, // 0x80
  LO_TI, // 0x81
  LO_TU, // 0x82
  LO_TE, // 0x83
  LO_TO, // 0x84
  LO_NA, // 0x85
  LO_NI, // 0x86
  LO_NU, // 0x87
  LO_NE, // 0x88
  LO_NO, // 0x89
  LO_HA, // 0x8a
  LO_HI, // 0x8b
  LO_HU, // 0x8c
  LO_HE, // 0x8d
  LO_HO, // 0x8e
  LO_MA, // 0x8f
  LO_MI, // 0x90
  LO_MU, // 0x91
  LO_ME, // 0x92
  LO_MO, // 0x93
  LO_YA, // 0x94
  LO_YU, // 0x95
  LO_YO, // 0x96
  LO_RA, // 0x97
  LO_RI, // 0x98
  LO_RU, // 0x99
  LO_RE, // 0x9a
  LO_RO, // 0x9b
  LO_WA, // 0x9c
  Letter.LO_N, // 0x9d
  Char.COLON, // 0x9e
  Char.SEMICOL, // 0x9f
  null, // 0xa0
  Letter.LO_G, // 0xa1
  LO_GG, // 0xa2
  LO_GS, // 0xa3
  Letter.LO_N, // 0xa4
  LO_NJ, // 0xa5
  LO_NH, // 0xa6
  Letter.LO_D, // 0xa7
  LO_DD, // 0xa8
  Letter.LO_R, // 0xa9
  LO_LG, // 0xaa
  LO_LM, // 0xab
  LO_LB, // 0xac
  LO_LS, // 0xad
  LO_LT, // 0xae
  LO_LP, // 0xaf
  LO_RH, // 0xb0
  Letter.LO_M, // 0xb1
  Letter.LO_B, // 0xb2
  LO_BB, // 0xb3
  LO_BS, // 0xb4
  Letter.LO_S, // 0xb5
  LO_SS, // 0xb6
  null, // 0xb7
  Letter.LO_J, // 0xb8
  LO_JJ, // 0xb9
  Letter.LO_C, // 0xba
  Letter.LO_K, // 0xbb
  Letter.LO_T, // 0xbc
  Letter.LO_P, // 0xbd
  Letter.LO_H, // 0xbe
  null, // 0xbf
  null, // 0xc0
  null, // 0xc1
  Letter.LO_A, // 0xc2
  LO_AE, // 0xc3
  LO_YA, // 0xc4
  new Letters("yae"), // 0xc5
  LO_EO, // 0xc6
  Letter.LO_E, // 0xc7
  null, // 0xc8
  null, // 0xc9
  new Letters("yeo"), // 0xca
  LO_YE, // 0xcb
  Letter.LO_O, // 0xcc
  LO_WA, // 0xcd
  new Letters("wae"), // 0xce
  LO_OE, // 0xcf
  null, // 0xd0
  null, // 0xd1
  LO_YO, // 0xd2
  Letter.LO_U, // 0xd3
  new Letters("weo"), // 0xd4
  LO_WE, // 0xd5
  LO_WI, // 0xd6
  LO_YU, // 0xd7
  null, // 0xd8
  null, // 0xd9
  LO_EU, // 0xda
  LO_YI, // 0xdb
  Letter.LO_I, // 0xdc
  null, // 0xdd
  null, // 0xde
  null, // 0xdf
  Currency.CENT, // 0xe0
  Currency.POUND, // 0xe1
  Char.EXCLAMATION, // 0xe2
  Char.MINUS, // 0xe3
  Char.PIPE, // 0xe4
  Currency.YEN, // 0xe5
  Currency.WON, // 0xe6
  null, // 0xe7
  Char.PIPE, // 0xe8
  Char.MINUS, // 0xe9
  Char.PIPE, // 0xea
  Char.MINUS, // 0xeb
  Char.PIPE, // 0xec
  Char.HASH, // 0xed
  Letter.UP_O, // 0xee
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
  Char.CURLY0, // 0xf9
  Char.PIPE, // 0xfa
  Char.CURLY1, // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null // 0xff
  };
}
