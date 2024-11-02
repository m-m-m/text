/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+15xx (Unified Canadian Aboriginal Syllabics).
 */
final class X15 extends Xxx {

  private static final Letters LO_YWAA = new Letters("ywaa");

  private static final Letters LO_YWA = new Letters("ywa");

  private static final Letters LO_YWOO = new Letters("ywoo");

  private static final Letters LO_YWO = new Letters("ywo");

  private static final Letters LO_YWII = new Letters("ywii");

  private static final Letters LO_YWI = new Letters("ywi");

  private static final Letters LO_YWE = new Letters("ywe");

  private static final Letters LO_SHWAA = new Letters("shwaa");

  private static final Letters LO_SHWA = new Letters("shwa");

  private static final Letters LO_SHWOO = new Letters("shwoo");

  private static final Letters LO_SHWO = new Letters("shwo");

  private static final Letters LO_SHWII = new Letters("shwii");

  private static final Letters LO_SWAA = new Letters("swaa");

  private static final Letters LO_SWA = new Letters("swa");

  static final Letters LO_YOO = new Letters("yoo");

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  LO_SWA, // 0x00
  LO_SWA, // 0x01
  LO_SWAA, // 0x02
  LO_SWAA, // 0x03
  LO_SWAA, // 0x04
  Letter.LO_S, // 0x05
  Letter.LO_S, // 0x06
  new Letters("sw"), // 0x07
  Letter.LO_S, // 0x08
  new Letters("sk"), // 0x09
  new Letters("skw"), // 0x0a
  new Letters("sW"), // 0x0b
  new Letters("spwa"), // 0x0c
  new Letters("stwa"), // 0x0d
  new Letters("skwa"), // 0x0e
  new Letters("scwa"), // 0x0f
  new Letters("she"), // 0x10
  new Letters("shi"), // 0x11
  new Letters("shii"), // 0x12
  new Letters("sho"), // 0x13
  new Letters("shoo"), // 0x14
  new Letters("sha"), // 0x15
  new Letters("shaa"), // 0x16
  new Letters("shwe"), // 0x17
  new Letters("shwe"), // 0x18
  new Letters("shwi"), // 0x19
  new Letters("shwi"), // 0x1a
  LO_SHWII, // 0x1b
  LO_SHWII, // 0x1c
  LO_SHWO, // 0x1d
  LO_SHWO, // 0x1e
  LO_SHWOO, // 0x1f
  LO_SHWOO, // 0x20
  LO_SHWA, // 0x21
  LO_SHWA, // 0x22
  LO_SHWAA, // 0x23
  LO_SHWAA, // 0x24
  LO_SH, // 0x25
  LO_YE, // 0x26
  new Letters("yaai"), // 0x27
  LO_YI, // 0x28
  new Letters("yii"), // 0x29
  LO_YO, // 0x2a
  LO_YOO, // 0x2b
  LO_YOO, // 0x2c
  LO_YA, // 0x2d
  new Letters("yaa"), // 0x2e
  LO_YWE, // 0x2f
  LO_YWE, // 0x30
  LO_YWI, // 0x31
  LO_YWI, // 0x32
  LO_YWII, // 0x33
  LO_YWII, // 0x34
  LO_YWO, // 0x35
  LO_YWO, // 0x36
  LO_YWOO, // 0x37
  LO_YWOO, // 0x38
  LO_YWA, // 0x39
  LO_YWA, // 0x3a
  LO_YWAA, // 0x3b
  LO_YWAA, // 0x3c
  LO_YWAA, // 0x3d
  Letter.LO_Y, // 0x3e
  Letter.LO_Y, // 0x3f
  Letter.LO_Y, // 0x40
  LO_YI, // 0x41
  LO_RE, // 0x42
  LO_RE, // 0x43
  LO_LE, // 0x44
  new Letters("raai"), // 0x45
  LO_RI, // 0x46
  new Letters("rii"), // 0x47
  LO_RO, // 0x48
  new Letters("roo"), // 0x49
  LO_LO, // 0x4a
  LO_RA, // 0x4b
  new Letters("raa"), // 0x4c
  LO_LA, // 0x4d
  new Letters("rwaa"), // 0x4e
  new Letters("rwaa"), // 0x4f
  Letter.LO_R, // 0x50
  Letter.LO_R, // 0x51
  Letter.LO_R, // 0x52
  LO_FE, // 0x53
  new Letters("faai"), // 0x54
  LO_FI, // 0x55
  new Letters("fii"), // 0x56
  LO_FO, // 0x57
  new Letters("foo"), // 0x58
  LO_FA, // 0x59
  new Letters("faa"), // 0x5a
  new Letters("fwaa"), // 0x5b
  new Letters("fwaa"), // 0x5c
  Letter.LO_F, // 0x5d
  new Letters("the"), // 0x5e
  new Letters("the"), // 0x5f
  new Letters("thi"), // 0x60
  new Letters("thi"), // 0x61
  new Letters("thii"), // 0x62
  new Letters("thii"), // 0x63
  new Letters("tho"), // 0x64
  new Letters("thoo"), // 0x65
  new Letters("tha"), // 0x66
  new Letters("thaa"), // 0x67
  new Letters("thwaa"), // 0x68
  new Letters("thwaa"), // 0x69
  LO_TH, // 0x6a
  new Letters("tthe"), // 0x6b
  new Letters("tthi"), // 0x6c
  new Letters("ttho"), // 0x6d
  new Letters("ttha"), // 0x6e
  new Letters("tth"), // 0x6f
  new Letters("tye"), // 0x70
  new Letters("tyi"), // 0x71
  new Letters("tyo"), // 0x72
  new Letters("tya"), // 0x73
  LO_HE, // 0x74
  LO_HI, // 0x75
  new Letters("hii"), // 0x76
  LO_HO, // 0x77
  new Letters("hoo"), // 0x78
  LO_HA, // 0x79
  new Letters("haa"), // 0x7a
  Letter.LO_H, // 0x7b
  Letter.LO_H, // 0x7c
  new Letters("hk"), // 0x7d
  new Letters("qaai"), // 0x7e
  new Letters("qi"), // 0x7f
  new Letters("qii"), // 0x80
  new Letters("qo"), // 0x81
  new Letters("qoo"), // 0x82
  new Letters("qa"), // 0x83
  new Letters("qaa"), // 0x84
  Letter.LO_Q, // 0x85
  new Letters("tlhe"), // 0x86
  new Letters("tlhi"), // 0x87
  new Letters("tlho"), // 0x88
  new Letters("tlha"), // 0x89
  LO_RE, // 0x8a
  LO_RI, // 0x8b
  LO_RO, // 0x8c
  LO_RA, // 0x8d
  new Letters("ngaai"), // 0x8e
  new Letters("ngi"), // 0x8f
  new Letters("ngii"), // 0x90
  new Letters("ngo"), // 0x91
  new Letters("ngoo"), // 0x92
  new Letters("nga"), // 0x93
  new Letters("ngaa"), // 0x94
  LO_NG, // 0x95
  new Letters("nng"), // 0x96
  new Letters("she"), // 0x97
  new Letters("shi"), // 0x98
  new Letters("sho"), // 0x99
  new Letters("sha"), // 0x9a
  new Letters("the"), // 0x9b
  new Letters("thi"), // 0x9c
  new Letters("tho"), // 0x9d
  new Letters("tha"), // 0x9e
  LO_TH, // 0x9f
  new Letters("lhi"), // 0xa0
  new Letters("lhii"), // 0xa1
  new Letters("lho"), // 0xa2
  new Letters("lhoo"), // 0xa3
  new Letters("lha"), // 0xa4
  new Letters("lhaa"), // 0xa5
  new Letters("lh"), // 0xa6
  new Letters("the"), // 0xa7
  new Letters("thi"), // 0xa8
  new Letters("thii"), // 0xa9
  new Letters("tho"), // 0xaa
  new Letters("thoo"), // 0xab
  new Letters("tha"), // 0xac
  new Letters("thaa"), // 0xad
  LO_TH, // 0xae
  Letter.LO_B, // 0xaf
  Letter.LO_E, // 0xb0
  Letter.LO_I, // 0xb1
  Letter.LO_O, // 0xb2
  Letter.LO_A, // 0xb3
  LO_WE, // 0xb4
  LO_WI, // 0xb5
  LO_WO, // 0xb6
  LO_WA, // 0xb7
  LO_NE, // 0xb8
  LO_NI, // 0xb9
  LO_NO, // 0xba
  LO_NA, // 0xbb
  LO_KE, // 0xbc
  LO_KI, // 0xbd
  LO_KO, // 0xbe
  LO_KA, // 0xbf
  LO_HE, // 0xc0
  LO_HI, // 0xc1
  LO_HO, // 0xc2
  LO_HA, // 0xc3
  new Letters("ghu"), // 0xc4
  new Letters("gho"), // 0xc5
  new Letters("ghe"), // 0xc6
  new Letters("ghee"), // 0xc7
  new Letters("ghi"), // 0xc8
  new Letters("gha"), // 0xc9
  LO_RU, // 0xca
  LO_RO, // 0xcb
  LO_RE, // 0xcc
  new Letters("ree"), // 0xcd
  LO_RI, // 0xce
  LO_RA, // 0xcf
  new Letters("wu"), // 0xd0
  LO_WO, // 0xd1
  LO_WE, // 0xd2
  new Letters("wee"), // 0xd3
  LO_WI, // 0xd4
  LO_WA, // 0xd5
  new Letters("hwu"), // 0xd6
  new Letters("hwo"), // 0xd7
  new Letters("hwe"), // 0xd8
  new Letters("hwee"), // 0xd9
  new Letters("hwi"), // 0xda
  new Letters("hwa"), // 0xdb
  new Letters("thu"), // 0xdc
  new Letters("tho"), // 0xdd
  new Letters("the"), // 0xde
  new Letters("thee"), // 0xdf
  new Letters("thi"), // 0xe0
  new Letters("tha"), // 0xe1
  new Letters("ttu"), // 0xe2
  new Letters("tto"), // 0xe3
  new Letters("tte"), // 0xe4
  new Letters("ttee"), // 0xe5
  new Letters("tti"), // 0xe6
  new Letters("tta"), // 0xe7
  LO_PU, // 0xe8
  LO_PO, // 0xe9
  LO_PE, // 0xea
  new Letters("pee"), // 0xeb
  LO_PI, // 0xec
  LO_PA, // 0xed
  Letter.LO_P, // 0xee
  LO_GU, // 0xef
  LO_GO, // 0xf0
  LO_GE, // 0xf1
  new Letters("gee"), // 0xf2
  LO_GI, // 0xf3
  LO_GA, // 0xf4
  new Letters("khu"), // 0xf5
  new Letters("kho"), // 0xf6
  new Letters("khe"), // 0xf7
  new Letters("khee"), // 0xf8
  new Letters("khi"), // 0xf9
  new Letters("kha"), // 0xfa
  new Letters("kku"), // 0xfb
  new Letters("kko"), // 0xfc
  new Letters("kke"), // 0xfd
  new Letters("kkee"), // 0xfe
  new Letters("kki") // 0xff
  };
}