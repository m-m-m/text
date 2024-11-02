/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+11xx (Hangul Jamo).
 */
final class X11 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  Letter.LO_G, // 0x00
  LO_GG, // 0x01
  Letter.LO_N, // 0x02
  Letter.LO_D, // 0x03
  LO_DD, // 0x04
  Letter.LO_R, // 0x05
  Letter.LO_M, // 0x06
  Letter.LO_B, // 0x07
  LO_BB, // 0x08
  Letter.LO_S, // 0x09
  LO_SS, // 0x0a
  null, // 0x0b
  Letter.LO_J, // 0x0c
  LO_JJ, // 0x0d
  Letter.LO_C, // 0x0e
  Letter.LO_K, // 0x0f
  Letter.LO_T, // 0x10
  Letter.LO_P, // 0x11
  Letter.LO_H, // 0x12
  LO_NG, // 0x13
  LO_NN, // 0x14
  new Letters("nd"), // 0x15
  new Letters("nb"), // 0x16
  new Letters("dg"), // 0x17
  new Letters("rn"), // 0x18
  LO_RR, // 0x19
  LO_RH, // 0x1a
  new Letters("rN"), // 0x1b
  new Letters("mb"), // 0x1c
  new Letters("mN"), // 0x1d
  new Letters("bg"), // 0x1e
  new Letters("bn"), // 0x1f
  null, // 0x20
  LO_BS, // 0x21
  new Letters("bsg"), // 0x22
  new Letters("bst"), // 0x23
  new Letters("bsb"), // 0x24
  new Letters("bss"), // 0x25
  new Letters("bsj"), // 0x26
  new Letters("bj"), // 0x27
  new Letters("bc"), // 0x28
  new Letters("bt"), // 0x29
  new Letters("bp"), // 0x2a
  new Letters("bN"), // 0x2b
  new Letters("bbN"), // 0x2c
  new Letters("sg"), // 0x2d
  new Letters("sn"), // 0x2e
  new Letters("sd"), // 0x2f
  new Letters("sr"), // 0x30
  new Letters("sm"), // 0x31
  new Letters("sb"), // 0x32
  new Letters("sbg"), // 0x33
  new Letters("sss"), // 0x34
  Letter.LO_S, // 0x35
  new Letters("sj"), // 0x36
  new Letters("sc"), // 0x37
  new Letters("sk"), // 0x38
  LO_ST, // 0x39
  LO_SP, // 0x3a
  LO_SH, // 0x3b
  null, // 0x3c
  null, // 0x3d
  null, // 0x3e
  null, // 0x3f
  Letter.UP_Z, // 0x40
  Letter.LO_G, // 0x41
  Letter.LO_D, // 0x42
  Letter.LO_M, // 0x43
  Letter.LO_B, // 0x44
  Letter.LO_S, // 0x45
  Letter.UP_Z, // 0x46
  null, // 0x47
  Letter.LO_J, // 0x48
  Letter.LO_C, // 0x49
  Letter.LO_T, // 0x4a
  Letter.LO_P, // 0x4b
  Letter.UP_N, // 0x4c
  Letter.LO_J, // 0x4d
  null, // 0x4e
  null, // 0x4f
  null, // 0x50
  null, // 0x51
  new Letters("ck"), // 0x52
  LO_CH, // 0x53
  null, // 0x54
  null, // 0x55
  new Letters("pb"), // 0x56
  new Letters("pN"), // 0x57
  new Letters("hh"), // 0x58
  Letter.UP_Q, // 0x59
  null, // 0x5a
  null, // 0x5b
  null, // 0x5c
  null, // 0x5d
  null, // 0x5e
  null, // 0x5f
  null, // 0x60
  Letter.LO_A, // 0x61
  LO_AE, // 0x62
  LO_YA, // 0x63
  new Letters("yae"), // 0x64
  LO_EO, // 0x65
  Letter.LO_E, // 0x66
  new Letters("yeo"), // 0x67
  LO_YE, // 0x68
  Letter.LO_O, // 0x69
  LO_WA, // 0x6a
  new Letters("wae"), // 0x6b
  LO_OE, // 0x6c
  LO_YO, // 0x6d
  Letter.LO_U, // 0x6e
  new Letters("weo"), // 0x6f
  LO_WE, // 0x70
  LO_WI, // 0x71
  LO_YU, // 0x72
  LO_EU, // 0x73
  LO_YI, // 0x74
  Letter.LO_I, // 0x75
  new Text("a-o"), // 0x76
  new Text("a-u"), // 0x77
  new Text("ya-o"), // 0x78
  new Text("ya-yo"), // 0x79
  new Text("eo-o"), // 0x7a
  new Text("eo-u"), // 0x7b
  new Text("eo-eu"), // 0x7c
  new Text("yeo-o"), // 0x7d
  new Text("yeo-u"), // 0x7e
  new Text("o-eo"), // 0x7f
  new Text("o-e"), // 0x80
  new Text("o-ye"), // 0x81
  new Text("o-o"), // 0x82
  new Text("o-u"), // 0x83
  new Text("yo-ya"), // 0x84
  new Text("yo-yae"), // 0x85
  new Text("yo-yeo"), // 0x86
  new Text("yo-o"), // 0x87
  new Text("yo-i"), // 0x88
  new Text("u-a"), // 0x89
  new Text("u-ae"), // 0x8a
  new Text("u-eo-eu"), // 0x8b
  new Text("u-ye"), // 0x8c
  new Text("u-u"), // 0x8d
  new Text("yu-a"), // 0x8e
  new Text("yu-eo"), // 0x8f
  new Text("yu-e"), // 0x90
  new Text("yu-yeo"), // 0x91
  new Text("yu-ye"), // 0x92
  new Text("yu-u"), // 0x93
  new Text("yu-i"), // 0x94
  new Text("eu-u"), // 0x95
  new Text("eu-eu"), // 0x96
  new Text("yi-u"), // 0x97
  new Text("i-a"), // 0x98
  new Text("i-ya"), // 0x99
  new Text("i-o"), // 0x9a
  new Text("i-u"), // 0x9b
  new Text("i-eu"), // 0x9c
  new Text("i-U"), // 0x9d
  Letter.UP_U, // 0x9e
  new Text("U-eo"), // 0x9f
  new Text("U-u"), // 0xa0
  new Text("U-i"), // 0xa1
  new Letters("UU"), // 0xa2
  null, // 0xa3
  null, // 0xa4
  null, // 0xa5
  null, // 0xa6
  null, // 0xa7
  Letter.LO_G, // 0xa8
  LO_GG, // 0xa9
  LO_GS, // 0xaa
  Letter.LO_N, // 0xab
  LO_NJ, // 0xac
  LO_NH, // 0xad
  Letter.LO_D, // 0xae
  Letter.LO_L, // 0xaf
  LO_LG, // 0xb0
  LO_LM, // 0xb1
  LO_LB, // 0xb2
  LO_LS, // 0xb3
  LO_LT, // 0xb4
  LO_LP, // 0xb5
  new Letters("lh"), // 0xb6
  Letter.LO_M, // 0xb7
  Letter.LO_B, // 0xb8
  LO_BS, // 0xb9
  Letter.LO_S, // 0xba
  LO_SS, // 0xbb
  LO_NG, // 0xbc
  Letter.LO_J, // 0xbd
  Letter.LO_C, // 0xbe
  Letter.LO_K, // 0xbf
  Letter.LO_T, // 0xc0
  Letter.LO_P, // 0xc1
  Letter.LO_H, // 0xc2
  new Letters("gl"), // 0xc3
  new Letters("gsg"), // 0xc4
  LO_NG, // 0xc5
  new Letters("nd"), // 0xc6
  new Letters("ns"), // 0xc7
  new Letters("nZ"), // 0xc8
  new Letters("nt"), // 0xc9
  new Letters("dg"), // 0xca
  new Letters("tl"), // 0xcb
  new Letters("lgs"), // 0xcc
  new Letters("ln"), // 0xcd
  new Letters("ld"), // 0xce
  new Letters("lth"), // 0xcf
  LO_LL, // 0xd0
  new Letters("lmg"), // 0xd1
  new Letters("lms"), // 0xd2
  new Letters("lbs"), // 0xd3
  new Letters("lbh"), // 0xd4
  new Letters("rNp"), // 0xd5
  new Letters("lss"), // 0xd6
  new Letters("lZ"), // 0xd7
  new Letters("lk"), // 0xd8
  new Letters("lQ"), // 0xd9
  new Letters("mg"), // 0xda
  new Letters("ml"), // 0xdb
  new Letters("mb"), // 0xdc
  new Letters("ms"), // 0xdd
  new Letters("mss"), // 0xde
  new Letters("mZ"), // 0xdf
  new Letters("mc"), // 0xe0
  new Letters("mh"), // 0xe1
  new Letters("mN"), // 0xe2
  new Letters("bl"), // 0xe3
  new Letters("bp"), // 0xe4
  LO_PH, // 0xe5
  new Letters("pN"), // 0xe6
  new Letters("sg"), // 0xe7
  new Letters("sd"), // 0xe8
  new Letters("sl"), // 0xe9
  new Letters("sb"), // 0xea
  Letter.UP_Z, // 0xeb
  Letter.LO_G, // 0xec
  LO_SS, // 0xed
  null, // 0xee
  LO_KH, // 0xef
  Letter.UP_N, // 0xf0
  new Letters("Ns"), // 0xf1
  new Letters("NZ"), // 0xf2
  new Letters("pb"), // 0xf3
  new Letters("pN"), // 0xf4
  new Letters("hn"), // 0xf5
  new Letters("hl"), // 0xf6
  new Letters("hm"), // 0xf7
  new Letters("hb"), // 0xf8
  Letter.UP_Q, // 0xf9
  null, // 0xfa
  null, // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}