/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+A1xx (Yi Syllables).
 */
final class Xa1 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("dit"), // 0x00
  new Letters("dix"), // 0x01
  LO_DI, // 0x02
  new Letters("dip"), // 0x03
  new Letters("diex"), // 0x04
  new Letters("die"), // 0x05
  new Letters("diep"), // 0x06
  new Letters("dat"), // 0x07
  new Letters("dax"), // 0x08
  LO_DA, // 0x09
  new Letters("dap"), // 0x0a
  new Letters("duox"), // 0x0b
  new Letters("duo"), // 0x0c
  new Letters("dot"), // 0x0d
  new Letters("dox"), // 0x0e
  LO_DO, // 0x0f
  new Letters("dop"), // 0x10
  new Letters("dex"), // 0x11
  LO_DE, // 0x12
  new Letters("dep"), // 0x13
  new Letters("dut"), // 0x14
  new Letters("dux"), // 0x15
  LO_DU, // 0x16
  new Letters("dup"), // 0x17
  new Letters("durx"), // 0x18
  new Letters("dur"), // 0x19
  new Letters("tit"), // 0x1a
  new Letters("tix"), // 0x1b
  LO_TI, // 0x1c
  new Letters("tip"), // 0x1d
  new Letters("tiex"), // 0x1e
  new Letters("tie"), // 0x1f
  new Letters("tiep"), // 0x20
  new Letters("tat"), // 0x21
  new Letters("tax"), // 0x22
  LO_TA, // 0x23
  new Letters("tap"), // 0x24
  new Letters("tuot"), // 0x25
  new Letters("tuox"), // 0x26
  new Letters("tuo"), // 0x27
  new Letters("tuop"), // 0x28
  new Letters("tot"), // 0x29
  new Letters("tox"), // 0x2a
  LO_TO, // 0x2b
  new Letters("top"), // 0x2c
  new Letters("tex"), // 0x2d
  LO_TE, // 0x2e
  new Letters("tep"), // 0x2f
  new Letters("tut"), // 0x30
  new Letters("tux"), // 0x31
  LO_TU, // 0x32
  new Letters("tup"), // 0x33
  new Letters("turx"), // 0x34
  new Letters("tur"), // 0x35
  new Letters("ddit"), // 0x36
  new Letters("ddix"), // 0x37
  new Letters("ddi"), // 0x38
  new Letters("ddip"), // 0x39
  new Letters("ddiex"), // 0x3a
  new Letters("ddie"), // 0x3b
  new Letters("ddiep"), // 0x3c
  new Letters("ddat"), // 0x3d
  new Letters("ddax"), // 0x3e
  new Letters("dda"), // 0x3f
  new Letters("ddap"), // 0x40
  new Letters("dduox"), // 0x41
  new Letters("dduo"), // 0x42
  new Letters("dduop"), // 0x43
  new Letters("ddot"), // 0x44
  new Letters("ddox"), // 0x45
  new Letters("ddo"), // 0x46
  new Letters("ddop"), // 0x47
  new Letters("ddex"), // 0x48
  new Letters("dde"), // 0x49
  new Letters("ddep"), // 0x4a
  new Letters("ddut"), // 0x4b
  new Letters("ddux"), // 0x4c
  new Letters("ddu"), // 0x4d
  new Letters("ddup"), // 0x4e
  new Letters("ddurx"), // 0x4f
  new Letters("ddur"), // 0x50
  new Letters("ndit"), // 0x51
  new Letters("ndix"), // 0x52
  new Letters("ndi"), // 0x53
  new Letters("ndip"), // 0x54
  new Letters("ndiex"), // 0x55
  new Letters("ndie"), // 0x56
  new Letters("ndat"), // 0x57
  new Letters("ndax"), // 0x58
  new Letters("nda"), // 0x59
  new Letters("ndap"), // 0x5a
  new Letters("ndot"), // 0x5b
  new Letters("ndox"), // 0x5c
  new Letters("ndo"), // 0x5d
  new Letters("ndop"), // 0x5e
  new Letters("ndex"), // 0x5f
  new Letters("nde"), // 0x60
  new Letters("ndep"), // 0x61
  new Letters("ndut"), // 0x62
  new Letters("ndux"), // 0x63
  new Letters("ndu"), // 0x64
  new Letters("ndup"), // 0x65
  new Letters("ndurx"), // 0x66
  new Letters("ndur"), // 0x67
  new Letters("hnit"), // 0x68
  new Letters("hnix"), // 0x69
  new Letters("hni"), // 0x6a
  new Letters("hnip"), // 0x6b
  new Letters("hniet"), // 0x6c
  new Letters("hniex"), // 0x6d
  new Letters("hnie"), // 0x6e
  new Letters("hniep"), // 0x6f
  new Letters("hnat"), // 0x70
  new Letters("hnax"), // 0x71
  new Letters("hna"), // 0x72
  new Letters("hnap"), // 0x73
  new Letters("hnuox"), // 0x74
  new Letters("hnuo"), // 0x75
  new Letters("hnot"), // 0x76
  new Letters("hnox"), // 0x77
  new Letters("hnop"), // 0x78
  new Letters("hnex"), // 0x79
  new Letters("hne"), // 0x7a
  new Letters("hnep"), // 0x7b
  new Letters("hnut"), // 0x7c
  new Letters("nit"), // 0x7d
  new Letters("nix"), // 0x7e
  LO_NI, // 0x7f
  new Letters("nip"), // 0x80
  new Letters("niex"), // 0x81
  new Letters("nie"), // 0x82
  new Letters("niep"), // 0x83
  new Letters("nax"), // 0x84
  LO_NA, // 0x85
  new Letters("nap"), // 0x86
  new Letters("nuox"), // 0x87
  new Letters("nuo"), // 0x88
  new Letters("nuop"), // 0x89
  new Letters("not"), // 0x8a
  new Letters("nox"), // 0x8b
  LO_NO, // 0x8c
  new Letters("nop"), // 0x8d
  new Letters("nex"), // 0x8e
  LO_NE, // 0x8f
  new Letters("nep"), // 0x90
  new Letters("nut"), // 0x91
  new Letters("nux"), // 0x92
  LO_NU, // 0x93
  new Letters("nup"), // 0x94
  new Letters("nurx"), // 0x95
  new Letters("nur"), // 0x96
  new Letters("hlit"), // 0x97
  new Letters("hlix"), // 0x98
  new Letters("hli"), // 0x99
  new Letters("hlip"), // 0x9a
  new Letters("hliex"), // 0x9b
  new Letters("hlie"), // 0x9c
  new Letters("hliep"), // 0x9d
  new Letters("hlat"), // 0x9e
  new Letters("hlax"), // 0x9f
  new Letters("hla"), // 0xa0
  new Letters("hlap"), // 0xa1
  new Letters("hluox"), // 0xa2
  new Letters("hluo"), // 0xa3
  new Letters("hluop"), // 0xa4
  new Letters("hlox"), // 0xa5
  new Letters("hlo"), // 0xa6
  new Letters("hlop"), // 0xa7
  new Letters("hlex"), // 0xa8
  new Letters("hle"), // 0xa9
  new Letters("hlep"), // 0xaa
  new Letters("hlut"), // 0xab
  new Letters("hlux"), // 0xac
  new Letters("hlu"), // 0xad
  new Letters("hlup"), // 0xae
  new Letters("hlurx"), // 0xaf
  new Letters("hlur"), // 0xb0
  new Letters("hlyt"), // 0xb1
  new Letters("hlyx"), // 0xb2
  new Letters("hly"), // 0xb3
  new Letters("hlyp"), // 0xb4
  new Letters("hlyrx"), // 0xb5
  new Letters("hlyr"), // 0xb6
  new Letters("lit"), // 0xb7
  new Letters("lix"), // 0xb8
  LO_LI, // 0xb9
  new Letters("lip"), // 0xba
  new Letters("liet"), // 0xbb
  new Letters("liex"), // 0xbc
  new Letters("lie"), // 0xbd
  new Letters("liep"), // 0xbe
  new Letters("lat"), // 0xbf
  new Letters("lax"), // 0xc0
  LO_LA, // 0xc1
  new Letters("lap"), // 0xc2
  new Letters("luot"), // 0xc3
  new Letters("luox"), // 0xc4
  new Letters("luo"), // 0xc5
  new Letters("luop"), // 0xc6
  new Letters("lot"), // 0xc7
  new Letters("lox"), // 0xc8
  LO_LO, // 0xc9
  new Letters("lop"), // 0xca
  new Letters("lex"), // 0xcb
  LO_LE, // 0xcc
  new Letters("lep"), // 0xcd
  new Letters("lut"), // 0xce
  new Letters("lux"), // 0xcf
  LO_LU, // 0xd0
  new Letters("lup"), // 0xd1
  new Letters("lurx"), // 0xd2
  new Letters("lur"), // 0xd3
  new Letters("lyt"), // 0xd4
  new Letters("lyx"), // 0xd5
  new Letters("ly"), // 0xd6
  new Letters("lyp"), // 0xd7
  new Letters("lyrx"), // 0xd8
  new Letters("lyr"), // 0xd9
  new Letters("git"), // 0xda
  new Letters("gix"), // 0xdb
  LO_GI, // 0xdc
  new Letters("gip"), // 0xdd
  new Letters("giet"), // 0xde
  new Letters("giex"), // 0xdf
  new Letters("gie"), // 0xe0
  new Letters("giep"), // 0xe1
  new Letters("gat"), // 0xe2
  new Letters("gax"), // 0xe3
  LO_GA, // 0xe4
  new Letters("gap"), // 0xe5
  new Letters("guot"), // 0xe6
  new Letters("guox"), // 0xe7
  new Letters("guo"), // 0xe8
  new Letters("guop"), // 0xe9
  new Letters("got"), // 0xea
  new Letters("gox"), // 0xeb
  LO_GO, // 0xec
  new Letters("gop"), // 0xed
  new Letters("get"), // 0xee
  new Letters("gex"), // 0xef
  LO_GE, // 0xf0
  new Letters("gep"), // 0xf1
  new Letters("gut"), // 0xf2
  new Letters("gux"), // 0xf3
  LO_GU, // 0xf4
  new Letters("gup"), // 0xf5
  new Letters("gurx"), // 0xf6
  new Letters("gur"), // 0xf7
  new Letters("kit"), // 0xf8
  new Letters("kix"), // 0xf9
  LO_KI, // 0xfa
  new Letters("kip"), // 0xfb
  new Letters("kiex"), // 0xfc
  new Letters("kie"), // 0xfd
  new Letters("kiep"), // 0xfe
  new Letters("kat") // 0xff
  };
}