/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+04xx (Cyrillic).
 */
final class X04 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  CAP_IE, // 0x00
  CAP_IO, // 0x01
  new Letters("Dj"), // 0x02
  new Letters("Gj"), // 0x03
  Letter.UP_E, // 0x04
  CAP_DZ, // 0x05
  Letter.UP_I, // 0x06
  new Letters("Yi"), // 0x07
  Letter.UP_J, // 0x08
  new Letters("Lj"), // 0x09
  CAP_NJ, // 0x0a
  new Letters("Tsh"), // 0x0b
  new Letters("Kj"), // 0x0c
  Letter.UP_I, // 0x0d
  Letter.UP_U, // 0x0e
  new Letters("Dzh"), // 0x0f
  Letter.UP_A, // 0x10
  Letter.UP_B, // 0x11
  Letter.UP_V, // 0x12
  Letter.UP_G, // 0x13
  Letter.UP_D, // 0x14
  Letter.UP_E, // 0x15
  CAP_ZH, // 0x16
  Letter.UP_Z, // 0x17
  Letter.UP_I, // 0x18
  Letter.UP_Y, // 0x19
  Letter.UP_K, // 0x1a
  Letter.UP_L, // 0x1b
  Letter.UP_M, // 0x1c
  Letter.UP_N, // 0x1d
  Letter.UP_O, // 0x1e
  Letter.UP_P, // 0x1f
  Letter.UP_R, // 0x20
  Letter.UP_S, // 0x21
  Letter.UP_T, // 0x22
  Letter.UP_U, // 0x23
  Letter.UP_F, // 0x24
  CAP_KH, // 0x25
  new Letters("Ts"), // 0x26
  CAP_CH, // 0x27
  CAP_SH, // 0x28
  new Letters("Shch"), // 0x29
  Char.QUOTE2, // 0x2a - https://sites.google.com/site/seesscm/transliteration-of-the-hard-sign-%D1%8A-tverdyi-znak
  Letter.UP_Y, // 0x2b
  Char.QUOTE1, // 0x2c
  Letter.UP_E, // 0x2d
  new Letters("Iu"), // 0x2e
  new Letters("Ya"), // 0x2f
  Letter.LO_A, // 0x30
  Letter.LO_B, // 0x31
  Letter.LO_V, // 0x32
  Letter.LO_G, // 0x33
  Letter.LO_D, // 0x34
  Letter.LO_E, // 0x35
  LO_ZH, // 0x36
  Letter.LO_Z, // 0x37
  Letter.LO_I, // 0x38
  Letter.LO_Y, // 0x39
  Letter.LO_K, // 0x3a
  Letter.LO_L, // 0x3b
  Letter.LO_M, // 0x3c
  Letter.LO_N, // 0x3d
  Letter.LO_O, // 0x3e
  Letter.LO_P, // 0x3f
  Letter.LO_R, // 0x40
  Letter.LO_S, // 0x41
  Letter.LO_T, // 0x42
  Letter.LO_U, // 0x43
  Letter.LO_F, // 0x44
  LO_KH, // 0x45
  LO_TS, // 0x46
  LO_CH, // 0x47
  LO_SH, // 0x48
  new Letters("shch"), // 0x49
  Char.QUOTE2, // 0x4a - https://sites.google.com/site/seesscm/transliteration-of-the-hard-sign-%D1%8A-tverdyi-znak
  Letter.LO_Y, // 0x4b
  Char.QUOTE1, // 0x4c
  Letter.LO_E, // 0x4d
  new Letters("iu"), // 0x4e
  LO_YA, // 0x4f
  LO_IE, // 0x50
  LO_IO, // 0x51
  new Letters("dj"), // 0x52
  new Letters("gj"), // 0x53
  LO_IE, // 0x54
  LO_DZ, // 0x55
  Letter.LO_I, // 0x56
  LO_YI, // 0x57
  Letter.LO_J, // 0x58
  LO_LJ, // 0x59
  LO_NJ, // 0x5a
  new Letters("tsh"), // 0x5b
  new Letters("kj"), // 0x5c
  Letter.LO_I, // 0x5d
  Letter.LO_U, // 0x5e
  new Letters("dzh"), // 0x5f
  Letter.UP_O, // 0x60
  Letter.LO_O, // 0x61
  Letter.UP_E, // 0x62
  Letter.LO_E, // 0x63
  CAP_IE, // 0x64
  LO_IE, // 0x65
  Letter.UP_E, // 0x66
  Letter.LO_E, // 0x67
  CAP_IE, // 0x68
  LO_IE, // 0x69
  Letter.UP_O, // 0x6a
  Letter.LO_O, // 0x6b
  CAP_IO, // 0x6c
  LO_IO, // 0x6d
  CAP_KS, // 0x6e
  new Letters("ks"), // 0x6f
  CAP_PS, // 0x70
  LO_PS, // 0x71
  Letter.UP_F, // 0x72
  Letter.LO_F, // 0x73
  Letter.UP_Y, // 0x74
  Letter.LO_Y, // 0x75
  Letter.UP_Y, // 0x76
  Letter.LO_Y, // 0x77
  Letter.LO_U, // 0x78
  Letter.LO_U, // 0x79
  Letter.UP_O, // 0x7a
  Letter.LO_O, // 0x7b
  Letter.UP_O, // 0x7c
  Letter.LO_O, // 0x7d
  new Letters("Ot"), // 0x7e
  LO_OT, // 0x7f
  Letter.UP_Q, // 0x80
  Letter.LO_Q, // 0x81
  new Chars("*1.000*"), // 0x82
  null, // 0x83
  null, // 0x84
  null, // 0x85
  null, // 0x86
  null, // 0x87
  new Chars("*100.000*"), // 0x88
  new Chars("*1.000.000*"), // 0x89
  null, // 0x8a - Į̆ - https://www.crwflags.com/fotw/flags/ru_cyr.html
  null, // 0x8b - į̆
  Char.QUOTE2, // 0x8c
  Char.QUOTE2, // 0x8d
  new Text("R\'"), // 0x8e
  new Text("r\'"), // 0x8f
  new Text("G\'"), // 0x90
  new Text("g\'"), // 0x91
  new Text("G\'"), // 0x92
  new Text("g\'"), // 0x93
  new Text("G\'"), // 0x94
  new Text("g\'"), // 0x95
  new Text("Zh\'"), // 0x96
  new Text("zh\'"), // 0x97
  new Text("Z\'"), // 0x98
  new Text("z\'"), // 0x99
  new Text("K\'"), // 0x9a
  new Text("k\'"), // 0x9b
  new Text("K\'"), // 0x9c
  new Text("k\'"), // 0x9d
  new Text("K\'"), // 0x9e
  new Text("k\'"), // 0x9f
  new Text("K\'"), // 0xa0
  new Text("k\'"), // 0xa1
  new Text("N\'"), // 0xa2
  new Text("n\'"), // 0xa3
  new Letters("Ng"), // 0xa4
  LO_NG, // 0xa5
  new Text("P\'"), // 0xa6
  new Text("p\'"), // 0xa7
  CAP_KH, // 0xa8
  LO_KH, // 0xa9
  new Text("S\'"), // 0xaa
  new Text("s\'"), // 0xab
  new Text("T\'"), // 0xac
  new Text("t\'"), // 0xad
  Letter.UP_U, // 0xae
  Letter.LO_U, // 0xaf
  new Text("U\'"), // 0xb0
  new Text("u\'"), // 0xb1
  new Text("Kh\'"), // 0xb2
  new Text("kh\'"), // 0xb3
  new Text("Tts"), // 0xb4
  new Text("tts"), // 0xb5
  new Text("Ch\'"), // 0xb6
  new Text("ch\'"), // 0xb7
  new Text("Ch\'"), // 0xb8
  new Text("ch\'"), // 0xb9
  Letter.UP_H, // 0xba
  Letter.LO_H, // 0xbb
  CAP_CH, // 0xbc
  LO_CH, // 0xbd
  new Text("Ch\'"), // 0xbe
  new Text("ch\'"), // 0xbf
  Char.GRAVE, // 0xc0
  CAP_ZH, // 0xc1
  LO_ZH, // 0xc2
  new Text("K\'"), // 0xc3
  new Text("k\'"), // 0xc4
  null, // 0xc5
  null, // 0xc6
  new Text("N\'"), // 0xc7
  new Text("n\'"), // 0xc8
  null, // 0xc9
  null, // 0xca
  CAP_CH, // 0xcb
  LO_CH, // 0xcc
  null, // 0xcd
  null, // 0xce
  null, // 0xcf
  Letter.LO_A, // 0xd0
  Letter.LO_A, // 0xd1
  Letter.UP_A, // 0xd2
  Letter.LO_A, // 0xd3
  UP_AE, // 0xd4
  LO_AE, // 0xd5
  CAP_IE, // 0xd6
  LO_IE, // 0xd7
  Char.AT, // 0xd8
  Char.AT, // 0xd9
  Char.AT, // 0xda
  Char.AT, // 0xdb
  CAP_ZH, // 0xdc
  LO_ZH, // 0xdd
  Letter.UP_Z, // 0xde
  Letter.LO_Z, // 0xdf
  CAP_DZ, // 0xe0
  LO_DZ, // 0xe1
  Letter.UP_I, // 0xe2
  Letter.LO_I, // 0xe3
  Letter.UP_I, // 0xe4
  Letter.LO_I, // 0xe5
  Letter.UP_O, // 0xe6
  Letter.LO_O, // 0xe7
  Letter.UP_O, // 0xe8
  Letter.LO_O, // 0xe9
  Letter.UP_O, // 0xea
  Letter.LO_O, // 0xeb
  Letter.UP_E, // 0xec
  Letter.LO_E, // 0xed
  Letter.UP_U, // 0xee
  Letter.LO_U, // 0xef
  Letter.UP_U, // 0xf0
  Letter.LO_U, // 0xf1
  Letter.UP_U, // 0xf2
  Letter.LO_U, // 0xf3
  CAP_CH, // 0xf4
  LO_CH, // 0xf5
  null, // 0xf6
  null, // 0xf7
  Letter.UP_Y, // 0xf8
  Letter.LO_Y, // 0xf9
  null, // 0xfa
  null, // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}
