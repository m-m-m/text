/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+12xx (Ethiopic).
 */
final class X12 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  LO_HA, // 0x00
  LO_HU, // 0x01
  LO_HI, // 0x02
  new Letters("haa"), // 0x03
  new Letters("hee"), // 0x04
  LO_HE, // 0x05
  LO_HO, // 0x06
  null, // 0x07
  LO_LA, // 0x08
  LO_LU, // 0x09
  LO_LI, // 0x0a
  new Letters("laa"), // 0x0b
  new Letters("lee"), // 0x0c
  LO_LE, // 0x0d
  LO_LO, // 0x0e
  new Letters("lwa"), // 0x0f
  new Letters("hha"), // 0x10
  new Letters("hhu"), // 0x11
  new Letters("hhi"), // 0x12
  new Letters("hhaa"), // 0x13
  new Letters("hhee"), // 0x14
  new Letters("hhe"), // 0x15
  new Letters("hho"), // 0x16
  new Letters("hhwa"), // 0x17
  LO_MA, // 0x18
  LO_MU, // 0x19
  LO_MI, // 0x1a
  new Letters("maa"), // 0x1b
  new Letters("mee"), // 0x1c
  LO_ME, // 0x1d
  LO_MO, // 0x1e
  new Letters("mwa"), // 0x1f
  new Letters("sza"), // 0x20
  new Letters("szu"), // 0x21
  new Letters("szi"), // 0x22
  new Letters("szaa"), // 0x23
  new Letters("szee"), // 0x24
  new Letters("sze"), // 0x25
  new Letters("szo"), // 0x26
  new Letters("szwa"), // 0x27
  LO_RA, // 0x28
  LO_RU, // 0x29
  LO_RI, // 0x2a
  new Letters("raa"), // 0x2b
  new Letters("ree"), // 0x2c
  LO_RE, // 0x2d
  LO_RO, // 0x2e
  new Letters("rwa"), // 0x2f
  LO_SA, // 0x30
  LO_SU, // 0x31
  LO_SI, // 0x32
  new Letters("saa"), // 0x33
  new Letters("see"), // 0x34
  LO_SE, // 0x35
  LO_SO, // 0x36
  new Letters("swa"), // 0x37
  new Letters("sha"), // 0x38
  new Letters("shu"), // 0x39
  new Letters("shi"), // 0x3a
  new Letters("shaa"), // 0x3b
  new Letters("shee"), // 0x3c
  new Letters("she"), // 0x3d
  new Letters("sho"), // 0x3e
  new Letters("shwa"), // 0x3f
  new Letters("qa"), // 0x40
  new Letters("qu"), // 0x41
  new Letters("qi"), // 0x42
  new Letters("qaa"), // 0x43
  new Letters("qee"), // 0x44
  new Letters("qe"), // 0x45
  new Letters("qo"), // 0x46
  null, // 0x47
  new Letters("qwa"), // 0x48
  null, // 0x49
  new Letters("qwi"), // 0x4a
  new Letters("qwaa"), // 0x4b
  new Letters("qwee"), // 0x4c
  new Letters("qwe"), // 0x4d
  null, // 0x4e
  null, // 0x4f
  new Letters("qha"), // 0x50
  new Letters("qhu"), // 0x51
  new Letters("qhi"), // 0x52
  new Letters("qhaa"), // 0x53
  new Letters("qhee"), // 0x54
  new Letters("qhe"), // 0x55
  new Letters("qho"), // 0x56
  null, // 0x57
  new Letters("qhwa"), // 0x58
  null, // 0x59
  new Letters("qhwi"), // 0x5a
  new Letters("qhwaa"), // 0x5b
  new Letters("qhwee"), // 0x5c
  new Letters("qhwe"), // 0x5d
  null, // 0x5e
  null, // 0x5f
  LO_BA, // 0x60
  LO_BU, // 0x61
  LO_BI, // 0x62
  new Letters("baa"), // 0x63
  new Letters("bee"), // 0x64
  LO_BE, // 0x65
  LO_BO, // 0x66
  new Letters("bwa"), // 0x67
  LO_VA, // 0x68
  LO_VU, // 0x69
  LO_VI, // 0x6a
  new Letters("vaa"), // 0x6b
  new Letters("vee"), // 0x6c
  LO_VE, // 0x6d
  LO_VO, // 0x6e
  new Letters("vwa"), // 0x6f
  LO_TA, // 0x70
  LO_TU, // 0x71
  LO_TI, // 0x72
  new Letters("taa"), // 0x73
  new Letters("tee"), // 0x74
  LO_TE, // 0x75
  LO_TO, // 0x76
  new Letters("twa"), // 0x77
  LO_CA, // 0x78
  new Letters("cu"), // 0x79
  new Letters("ci"), // 0x7a
  new Letters("caa"), // 0x7b
  new Letters("cee"), // 0x7c
  LO_CE, // 0x7d
  new Letters("co"), // 0x7e
  new Letters("cwa"), // 0x7f
  new Letters("xa"), // 0x80
  new Letters("xu"), // 0x81
  new Letters("xi"), // 0x82
  new Letters("xaa"), // 0x83
  new Letters("xee"), // 0x84
  new Letters("xe"), // 0x85
  new Letters("xo"), // 0x86
  null, // 0x87
  new Letters("xwa"), // 0x88
  null, // 0x89
  new Letters("xwi"), // 0x8a
  new Letters("xwaa"), // 0x8b
  new Letters("xwee"), // 0x8c
  new Letters("xwe"), // 0x8d
  null, // 0x8e
  null, // 0x8f
  LO_NA, // 0x90
  LO_NU, // 0x91
  LO_NI, // 0x92
  new Letters("naa"), // 0x93
  new Letters("nee"), // 0x94
  LO_NE, // 0x95
  LO_NO, // 0x96
  new Letters("nwa"), // 0x97
  new Letters("nya"), // 0x98
  new Letters("nyu"), // 0x99
  new Letters("nyi"), // 0x9a
  new Letters("nyaa"), // 0x9b
  new Letters("nyee"), // 0x9c
  new Letters("nye"), // 0x9d
  new Letters("nyo"), // 0x9e
  new Letters("nywa"), // 0x9f
  new Chars("\'a"), // 0xa0
  new Chars("\'u"), // 0xa1
  null, // 0xa2
  new Chars("\'aa"), // 0xa3
  new Chars("\'ee"), // 0xa4
  new Chars("\'e"), // 0xa5
  new Chars("\'o"), // 0xa6
  new Chars("\'wa"), // 0xa7
  LO_KA, // 0xa8
  LO_KU, // 0xa9
  LO_KI, // 0xaa
  new Letters("kaa"), // 0xab
  new Letters("kee"), // 0xac
  LO_KE, // 0xad
  LO_KO, // 0xae
  null, // 0xaf
  new Letters("kwa"), // 0xb0
  null, // 0xb1
  new Letters("kwi"), // 0xb2
  new Letters("kwaa"), // 0xb3
  new Letters("kwee"), // 0xb4
  new Letters("kwe"), // 0xb5
  null, // 0xb6
  null, // 0xb7
  new Letters("kxa"), // 0xb8
  new Letters("kxu"), // 0xb9
  new Letters("kxi"), // 0xba
  new Letters("kxaa"), // 0xbb
  new Letters("kxee"), // 0xbc
  new Letters("kxe"), // 0xbd
  new Letters("kxo"), // 0xbe
  null, // 0xbf
  new Letters("kxwa"), // 0xc0
  null, // 0xc1
  new Letters("kxwi"), // 0xc2
  new Letters("kxwaa"), // 0xc3
  new Letters("kxwee"), // 0xc4
  new Letters("kxwe"), // 0xc5
  null, // 0xc6
  null, // 0xc7
  LO_WA, // 0xc8
  new Letters("wu"), // 0xc9
  LO_WI, // 0xca
  new Letters("waa"), // 0xcb
  new Letters("wee"), // 0xcc
  LO_WE, // 0xcd
  LO_WO, // 0xce
  null, // 0xcf
  new Chars("`a"), // 0xd0
  new Chars("`u"), // 0xd1
  new Chars("`i"), // 0xd2
  new Chars("`aa"), // 0xd3
  new Chars("`ee"), // 0xd4
  new Chars("`e"), // 0xd5
  new Chars("`o"), // 0xd6
  null, // 0xd7
  LO_ZA, // 0xd8
  LO_ZU, // 0xd9
  LO_ZI, // 0xda
  new Letters("zaa"), // 0xdb
  new Letters("zee"), // 0xdc
  LO_ZE, // 0xdd
  LO_ZO, // 0xde
  new Letters("zwa"), // 0xdf
  new Letters("zha"), // 0xe0
  new Letters("zhu"), // 0xe1
  new Letters("zhi"), // 0xe2
  new Letters("zhaa"), // 0xe3
  new Letters("zhee"), // 0xe4
  new Letters("zhe"), // 0xe5
  new Letters("zho"), // 0xe6
  new Letters("zhwa"), // 0xe7
  LO_YA, // 0xe8
  LO_YU, // 0xe9
  LO_YI, // 0xea
  new Letters("yaa"), // 0xeb
  new Letters("yee"), // 0xec
  LO_YE, // 0xed
  LO_YO, // 0xee
  null, // 0xef
  LO_DA, // 0xf0
  LO_DU, // 0xf1
  LO_DI, // 0xf2
  new Letters("daa"), // 0xf3
  new Letters("dee"), // 0xf4
  LO_DE, // 0xf5
  LO_DO, // 0xf6
  new Letters("dwa"), // 0xf7
  new Letters("dda"), // 0xf8
  new Letters("ddu"), // 0xf9
  new Letters("ddi"), // 0xfa
  new Letters("ddaa"), // 0xfb
  new Letters("ddee"), // 0xfc
  new Letters("dde"), // 0xfd
  new Letters("ddo"), // 0xfe
  new Letters("ddwa") // 0xff
  };
}
