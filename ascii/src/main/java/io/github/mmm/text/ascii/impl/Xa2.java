/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+A2xx.
 */
final class Xa2 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("kax"), // 0x00
  LO_KA, // 0x01
  new Letters("kap"), // 0x02
  new Letters("kuox"), // 0x03
  new Letters("kuo"), // 0x04
  new Letters("kuop"), // 0x05
  new Letters("kot"), // 0x06
  new Letters("kox"), // 0x07
  LO_KO, // 0x08
  new Letters("kop"), // 0x09
  new Letters("ket"), // 0x0a
  new Letters("kex"), // 0x0b
  LO_KE, // 0x0c
  new Letters("kep"), // 0x0d
  new Letters("kut"), // 0x0e
  new Letters("kux"), // 0x0f
  LO_KU, // 0x10
  new Letters("kup"), // 0x11
  new Letters("kurx"), // 0x12
  new Letters("kur"), // 0x13
  new Letters("ggit"), // 0x14
  new Letters("ggix"), // 0x15
  new Letters("ggi"), // 0x16
  new Letters("ggiex"), // 0x17
  new Letters("ggie"), // 0x18
  new Letters("ggiep"), // 0x19
  new Letters("ggat"), // 0x1a
  new Letters("ggax"), // 0x1b
  new Letters("gga"), // 0x1c
  new Letters("ggap"), // 0x1d
  new Letters("gguot"), // 0x1e
  new Letters("gguox"), // 0x1f
  new Letters("gguo"), // 0x20
  new Letters("gguop"), // 0x21
  new Letters("ggot"), // 0x22
  new Letters("ggox"), // 0x23
  new Letters("ggo"), // 0x24
  new Letters("ggop"), // 0x25
  new Letters("gget"), // 0x26
  new Letters("ggex"), // 0x27
  new Letters("gge"), // 0x28
  new Letters("ggep"), // 0x29
  new Letters("ggut"), // 0x2a
  new Letters("ggux"), // 0x2b
  new Letters("ggu"), // 0x2c
  new Letters("ggup"), // 0x2d
  new Letters("ggurx"), // 0x2e
  new Letters("ggur"), // 0x2f
  new Letters("mgiex"), // 0x30
  new Letters("mgie"), // 0x31
  new Letters("mgat"), // 0x32
  new Letters("mgax"), // 0x33
  new Letters("mga"), // 0x34
  new Letters("mgap"), // 0x35
  new Letters("mguox"), // 0x36
  new Letters("mguo"), // 0x37
  new Letters("mguop"), // 0x38
  new Letters("mgot"), // 0x39
  new Letters("mgox"), // 0x3a
  new Letters("mgo"), // 0x3b
  new Letters("mgop"), // 0x3c
  new Letters("mgex"), // 0x3d
  new Letters("mge"), // 0x3e
  new Letters("mgep"), // 0x3f
  new Letters("mgut"), // 0x40
  new Letters("mgux"), // 0x41
  new Letters("mgu"), // 0x42
  new Letters("mgup"), // 0x43
  new Letters("mgurx"), // 0x44
  new Letters("mgur"), // 0x45
  new Letters("hxit"), // 0x46
  new Letters("hxix"), // 0x47
  new Letters("hxi"), // 0x48
  new Letters("hxip"), // 0x49
  new Letters("hxiet"), // 0x4a
  new Letters("hxiex"), // 0x4b
  new Letters("hxie"), // 0x4c
  new Letters("hxiep"), // 0x4d
  new Letters("hxat"), // 0x4e
  new Letters("hxax"), // 0x4f
  new Letters("hxa"), // 0x50
  new Letters("hxap"), // 0x51
  new Letters("hxuot"), // 0x52
  new Letters("hxuox"), // 0x53
  new Letters("hxuo"), // 0x54
  new Letters("hxuop"), // 0x55
  new Letters("hxot"), // 0x56
  new Letters("hxox"), // 0x57
  new Letters("hxo"), // 0x58
  new Letters("hxop"), // 0x59
  new Letters("hxex"), // 0x5a
  new Letters("hxe"), // 0x5b
  new Letters("hxep"), // 0x5c
  new Letters("ngiex"), // 0x5d
  new Letters("ngie"), // 0x5e
  new Letters("ngiep"), // 0x5f
  new Letters("ngat"), // 0x60
  new Letters("ngax"), // 0x61
  new Letters("nga"), // 0x62
  new Letters("ngap"), // 0x63
  new Letters("nguot"), // 0x64
  new Letters("nguox"), // 0x65
  new Letters("nguo"), // 0x66
  new Letters("ngot"), // 0x67
  new Letters("ngox"), // 0x68
  new Letters("ngo"), // 0x69
  new Letters("ngop"), // 0x6a
  new Letters("ngex"), // 0x6b
  new Letters("nge"), // 0x6c
  new Letters("ngep"), // 0x6d
  new Letters("hit"), // 0x6e
  new Letters("hiex"), // 0x6f
  new Letters("hie"), // 0x70
  new Letters("hat"), // 0x71
  new Letters("hax"), // 0x72
  LO_HA, // 0x73
  new Letters("hap"), // 0x74
  new Letters("huot"), // 0x75
  new Letters("huox"), // 0x76
  new Letters("huo"), // 0x77
  new Letters("huop"), // 0x78
  new Letters("hot"), // 0x79
  new Letters("hox"), // 0x7a
  LO_HO, // 0x7b
  new Letters("hop"), // 0x7c
  new Letters("hex"), // 0x7d
  LO_HE, // 0x7e
  new Letters("hep"), // 0x7f
  new Letters("wat"), // 0x80
  new Letters("wax"), // 0x81
  LO_WA, // 0x82
  new Letters("wap"), // 0x83
  new Letters("wuox"), // 0x84
  new Letters("wuo"), // 0x85
  new Letters("wuop"), // 0x86
  new Letters("wox"), // 0x87
  LO_WO, // 0x88
  new Letters("wop"), // 0x89
  new Letters("wex"), // 0x8a
  LO_WE, // 0x8b
  new Letters("wep"), // 0x8c
  new Letters("zit"), // 0x8d
  new Letters("zix"), // 0x8e
  LO_ZI, // 0x8f
  new Letters("zip"), // 0x90
  new Letters("ziex"), // 0x91
  new Letters("zie"), // 0x92
  new Letters("ziep"), // 0x93
  new Letters("zat"), // 0x94
  new Letters("zax"), // 0x95
  LO_ZA, // 0x96
  new Letters("zap"), // 0x97
  new Letters("zuox"), // 0x98
  new Letters("zuo"), // 0x99
  new Letters("zuop"), // 0x9a
  new Letters("zot"), // 0x9b
  new Letters("zox"), // 0x9c
  LO_ZO, // 0x9d
  new Letters("zop"), // 0x9e
  new Letters("zex"), // 0x9f
  LO_ZE, // 0xa0
  new Letters("zep"), // 0xa1
  new Letters("zut"), // 0xa2
  new Letters("zux"), // 0xa3
  LO_ZU, // 0xa4
  new Letters("zup"), // 0xa5
  new Letters("zurx"), // 0xa6
  new Letters("zur"), // 0xa7
  new Letters("zyt"), // 0xa8
  new Letters("zyx"), // 0xa9
  new Letters("zy"), // 0xaa
  new Letters("zyp"), // 0xab
  new Letters("zyrx"), // 0xac
  new Letters("zyr"), // 0xad
  new Letters("cit"), // 0xae
  new Letters("cix"), // 0xaf
  new Letters("ci"), // 0xb0
  new Letters("cip"), // 0xb1
  new Letters("ciet"), // 0xb2
  new Letters("ciex"), // 0xb3
  new Letters("cie"), // 0xb4
  new Letters("ciep"), // 0xb5
  new Letters("cat"), // 0xb6
  new Letters("cax"), // 0xb7
  LO_CA, // 0xb8
  new Letters("cap"), // 0xb9
  new Letters("cuox"), // 0xba
  new Letters("cuo"), // 0xbb
  new Letters("cuop"), // 0xbc
  new Letters("cot"), // 0xbd
  new Letters("cox"), // 0xbe
  new Letters("co"), // 0xbf
  new Letters("cop"), // 0xc0
  new Letters("cex"), // 0xc1
  LO_CE, // 0xc2
  new Letters("cep"), // 0xc3
  new Letters("cut"), // 0xc4
  new Letters("cux"), // 0xc5
  new Letters("cu"), // 0xc6
  new Letters("cup"), // 0xc7
  new Letters("curx"), // 0xc8
  new Letters("cur"), // 0xc9
  new Letters("cyt"), // 0xca
  new Letters("cyx"), // 0xcb
  new Letters("cy"), // 0xcc
  new Letters("cyp"), // 0xcd
  new Letters("cyrx"), // 0xce
  new Letters("cyr"), // 0xcf
  new Letters("zzit"), // 0xd0
  new Letters("zzix"), // 0xd1
  new Letters("zzi"), // 0xd2
  new Letters("zzip"), // 0xd3
  new Letters("zziet"), // 0xd4
  new Letters("zziex"), // 0xd5
  new Letters("zzie"), // 0xd6
  new Letters("zziep"), // 0xd7
  new Letters("zzat"), // 0xd8
  new Letters("zzax"), // 0xd9
  new Letters("zza"), // 0xda
  new Letters("zzap"), // 0xdb
  new Letters("zzox"), // 0xdc
  new Letters("zzo"), // 0xdd
  new Letters("zzop"), // 0xde
  new Letters("zzex"), // 0xdf
  new Letters("zze"), // 0xe0
  new Letters("zzep"), // 0xe1
  new Letters("zzux"), // 0xe2
  new Letters("zzu"), // 0xe3
  new Letters("zzup"), // 0xe4
  new Letters("zzurx"), // 0xe5
  new Letters("zzur"), // 0xe6
  new Letters("zzyt"), // 0xe7
  new Letters("zzyx"), // 0xe8
  new Letters("zzy"), // 0xe9
  new Letters("zzyp"), // 0xea
  new Letters("zzyrx"), // 0xeb
  new Letters("zzyr"), // 0xec
  new Letters("nzit"), // 0xed
  new Letters("nzix"), // 0xee
  new Letters("nzi"), // 0xef
  new Letters("nzip"), // 0xf0
  new Letters("nziex"), // 0xf1
  new Letters("nzie"), // 0xf2
  new Letters("nziep"), // 0xf3
  new Letters("nzat"), // 0xf4
  new Letters("nzax"), // 0xf5
  new Letters("nza"), // 0xf6
  new Letters("nzap"), // 0xf7
  new Letters("nzuox"), // 0xf8
  new Letters("nzuo"), // 0xf9
  new Letters("nzox"), // 0xfa
  new Letters("nzop"), // 0xfb
  new Letters("nzex"), // 0xfc
  new Letters("nze"), // 0xfd
  new Letters("nzux"), // 0xfe
  new Letters("nzu") // 0xff
  };
}