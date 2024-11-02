/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+C6xx (Hangul Syllables for Korean).
 */
final class Xc6 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("yeoss"), // 0x00
  new Letters("yeong"), // 0x01
  new Letters("yeoj"), // 0x02
  new Letters("yeoc"), // 0x03
  new Letters("yeok"), // 0x04
  new Letters("yeot"), // 0x05
  new Letters("yeop"), // 0x06
  new Letters("yeoh"), // 0x07
  LO_YE, // 0x08
  new Letters("yeg"), // 0x09
  new Letters("yegg"), // 0x0a
  new Letters("yegs"), // 0x0b
  new Letters("yen"), // 0x0c
  new Letters("yenj"), // 0x0d
  new Letters("yenh"), // 0x0e
  new Letters("yed"), // 0x0f
  new Letters("yel"), // 0x10
  new Letters("yelg"), // 0x11
  new Letters("yelm"), // 0x12
  new Letters("yelb"), // 0x13
  new Letters("yels"), // 0x14
  new Letters("yelt"), // 0x15
  new Letters("yelp"), // 0x16
  new Letters("yelh"), // 0x17
  new Letters("yem"), // 0x18
  new Letters("yeb"), // 0x19
  new Letters("yebs"), // 0x1a
  new Letters("yes"), // 0x1b
  new Letters("yess"), // 0x1c
  new Letters("yeng"), // 0x1d
  new Letters("yej"), // 0x1e
  new Letters("yec"), // 0x1f
  new Letters("yek"), // 0x20
  new Letters("yet"), // 0x21
  new Letters("yep"), // 0x22
  new Letters("yeh"), // 0x23
  Letter.LO_O, // 0x24
  new Letters("og"), // 0x25
  new Letters("ogg"), // 0x26
  new Letters("ogs"), // 0x27
  new Letters("on"), // 0x28
  new Letters("onj"), // 0x29
  new Letters("onh"), // 0x2a
  new Letters("od"), // 0x2b
  new Letters("ol"), // 0x2c
  new Letters("olg"), // 0x2d
  new Letters("olm"), // 0x2e
  new Letters("olb"), // 0x2f
  new Letters("ols"), // 0x30
  new Letters("olt"), // 0x31
  new Letters("olp"), // 0x32
  new Letters("olh"), // 0x33
  new Letters("om"), // 0x34
  new Letters("ob"), // 0x35
  new Letters("obs"), // 0x36
  new Letters("os"), // 0x37
  new Letters("oss"), // 0x38
  new Letters("ong"), // 0x39
  new Letters("oj"), // 0x3a
  new Letters("oc"), // 0x3b
  new Letters("ok"), // 0x3c
  LO_OT, // 0x3d
  new Letters("op"), // 0x3e
  new Letters("oh"), // 0x3f
  LO_WA, // 0x40
  new Letters("wag"), // 0x41
  new Letters("wagg"), // 0x42
  new Letters("wags"), // 0x43
  new Letters("wan"), // 0x44
  new Letters("wanj"), // 0x45
  new Letters("wanh"), // 0x46
  new Letters("wad"), // 0x47
  new Letters("wal"), // 0x48
  new Letters("walg"), // 0x49
  new Letters("walm"), // 0x4a
  new Letters("walb"), // 0x4b
  new Letters("wals"), // 0x4c
  new Letters("walt"), // 0x4d
  new Letters("walp"), // 0x4e
  new Letters("walh"), // 0x4f
  new Letters("wam"), // 0x50
  new Letters("wab"), // 0x51
  new Letters("wabs"), // 0x52
  new Letters("was"), // 0x53
  new Letters("wass"), // 0x54
  new Letters("wang"), // 0x55
  new Letters("waj"), // 0x56
  new Letters("wac"), // 0x57
  new Letters("wak"), // 0x58
  new Letters("wat"), // 0x59
  new Letters("wap"), // 0x5a
  new Letters("wah"), // 0x5b
  new Letters("wae"), // 0x5c
  new Letters("waeg"), // 0x5d
  new Letters("waegg"), // 0x5e
  new Letters("waegs"), // 0x5f
  new Letters("waen"), // 0x60
  new Letters("waenj"), // 0x61
  new Letters("waenh"), // 0x62
  new Letters("waed"), // 0x63
  new Letters("wael"), // 0x64
  new Letters("waelg"), // 0x65
  new Letters("waelm"), // 0x66
  new Letters("waelb"), // 0x67
  new Letters("waels"), // 0x68
  new Letters("waelt"), // 0x69
  new Letters("waelp"), // 0x6a
  new Letters("waelh"), // 0x6b
  new Letters("waem"), // 0x6c
  new Letters("waeb"), // 0x6d
  new Letters("waebs"), // 0x6e
  new Letters("waes"), // 0x6f
  new Letters("waess"), // 0x70
  new Letters("waeng"), // 0x71
  new Letters("waej"), // 0x72
  new Letters("waec"), // 0x73
  new Letters("waek"), // 0x74
  new Letters("waet"), // 0x75
  new Letters("waep"), // 0x76
  new Letters("waeh"), // 0x77
  LO_OE, // 0x78
  new Letters("oeg"), // 0x79
  new Letters("oegg"), // 0x7a
  new Letters("oegs"), // 0x7b
  new Letters("oen"), // 0x7c
  new Letters("oenj"), // 0x7d
  new Letters("oenh"), // 0x7e
  new Letters("oed"), // 0x7f
  new Letters("oel"), // 0x80
  new Letters("oelg"), // 0x81
  new Letters("oelm"), // 0x82
  new Letters("oelb"), // 0x83
  new Letters("oels"), // 0x84
  new Letters("oelt"), // 0x85
  new Letters("oelp"), // 0x86
  new Letters("oelh"), // 0x87
  new Letters("oem"), // 0x88
  new Letters("oeb"), // 0x89
  new Letters("oebs"), // 0x8a
  new Letters("oes"), // 0x8b
  new Letters("oess"), // 0x8c
  new Letters("oeng"), // 0x8d
  new Letters("oej"), // 0x8e
  new Letters("oec"), // 0x8f
  new Letters("oek"), // 0x90
  new Letters("oet"), // 0x91
  new Letters("oep"), // 0x92
  new Letters("oeh"), // 0x93
  LO_YO, // 0x94
  new Letters("yog"), // 0x95
  new Letters("yogg"), // 0x96
  new Letters("yogs"), // 0x97
  new Letters("yon"), // 0x98
  new Letters("yonj"), // 0x99
  new Letters("yonh"), // 0x9a
  new Letters("yod"), // 0x9b
  new Letters("yol"), // 0x9c
  new Letters("yolg"), // 0x9d
  new Letters("yolm"), // 0x9e
  new Letters("yolb"), // 0x9f
  new Letters("yols"), // 0xa0
  new Letters("yolt"), // 0xa1
  new Letters("yolp"), // 0xa2
  new Letters("yolh"), // 0xa3
  new Letters("yom"), // 0xa4
  new Letters("yob"), // 0xa5
  new Letters("yobs"), // 0xa6
  new Letters("yos"), // 0xa7
  new Letters("yoss"), // 0xa8
  new Letters("yong"), // 0xa9
  new Letters("yoj"), // 0xaa
  new Letters("yoc"), // 0xab
  new Letters("yok"), // 0xac
  new Letters("yot"), // 0xad
  new Letters("yop"), // 0xae
  new Letters("yoh"), // 0xaf
  Letter.LO_U, // 0xb0
  new Letters("ug"), // 0xb1
  new Letters("ugg"), // 0xb2
  new Letters("ugs"), // 0xb3
  new Letters("un"), // 0xb4
  new Letters("unj"), // 0xb5
  new Letters("unh"), // 0xb6
  new Letters("ud"), // 0xb7
  new Letters("ul"), // 0xb8
  new Letters("ulg"), // 0xb9
  new Letters("ulm"), // 0xba
  new Letters("ulb"), // 0xbb
  new Letters("uls"), // 0xbc
  new Letters("ult"), // 0xbd
  new Letters("ulp"), // 0xbe
  new Letters("ulh"), // 0xbf
  new Letters("um"), // 0xc0
  new Letters("ub"), // 0xc1
  new Letters("ubs"), // 0xc2
  new Letters("us"), // 0xc3
  new Letters("uss"), // 0xc4
  new Letters("ung"), // 0xc5
  new Letters("uj"), // 0xc6
  new Letters("uc"), // 0xc7
  new Letters("uk"), // 0xc8
  new Letters("ut"), // 0xc9
  new Letters("up"), // 0xca
  new Letters("uh"), // 0xcb
  new Letters("weo"), // 0xcc
  new Letters("weog"), // 0xcd
  new Letters("weogg"), // 0xce
  new Letters("weogs"), // 0xcf
  new Letters("weon"), // 0xd0
  new Letters("weonj"), // 0xd1
  new Letters("weonh"), // 0xd2
  new Letters("weod"), // 0xd3
  new Letters("weol"), // 0xd4
  new Letters("weolg"), // 0xd5
  new Letters("weolm"), // 0xd6
  new Letters("weolb"), // 0xd7
  new Letters("weols"), // 0xd8
  new Letters("weolt"), // 0xd9
  new Letters("weolp"), // 0xda
  new Letters("weolh"), // 0xdb
  new Letters("weom"), // 0xdc
  new Letters("weob"), // 0xdd
  new Letters("weobs"), // 0xde
  new Letters("weos"), // 0xdf
  new Letters("weoss"), // 0xe0
  new Letters("weong"), // 0xe1
  new Letters("weoj"), // 0xe2
  new Letters("weoc"), // 0xe3
  new Letters("weok"), // 0xe4
  new Letters("weot"), // 0xe5
  new Letters("weop"), // 0xe6
  new Letters("weoh"), // 0xe7
  LO_WE, // 0xe8
  new Letters("weg"), // 0xe9
  new Letters("wegg"), // 0xea
  new Letters("wegs"), // 0xeb
  new Letters("wen"), // 0xec
  new Letters("wenj"), // 0xed
  new Letters("wenh"), // 0xee
  new Letters("wed"), // 0xef
  new Letters("wel"), // 0xf0
  new Letters("welg"), // 0xf1
  new Letters("welm"), // 0xf2
  new Letters("welb"), // 0xf3
  new Letters("wels"), // 0xf4
  new Letters("welt"), // 0xf5
  new Letters("welp"), // 0xf6
  new Letters("welh"), // 0xf7
  new Letters("wem"), // 0xf8
  new Letters("web"), // 0xf9
  new Letters("webs"), // 0xfa
  new Letters("wes"), // 0xfb
  new Letters("wess"), // 0xfc
  new Letters("weng"), // 0xfd
  new Letters("wej"), // 0xfe
  new Letters("wec") // 0xff
  };
}