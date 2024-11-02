/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+02xx (end of Latin Extended-B, IPA Extensions, Spacing Modifiers).
 */
final class X02 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  Letter.UP_A, // 0x00
  Letter.LO_A, // 0x01
  Letter.UP_A, // 0x02
  Letter.LO_A, // 0x03
  Letter.UP_E, // 0x04
  Letter.LO_E, // 0x05
  Letter.UP_E, // 0x06
  Letter.LO_E, // 0x07
  Letter.UP_I, // 0x08
  Letter.LO_I, // 0x09
  Letter.UP_I, // 0x0a
  Letter.LO_I, // 0x0b
  Letter.UP_O, // 0x0c
  Letter.LO_O, // 0x0d
  Letter.UP_O, // 0x0e
  Letter.LO_O, // 0x0f
  Letter.UP_R, // 0x10
  Letter.LO_R, // 0x11
  Letter.UP_R, // 0x12
  Letter.LO_R, // 0x13
  Letter.UP_U, // 0x14
  Letter.LO_U, // 0x15
  Letter.UP_U, // 0x16
  Letter.LO_U, // 0x17
  Letter.UP_S, // 0x18
  Letter.LO_S, // 0x19
  Letter.UP_T, // 0x1a
  Letter.LO_T, // 0x1b
  Letter.UP_Y, // 0x1c
  Letter.LO_Y, // 0x1d
  Letter.UP_H, // 0x1e
  Letter.LO_H, // 0x1f
  Letter.UP_N, // 0x20
  Letter.LO_D, // 0x21
  new Chars("Ou"), // 0x22
  new Chars("ou"), // 0x23
  Letter.UP_Z, // 0x24
  Letter.LO_Z, // 0x25
  Letter.UP_A, // 0x26
  Letter.LO_A, // 0x27
  Letter.UP_E, // 0x28
  Letter.LO_E, // 0x29
  Letter.UP_O, // 0x2a
  Letter.LO_O, // 0x2b
  Letter.UP_O, // 0x2c
  Letter.LO_O, // 0x2d
  Letter.UP_O, // 0x2e
  Letter.LO_O, // 0x2f
  Letter.UP_O, // 0x30
  Letter.LO_O, // 0x31
  Letter.UP_Y, // 0x32
  Letter.LO_Y, // 0x33
  Letter.LO_L, // 0x34
  Letter.LO_N, // 0x35
  Letter.LO_T, // 0x36
  Letter.LO_J, // 0x37
  new Chars("db"), // 0x38
  new Chars("qp"), // 0x39
  Letter.UP_A, // 0x3a
  Letter.UP_C, // 0x3b
  Letter.LO_C, // 0x3c
  Letter.UP_L, // 0x3d
  Letter.UP_T, // 0x3e
  Letter.LO_S, // 0x3f
  Letter.LO_Z, // 0x40
  null, // 0x41
  null, // 0x42
  Letter.UP_B, // 0x43
  Letter.UP_U, // 0x44
  Char.CARET, // 0x45
  Letter.UP_E, // 0x46
  Letter.LO_E, // 0x47
  Letter.UP_J, // 0x48
  Letter.LO_J, // 0x49
  Letter.LO_Q, // 0x4a
  Letter.LO_Q, // 0x4b
  Letter.UP_R, // 0x4c
  Letter.LO_R, // 0x4d
  Letter.UP_Y, // 0x4e
  Letter.LO_Y, // 0x4f
  Letter.LO_A, // 0x50
  Letter.LO_A, // 0x51
  Letter.LO_A, // 0x52
  Letter.LO_B, // 0x53
  Letter.LO_O, // 0x54
  Letter.LO_C, // 0x55
  Letter.LO_D, // 0x56
  Letter.LO_D, // 0x57
  Letter.LO_E, // 0x58
  Char.AT, // 0x59
  Char.AT, // 0x5a
  Letter.LO_E, // 0x5b
  Letter.LO_E, // 0x5c
  Letter.LO_E, // 0x5d
  Letter.LO_E, // 0x5e
  Letter.LO_J, // 0x5f
  Letter.LO_G, // 0x60
  Letter.LO_G, // 0x61
  Letter.LO_G, // 0x62
  Letter.LO_G, // 0x63
  Letter.LO_U, // 0x64
  Letter.UP_Y, // 0x65
  Letter.LO_H, // 0x66
  Letter.LO_H, // 0x67
  Letter.LO_I, // 0x68
  Letter.LO_I, // 0x69
  Letter.UP_I, // 0x6a
  Letter.LO_L, // 0x6b
  Letter.LO_L, // 0x6c
  Letter.LO_L, // 0x6d
  new Chars("lZ"), // 0x6e
  Letter.UP_W, // 0x6f
  Letter.UP_W, // 0x70
  Letter.LO_M, // 0x71
  Letter.LO_N, // 0x72
  Letter.LO_N, // 0x73
  Letter.LO_N, // 0x74
  Letter.LO_O, // 0x75
  UP_OE, // 0x76
  Letter.UP_O, // 0x77
  Letter.UP_F, // 0x78
  Letter.LO_R, // 0x79
  Letter.LO_R, // 0x7a
  Letter.LO_R, // 0x7b
  Letter.LO_R, // 0x7c
  Letter.LO_R, // 0x7d
  Letter.LO_R, // 0x7e
  Letter.LO_R, // 0x7f
  Letter.UP_R, // 0x80
  Letter.UP_R, // 0x81
  Letter.LO_S, // 0x82
  Letter.UP_S, // 0x83
  Letter.LO_J, // 0x84
  Letter.UP_S, // 0x85
  Letter.UP_S, // 0x86
  Letter.LO_T, // 0x87
  Letter.LO_T, // 0x88
  Letter.LO_U, // 0x89
  Letter.UP_U, // 0x8a
  Letter.LO_V, // 0x8b
  Char.CARET, // 0x8c
  Letter.LO_W, // 0x8d
  Letter.LO_Y, // 0x8e
  Letter.UP_Y, // 0x8f
  Letter.LO_Z, // 0x90
  Letter.LO_Z, // 0x91
  Letter.UP_Z, // 0x92
  Letter.UP_Z, // 0x93
  Char.QUESTION, // 0x94
  Char.QUESTION, // 0x95
  Char.QUESTION, // 0x96
  Letter.UP_C, // 0x97
  Char.AT, // 0x98
  Letter.UP_B, // 0x99
  Letter.UP_E, // 0x9a
  Letter.UP_G, // 0x9b
  Letter.UP_H, // 0x9c
  Letter.LO_J, // 0x9d
  Letter.LO_K, // 0x9e
  Letter.UP_L, // 0x9f
  Letter.LO_Q, // 0xa0
  Char.QUESTION, // 0xa1
  Char.QUESTION, // 0xa2
  LO_DZ, // 0xa3
  new Chars("dZ"), // 0xa4
  LO_DZ, // 0xa5
  LO_TS, // 0xa6
  new Chars("tS"), // 0xa7
  new Chars("tC"), // 0xa8
  new Chars("fN"), // 0xa9
  LO_LS, // 0xaa
  new Chars("lz"), // 0xab
  new Chars("WW"), // 0xac
  new Chars("]]"), // 0xad
  Letter.LO_H, // 0xae
  Letter.LO_H, // 0xaf
  Letter.LO_H, // 0xb0
  Letter.LO_H, // 0xb1
  Letter.LO_J, // 0xb2
  Letter.LO_R, // 0xb3
  Letter.LO_R, // 0xb4
  Letter.LO_R, // 0xb5
  Letter.LO_R, // 0xb6
  Letter.LO_W, // 0xb7
  Letter.LO_Y, // 0xb8
  Char.QUOTE1, // 0xb9
  Char.QUOTE2, // 0xba
  Char.GRAVE, // 0xbb
  Char.QUOTE1, // 0xbc
  Char.GRAVE, // 0xbd
  Char.GRAVE, // 0xbe
  Char.QUOTE1, // 0xbf
  Char.QUESTION, // 0xc0
  Char.QUESTION, // 0xc1
  Char.LESS, // 0xc2
  Char.GREATER, // 0xc3
  Char.CARET, // 0xc4
  Letter.UP_V, // 0xc5
  Char.CARET, // 0xc6
  Letter.UP_V, // 0xc7
  Char.QUOTE1, // 0xc8
  Char.MINUS, // 0xc9
  Char.SLASH, // 0xca
  Char.BKSLASH, // 0xcb
  Char.COMMA, // 0xcc
  Char.UNDSCORE, // 0xcd
  Char.BKSLASH, // 0xce
  Char.SLASH, // 0xcf
  Char.COLON, // 0xd0
  Char.PERIOD, // 0xd1
  Char.GRAVE, // 0xd2
  Char.QUOTE1, // 0xd3
  Char.CARET, // 0xd4
  Letter.UP_V, // 0xd5
  Char.PLUS, // 0xd6
  Char.MINUS, // 0xd7
  Letter.UP_V, // 0xd8
  Char.PERIOD, // 0xd9
  Char.AT, // 0xda
  Char.COMMA, // 0xdb
  Char.TILDE, // 0xdc
  Char.QUOTE2, // 0xdd
  Letter.UP_R, // 0xde
  Letter.UP_X, // 0xdf
  Letter.UP_G, // 0xe0
  Letter.LO_L, // 0xe1
  Letter.LO_S, // 0xe2
  Letter.LO_X, // 0xe3
  Char.QUESTION, // 0xe4
  Digit._5, // 0xe5
  Digit._4, // 0xe6
  Digit._3, // 0xe7
  Digit._2, // 0xe8
  Digit._1, // 0xe9
  Char.SLASH, // 0xea
  Char.BKSLASH, // 0xeb
  Letter.UP_V, // 0xec
  Char.EQUAL, // 0xed
  Char.QUOTE2, // 0xee
  Letter.UP_V, // 0xef
  Char.CARET, // 0xf0
  Char.LESS, // 0xf1
  Char.GREATER, // 0xf2
  Letter.LO_O, // 0xf3
  Char.GRAVE, // 0xf4
  new Chars("``"), // 0xf5
  new Chars("//"), // 0xf6
  Char.TILDE, // 0xf7
  Char.COLON, // 0xf8
  new Chars("[-"), // 0xf9
  new Chars("-]"), // 0xfa
  new Chars("[_"), // 0xfb
  new Chars("_]"), // 0xfc
  Char.UNDSCORE, // 0xfd
  Char.UNDSCORE, // 0xfe
  Char.LESS };
}
