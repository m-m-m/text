/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+31xx (Bopomofo, Hangul Compatibility Jamo, Kanbun, Bopomofo Extended, CJK Strokes, Katakana
 * Phonetic Extensions).
 */
final class X31 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  null, // 0x00
  null, // 0x01
  null, // 0x02
  null, // 0x03
  null, // 0x04
  Letter.UP_B, // 0x05
  Letter.UP_P, // 0x06
  Letter.UP_M, // 0x07
  Letter.UP_F, // 0x08
  Letter.UP_D, // 0x09
  Letter.UP_T, // 0x0a
  Letter.UP_N, // 0x0b
  Letter.UP_L, // 0x0c
  Letter.UP_G, // 0x0d
  Letter.UP_K, // 0x0e
  Letter.UP_H, // 0x0f
  Letter.UP_J, // 0x10
  Letter.UP_Q, // 0x11
  Letter.UP_X, // 0x12
  CAP_ZH, // 0x13
  UP_CH, // 0x14
  CAP_SH, // 0x15
  Letter.UP_R, // 0x16
  Letter.UP_Z, // 0x17
  Letter.UP_C, // 0x18
  Letter.UP_S, // 0x19
  Letter.UP_A, // 0x1a
  Letter.UP_O, // 0x1b
  Letter.UP_E, // 0x1c
  new Letters("EH"), // 0x1d
  new Letters("AI"), // 0x1e
  new Letters("EI"), // 0x1f
  new Letters("AU"), // 0x20
  new Letters("OU"), // 0x21
  new Letters("AN"), // 0x22
  new Letters("EN"), // 0x23
  new Letters("ANG"), // 0x24
  new Letters("ENG"), // 0x25
  new Letters("ER"), // 0x26
  Letter.UP_I, // 0x27
  Letter.UP_U, // 0x28
  new Letters("IU"), // 0x29
  Letter.UP_V, // 0x2a
  new Letters("NG"), // 0x2b
  new Letters("GN"), // 0x2c
  null, // 0x2d
  null, // 0x2e
  null, // 0x2f
  null, // 0x30
  Letter.LO_G, // 0x31
  LO_GG, // 0x32
  LO_GS, // 0x33
  Letter.LO_N, // 0x34
  LO_NJ, // 0x35
  LO_NH, // 0x36
  Letter.LO_D, // 0x37
  LO_DD, // 0x38
  Letter.LO_R, // 0x39
  LO_LG, // 0x3a
  LO_LM, // 0x3b
  LO_LB, // 0x3c
  LO_LS, // 0x3d
  LO_LT, // 0x3e
  LO_LP, // 0x3f
  LO_RH, // 0x40
  Letter.LO_M, // 0x41
  Letter.LO_B, // 0x42
  LO_BB, // 0x43
  LO_BS, // 0x44
  Letter.LO_S, // 0x45
  LO_SS, // 0x46
  null, // 0x47
  Letter.LO_J, // 0x48
  LO_JJ, // 0x49
  Letter.LO_C, // 0x4a
  Letter.LO_K, // 0x4b
  Letter.LO_T, // 0x4c
  Letter.LO_P, // 0x4d
  Letter.LO_H, // 0x4e
  Letter.LO_A, // 0x4f
  LO_AE, // 0x50
  LO_YA, // 0x51
  new Letters("yae"), // 0x52
  LO_EO, // 0x53
  Letter.LO_E, // 0x54
  new Letters("yeo"), // 0x55
  LO_YE, // 0x56
  Letter.LO_O, // 0x57
  LO_WA, // 0x58
  new Letters("wae"), // 0x59
  LO_OE, // 0x5a
  LO_YO, // 0x5b
  Letter.LO_U, // 0x5c
  new Letters("weo"), // 0x5d
  LO_WE, // 0x5e
  LO_WI, // 0x5f
  LO_YU, // 0x60
  LO_EU, // 0x61
  LO_YI, // 0x62
  Letter.LO_I, // 0x63
  null, // 0x64
  LO_NN, // 0x65
  new Letters("nd"), // 0x66
  new Letters("ns"), // 0x67
  new Letters("nZ"), // 0x68
  new Letters("lgs"), // 0x69
  new Letters("ld"), // 0x6a
  new Letters("lbs"), // 0x6b
  new Letters("lZ"), // 0x6c
  new Letters("lQ"), // 0x6d
  new Letters("mb"), // 0x6e
  new Letters("ms"), // 0x6f
  new Letters("mZ"), // 0x70
  new Letters("mN"), // 0x71
  new Letters("bg"), // 0x72
  null, // 0x73
  new Letters("bsg"), // 0x74
  new Letters("bst"), // 0x75
  new Letters("bj"), // 0x76
  new Letters("bt"), // 0x77
  new Letters("bN"), // 0x78
  new Letters("bbN"), // 0x79
  new Letters("sg"), // 0x7a
  new Letters("sn"), // 0x7b
  new Letters("sd"), // 0x7c
  new Letters("sb"), // 0x7d
  new Letters("sj"), // 0x7e
  Letter.UP_Z, // 0x7f
  null, // 0x80
  Letter.UP_N, // 0x81
  new Letters("Ns"), // 0x82
  new Letters("NZ"), // 0x83
  new Letters("pN"), // 0x84
  new Letters("hh"), // 0x85
  Letter.UP_Q, // 0x86
  new Letters("yo-ya"), // 0x87
  new Letters("yo-yae"), // 0x88
  new Letters("yo-i"), // 0x89
  new Letters("yu-yeo"), // 0x8a
  new Letters("yu-ye"), // 0x8b
  new Letters("yu-i"), // 0x8c
  Letter.UP_U, // 0x8d
  new Letters("U-i"), // 0x8e
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
  new Letters("BU"), // 0xa0
  new Letters("ZI"), // 0xa1
  new Letters("JI"), // 0xa2
  new Letters("GU"), // 0xa3
  new Letters("EE"), // 0xa4
  new Letters("ENN"), // 0xa5
  new Letters("OO"), // 0xa6
  new Letters("ONN"), // 0xa7
  new Letters("IR"), // 0xa8
  new Letters("ANN"), // 0xa9
  new Letters("INN"), // 0xaa
  new Letters("UNN"), // 0xab
  new Letters("IM"), // 0xac
  new Letters("NGG"), // 0xad
  new Letters("AINN"), // 0xae
  new Letters("AUNN"), // 0xaf
  new Letters("AM"), // 0xb0
  new Letters("OM"), // 0xb1
  new Letters("ONG"), // 0xb2
  new Letters("INNN"), // 0xb3
  Letter.UP_P, // 0xb4
  Letter.UP_T, // 0xb5
  Letter.UP_K, // 0xb6
  Letter.UP_H, // 0xb7
  null, // 0xb8
  null, // 0xb9
  null, // 0xba
  null, // 0xbb
  null, // 0xbc
  null, // 0xbd
  null, // 0xbe
  null, // 0xbf
  null, // 0xc0
  null, // 0xc1
  null, // 0xc2
  null, // 0xc3
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