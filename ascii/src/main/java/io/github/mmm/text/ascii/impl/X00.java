/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+00xx (Basic Latin, Latin-1 Supplement).
 */
final class X00 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new ControlChar(0x00), // 0x00
  new ControlChar(0x01), // 0x01
  new ControlChar(0x02), // 0x02
  new ControlChar(0x03), // 0x03
  new ControlChar(0x04), // 0x04
  new ControlChar(0x05), // 0x05
  new ControlChar(0x06), // 0x06
  new ControlChar(0x07), // 0x07
  new ControlChar(0x08), // 0x08
  Char.TAB, // 0x09
  Char.LF, // 0x0a
  new ControlChar(0x0b), // 0x0b
  new ControlChar(0x0c), // 0x0c
  new ControlChar(0x0d), // 0x0d
  new ControlChar(0x0e), // 0x0e
  new ControlChar(0x0f), // 0x0f
  new ControlChar(0x10), // 0x10
  new ControlChar(0x11), // 0x11
  new ControlChar(0x12), // 0x12
  new ControlChar(0x13), // 0x13
  new ControlChar(0x14), // 0x14
  new ControlChar(0x15), // 0x15
  new ControlChar(0x16), // 0x16
  new ControlChar(0x17), // 0x17
  new ControlChar(0x18), // 0x18
  new ControlChar(0x19), // 0x19
  new ControlChar(0x1a), // 0x1a
  new ControlChar(0x1b), // 0x1b
  new ControlChar(0x1c), // 0x1c
  new ControlChar(0x1d), // 0x1d
  new ControlChar(0x1e), // 0x1e
  new ControlChar(0x1f), // 0x1f
  Char.SPACE, // 0x20
  Char.EXCLAMATION, // 0x21
  Char.QUOTE2, // 0x22
  Char.HASH, // 0x23
  Char.DOLAR, // 0x24
  Char.PERCENT, // 0x25
  Char.AMP, // 0x26
  Char.QUOTE1, // 0x27
  Char.PARENT0, // 0x28
  Char.PARENT1, // 0x29
  Char.ASTERISK, // 0x2a
  Char.PLUS, // 0x2b
  Char.COMMA, // 0x2c
  Char.MINUS, // 0x2d
  Char.PERIOD, // 0x2e
  Char.SLASH, // 0x2f
  Digit._0, // 0x30
  Digit._1, // 0x31
  Digit._2, // 0x32
  Digit._3, // 0x33
  Digit._4, // 0x34
  Digit._5, // 0x35
  Digit._6, // 0x36
  Digit._7, // 0x37
  Digit._8, // 0x38
  Digit._9, // 0x39
  Char.COLON, // 0x3a
  Char.SEMICOL, // 0x3b
  Char.LESS, // 0x3c
  Char.EQUAL, // 0x3d
  Char.GREATER, // 0x3e
  Char.QUESTION, // 0x3f
  Char.AT, // 0x40
  Letter.UP_A, // 0x41
  Letter.UP_B, // 0x42
  Letter.UP_C, // 0x43
  Letter.UP_D, // 0x44
  Letter.UP_E, // 0x45
  Letter.UP_F, // 0x46
  Letter.UP_G, // 0x47
  Letter.UP_H, // 0x48
  Letter.UP_I, // 0x49
  Letter.UP_J, // 0x4a
  Letter.UP_K, // 0x4b
  Letter.UP_L, // 0x4c
  Letter.UP_M, // 0x4d
  Letter.UP_N, // 0x4e
  Letter.UP_O, // 0x4f
  Letter.UP_P, // 0x50
  Letter.UP_Q, // 0x51
  Letter.UP_R, // 0x52
  Letter.UP_S, // 0x53
  Letter.UP_T, // 0x54
  Letter.UP_U, // 0x55
  Letter.UP_V, // 0x56
  Letter.UP_W, // 0x57
  Letter.UP_X, // 0x58
  Letter.UP_Y, // 0x59
  Letter.UP_Z, // 0x5a
  Char.BRACKET0, // 0x5b
  Char.BKSLASH, // 0x5c
  Char.BRACKET1, // 0x5d
  Char.CARET, // 0x5e
  Char.UNDSCORE, // 0x5f
  Char.GRAVE, // 0x60
  Letter.LO_A, // 0x61
  Letter.LO_B, // 0x62
  Letter.LO_C, // 0x63
  Letter.LO_D, // 0x64
  Letter.LO_E, // 0x65
  Letter.LO_F, // 0x66
  Letter.LO_G, // 0x67
  Letter.LO_H, // 0x68
  Letter.LO_I, // 0x69
  Letter.LO_J, // 0x6a
  Letter.LO_K, // 0x6b
  Letter.LO_L, // 0x6c
  Letter.LO_M, // 0x6d
  Letter.LO_N, // 0x6e
  Letter.LO_O, // 0x6f
  Letter.LO_P, // 0x70
  Letter.LO_Q, // 0x71
  Letter.LO_R, // 0x72
  Letter.LO_S, // 0x73
  Letter.LO_T, // 0x74
  Letter.LO_U, // 0x75
  Letter.LO_V, // 0x76
  Letter.LO_W, // 0x77
  Letter.LO_X, // 0x78
  Letter.LO_Y, // 0x79
  Letter.LO_Z, // 0x7a
  Char.CURLY0, // 0x7b
  Char.PIPE, // 0x7c
  Char.CURLY1, // 0x7d
  Char.TILDE, // 0x7e
  null, // 0x7f
  null, // 0x80
  null, // 0x81
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
  null, // 0x90
  null, // 0x91
  null, // 0x92
  null, // 0x93
  null, // 0x94
  null, // 0x95
  null, // 0x96
  null, // 0x97
  null, // 0x98
  null, // 0x99
  null, // 0x9a
  null, // 0x9b
  null, // 0x9c
  null, // 0x9d
  null, // 0x9e
  null, // 0x9f
  Char.SPACE, // 0xa0
  Char.EXCLAMATION, // 0xa1
  Currency.CENT, // 0xa2
  Currency.POUND, // 0xa3
  Currency.SIGN, // 0xa4
  Currency.YEN, // 0xa5
  Char.PIPE, // 0xa6
  new Chars("SS"), // 0xa7
  Char.QUOTE2, // 0xa8
  new Chars("(c)"), // 0xa9
  Letter.LO_A, // 0xaa
  new Chars("<<"), // 0xab
  Char.EXCLAMATION, // 0xac
  null, // 0xad
  new Chars("(r)"), // 0xae
  Char.MINUS, // 0xaf
  new Chars("deg"), // 0xb0
  new Chars("+-"), // 0xb1
  new Chars("^2"), // 0xb2
  new Chars("^3"), // 0xb3
  Char.QUOTE1, // 0xb4
  Letter.LO_U, // 0xb5
  new Chars("[P]"), // 0xb6
  Char.ASTERISK, // 0xb7
  Char.COMMA, // 0xb8
  Digit._1, // 0xb9
  Letter.LO_O, // 0xba
  new Chars(">>"), // 0xbb
  new Chars("1/4"), // 0xbc
  new Chars("1/2"), // 0xbd
  new Chars("3/4"), // 0xbe
  Char.QUESTION, // 0xbf
  Letter.UP_A, // 0xc0
  Letter.UP_A, // 0xc1
  Letter.UP_A, // 0xc2
  Letter.UP_A, // 0xc3
  UP_AE, // 0xc4
  Letter.UP_A, // 0xc5
  UP_AE, // 0xc6
  Letter.UP_C, // 0xc7
  Letter.UP_E, // 0xc8
  Letter.UP_E, // 0xc9
  Letter.UP_E, // 0xca
  Letter.UP_E, // 0xcb
  Letter.UP_I, // 0xcc
  Letter.UP_I, // 0xcd
  Letter.UP_I, // 0xce
  Letter.UP_I, // 0xcf
  Letter.UP_D, // 0xd0
  Letter.UP_N, // 0xd1
  Letter.UP_O, // 0xd2
  Letter.UP_O, // 0xd3
  Letter.UP_O, // 0xd4
  Letter.UP_O, // 0xd5
  UP_OE, // 0xd6
  Letter.LO_X, // 0xd7
  UP_OE, // 0xd8
  Letter.UP_U, // 0xd9
  Letter.UP_U, // 0xda
  Letter.UP_U, // 0xdb
  UP_UE, // 0xdc
  Letter.UP_Y, // 0xdd
  CAP_TH, // 0xde
  LO_SS, // 0xdf
  Letter.LO_A, // 0xe0
  Letter.LO_A, // 0xe1
  Letter.LO_A, // 0xe2
  Letter.LO_A, // 0xe3
  LO_AE, // 0xe4
  LO_AE, // 0xe5
  LO_AE, // 0xe6
  Letter.LO_C, // 0xe7
  Letter.LO_E, // 0xe8
  Letter.LO_E, // 0xe9
  Letter.LO_E, // 0xea
  Letter.LO_E, // 0xeb
  Letter.LO_I, // 0xec
  Letter.LO_I, // 0xed
  Letter.LO_I, // 0xee
  Letter.LO_I, // 0xef
  Letter.LO_D, // 0xf0
  Letter.LO_N, // 0xf1
  Letter.LO_O, // 0xf2
  Letter.LO_O, // 0xf3
  Letter.LO_O, // 0xf4
  Letter.LO_O, // 0xf5
  LO_OE, // 0xf6
  Char.SLASH, // 0xf7
  LO_OE, // 0xf8
  Letter.LO_U, // 0xf9
  Letter.LO_U, // 0xfa
  Letter.LO_U, // 0xfb
  LO_UE, // 0xfc
  Letter.LO_Y, // 0xfd
  LO_TH, // 0xfe
  Letter.LO_Y };
}
