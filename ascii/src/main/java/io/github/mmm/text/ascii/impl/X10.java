/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+10xx (Myanmar, Georgian).
 */
final class X10 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  Letter.LO_K, // 0x00
  LO_KH, // 0x01
  Letter.LO_G, // 0x02
  LO_GH, // 0x03
  LO_NG, // 0x04
  Letter.LO_C, // 0x05
  LO_CH, // 0x06
  Letter.LO_J, // 0x07
  LO_JH, // 0x08
  LO_NY, // 0x09
  new Letters("nny"), // 0x0a
  LO_TT, // 0x0b
  new Letters("tth"), // 0x0c
  LO_DD, // 0x0d
  new Letters("ddh"), // 0x0e
  LO_NN, // 0x0f
  LO_TT, // 0x10
  LO_TH, // 0x11
  Letter.LO_D, // 0x12
  LO_DH, // 0x13
  Letter.LO_N, // 0x14
  Letter.LO_P, // 0x15
  LO_PH, // 0x16
  Letter.LO_B, // 0x17
  LO_BH, // 0x18
  Letter.LO_M, // 0x19
  Letter.LO_Y, // 0x1a
  Letter.LO_R, // 0x1b
  Letter.LO_L, // 0x1c
  Letter.LO_W, // 0x1d
  Letter.LO_S, // 0x1e
  Letter.LO_H, // 0x1f
  LO_LL, // 0x20
  Letter.LO_A, // 0x21
  null, // 0x22
  Letter.LO_I, // 0x23
  LO_II, // 0x24
  Letter.LO_U, // 0x25
  LO_UU, // 0x26
  Letter.LO_E, // 0x27
  null, // 0x28
  Letter.LO_O, // 0x29
  LO_AU, // 0x2a
  null, // 0x2b
  LO_AA, // 0x2c
  Letter.LO_I, // 0x2d
  LO_II, // 0x2e
  Letter.LO_U, // 0x2f
  LO_UU, // 0x30
  Letter.LO_E, // 0x31
  LO_AI, // 0x32
  null, // 0x33
  null, // 0x34
  null, // 0x35
  Letter.UP_N, // 0x36
  Char.QUOTE1, // 0x37
  Char.COLON, // 0x38
  null, // 0x39
  null, // 0x3a
  null, // 0x3b
  null, // 0x3c
  null, // 0x3d
  null, // 0x3e
  null, // 0x3f
  Digit._0, // 0x40
  Digit._1, // 0x41
  Digit._2, // 0x42
  Digit._3, // 0x43
  Digit._4, // 0x44
  Digit._5, // 0x45
  Digit._6, // 0x46
  Digit._7, // 0x47
  Digit._8, // 0x48
  Digit._9, // 0x49
  new Chars(" / "), // 0x4a
  new Chars(" // "), // 0x4b
  new Chars("n*"), // 0x4c
  new Chars("r*"), // 0x4d
  new Chars("l*"), // 0x4e
  new Chars("e*"), // 0x4f
  LO_SH, // 0x50
  LO_SS, // 0x51
  Letter.UP_R, // 0x52
  new Letters("RR"), // 0x53
  Letter.UP_L, // 0x54
  UP_LL, // 0x55
  Letter.UP_R, // 0x56
  new Letters("RR"), // 0x57
  Letter.UP_L, // 0x58
  UP_LL, // 0x59
  null, // 0x5a
  null, // 0x5b
  null, // 0x5c
  null, // 0x5d
  null, // 0x5e
  null, // 0x5f
  null, // 0x60
  null, // 0x61
  null, // 0x62
  null, // 0x63
  null, // 0x64
  null, // 0x65
  null, // 0x66
  null, // 0x67
  null, // 0x68
  null, // 0x69
  null, // 0x6a
  null, // 0x6b
  null, // 0x6c
  null, // 0x6d
  null, // 0x6e
  null, // 0x6f
  null, // 0x70
  null, // 0x71
  null, // 0x72
  null, // 0x73
  null, // 0x74
  null, // 0x75
  null, // 0x76
  null, // 0x77
  null, // 0x78
  null, // 0x79
  null, // 0x7a
  null, // 0x7b
  null, // 0x7c
  null, // 0x7d
  null, // 0x7e
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
  Letter.UP_A, // 0xa0
  Letter.UP_B, // 0xa1
  Letter.UP_G, // 0xa2
  Letter.UP_D, // 0xa3
  Letter.UP_E, // 0xa4
  Letter.UP_V, // 0xa5
  Letter.UP_Z, // 0xa6
  new Text("T`"), // 0xa7
  Letter.UP_I, // 0xa8
  Letter.UP_K, // 0xa9
  Letter.UP_L, // 0xaa
  Letter.UP_M, // 0xab
  Letter.UP_N, // 0xac
  Letter.UP_O, // 0xad
  Letter.UP_P, // 0xae
  CAP_ZH, // 0xaf
  Letter.UP_R, // 0xb0
  Letter.UP_S, // 0xb1
  Letter.UP_T, // 0xb2
  Letter.UP_U, // 0xb3
  new Text("P`"), // 0xb4
  new Text("K`"), // 0xb5
  new Text("G\'"), // 0xb6
  Letter.UP_Q, // 0xb7
  CAP_SH, // 0xb8
  new Text("Ch`"), // 0xb9
  new Text("C`"), // 0xba
  new Text("Z\'"), // 0xbb
  Letter.UP_C, // 0xbc
  CAP_CH, // 0xbd
  Letter.UP_X, // 0xbe
  Letter.UP_J, // 0xbf
  Letter.UP_H, // 0xc0
  Letter.UP_E, // 0xc1
  Letter.UP_Y, // 0xc2
  Letter.UP_W, // 0xc3
  new Letters("Xh"), // 0xc4
  UP_OE, // 0xc5
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
  Letter.LO_A, // 0xd0
  Letter.LO_B, // 0xd1
  Letter.LO_G, // 0xd2
  Letter.LO_D, // 0xd3
  Letter.LO_E, // 0xd4
  Letter.LO_V, // 0xd5
  Letter.LO_Z, // 0xd6
  new Text("t`"), // 0xd7
  Letter.LO_I, // 0xd8
  Letter.LO_K, // 0xd9
  Letter.LO_L, // 0xda
  Letter.LO_M, // 0xdb
  Letter.LO_N, // 0xdc
  Letter.LO_O, // 0xdd
  Letter.LO_P, // 0xde
  LO_ZH, // 0xdf
  Letter.LO_R, // 0xe0
  Letter.LO_S, // 0xe1
  Letter.LO_T, // 0xe2
  Letter.LO_U, // 0xe3
  new Text("p`"), // 0xe4
  new Text("k`"), // 0xe5
  new Text("g\'"), // 0xe6
  Letter.LO_Q, // 0xe7
  LO_SH, // 0xe8
  new Text("ch`"), // 0xe9
  new Text("c`"), // 0xea
  new Text("z\'"), // 0xeb
  Letter.LO_C, // 0xec
  LO_CH, // 0xed
  Letter.LO_X, // 0xee
  Letter.LO_J, // 0xef
  Letter.LO_H, // 0xf0
  Letter.LO_E, // 0xf1
  Letter.LO_Y, // 0xf2
  Letter.LO_W, // 0xf3
  new Letters("xh"), // 0xf4
  LO_OE, // 0xf5
  Letter.LO_F, // 0xf6
  null, // 0xf7
  null, // 0xf8
  null, // 0xf9
  null, // 0xfa
  new Chars(" // "), // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}
