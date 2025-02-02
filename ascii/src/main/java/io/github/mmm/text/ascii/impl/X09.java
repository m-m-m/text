/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+09xx (Devanagari, Bengali).
 */
final class X09 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  null, // 0x00
  Letter.UP_N, // 0x01
  Letter.UP_N, // 0x02
  Letter.UP_H, // 0x03
  null, // 0x04
  Letter.LO_A, // 0x05
  LO_AA, // 0x06
  Letter.LO_I, // 0x07
  LO_II, // 0x08
  Letter.LO_U, // 0x09
  LO_UU, // 0x0a
  Letter.UP_R, // 0x0b
  Letter.UP_L, // 0x0c
  new Letters("eN"), // 0x0d
  Letter.LO_E, // 0x0e
  Letter.LO_E, // 0x0f
  LO_AI, // 0x10
  new Letters("oN"), // 0x11
  Letter.LO_O, // 0x12
  Letter.LO_O, // 0x13
  LO_AU, // 0x14
  Letter.LO_K, // 0x15
  LO_KH, // 0x16
  Letter.LO_G, // 0x17
  LO_GH, // 0x18
  LO_NG, // 0x19
  Letter.LO_C, // 0x1a
  LO_CH, // 0x1b
  Letter.LO_J, // 0x1c
  LO_JH, // 0x1d
  LO_NY, // 0x1e
  LO_TT, // 0x1f
  new Letters("tth"), // 0x20
  LO_DD, // 0x21
  new Letters("ddh"), // 0x22
  LO_NN, // 0x23
  Letter.LO_T, // 0x24
  LO_TH, // 0x25
  Letter.LO_D, // 0x26
  LO_DH, // 0x27
  Letter.LO_N, // 0x28
  new Letters("nnn"), // 0x29
  Letter.LO_P, // 0x2a
  LO_PH, // 0x2b
  Letter.LO_B, // 0x2c
  LO_BH, // 0x2d
  Letter.LO_M, // 0x2e
  Letter.LO_Y, // 0x2f
  Letter.LO_R, // 0x30
  LO_RR, // 0x31
  Letter.LO_L, // 0x32
  Letter.LO_L, // 0x33
  new Letters("lll"), // 0x34
  Letter.LO_V, // 0x35
  LO_SH, // 0x36
  LO_SS, // 0x37
  Letter.LO_S, // 0x38
  Letter.LO_H, // 0x39
  null, // 0x3a
  null, // 0x3b
  Char.QUOTE1, // 0x3c
  Char.QUOTE1, // 0x3d
  LO_AA, // 0x3e
  Letter.LO_I, // 0x3f
  LO_II, // 0x40
  Letter.LO_U, // 0x41
  LO_UU, // 0x42
  Letter.UP_R, // 0x43
  new Letters("RR"), // 0x44
  new Letters("eN"), // 0x45
  Letter.LO_E, // 0x46
  Letter.LO_E, // 0x47
  LO_AI, // 0x48
  new Letters("oN"), // 0x49
  Letter.LO_O, // 0x4a
  Letter.LO_O, // 0x4b
  LO_AU, // 0x4c
  null, // 0x4d
  null, // 0x4e
  null, // 0x4f
  new Letters("AUM"), // 0x50
  Char.QUOTE1, // 0x51
  Char.QUOTE1, // 0x52
  Char.GRAVE, // 0x53
  Char.QUOTE1, // 0x54
  null, // 0x55
  null, // 0x56
  null, // 0x57
  Letter.LO_Q, // 0x58
  new Letters("khh"), // 0x59
  new Letters("ghh"), // 0x5a
  Letter.LO_Z, // 0x5b
  new Letters("dddh"), // 0x5c
  LO_RH, // 0x5d
  Letter.LO_F, // 0x5e
  LO_YY, // 0x5f
  new Letters("RR"), // 0x60
  UP_LL, // 0x61
  Letter.UP_L, // 0x62
  UP_LL, // 0x63
  new Letters(" / "), // 0x64
  new Letters(" // "), // 0x65
  Digit._0, // 0x66
  Digit._1, // 0x67
  Digit._2, // 0x68
  Digit._3, // 0x69
  Digit._4, // 0x6a
  Digit._5, // 0x6b
  Digit._6, // 0x6c
  Digit._7, // 0x6d
  Digit._8, // 0x6e
  Digit._9, // 0x6f
  Char.PERIOD, // 0x70
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
  Letter.UP_N, // 0x81
  Letter.UP_N, // 0x82
  Letter.UP_H, // 0x83
  null, // 0x84
  Letter.LO_A, // 0x85
  LO_AA, // 0x86
  Letter.LO_I, // 0x87
  LO_II, // 0x88
  Letter.LO_U, // 0x89
  LO_UU, // 0x8a
  Letter.UP_R, // 0x8b
  new Letters("RR"), // 0x8c
  null, // 0x8d
  null, // 0x8e
  Letter.LO_E, // 0x8f
  LO_AI, // 0x90
  null, // 0x91
  null, // 0x92
  Letter.LO_O, // 0x93
  LO_AU, // 0x94
  Letter.LO_K, // 0x95
  LO_KH, // 0x96
  Letter.LO_G, // 0x97
  LO_GH, // 0x98
  LO_NG, // 0x99
  Letter.LO_C, // 0x9a
  LO_CH, // 0x9b
  Letter.LO_J, // 0x9c
  LO_JH, // 0x9d
  LO_NY, // 0x9e
  LO_TT, // 0x9f
  new Letters("tth"), // 0xa0
  LO_DD, // 0xa1
  new Letters("ddh"), // 0xa2
  LO_NN, // 0xa3
  Letter.LO_T, // 0xa4
  LO_TH, // 0xa5
  Letter.LO_D, // 0xa6
  LO_DH, // 0xa7
  Letter.LO_N, // 0xa8
  null, // 0xa9
  Letter.LO_P, // 0xaa
  LO_PH, // 0xab
  Letter.LO_B, // 0xac
  LO_BH, // 0xad
  Letter.LO_M, // 0xae
  Letter.LO_Y, // 0xaf
  Letter.LO_R, // 0xb0
  null, // 0xb1
  Letter.LO_L, // 0xb2
  null, // 0xb3
  null, // 0xb4
  null, // 0xb5
  LO_SH, // 0xb6
  LO_SS, // 0xb7
  Letter.LO_S, // 0xb8
  Letter.LO_H, // 0xb9
  null, // 0xba
  null, // 0xbb
  Char.QUOTE1, // 0xbc
  null, // 0xbd
  LO_AA, // 0xbe
  Letter.LO_I, // 0xbf
  LO_II, // 0xc0
  Letter.LO_U, // 0xc1
  LO_UU, // 0xc2
  Letter.UP_R, // 0xc3
  new Letters("RR"), // 0xc4
  null, // 0xc5
  null, // 0xc6
  Letter.LO_E, // 0xc7
  LO_AI, // 0xc8
  null, // 0xc9
  null, // 0xca
  Letter.LO_O, // 0xcb
  LO_AU, // 0xcc
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
  Char.PLUS, // 0xd7
  null, // 0xd8
  null, // 0xd9
  null, // 0xda
  null, // 0xdb
  LO_RR, // 0xdc
  LO_RH, // 0xdd
  null, // 0xde
  LO_YY, // 0xdf
  new Letters("RR"), // 0xe0
  UP_LL, // 0xe1
  Letter.UP_L, // 0xe2
  UP_LL, // 0xe3
  null, // 0xe4
  null, // 0xe5
  Digit._0, // 0xe6
  Digit._1, // 0xe7
  Digit._2, // 0xe8
  Digit._3, // 0xe9
  Digit._4, // 0xea
  Digit._5, // 0xeb
  Digit._6, // 0xec
  Digit._7, // 0xed
  Digit._8, // 0xee
  Digit._9, // 0xef
  new Letters("r\'"), // 0xf0
  new Letters("r`"), // 0xf1
  Currency.RUPEE, // 0xf2
  Currency.RUPEE, // 0xf3
  new Letters("1/"), // 0xf4
  new Letters("2/"), // 0xf5
  new Letters("3/"), // 0xf6
  new Letters("4/"), // 0xf7
  new Letters(" x-1/"), // 0xf8
  new Letters("/16"), // 0xf9
  null, // 0xfa
  null, // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}
