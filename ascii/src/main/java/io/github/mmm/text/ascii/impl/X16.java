/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+16xx (Unified Canadian Aboriginal Syllabics).
 */
final class X16 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("kka"), // 0x00
  new Letters("kk"), // 0x01
  LO_NU, // 0x02
  LO_NO, // 0x03
  LO_NE, // 0x04
  new Letters("nee"), // 0x05
  LO_NI, // 0x06
  LO_NA, // 0x07
  LO_MU, // 0x08
  LO_MO, // 0x09
  LO_ME, // 0x0a
  new Letters("mee"), // 0x0b
  LO_MI, // 0x0c
  LO_MA, // 0x0d
  LO_YU, // 0x0e
  LO_YO, // 0x0f
  LO_YE, // 0x10
  new Letters("yee"), // 0x11
  LO_YI, // 0x12
  LO_YA, // 0x13
  LO_JU, // 0x14
  LO_JU, // 0x15
  LO_JO, // 0x16
  LO_JE, // 0x17
  new Letters("jee"), // 0x18
  LO_JI, // 0x19
  LO_JI, // 0x1a
  LO_JA, // 0x1b
  new Letters("jju"), // 0x1c
  new Letters("jjo"), // 0x1d
  new Letters("jje"), // 0x1e
  new Letters("jjee"), // 0x1f
  new Letters("jji"), // 0x20
  new Letters("jja"), // 0x21
  LO_LU, // 0x22
  LO_LO, // 0x23
  LO_LE, // 0x24
  new Letters("lee"), // 0x25
  LO_LI, // 0x26
  LO_LA, // 0x27
  new Letters("dlu"), // 0x28
  new Letters("dlo"), // 0x29
  new Letters("dle"), // 0x2a
  new Letters("dlee"), // 0x2b
  new Letters("dli"), // 0x2c
  new Letters("dla"), // 0x2d
  new Letters("lhu"), // 0x2e
  new Letters("lho"), // 0x2f
  new Letters("lhe"), // 0x30
  new Letters("lhee"), // 0x31
  new Letters("lhi"), // 0x32
  new Letters("lha"), // 0x33
  new Letters("tlhu"), // 0x34
  new Letters("tlho"), // 0x35
  new Letters("tlhe"), // 0x36
  new Letters("tlhee"), // 0x37
  new Letters("tlhi"), // 0x38
  new Letters("tlha"), // 0x39
  new Letters("tlu"), // 0x3a
  new Letters("tlo"), // 0x3b
  new Letters("tle"), // 0x3c
  new Letters("tlee"), // 0x3d
  new Letters("tli"), // 0x3e
  new Letters("tla"), // 0x3f
  LO_ZU, // 0x40
  LO_ZO, // 0x41
  LO_ZE, // 0x42
  new Letters("zee"), // 0x43
  LO_ZI, // 0x44
  LO_ZA, // 0x45
  Letter.LO_Z, // 0x46
  Letter.LO_Z, // 0x47
  new Letters("dzu"), // 0x48
  new Letters("dzo"), // 0x49
  new Letters("dze"), // 0x4a
  new Letters("dzee"), // 0x4b
  new Letters("dzi"), // 0x4c
  new Letters("dza"), // 0x4d
  LO_SU, // 0x4e
  LO_SO, // 0x4f
  LO_SE, // 0x50
  new Letters("see"), // 0x51
  LO_SI, // 0x52
  LO_SA, // 0x53
  new Letters("shu"), // 0x54
  new Letters("sho"), // 0x55
  new Letters("she"), // 0x56
  new Letters("shee"), // 0x57
  new Letters("shi"), // 0x58
  new Letters("sha"), // 0x59
  LO_SH, // 0x5a
  new Letters("tsu"), // 0x5b
  new Letters("tso"), // 0x5c
  new Letters("tse"), // 0x5d
  new Letters("tsee"), // 0x5e
  new Letters("tsi"), // 0x5f
  new Letters("tsa"), // 0x60
  new Letters("chu"), // 0x61
  new Letters("cho"), // 0x62
  new Letters("che"), // 0x63
  new Letters("chee"), // 0x64
  new Letters("chi"), // 0x65
  new Letters("cha"), // 0x66
  new Letters("ttsu"), // 0x67
  new Letters("ttso"), // 0x68
  new Letters("ttse"), // 0x69
  new Letters("ttsee"), // 0x6a
  new Letters("ttsi"), // 0x6b
  new Letters("ttsa"), // 0x6c
  Letter.UP_X, // 0x6d
  Char.PERIOD, // 0x6e
  new Letters("qai"), // 0x6f
  new Letters("ngai"), // 0x70
  new Letters("nngi"), // 0x71
  new Letters("nngii"), // 0x72
  new Letters("nngo"), // 0x73
  new Letters("nngoo"), // 0x74
  new Letters("nnga"), // 0x75
  new Letters("nngaa"), // 0x76
  null, // 0x77
  null, // 0x78
  null, // 0x79
  null, // 0x7a
  null, // 0x7b
  null, // 0x7c
  null, // 0x7d
  null, // 0x7e
  null, // 0x7f
  Char.SPACE, // 0x80
  Letter.LO_B, // 0x81
  Letter.LO_L, // 0x82
  Letter.LO_F, // 0x83
  Letter.LO_S, // 0x84
  Letter.LO_N, // 0x85
  Letter.LO_H, // 0x86
  Letter.LO_D, // 0x87
  Letter.LO_T, // 0x88
  Letter.LO_C, // 0x89
  Letter.LO_Q, // 0x8a
  Letter.LO_M, // 0x8b
  Letter.LO_G, // 0x8c
  LO_NG, // 0x8d
  Letter.LO_Z, // 0x8e
  Letter.LO_R, // 0x8f
  Letter.LO_A, // 0x90
  Letter.LO_O, // 0x91
  Letter.LO_U, // 0x92
  Letter.LO_E, // 0x93
  Letter.LO_I, // 0x94
  LO_CH, // 0x95
  LO_TH, // 0x96
  LO_PH, // 0x97
  Letter.LO_P, // 0x98
  Letter.LO_X, // 0x99
  Letter.LO_P, // 0x9a
  Char.LESS, // 0x9b
  Char.GREATER, // 0x9c
  null, // 0x9d
  null, // 0x9e
  null, // 0x9f
  Letter.LO_F, // 0xa0
  Letter.LO_V, // 0xa1
  Letter.LO_U, // 0xa2
  LO_YR, // 0xa3
  Letter.LO_Y, // 0xa4
  Letter.LO_W, // 0xa5
  LO_TH, // 0xa6
  LO_TH, // 0xa7
  Letter.LO_A, // 0xa8
  Letter.LO_O, // 0xa9
  new Letters("ac"), // 0xaa
  LO_AE, // 0xab
  Letter.LO_O, // 0xac
  Letter.LO_O, // 0xad
  Letter.LO_O, // 0xae
  LO_OE, // 0xaf
  LO_ON, // 0xb0
  Letter.LO_R, // 0xb1
  Letter.LO_K, // 0xb2
  Letter.LO_C, // 0xb3
  Letter.LO_K, // 0xb4
  Letter.LO_G, // 0xb5
  LO_NG, // 0xb6
  Letter.LO_G, // 0xb7
  Letter.LO_G, // 0xb8
  Letter.LO_W, // 0xb9
  Letter.LO_H, // 0xba
  Letter.LO_H, // 0xbb
  Letter.LO_H, // 0xbc
  Letter.LO_H, // 0xbd
  Letter.LO_N, // 0xbe
  Letter.LO_N, // 0xbf
  Letter.LO_N, // 0xc0
  Letter.LO_I, // 0xc1
  Letter.LO_E, // 0xc2
  Letter.LO_J, // 0xc3
  Letter.LO_G, // 0xc4
  LO_AE, // 0xc5
  Letter.LO_A, // 0xc6
  LO_EO, // 0xc7
  Letter.LO_P, // 0xc8
  Letter.LO_Z, // 0xc9
  Letter.LO_S, // 0xca
  Letter.LO_S, // 0xcb
  Letter.LO_S, // 0xcc
  Letter.LO_C, // 0xcd
  Letter.LO_Z, // 0xce
  Letter.LO_T, // 0xcf
  Letter.LO_T, // 0xd0
  Letter.LO_D, // 0xd1
  Letter.LO_B, // 0xd2
  Letter.LO_B, // 0xd3
  Letter.LO_P, // 0xd4
  Letter.LO_P, // 0xd5
  Letter.LO_E, // 0xd6
  Letter.LO_M, // 0xd7
  Letter.LO_M, // 0xd8
  Letter.LO_M, // 0xd9
  Letter.LO_L, // 0xda
  Letter.LO_L, // 0xdb
  LO_NG, // 0xdc
  LO_NG, // 0xdd
  Letter.LO_D, // 0xde
  Letter.LO_O, // 0xdf
  new Letters("ear"), // 0xe0
  new Letters("ior"), // 0xe1
  new Letters("qu"), // 0xe2
  new Letters("qu"), // 0xe3
  new Letters("qu"), // 0xe4
  Letter.LO_S, // 0xe5
  LO_YR, // 0xe6
  LO_YR, // 0xe7
  LO_YR, // 0xe8
  Letter.LO_Q, // 0xe9
  Letter.LO_X, // 0xea
  Char.PERIOD, // 0xeb
  Char.COLON, // 0xec
  Char.PLUS, // 0xed
  new Chars("17"), // 0xee
  new Chars("18"), // 0xef
  new Chars("19"), // 0xf0
  Letter.LO_K, // 0xf1
  LO_SH, // 0xf2
  LO_OO, // 0xf3
  Letter.LO_O, // 0xf4
  Letter.LO_I, // 0xf5
  Letter.LO_E, // 0xf6
  Letter.LO_A, // 0xf7
  LO_AE, // 0xf8
  null, // 0xf9
  null, // 0xfa
  null, // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}