/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+A4xx (Yi Syllables, Yi Radicals, Lisu).
 */
final class Xa4 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("qiet"), // 0x00
  new Letters("qiex"), // 0x01
  new Letters("qie"), // 0x02
  new Letters("qiep"), // 0x03
  new Letters("quot"), // 0x04
  new Letters("quox"), // 0x05
  new Letters("quo"), // 0x06
  new Letters("quop"), // 0x07
  new Letters("qot"), // 0x08
  new Letters("qox"), // 0x09
  new Letters("qo"), // 0x0a
  new Letters("qop"), // 0x0b
  new Letters("qut"), // 0x0c
  new Letters("qux"), // 0x0d
  new Letters("qu"), // 0x0e
  new Letters("qup"), // 0x0f
  new Letters("qurx"), // 0x10
  new Letters("qur"), // 0x11
  new Letters("qyt"), // 0x12
  new Letters("qyx"), // 0x13
  new Letters("qy"), // 0x14
  new Letters("qyp"), // 0x15
  new Letters("qyrx"), // 0x16
  new Letters("qyr"), // 0x17
  new Letters("jjit"), // 0x18
  new Letters("jjix"), // 0x19
  new Letters("jji"), // 0x1a
  new Letters("jjip"), // 0x1b
  new Letters("jjiet"), // 0x1c
  new Letters("jjiex"), // 0x1d
  new Letters("jjie"), // 0x1e
  new Letters("jjiep"), // 0x1f
  new Letters("jjuox"), // 0x20
  new Letters("jjuo"), // 0x21
  new Letters("jjuop"), // 0x22
  new Letters("jjot"), // 0x23
  new Letters("jjox"), // 0x24
  new Letters("jjo"), // 0x25
  new Letters("jjop"), // 0x26
  new Letters("jjut"), // 0x27
  new Letters("jjux"), // 0x28
  new Letters("jju"), // 0x29
  new Letters("jjup"), // 0x2a
  new Letters("jjurx"), // 0x2b
  new Letters("jjur"), // 0x2c
  new Letters("jjyt"), // 0x2d
  new Letters("jjyx"), // 0x2e
  new Letters("jjy"), // 0x2f
  new Letters("jjyp"), // 0x30
  new Letters("njit"), // 0x31
  new Letters("njix"), // 0x32
  new Letters("nji"), // 0x33
  new Letters("njip"), // 0x34
  new Letters("njiet"), // 0x35
  new Letters("njiex"), // 0x36
  new Letters("njie"), // 0x37
  new Letters("njiep"), // 0x38
  new Letters("njuox"), // 0x39
  new Letters("njuo"), // 0x3a
  new Letters("njot"), // 0x3b
  new Letters("njox"), // 0x3c
  new Letters("njo"), // 0x3d
  new Letters("njop"), // 0x3e
  new Letters("njux"), // 0x3f
  new Letters("nju"), // 0x40
  new Letters("njup"), // 0x41
  new Letters("njurx"), // 0x42
  new Letters("njur"), // 0x43
  new Letters("njyt"), // 0x44
  new Letters("njyx"), // 0x45
  new Letters("njy"), // 0x46
  new Letters("njyp"), // 0x47
  new Letters("njyrx"), // 0x48
  new Letters("njyr"), // 0x49
  new Letters("nyit"), // 0x4a
  new Letters("nyix"), // 0x4b
  new Letters("nyi"), // 0x4c
  new Letters("nyip"), // 0x4d
  new Letters("nyiet"), // 0x4e
  new Letters("nyiex"), // 0x4f
  new Letters("nyie"), // 0x50
  new Letters("nyiep"), // 0x51
  new Letters("nyuox"), // 0x52
  new Letters("nyuo"), // 0x53
  new Letters("nyuop"), // 0x54
  new Letters("nyot"), // 0x55
  new Letters("nyox"), // 0x56
  new Letters("nyo"), // 0x57
  new Letters("nyop"), // 0x58
  new Letters("nyut"), // 0x59
  new Letters("nyux"), // 0x5a
  new Letters("nyu"), // 0x5b
  new Letters("nyup"), // 0x5c
  new Letters("xit"), // 0x5d
  new Letters("xix"), // 0x5e
  new Letters("xi"), // 0x5f
  new Letters("xip"), // 0x60
  new Letters("xiet"), // 0x61
  new Letters("xiex"), // 0x62
  new Letters("xie"), // 0x63
  new Letters("xiep"), // 0x64
  new Letters("xuox"), // 0x65
  new Letters("xuo"), // 0x66
  new Letters("xot"), // 0x67
  new Letters("xox"), // 0x68
  new Letters("xo"), // 0x69
  new Letters("xop"), // 0x6a
  new Letters("xyt"), // 0x6b
  new Letters("xyx"), // 0x6c
  new Letters("xy"), // 0x6d
  new Letters("xyp"), // 0x6e
  new Letters("xyrx"), // 0x6f
  new Letters("xyr"), // 0x70
  new Letters("yit"), // 0x71
  new Letters("yix"), // 0x72
  LO_YI, // 0x73
  new Letters("yip"), // 0x74
  new Letters("yiet"), // 0x75
  new Letters("yiex"), // 0x76
  new Letters("yie"), // 0x77
  new Letters("yiep"), // 0x78
  new Letters("yuot"), // 0x79
  new Letters("yuox"), // 0x7a
  new Letters("yuo"), // 0x7b
  new Letters("yuop"), // 0x7c
  new Letters("yot"), // 0x7d
  new Letters("yox"), // 0x7e
  LO_YO, // 0x7f
  new Letters("yop"), // 0x80
  new Letters("yut"), // 0x81
  new Letters("yux"), // 0x82
  LO_YU, // 0x83
  new Letters("yup"), // 0x84
  new Letters("yurx"), // 0x85
  new Letters("yur"), // 0x86
  new Letters("yyt"), // 0x87
  new Letters("yyx"), // 0x88
  LO_YY, // 0x89
  new Letters("yyp"), // 0x8a
  new Letters("yyrx"), // 0x8b
  new Letters("yyr"), // 0x8c
  null, // 0x8d
  null, // 0x8e
  null, // 0x8f
  new Letters("Qot"), // 0x90
  new Letters("Li"), // 0x91
  new Letters("Kit"), // 0x92
  new Letters("Nyip"), // 0x93
  new Letters("Cyp"), // 0x94
  new Letters("Ssi"), // 0x95
  new Letters("Ggop"), // 0x96
  new Letters("Gep"), // 0x97
  new Letters("Mi"), // 0x98
  new Letters("Hxit"), // 0x99
  new Letters("Lyr"), // 0x9a
  new Letters("Bbut"), // 0x9b
  new Letters("Mop"), // 0x9c
  new Letters("Yo"), // 0x9d
  new Letters("Put"), // 0x9e
  new Letters("Hxuo"), // 0x9f
  new Letters("Tat"), // 0xa0
  new Letters("Ga"), // 0xa1
  null, // 0xa2
  null, // 0xa3
  new Letters("Ddur"), // 0xa4
  new Letters("Bur"), // 0xa5
  new Letters("Gguo"), // 0xa6
  new Letters("Nyop"), // 0xa7
  new Letters("Tu"), // 0xa8
  new Letters("Op"), // 0xa9
  new Letters("Jjut"), // 0xaa
  new Letters("Zot"), // 0xab
  new Letters("Pyt"), // 0xac
  new Letters("Hmo"), // 0xad
  new Letters("Yit"), // 0xae
  new Letters("Vur"), // 0xaf
  new Letters("Shy"), // 0xb0
  new Letters("Vep"), // 0xb1
  new Letters("Za"), // 0xb2
  new Letters("Jo"), // 0xb3
  null, // 0xb4
  new Letters("Jjy"), // 0xb5
  new Letters("Got"), // 0xb6
  new Letters("Jjie"), // 0xb7
  new Letters("Wo"), // 0xb8
  new Letters("Du"), // 0xb9
  new Letters("Shur"), // 0xba
  new Letters("Lie"), // 0xbb
  new Letters("Cy"), // 0xbc
  new Letters("Cuop"), // 0xbd
  new Letters("Cip"), // 0xbe
  new Letters("Hxop"), // 0xbf
  new Letters("Shat"), // 0xc0
  null, // 0xc1
  new Letters("Shop"), // 0xc2
  new Letters("Che"), // 0xc3
  new Letters("Zziet"), // 0xc4
  null, // 0xc5
  new Letters("Ke"), // 0xc6
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