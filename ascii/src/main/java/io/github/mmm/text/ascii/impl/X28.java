/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+28xx.
 */
final class X28 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  Char.SPACE, // 0x00
  Letter.LO_A, // 0x01
  Digit._1, // 0x02
  Letter.LO_B, // 0x03
  Char.QUOTE1, // 0x04
  Letter.LO_K, // 0x05
  Digit._2, // 0x06
  Letter.LO_L, // 0x07
  Char.AT, // 0x08
  Letter.LO_C, // 0x09
  Letter.LO_I, // 0x0a
  Letter.LO_F, // 0x0b
  Char.SLASH, // 0x0c
  Letter.LO_M, // 0x0d
  Letter.LO_S, // 0x0e
  Letter.LO_P, // 0x0f
  Char.QUOTE2, // 0x10
  Letter.LO_E, // 0x11
  Digit._3, // 0x12
  Letter.LO_H, // 0x13
  Digit._9, // 0x14
  Letter.LO_O, // 0x15
  Digit._6, // 0x16
  Letter.LO_R, // 0x17
  Char.CARET, // 0x18
  Letter.LO_D, // 0x19
  Letter.LO_J, // 0x1a
  Letter.LO_G, // 0x1b
  Char.GREATER, // 0x1c
  Letter.LO_N, // 0x1d
  Letter.LO_T, // 0x1e
  Letter.LO_Q, // 0x1f
  Char.COMMA, // 0x20
  Char.ASTERISK, // 0x21
  Digit._5, // 0x22
  Char.LESS, // 0x23
  Char.MINUS, // 0x24
  Letter.LO_U, // 0x25
  Digit._8, // 0x26
  Letter.LO_V, // 0x27
  Char.PERIOD, // 0x28
  Char.PERCENT, // 0x29
  Char.BRACKET0, // 0x2a
  Char.DOLAR, // 0x2b
  Char.PLUS, // 0x2c
  Letter.LO_X, // 0x2d
  Char.EXCLAMATION, // 0x2e
  Char.AMP, // 0x2f
  Char.SEMICOL, // 0x30
  Char.COLON, // 0x31
  Digit._4, // 0x32
  Char.BKSLASH, // 0x33
  Digit._0, // 0x34
  Letter.LO_Z, // 0x35
  Digit._7, // 0x36
  Char.PARENT0, // 0x37
  Char.UNDSCORE, // 0x38
  Char.QUESTION, // 0x39
  Letter.LO_W, // 0x3a
  Char.BRACKET1, // 0x3b
  Char.HASH, // 0x3c
  Letter.LO_Y, // 0x3d
  Char.PARENT1, // 0x3e
  Char.EQUAL, // 0x3f
  new Chars("[d7]"), // 0x40
  new Chars("[d17]"), // 0x41
  new Chars("[d27]"), // 0x42
  new Chars("[d127]"), // 0x43
  new Chars("[d37]"), // 0x44
  new Chars("[d137]"), // 0x45
  new Chars("[d237]"), // 0x46
  new Chars("[d1237]"), // 0x47
  new Chars("[d47]"), // 0x48
  new Chars("[d147]"), // 0x49
  new Chars("[d247]"), // 0x4a
  new Chars("[d1247]"), // 0x4b
  new Chars("[d347]"), // 0x4c
  new Chars("[d1347]"), // 0x4d
  new Chars("[d2347]"), // 0x4e
  new Chars("[d12347]"), // 0x4f
  new Chars("[d57]"), // 0x50
  new Chars("[d157]"), // 0x51
  new Chars("[d257]"), // 0x52
  new Chars("[d1257]"), // 0x53
  new Chars("[d357]"), // 0x54
  new Chars("[d1357]"), // 0x55
  new Chars("[d2357]"), // 0x56
  new Chars("[d12357]"), // 0x57
  new Chars("[d457]"), // 0x58
  new Chars("[d1457]"), // 0x59
  new Chars("[d2457]"), // 0x5a
  new Chars("[d12457]"), // 0x5b
  new Chars("[d3457]"), // 0x5c
  new Chars("[d13457]"), // 0x5d
  new Chars("[d23457]"), // 0x5e
  new Chars("[d123457]"), // 0x5f
  new Chars("[d67]"), // 0x60
  new Chars("[d167]"), // 0x61
  new Chars("[d267]"), // 0x62
  new Chars("[d1267]"), // 0x63
  new Chars("[d367]"), // 0x64
  new Chars("[d1367]"), // 0x65
  new Chars("[d2367]"), // 0x66
  new Chars("[d12367]"), // 0x67
  new Chars("[d467]"), // 0x68
  new Chars("[d1467]"), // 0x69
  new Chars("[d2467]"), // 0x6a
  new Chars("[d12467]"), // 0x6b
  new Chars("[d3467]"), // 0x6c
  new Chars("[d13467]"), // 0x6d
  new Chars("[d23467]"), // 0x6e
  new Chars("[d123467]"), // 0x6f
  new Chars("[d567]"), // 0x70
  new Chars("[d1567]"), // 0x71
  new Chars("[d2567]"), // 0x72
  new Chars("[d12567]"), // 0x73
  new Chars("[d3567]"), // 0x74
  new Chars("[d13567]"), // 0x75
  new Chars("[d23567]"), // 0x76
  new Chars("[d123567]"), // 0x77
  new Chars("[d4567]"), // 0x78
  new Chars("[d14567]"), // 0x79
  new Chars("[d24567]"), // 0x7a
  new Chars("[d124567]"), // 0x7b
  new Chars("[d34567]"), // 0x7c
  new Chars("[d134567]"), // 0x7d
  new Chars("[d234567]"), // 0x7e
  new Chars("[d1234567]"), // 0x7f
  new Chars("[d8]"), // 0x80
  new Chars("[d18]"), // 0x81
  new Chars("[d28]"), // 0x82
  new Chars("[d128]"), // 0x83
  new Chars("[d38]"), // 0x84
  new Chars("[d138]"), // 0x85
  new Chars("[d238]"), // 0x86
  new Chars("[d1238]"), // 0x87
  new Chars("[d48]"), // 0x88
  new Chars("[d148]"), // 0x89
  new Chars("[d248]"), // 0x8a
  new Chars("[d1248]"), // 0x8b
  new Chars("[d348]"), // 0x8c
  new Chars("[d1348]"), // 0x8d
  new Chars("[d2348]"), // 0x8e
  new Chars("[d12348]"), // 0x8f
  new Chars("[d58]"), // 0x90
  new Chars("[d158]"), // 0x91
  new Chars("[d258]"), // 0x92
  new Chars("[d1258]"), // 0x93
  new Chars("[d358]"), // 0x94
  new Chars("[d1358]"), // 0x95
  new Chars("[d2358]"), // 0x96
  new Chars("[d12358]"), // 0x97
  new Chars("[d458]"), // 0x98
  new Chars("[d1458]"), // 0x99
  new Chars("[d2458]"), // 0x9a
  new Chars("[d12458]"), // 0x9b
  new Chars("[d3458]"), // 0x9c
  new Chars("[d13458]"), // 0x9d
  new Chars("[d23458]"), // 0x9e
  new Chars("[d123458]"), // 0x9f
  new Chars("[d68]"), // 0xa0
  new Chars("[d168]"), // 0xa1
  new Chars("[d268]"), // 0xa2
  new Chars("[d1268]"), // 0xa3
  new Chars("[d368]"), // 0xa4
  new Chars("[d1368]"), // 0xa5
  new Chars("[d2368]"), // 0xa6
  new Chars("[d12368]"), // 0xa7
  new Chars("[d468]"), // 0xa8
  new Chars("[d1468]"), // 0xa9
  new Chars("[d2468]"), // 0xaa
  new Chars("[d12468]"), // 0xab
  new Chars("[d3468]"), // 0xac
  new Chars("[d13468]"), // 0xad
  new Chars("[d23468]"), // 0xae
  new Chars("[d123468]"), // 0xaf
  new Chars("[d568]"), // 0xb0
  new Chars("[d1568]"), // 0xb1
  new Chars("[d2568]"), // 0xb2
  new Chars("[d12568]"), // 0xb3
  new Chars("[d3568]"), // 0xb4
  new Chars("[d13568]"), // 0xb5
  new Chars("[d23568]"), // 0xb6
  new Chars("[d123568]"), // 0xb7
  new Chars("[d4568]"), // 0xb8
  new Chars("[d14568]"), // 0xb9
  new Chars("[d24568]"), // 0xba
  new Chars("[d124568]"), // 0xbb
  new Chars("[d34568]"), // 0xbc
  new Chars("[d134568]"), // 0xbd
  new Chars("[d234568]"), // 0xbe
  new Chars("[d1234568]"), // 0xbf
  new Chars("[d78]"), // 0xc0
  new Chars("[d178]"), // 0xc1
  new Chars("[d278]"), // 0xc2
  new Chars("[d1278]"), // 0xc3
  new Chars("[d378]"), // 0xc4
  new Chars("[d1378]"), // 0xc5
  new Chars("[d2378]"), // 0xc6
  new Chars("[d12378]"), // 0xc7
  new Chars("[d478]"), // 0xc8
  new Chars("[d1478]"), // 0xc9
  new Chars("[d2478]"), // 0xca
  new Chars("[d12478]"), // 0xcb
  new Chars("[d3478]"), // 0xcc
  new Chars("[d13478]"), // 0xcd
  new Chars("[d23478]"), // 0xce
  new Chars("[d123478]"), // 0xcf
  new Chars("[d578]"), // 0xd0
  new Chars("[d1578]"), // 0xd1
  new Chars("[d2578]"), // 0xd2
  new Chars("[d12578]"), // 0xd3
  new Chars("[d3578]"), // 0xd4
  new Chars("[d13578]"), // 0xd5
  new Chars("[d23578]"), // 0xd6
  new Chars("[d123578]"), // 0xd7
  new Chars("[d4578]"), // 0xd8
  new Chars("[d14578]"), // 0xd9
  new Chars("[d24578]"), // 0xda
  new Chars("[d124578]"), // 0xdb
  new Chars("[d34578]"), // 0xdc
  new Chars("[d134578]"), // 0xdd
  new Chars("[d234578]"), // 0xde
  new Chars("[d1234578]"), // 0xdf
  new Chars("[d678]"), // 0xe0
  new Chars("[d1678]"), // 0xe1
  new Chars("[d2678]"), // 0xe2
  new Chars("[d12678]"), // 0xe3
  new Chars("[d3678]"), // 0xe4
  new Chars("[d13678]"), // 0xe5
  new Chars("[d23678]"), // 0xe6
  new Chars("[d123678]"), // 0xe7
  new Chars("[d4678]"), // 0xe8
  new Chars("[d14678]"), // 0xe9
  new Chars("[d24678]"), // 0xea
  new Chars("[d124678]"), // 0xeb
  new Chars("[d34678]"), // 0xec
  new Chars("[d134678]"), // 0xed
  new Chars("[d234678]"), // 0xee
  new Chars("[d1234678]"), // 0xef
  new Chars("[d5678]"), // 0xf0
  new Chars("[d15678]"), // 0xf1
  new Chars("[d25678]"), // 0xf2
  new Chars("[d125678]"), // 0xf3
  new Chars("[d35678]"), // 0xf4
  new Chars("[d135678]"), // 0xf5
  new Chars("[d235678]"), // 0xf6
  new Chars("[d1235678]"), // 0xf7
  new Chars("[d45678]"), // 0xf8
  new Chars("[d145678]"), // 0xf9
  new Chars("[d245678]"), // 0xfa
  new Chars("[d1245678]"), // 0xfb
  new Chars("[d345678]"), // 0xfc
  new Chars("[d1345678]"), // 0xfd
  new Chars("[d2345678]"), // 0xfe
  new Chars("[d12345678]") // 0xff
  };
}
