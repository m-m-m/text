/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+13xx (Ethiopic + Supplement, Cherokee).
 */
final class X13 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  LO_JA, // 0x00
  LO_JU, // 0x01
  LO_JI, // 0x02
  new Letters("jaa"), // 0x03
  new Letters("jee"), // 0x04
  LO_JE, // 0x05
  LO_JO, // 0x06
  new Letters("jwa"), // 0x07
  LO_GA, // 0x08
  LO_GU, // 0x09
  LO_GI, // 0x0a
  new Letters("gaa"), // 0x0b
  new Letters("gee"), // 0x0c
  LO_GE, // 0x0d
  LO_GO, // 0x0e
  null, // 0x0f
  new Letters("gwa"), // 0x10
  null, // 0x11
  new Letters("gwi"), // 0x12
  new Letters("gwaa"), // 0x13
  new Letters("gwee"), // 0x14
  new Letters("gwe"), // 0x15
  null, // 0x16
  null, // 0x17
  new Letters("gga"), // 0x18
  new Letters("ggu"), // 0x19
  new Letters("ggi"), // 0x1a
  new Letters("ggaa"), // 0x1b
  new Letters("ggee"), // 0x1c
  new Letters("gge"), // 0x1d
  new Letters("ggo"), // 0x1e
  null, // 0x1f
  new Letters("tha"), // 0x20
  new Letters("thu"), // 0x21
  new Letters("thi"), // 0x22
  new Letters("thaa"), // 0x23
  new Letters("thee"), // 0x24
  new Letters("the"), // 0x25
  new Letters("tho"), // 0x26
  new Letters("thwa"), // 0x27
  new Letters("cha"), // 0x28
  new Letters("chu"), // 0x29
  new Letters("chi"), // 0x2a
  new Letters("chaa"), // 0x2b
  new Letters("chee"), // 0x2c
  new Letters("che"), // 0x2d
  new Letters("cho"), // 0x2e
  new Letters("chwa"), // 0x2f
  new Letters("pha"), // 0x30
  new Letters("phu"), // 0x31
  new Letters("phi"), // 0x32
  new Letters("phaa"), // 0x33
  new Letters("phee"), // 0x34
  new Letters("phe"), // 0x35
  new Letters("pho"), // 0x36
  new Letters("phwa"), // 0x37
  new Letters("tsa"), // 0x38
  new Letters("tsu"), // 0x39
  new Letters("tsi"), // 0x3a
  new Letters("tsaa"), // 0x3b
  new Letters("tsee"), // 0x3c
  new Letters("tse"), // 0x3d
  new Letters("tso"), // 0x3e
  new Letters("tswa"), // 0x3f
  new Letters("tza"), // 0x40
  new Letters("tzu"), // 0x41
  new Letters("tzi"), // 0x42
  new Letters("tzaa"), // 0x43
  new Letters("tzee"), // 0x44
  new Letters("tze"), // 0x45
  new Letters("tzo"), // 0x46
  null, // 0x47
  LO_FA, // 0x48
  LO_FU, // 0x49
  LO_FI, // 0x4a
  new Letters("faa"), // 0x4b
  new Letters("fee"), // 0x4c
  LO_FE, // 0x4d
  LO_FO, // 0x4e
  new Letters("fwa"), // 0x4f
  LO_PA, // 0x50
  LO_PU, // 0x51
  LO_PI, // 0x52
  new Letters("paa"), // 0x53
  new Letters("pee"), // 0x54
  LO_PE, // 0x55
  LO_PO, // 0x56
  new Letters("pwa"), // 0x57
  new Letters("rya"), // 0x58
  new Letters("mya"), // 0x59
  new Letters("fya"), // 0x5a
  null, // 0x5b
  null, // 0x5c
  null, // 0x5d
  null, // 0x5e
  null, // 0x5f
  null, // 0x60
  Char.SPACE, // 0x61
  Char.PERIOD, // 0x62
  Char.COMMA, // 0x63
  Char.SEMICOL, // 0x64
  Char.COLON, // 0x65
  new Chars(":: "), // 0x66
  Char.QUESTION, // 0x67
  new Chars("//"), // 0x68
  Digit._1, // 0x69
  Digit._2, // 0x6a
  Digit._3, // 0x6b
  Digit._4, // 0x6c
  Digit._5, // 0x6d
  Digit._6, // 0x6e
  Digit._7, // 0x6f
  Digit._8, // 0x70
  Digit._9, // 0x71
  new GenericNumber(10), // 0x72
  new GenericNumber(20), // 0x73
  new GenericNumber(30), // 0x74
  new GenericNumber(40), // 0x75
  new GenericNumber(50), // 0x76
  new GenericNumber(60), // 0x77
  new GenericNumber(70), // 0x78
  new GenericNumber(80), // 0x79
  new GenericNumber(90), // 0x7a
  new GenericNumber(100), // 0x7b
  new GenericNumber(10000), // 0x7c
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
  Letter.LO_A, // 0xa0
  Letter.LO_E, // 0xa1
  Letter.LO_I, // 0xa2
  Letter.LO_O, // 0xa3
  Letter.LO_U, // 0xa4
  Letter.LO_V, // 0xa5
  LO_GA, // 0xa6
  LO_KA, // 0xa7
  LO_GE, // 0xa8
  LO_GI, // 0xa9
  LO_GO, // 0xaa
  LO_GU, // 0xab
  new Letters("gv"), // 0xac
  LO_HA, // 0xad
  LO_HE, // 0xae
  LO_HI, // 0xaf
  LO_HO, // 0xb0
  LO_HU, // 0xb1
  new Letters("hv"), // 0xb2
  LO_LA, // 0xb3
  LO_LE, // 0xb4
  LO_LI, // 0xb5
  LO_LO, // 0xb6
  LO_LU, // 0xb7
  new Letters("lv"), // 0xb8
  LO_MA, // 0xb9
  LO_ME, // 0xba
  LO_MI, // 0xbb
  LO_MO, // 0xbc
  LO_MU, // 0xbd
  LO_NA, // 0xbe
  new Letters("hna"), // 0xbf
  new Letters("nah"), // 0xc0
  LO_NE, // 0xc1
  LO_NI, // 0xc2
  LO_NO, // 0xc3
  LO_NU, // 0xc4
  new Letters("nv"), // 0xc5
  new Letters("qua"), // 0xc6
  new Letters("que"), // 0xc7
  new Letters("qui"), // 0xc8
  new Letters("quo"), // 0xc9
  new Letters("quu"), // 0xca
  new Letters("quv"), // 0xcb
  LO_SA, // 0xcc
  Letter.LO_S, // 0xcd
  LO_SE, // 0xce
  LO_SI, // 0xcf
  LO_SO, // 0xd0
  LO_SU, // 0xd1
  new Letters("sv"), // 0xd2
  LO_DA, // 0xd3
  LO_TA, // 0xd4
  LO_DE, // 0xd5
  LO_TE, // 0xd6
  LO_DI, // 0xd7
  LO_TI, // 0xd8
  LO_DO, // 0xd9
  LO_DU, // 0xda
  new Letters("dv"), // 0xdb
  new Letters("dla"), // 0xdc
  new Letters("tla"), // 0xdd
  new Letters("tle"), // 0xde
  new Letters("tli"), // 0xdf
  new Letters("tlo"), // 0xe0
  new Letters("tlu"), // 0xe1
  new Letters("tlv"), // 0xe2
  new Letters("tsa"), // 0xe3
  new Letters("tse"), // 0xe4
  new Letters("tsi"), // 0xe5
  new Letters("tso"), // 0xe6
  new Letters("tsu"), // 0xe7
  new Letters("tsv"), // 0xe8
  LO_WA, // 0xe9
  LO_WE, // 0xea
  LO_WI, // 0xeb
  LO_WO, // 0xec
  new Letters("wu"), // 0xed
  new Letters("wv"), // 0xee
  LO_YA, // 0xef
  LO_YE, // 0xf0
  LO_YI, // 0xf1
  LO_YO, // 0xf2
  LO_YU, // 0xf3
  new Letters("yv"), // 0xf4
  new Letters("MV"), // 0xf5
  null, // 0xf6
  null, // 0xf7
  LO_YE, // 0xf8
  LO_YI, // 0xf9
  LO_YO, // 0xfa
  LO_YU, // 0xfb
  new Letters("yv"), // 0xfc
  new Letters("mv"), // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}