/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+14xx (Unified Canadian Aboriginal Syllabics).
 */
final class X14 extends Xxx {

  private static final Letters LO_LOO = new Letters("loo");

  private static final Letters LO_LWAA = new Letters("lwaa");

  private static final Letters LO_LWA = new Letters("lwa");

  private static final Letters LO_LWOO = new Letters("lwoo");

  private static final Letters LO_LWO = new Letters("lwo");

  private static final Letters LO_LWII = new Letters("lwii");

  private static final Letters LO_LWI = new Letters("lwi");

  private static final Letters LO_LWE = new Letters("lwe");

  private static final Letters LO_NWAA = new Letters("nwaa");

  private static final Letters LO_NWA = new Letters("nwa");

  private static final Letters LO_NWE = new Letters("nwe");

  private static final Letters LO_MWO = new Letters("mwo");

  private static final Letters LO_MWII = new Letters("mwii");

  private static final Letters LO_MWI = new Letters("mwi");

  private static final Letters LO_MWE = new Letters("mwe");

  private static final Letters LO_MOO = new Letters("moo");

  private static final Letters LO_COO = new Letters("coo");

  private static final Letters LO_KWA = new Letters("kwa");

  private static final Letters LO_KWOO = new Letters("kwoo");

  private static final Letters LO_KWO = new Letters("kwo");

  private static final Letters LO_KWII = new Letters("kwii");

  private static final Letters LO_KWI = new Letters("kwi");

  private static final Letters LO_KWE = new Letters("kwe");

  private static final Letters LO_KOO = new Letters("koo");

  private static final Letters LO_TWA = new Letters("twa");

  private static final Letters LO_TWOO = new Letters("twoo");

  private static final Letters LO_SOO = new Letters("soo");

  private static final Letters LO_SWE = new Letters("swe");

  private static final Letters LO_SWI = new Letters("swi");

  private static final Letters LO_SWII = new Letters("swii");

  private static final Letters LO_SWOO = new Letters("swoo");

  private static final Letters LO_TWO = new Letters("two");

  private static final Letters LO_TWII = new Letters("twii");

  private static final Letters LO_TWI = new Letters("twi");

  private static final Letters LO_TWE = new Letters("twe");

  private static final Letters LO_TOO = new Letters("too");

  private static final Letters LO_POO = new Letters("poo");

  private static final Letters LO_WII = new Letters("wii");

  private static final Letters LO_WAA = new Letters("waa");

  private static final Letters LO_CWE = new Letters("cwe");

  private static final Letters LO_CWI = new Letters("cwi");

  private static final Letters LO_CWII = new Letters("cwii");

  private static final Letters LO_CWO = new Letters("cwo");

  private static final Letters LO_CWA = new Letters("cwa");

  private static final Letters LO_CWOO = new Letters("cwoo");

  private static final Letters LO_KWAA = new Letters("kwaa");

  private static final Letters LO_TWAA = new Letters("twaa");

  static final Chars LO_CWAA = new Letters("cwaa");

  static final Chars LO_PWAA = new Letters("pwaa");

  static final Chars LO_PWA = new Letters("pwa");

  static final Chars LO_PWOO = new Letters("pwoo");

  static final Chars LO_PWO = new Letters("pwo");

  static final Chars LO_PWII = new Letters("pwii");

  static final Chars LO_PWI = new Letters("pwi");

  static final Chars LO_PWE = new Letters("pwe");

  static final Chars LO_SWO = new Letters("swo");

  static final Chars LO_MWA = new Letters("mwa");

  static final Chars LO_MWOO = new Letters("mwoo");

  static final Chars LO_MWAA = new Letters("mwaa");

  static final Chars LO_NOO = new Letters("noo");

  static final Chars LO_WOO = new Letters("woo");

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  null, // 0x00
  Letter.LO_E, // 0x01
  new Letters("aai"), // 0x02
  Letter.LO_I, // 0x03
  LO_II, // 0x04
  Letter.LO_O, // 0x05
  LO_OO, // 0x06
  LO_OO, // 0x07
  LO_EE, // 0x08
  Letter.LO_I, // 0x09
  Letter.LO_A, // 0x0a
  LO_AA, // 0x0b
  LO_WE, // 0x0c
  LO_WE, // 0x0d
  LO_WI, // 0x0e
  LO_WI, // 0x0f
  LO_WII, // 0x10
  LO_WII, // 0x11
  LO_WO, // 0x12
  LO_WO, // 0x13
  LO_WOO, // 0x14
  LO_WOO, // 0x15
  LO_WOO, // 0x16
  LO_WA, // 0x17
  LO_WA, // 0x18
  LO_WAA, // 0x19
  LO_WAA, // 0x1a
  LO_WAA, // 0x1b
  LO_AI, // 0x1c
  Letter.LO_W, // 0x1d
  Char.QUOTE1, // 0x1e
  Letter.LO_T, // 0x1f
  Letter.LO_K, // 0x20
  LO_SH, // 0x21
  Letter.LO_S, // 0x22
  Letter.LO_N, // 0x23
  Letter.LO_W, // 0x24
  Letter.LO_N, // 0x25
  null, // 0x26
  Letter.LO_W, // 0x27
  Letter.LO_C, // 0x28
  Char.QUESTION, // 0x29
  Letter.LO_L, // 0x2a
  LO_EN, // 0x2b
  LO_IN, // 0x2c
  LO_ON, // 0x2d
  LO_AN, // 0x2e
  LO_PE, // 0x2f
  new Letters("paai"), // 0x30
  LO_PI, // 0x31
  new Letters("pii"), // 0x32
  LO_PO, // 0x33
  LO_POO, // 0x34
  LO_POO, // 0x35
  new Letters("hee"), // 0x36
  LO_HI, // 0x37
  LO_PA, // 0x38
  new Letters("paa"), // 0x39
  LO_PWE, // 0x3a
  LO_PWE, // 0x3b
  LO_PWI, // 0x3c
  LO_PWI, // 0x3d
  LO_PWII, // 0x3e
  LO_PWII, // 0x3f
  LO_PWO, // 0x40
  LO_PWO, // 0x41
  LO_PWOO, // 0x42
  LO_PWOO, // 0x43
  LO_PWA, // 0x44
  LO_PWA, // 0x45
  LO_PWAA, // 0x46
  LO_PWAA, // 0x47
  LO_PWAA, // 0x48
  Letter.LO_P, // 0x49
  Letter.LO_P, // 0x4a
  Letter.LO_H, // 0x4b
  LO_TE, // 0x4c
  new Letters("taai"), // 0x4d
  LO_TI, // 0x4e
  new Letters("tii"), // 0x4f
  LO_TO, // 0x50
  LO_TOO, // 0x51
  LO_TOO, // 0x52
  new Letters("dee"), // 0x53
  LO_DI, // 0x54
  LO_TA, // 0x55
  new Letters("taa"), // 0x56
  LO_TWE, // 0x57
  LO_TWE, // 0x58
  LO_TWI, // 0x59
  LO_TWI, // 0x5a
  LO_TWII, // 0x5b
  LO_TWII, // 0x5c
  LO_TWO, // 0x5d
  LO_TWO, // 0x5e
  LO_TWOO, // 0x5f
  LO_TWOO, // 0x60
  LO_TWA, // 0x61
  LO_TWA, // 0x62
  LO_TWAA, // 0x63
  LO_TWAA, // 0x64
  LO_TWAA, // 0x65
  Letter.LO_T, // 0x66
  new Letters("tte"), // 0x67
  new Letters("tti"), // 0x68
  new Letters("tto"), // 0x69
  new Letters("tta"), // 0x6a
  LO_KE, // 0x6b
  new Letters("kaai"), // 0x6c
  LO_KI, // 0x6d
  new Letters("kii"), // 0x6e
  LO_KO, // 0x6f
  LO_KOO, // 0x70
  LO_KOO, // 0x71
  LO_KA, // 0x72
  new Letters("kaa"), // 0x73
  LO_KWE, // 0x74
  LO_KWE, // 0x75
  LO_KWI, // 0x76
  LO_KWI, // 0x77
  LO_KWII, // 0x78
  LO_KWII, // 0x79
  LO_KWO, // 0x7a
  LO_KWO, // 0x7b
  LO_KWOO, // 0x7c
  LO_KWOO, // 0x7d
  LO_KWA, // 0x7e
  LO_KWA, // 0x7f
  LO_KWAA, // 0x80
  LO_KWAA, // 0x81
  LO_KWAA, // 0x82
  Letter.LO_K, // 0x83
  new Letters("kw"), // 0x84
  new Letters("keh"), // 0x85
  new Letters("kih"), // 0x86
  new Letters("koh"), // 0x87
  new Letters("kah"), // 0x88
  LO_CE, // 0x89
  new Letters("caai"), // 0x8a
  new Letters("ci"), // 0x8b
  new Letters("cii"), // 0x8c
  new Letters("co"), // 0x8d
  LO_COO, // 0x8e
  LO_COO, // 0x8f
  LO_CA, // 0x90
  new Letters("caa"), // 0x91
  LO_CWE, // 0x92
  LO_CWE, // 0x93
  LO_CWI, // 0x94
  LO_CWI, // 0x95
  LO_CWII, // 0x96
  LO_CWII, // 0x97
  LO_CWO, // 0x98
  LO_CWO, // 0x99
  LO_CWOO, // 0x9a
  LO_CWOO, // 0x9b
  LO_CWA, // 0x9c
  LO_CWA, // 0x9d
  LO_CWAA, // 0x9e
  LO_CWAA, // 0x9f
  LO_CWAA, // 0xa0
  Letter.LO_C, // 0xa1
  LO_TH, // 0xa2
  LO_ME, // 0xa3
  new Letters("maai"), // 0xa4
  LO_MI, // 0xa5
  new Letters("mii"), // 0xa6
  LO_MO, // 0xa7
  LO_MOO, // 0xa8
  LO_MOO, // 0xa9
  LO_MA, // 0xaa
  new Letters("maa"), // 0xab
  LO_MWE, // 0xac
  LO_MWE, // 0xad
  LO_MWI, // 0xae
  LO_MWI, // 0xaf
  LO_MWII, // 0xb0
  LO_MWII, // 0xb1
  LO_MWO, // 0xb2
  LO_MWO, // 0xb3
  LO_MWOO, // 0xb4
  LO_MWOO, // 0xb5
  LO_MWA, // 0xb6
  LO_MWA, // 0xb7
  LO_MWAA, // 0xb8
  LO_MWAA, // 0xb9
  LO_MWAA, // 0xba
  Letter.LO_M, // 0xbb
  Letter.LO_M, // 0xbc
  new Letters("mh"), // 0xbd
  Letter.LO_M, // 0xbe
  Letter.LO_M, // 0xbf
  LO_NE, // 0xc0
  new Letters("naai"), // 0xc1
  LO_NI, // 0xc2
  new Letters("nii"), // 0xc3
  LO_NO, // 0xc4
  LO_NOO, // 0xc5
  LO_NOO, // 0xc6
  LO_NA, // 0xc7
  new Letters("naa"), // 0xc8
  LO_NWE, // 0xc9
  LO_NWE, // 0xca
  LO_NWA, // 0xcb
  LO_NWA, // 0xcc
  LO_NWAA, // 0xcd
  LO_NWAA, // 0xce
  LO_NWAA, // 0xcf
  Letter.LO_N, // 0xd0
  LO_NG, // 0xd1
  new Letters("nh"), // 0xd2
  LO_LE, // 0xd3
  new Letters("laai"), // 0xd4
  LO_LI, // 0xd5
  new Letters("lii"), // 0xd6
  LO_LO, // 0xd7
  LO_LOO, // 0xd8
  LO_LOO, // 0xd9
  LO_LA, // 0xda
  new Letters("laa"), // 0xdb
  LO_LWE, // 0xdc
  LO_LWE, // 0xdd
  LO_LWI, // 0xde
  LO_LWI, // 0xdf
  LO_LWII, // 0xe0
  LO_LWII, // 0xe1
  LO_LWO, // 0xe2
  LO_LWO, // 0xe3
  LO_LWOO, // 0xe4
  LO_LWOO, // 0xe5
  LO_LWA, // 0xe6
  LO_LWA, // 0xe7
  LO_LWAA, // 0xe8
  LO_LWAA, // 0xe9
  Letter.LO_L, // 0xea
  Letter.LO_L, // 0xeb
  Letter.LO_L, // 0xec
  LO_SE, // 0xed
  new Letters("saai"), // 0xee
  LO_SI, // 0xef
  new Letters("sii"), // 0xf0
  LO_SO, // 0xf1
  LO_SOO, // 0xf2
  LO_SOO, // 0xf3
  LO_SA, // 0xf4
  new Letters("saa"), // 0xf5
  LO_SWE, // 0xf6
  LO_SWE, // 0xf7
  LO_SWI, // 0xf8
  LO_SWI, // 0xf9
  LO_SWII, // 0xfa
  LO_SWII, // 0xfb
  LO_SWO, // 0xfc
  LO_SWO, // 0xfd
  LO_SWOO, // 0xfe
  LO_SWOO };
}
