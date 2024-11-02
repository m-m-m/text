/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+06xx (Arabic).
 */
final class X06 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  null, // 0x00
  null, // 0x01
  null, // 0x02
  null, // 0x03
  null, // 0x04
  null, // 0x05
  null, // 0x06
  null, // 0x07
  null, // 0x08
  null, // 0x09
  null, // 0x0a
  null, // 0x0b
  Char.COMMA, // 0x0c
  null, // 0x0d
  null, // 0x0e
  null, // 0x0f
  null, // 0x10
  null, // 0x11
  null, // 0x12
  null, // 0x13
  null, // 0x14
  null, // 0x15
  null, // 0x16
  null, // 0x17
  null, // 0x18
  null, // 0x19
  null, // 0x1a
  Char.SEMICOL, // 0x1b
  null, // 0x1c
  null, // 0x1d
  null, // 0x1e
  Char.QUESTION, // 0x1f
  null, // 0x20
  null, // 0x21
  Letter.LO_A, // 0x22
  Char.QUOTE1, // 0x23
  new Text("w\'"), // 0x24
  null, // 0x25
  new Text("y\'"), // 0x26
  null, // 0x27
  Letter.LO_B, // 0x28
  Char.AT, // 0x29
  Letter.LO_T, // 0x2a
  LO_TH, // 0x2b
  Letter.LO_J, // 0x2c
  Letter.UP_H, // 0x2d
  LO_KH, // 0x2e
  Letter.LO_D, // 0x2f
  LO_DH, // 0x30
  Letter.LO_R, // 0x31
  Letter.LO_Z, // 0x32
  Letter.LO_S, // 0x33
  LO_SH, // 0x34
  Letter.UP_S, // 0x35
  Letter.UP_D, // 0x36
  Letter.UP_T, // 0x37
  Letter.UP_Z, // 0x38
  Char.GRAVE, // 0x39
  Letter.UP_G, // 0x3a
  null, // 0x3b
  null, // 0x3c
  null, // 0x3d
  null, // 0x3e
  null, // 0x3f
  null, // 0x40
  Letter.LO_F, // 0x41
  Letter.LO_Q, // 0x42
  Letter.LO_K, // 0x43
  Letter.LO_L, // 0x44
  Letter.LO_M, // 0x45
  Letter.LO_N, // 0x46
  Letter.LO_H, // 0x47
  Letter.LO_W, // 0x48
  Char.TILDE, // 0x49
  Letter.LO_Y, // 0x4a
  LO_AN, // 0x4b
  new Letters("un"), // 0x4c
  LO_IN, // 0x4d
  Letter.LO_A, // 0x4e
  Letter.LO_U, // 0x4f
  Letter.LO_I, // 0x50
  Letter.UP_W, // 0x51
  null, // 0x52
  null, // 0x53
  Char.QUOTE1, // 0x54
  Char.QUOTE1, // 0x55
  null, // 0x56
  null, // 0x57
  null, // 0x58
  null, // 0x59
  null, // 0x5a
  null, // 0x5b
  null, // 0x5c
  null, // 0x5d
  null, // 0x5e
  null, // 0x5f
  Digit._0, // 0x60
  Digit._1, // 0x61
  Digit._2, // 0x62
  Digit._3, // 0x63
  Digit._4, // 0x64
  Digit._5, // 0x65
  Digit._6, // 0x66
  Digit._7, // 0x67
  Digit._8, // 0x68
  Digit._9, // 0x69
  Char.PERCENT, // 0x6a
  Char.PERIOD, // 0x6b
  Char.COMMA, // 0x6c
  Char.ASTERISK, // 0x6d
  null, // 0x6e
  null, // 0x6f
  null, // 0x70
  Char.QUOTE1, // 0x71
  Char.QUOTE1, // 0x72
  Char.QUOTE1, // 0x73
  null, // 0x74
  Char.QUOTE1, // 0x75
  new Chars("\'w"), // 0x76
  new Chars("\'u"), // 0x77
  new Chars("\'y"), // 0x78
  LO_TT, // 0x79
  new Letters("tth"), // 0x7a
  Letter.LO_B, // 0x7b
  Letter.LO_T, // 0x7c
  Letter.UP_T, // 0x7d
  Letter.LO_P, // 0x7e
  LO_TH, // 0x7f
  LO_BH, // 0x80
  new Chars("\'h"), // 0x81
  Letter.UP_H, // 0x82
  LO_NY, // 0x83
  new Letters("dy"), // 0x84
  Letter.UP_H, // 0x85
  LO_CH, // 0x86
  new Letters("cch"), // 0x87
  LO_DD, // 0x88
  Letter.UP_D, // 0x89
  Letter.UP_D, // 0x8a
  new Letters("Dt"), // 0x8b
  LO_DH, // 0x8c
  new Letters("ddh"), // 0x8d
  Letter.LO_D, // 0x8e
  Letter.UP_D, // 0x8f
  Letter.UP_D, // 0x90
  LO_RR, // 0x91
  Letter.UP_R, // 0x92
  Letter.UP_R, // 0x93
  Letter.UP_R, // 0x94
  Letter.UP_R, // 0x95
  Letter.UP_R, // 0x96
  Letter.UP_R, // 0x97
  Letter.LO_J, // 0x98
  Letter.UP_R, // 0x99
  Letter.UP_S, // 0x9a
  Letter.UP_S, // 0x9b
  Letter.UP_S, // 0x9c
  Letter.UP_S, // 0x9d
  Letter.UP_S, // 0x9e
  Letter.UP_T, // 0x9f
  new Letters("GH"), // 0xa0
  Letter.UP_F, // 0xa1
  Letter.UP_F, // 0xa2
  Letter.UP_F, // 0xa3
  Letter.LO_V, // 0xa4
  Letter.LO_F, // 0xa5
  LO_PH, // 0xa6
  Letter.UP_Q, // 0xa7
  Letter.UP_Q, // 0xa8
  LO_KH, // 0xa9
  Letter.LO_K, // 0xaa
  Letter.UP_K, // 0xab
  Letter.UP_K, // 0xac
  LO_NG, // 0xad
  Letter.UP_K, // 0xae
  Letter.LO_G, // 0xaf
  Letter.UP_G, // 0xb0
  Letter.UP_N, // 0xb1
  Letter.UP_G, // 0xb2
  Letter.UP_G, // 0xb3
  Letter.UP_G, // 0xb4
  Letter.UP_L, // 0xb5
  Letter.UP_L, // 0xb6
  Letter.UP_L, // 0xb7
  Letter.UP_L, // 0xb8
  Letter.UP_N, // 0xb9
  Letter.UP_N, // 0xba
  Letter.UP_N, // 0xbb
  Letter.UP_N, // 0xbc
  Letter.UP_N, // 0xbd
  Letter.LO_H, // 0xbe
  CAP_CH, // 0xbf
  new Letters("hy"), // 0xc0
  Letter.LO_H, // 0xc1
  Letter.UP_H, // 0xc2
  Char.AT, // 0xc3
  Letter.UP_W, // 0xc4
  LO_OE, // 0xc5
  LO_OE, // 0xc6
  Letter.LO_U, // 0xc7
  LO_YU, // 0xc8
  LO_YU, // 0xc9
  Letter.UP_W, // 0xca
  Letter.LO_V, // 0xcb
  Letter.LO_Y, // 0xcc
  Letter.UP_Y, // 0xcd
  Letter.UP_Y, // 0xce
  Letter.UP_W, // 0xcf
  null, // 0xd0
  null, // 0xd1
  Letter.LO_Y, // 0xd2
  new Text("y\'"), // 0xd3
  Char.PERIOD, // 0xd4
  LO_AE, // 0xd5
  null, // 0xd6
  null, // 0xd7
  null, // 0xd8
  null, // 0xd9
  null, // 0xda
  null, // 0xdb
  null, // 0xdc
  Char.AT, // 0xdd
  Char.HASH, // 0xde
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
  Char.CARET, // 0xe9
  null, // 0xea
  null, // 0xeb
  null, // 0xec
  null, // 0xed
  null, // 0xee
  null, // 0xef
  Digit._0, // 0xf0
  Digit._1, // 0xf1
  Digit._2, // 0xf2
  Digit._3, // 0xf3
  Digit._4, // 0xf4
  Digit._5, // 0xf5
  Digit._6, // 0xf6
  Digit._7, // 0xf7
  Digit._8, // 0xf8
  Digit._9, // 0xf9
  CAP_SH, // 0xfa
  Letter.UP_D, // 0xfb
  new Letters("Gh"), // 0xfc
  Char.AMP, // 0xfd
  new Chars("+m"), // 0xfe
  Letter.LO_H };
}
