/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+0Dxx (Malayalam, Sinhala).
 */
final class X0d extends Xxx {

  private static final Letters LO_DDH = new Letters("ddh");

  private static final Letters LO_TTH = new Letters("tth");

  private static final Letters UP_RR = new Letters("RR");

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  null, // 0x00
  null, // 0x01
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
  null, // 0x0d
  Letter.LO_E, // 0x0e
  LO_EE, // 0x0f
  LO_AI, // 0x10
  null, // 0x11
  Letter.LO_O, // 0x12
  LO_OO, // 0x13
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
  LO_TTH, // 0x20
  LO_DD, // 0x21
  LO_DDH, // 0x22
  LO_NN, // 0x23
  Letter.LO_T, // 0x24
  LO_TH, // 0x25
  Letter.LO_D, // 0x26
  LO_DH, // 0x27
  Letter.LO_N, // 0x28
  null, // 0x29
  Letter.LO_P, // 0x2a
  LO_PH, // 0x2b
  Letter.LO_B, // 0x2c
  LO_BH, // 0x2d
  Letter.LO_M, // 0x2e
  Letter.LO_Y, // 0x2f
  Letter.LO_R, // 0x30
  LO_RR, // 0x31
  Letter.LO_L, // 0x32
  LO_LL, // 0x33
  new Letters("lll"), // 0x34
  Letter.LO_V, // 0x35
  LO_SH, // 0x36
  LO_SS, // 0x37
  Letter.LO_S, // 0x38
  Letter.LO_H, // 0x39
  null, // 0x3a
  null, // 0x3b
  null, // 0x3c
  null, // 0x3d
  LO_AA, // 0x3e
  Letter.LO_I, // 0x3f
  LO_II, // 0x40
  Letter.LO_U, // 0x41
  LO_UU, // 0x42
  Letter.UP_R, // 0x43
  null, // 0x44
  null, // 0x45
  Letter.LO_E, // 0x46
  LO_EE, // 0x47
  LO_AI, // 0x48
  null, // 0x49
  Letter.LO_O, // 0x4a
  LO_OO, // 0x4b
  LO_AU, // 0x4c
  null, // 0x4d
  null, // 0x4e
  null, // 0x4f
  null, // 0x50
  null, // 0x51
  null, // 0x52
  null, // 0x53
  null, // 0x54
  null, // 0x55
  null, // 0x56
  Char.PLUS, // 0x57
  null, // 0x58
  null, // 0x59
  null, // 0x5a
  null, // 0x5b
  null, // 0x5c
  null, // 0x5d
  null, // 0x5e
  null, // 0x5f
  UP_RR, // 0x60
  UP_LL, // 0x61
  null, // 0x62
  null, // 0x63
  null, // 0x64
  null, // 0x65
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
  Letter.UP_N, // 0x82
  Letter.UP_H, // 0x83
  null, // 0x84
  Letter.LO_A, // 0x85
  LO_AA, // 0x86
  LO_AE, // 0x87
  new Letters("aae"), // 0x88
  Letter.LO_I, // 0x89
  LO_II, // 0x8a
  Letter.LO_U, // 0x8b
  LO_UU, // 0x8c
  Letter.UP_R, // 0x8d
  UP_RR, // 0x8e
  Letter.UP_L, // 0x8f
  UP_LL, // 0x90
  Letter.LO_E, // 0x91
  LO_EE, // 0x92
  LO_AI, // 0x93
  Letter.LO_O, // 0x94
  LO_OO, // 0x95
  LO_AU, // 0x96
  null, // 0x97
  null, // 0x98
  null, // 0x99
  Letter.LO_K, // 0x9a
  LO_KH, // 0x9b
  Letter.LO_G, // 0x9c
  LO_GH, // 0x9d
  LO_NG, // 0x9e
  new Letters("nng"), // 0x9f
  Letter.LO_C, // 0xa0
  LO_CH, // 0xa1
  Letter.LO_J, // 0xa2
  LO_JH, // 0xa3
  LO_NY, // 0xa4
  new Letters("jny"), // 0xa5
  new Letters("nyj"), // 0xa6
  LO_TT, // 0xa7
  LO_TTH, // 0xa8
  LO_DD, // 0xa9
  LO_DDH, // 0xaa
  LO_NN, // 0xab
  new Letters("nndd"), // 0xac
  Letter.LO_T, // 0xad
  LO_TH, // 0xae
  Letter.LO_D, // 0xaf
  LO_DH, // 0xb0
  Letter.LO_N, // 0xb1
  null, // 0xb2
  new Letters("nd"), // 0xb3
  Letter.LO_P, // 0xb4
  LO_PH, // 0xb5
  Letter.LO_B, // 0xb6
  LO_BH, // 0xb7
  Letter.LO_M, // 0xb8
  new Letters("mb"), // 0xb9
  Letter.LO_Y, // 0xba
  Letter.LO_R, // 0xbb
  null, // 0xbc
  Letter.LO_L, // 0xbd
  null, // 0xbe
  null, // 0xbf
  Letter.LO_V, // 0xc0
  LO_SH, // 0xc1
  LO_SS, // 0xc2
  Letter.LO_S, // 0xc3
  Letter.LO_H, // 0xc4
  LO_LL, // 0xc5
  Letter.LO_F, // 0xc6
  null, // 0xc7
  null, // 0xc8
  null, // 0xc9
  null, // 0xca
  null, // 0xcb
  null, // 0xcc
  null, // 0xcd
  null, // 0xce
  LO_AA, // 0xcf
  LO_AE, // 0xd0
  new Letters("aae"), // 0xd1
  Letter.LO_I, // 0xd2
  LO_II, // 0xd3
  Letter.LO_U, // 0xd4
  null, // 0xd5
  LO_UU, // 0xd6
  null, // 0xd7
  Letter.UP_R, // 0xd8
  Letter.LO_E, // 0xd9
  LO_EE, // 0xda
  LO_AI, // 0xdb
  Letter.LO_O, // 0xdc
  LO_OO, // 0xdd
  LO_AU, // 0xde
  Letter.UP_L, // 0xdf
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
  UP_RR, // 0xf2
  UP_LL, // 0xf3
  new Chars(" . "), // 0xf4
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