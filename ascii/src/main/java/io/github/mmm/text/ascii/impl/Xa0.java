/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+A0xx (Yi Syllables).
 */
final class Xa0 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("it"), // 0x00
  new Letters("ix"), // 0x01
  Letter.LO_I, // 0x02
  new Letters("ip"), // 0x03
  new Letters("iet"), // 0x04
  new Letters("iex"), // 0x05
  LO_IE, // 0x06
  new Letters("iep"), // 0x07
  LO_AT, // 0x08
  new Letters("ax"), // 0x09
  Letter.LO_A, // 0x0a
  new Letters("ap"), // 0x0b
  new Letters("uox"), // 0x0c
  new Letters("uo"), // 0x0d
  new Letters("uop"), // 0x0e
  LO_OT, // 0x0f
  new Letters("ox"), // 0x10
  Letter.LO_O, // 0x11
  new Letters("op"), // 0x12
  new Letters("ex"), // 0x13
  Letter.LO_E, // 0x14
  new Letters("wu"), // 0x15
  new Letters("bit"), // 0x16
  new Letters("bix"), // 0x17
  LO_BI, // 0x18
  new Letters("bip"), // 0x19
  new Letters("biet"), // 0x1a
  new Letters("biex"), // 0x1b
  new Letters("bie"), // 0x1c
  new Letters("biep"), // 0x1d
  new Letters("bat"), // 0x1e
  new Letters("bax"), // 0x1f
  LO_BA, // 0x20
  new Letters("bap"), // 0x21
  new Letters("buox"), // 0x22
  new Letters("buo"), // 0x23
  new Letters("buop"), // 0x24
  new Letters("bot"), // 0x25
  new Letters("box"), // 0x26
  LO_BO, // 0x27
  new Letters("bop"), // 0x28
  new Letters("bex"), // 0x29
  LO_BE, // 0x2a
  new Letters("bep"), // 0x2b
  new Letters("but"), // 0x2c
  new Letters("bux"), // 0x2d
  LO_BU, // 0x2e
  new Letters("bup"), // 0x2f
  new Letters("burx"), // 0x30
  new Letters("bur"), // 0x31
  new Letters("byt"), // 0x32
  new Letters("byx"), // 0x33
  new Letters("by"), // 0x34
  new Letters("byp"), // 0x35
  new Letters("byrx"), // 0x36
  new Letters("byr"), // 0x37
  new Letters("pit"), // 0x38
  new Letters("pix"), // 0x39
  LO_PI, // 0x3a
  new Letters("pip"), // 0x3b
  new Letters("piex"), // 0x3c
  new Letters("pie"), // 0x3d
  new Letters("piep"), // 0x3e
  new Letters("pat"), // 0x3f
  new Letters("pax"), // 0x40
  LO_PA, // 0x41
  new Letters("pap"), // 0x42
  new Letters("puox"), // 0x43
  new Letters("puo"), // 0x44
  new Letters("puop"), // 0x45
  new Letters("pot"), // 0x46
  new Letters("pox"), // 0x47
  LO_PO, // 0x48
  new Letters("pop"), // 0x49
  new Letters("put"), // 0x4a
  new Letters("pux"), // 0x4b
  LO_PU, // 0x4c
  new Letters("pup"), // 0x4d
  new Letters("purx"), // 0x4e
  new Letters("pur"), // 0x4f
  new Letters("pyt"), // 0x50
  new Letters("pyx"), // 0x51
  new Letters("py"), // 0x52
  new Letters("pyp"), // 0x53
  new Letters("pyrx"), // 0x54
  new Letters("pyr"), // 0x55
  new Letters("bbit"), // 0x56
  new Letters("bbix"), // 0x57
  new Letters("bbi"), // 0x58
  new Letters("bbip"), // 0x59
  new Letters("bbiet"), // 0x5a
  new Letters("bbiex"), // 0x5b
  new Letters("bbie"), // 0x5c
  new Letters("bbiep"), // 0x5d
  new Letters("bbat"), // 0x5e
  new Letters("bbax"), // 0x5f
  new Letters("bba"), // 0x60
  new Letters("bbap"), // 0x61
  new Letters("bbuox"), // 0x62
  new Letters("bbuo"), // 0x63
  new Letters("bbuop"), // 0x64
  new Letters("bbot"), // 0x65
  new Letters("bbox"), // 0x66
  new Letters("bbo"), // 0x67
  new Letters("bbop"), // 0x68
  new Letters("bbex"), // 0x69
  new Letters("bbe"), // 0x6a
  new Letters("bbep"), // 0x6b
  new Letters("bbut"), // 0x6c
  new Letters("bbux"), // 0x6d
  new Letters("bbu"), // 0x6e
  new Letters("bbup"), // 0x6f
  new Letters("bburx"), // 0x70
  new Letters("bbur"), // 0x71
  new Letters("bbyt"), // 0x72
  new Letters("bbyx"), // 0x73
  new Letters("bby"), // 0x74
  new Letters("bbyp"), // 0x75
  new Letters("nbit"), // 0x76
  new Letters("nbix"), // 0x77
  new Letters("nbi"), // 0x78
  new Letters("nbip"), // 0x79
  new Letters("nbiex"), // 0x7a
  new Letters("nbie"), // 0x7b
  new Letters("nbiep"), // 0x7c
  new Letters("nbat"), // 0x7d
  new Letters("nbax"), // 0x7e
  new Letters("nba"), // 0x7f
  new Letters("nbap"), // 0x80
  new Letters("nbot"), // 0x81
  new Letters("nbox"), // 0x82
  new Letters("nbo"), // 0x83
  new Letters("nbop"), // 0x84
  new Letters("nbut"), // 0x85
  new Letters("nbux"), // 0x86
  new Letters("nbu"), // 0x87
  new Letters("nbup"), // 0x88
  new Letters("nburx"), // 0x89
  new Letters("nbur"), // 0x8a
  new Letters("nbyt"), // 0x8b
  new Letters("nbyx"), // 0x8c
  new Letters("nby"), // 0x8d
  new Letters("nbyp"), // 0x8e
  new Letters("nbyrx"), // 0x8f
  new Letters("nbyr"), // 0x90
  new Letters("hmit"), // 0x91
  new Letters("hmix"), // 0x92
  new Letters("hmi"), // 0x93
  new Letters("hmip"), // 0x94
  new Letters("hmiex"), // 0x95
  new Letters("hmie"), // 0x96
  new Letters("hmiep"), // 0x97
  new Letters("hmat"), // 0x98
  new Letters("hmax"), // 0x99
  new Letters("hma"), // 0x9a
  new Letters("hmap"), // 0x9b
  new Letters("hmuox"), // 0x9c
  new Letters("hmuo"), // 0x9d
  new Letters("hmuop"), // 0x9e
  new Letters("hmot"), // 0x9f
  new Letters("hmox"), // 0xa0
  new Letters("hmo"), // 0xa1
  new Letters("hmop"), // 0xa2
  new Letters("hmut"), // 0xa3
  new Letters("hmux"), // 0xa4
  new Letters("hmu"), // 0xa5
  new Letters("hmup"), // 0xa6
  new Letters("hmurx"), // 0xa7
  new Letters("hmur"), // 0xa8
  new Letters("hmyx"), // 0xa9
  new Letters("hmy"), // 0xaa
  new Letters("hmyp"), // 0xab
  new Letters("hmyrx"), // 0xac
  new Letters("hmyr"), // 0xad
  new Letters("mit"), // 0xae
  new Letters("mix"), // 0xaf
  LO_MI, // 0xb0
  new Letters("mip"), // 0xb1
  new Letters("miex"), // 0xb2
  new Letters("mie"), // 0xb3
  new Letters("miep"), // 0xb4
  new Letters("mat"), // 0xb5
  new Letters("max"), // 0xb6
  LO_MA, // 0xb7
  new Letters("map"), // 0xb8
  new Letters("muot"), // 0xb9
  new Letters("muox"), // 0xba
  new Letters("muo"), // 0xbb
  new Letters("muop"), // 0xbc
  new Letters("mot"), // 0xbd
  new Letters("mox"), // 0xbe
  LO_MO, // 0xbf
  new Letters("mop"), // 0xc0
  new Letters("mex"), // 0xc1
  LO_ME, // 0xc2
  new Letters("mut"), // 0xc3
  new Letters("mux"), // 0xc4
  LO_MU, // 0xc5
  new Letters("mup"), // 0xc6
  new Letters("murx"), // 0xc7
  new Letters("mur"), // 0xc8
  new Letters("myt"), // 0xc9
  new Letters("myx"), // 0xca
  new Letters("my"), // 0xcb
  new Letters("myp"), // 0xcc
  new Letters("fit"), // 0xcd
  new Letters("fix"), // 0xce
  LO_FI, // 0xcf
  new Letters("fip"), // 0xd0
  new Letters("fat"), // 0xd1
  new Letters("fax"), // 0xd2
  LO_FA, // 0xd3
  new Letters("fap"), // 0xd4
  new Letters("fox"), // 0xd5
  LO_FO, // 0xd6
  new Letters("fop"), // 0xd7
  new Letters("fut"), // 0xd8
  new Letters("fux"), // 0xd9
  LO_FU, // 0xda
  new Letters("fup"), // 0xdb
  new Letters("furx"), // 0xdc
  new Letters("fur"), // 0xdd
  new Letters("fyt"), // 0xde
  new Letters("fyx"), // 0xdf
  new Letters("fy"), // 0xe0
  new Letters("fyp"), // 0xe1
  new Letters("vit"), // 0xe2
  new Letters("vix"), // 0xe3
  LO_VI, // 0xe4
  new Letters("vip"), // 0xe5
  new Letters("viet"), // 0xe6
  new Letters("viex"), // 0xe7
  new Letters("vie"), // 0xe8
  new Letters("viep"), // 0xe9
  new Letters("vat"), // 0xea
  new Letters("vax"), // 0xeb
  LO_VA, // 0xec
  new Letters("vap"), // 0xed
  new Letters("vot"), // 0xee
  new Letters("vox"), // 0xef
  LO_VO, // 0xf0
  new Letters("vop"), // 0xf1
  new Letters("vex"), // 0xf2
  new Letters("vep"), // 0xf3
  new Letters("vut"), // 0xf4
  new Letters("vux"), // 0xf5
  LO_VU, // 0xf6
  new Letters("vup"), // 0xf7
  new Letters("vurx"), // 0xf8
  new Letters("vur"), // 0xf9
  new Letters("vyt"), // 0xfa
  new Letters("vyx"), // 0xfb
  new Letters("vy"), // 0xfc
  new Letters("vyp"), // 0xfd
  new Letters("vyrx"), // 0xfe
  new Letters("vyr") // 0xff
  };
}