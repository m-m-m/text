/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+B5xx (Hangul Syllables for Korean).
 */
final class Xb5 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("dyil"), // 0x00
  new Letters("dyilg"), // 0x01
  new Letters("dyilm"), // 0x02
  new Letters("dyilb"), // 0x03
  new Letters("dyils"), // 0x04
  new Letters("dyilt"), // 0x05
  new Letters("dyilp"), // 0x06
  new Letters("dyilh"), // 0x07
  new Letters("dyim"), // 0x08
  new Letters("dyib"), // 0x09
  new Letters("dyibs"), // 0x0a
  new Letters("dyis"), // 0x0b
  new Letters("dyiss"), // 0x0c
  new Letters("dying"), // 0x0d
  new Letters("dyij"), // 0x0e
  new Letters("dyic"), // 0x0f
  new Letters("dyik"), // 0x10
  new Letters("dyit"), // 0x11
  new Letters("dyip"), // 0x12
  new Letters("dyih"), // 0x13
  LO_DI, // 0x14
  new Letters("dig"), // 0x15
  new Letters("digg"), // 0x16
  new Letters("digs"), // 0x17
  new Letters("din"), // 0x18
  new Letters("dinj"), // 0x19
  new Letters("dinh"), // 0x1a
  new Letters("did"), // 0x1b
  new Letters("dil"), // 0x1c
  new Letters("dilg"), // 0x1d
  new Letters("dilm"), // 0x1e
  new Letters("dilb"), // 0x1f
  new Letters("dils"), // 0x20
  new Letters("dilt"), // 0x21
  new Letters("dilp"), // 0x22
  new Letters("dilh"), // 0x23
  new Letters("dim"), // 0x24
  new Letters("dib"), // 0x25
  new Letters("dibs"), // 0x26
  new Letters("dis"), // 0x27
  new Letters("diss"), // 0x28
  new Letters("ding"), // 0x29
  new Letters("dij"), // 0x2a
  new Letters("dic"), // 0x2b
  new Letters("dik"), // 0x2c
  new Letters("dit"), // 0x2d
  new Letters("dip"), // 0x2e
  new Letters("dih"), // 0x2f
  new Letters("dda"), // 0x30
  new Letters("ddag"), // 0x31
  new Letters("ddagg"), // 0x32
  new Letters("ddags"), // 0x33
  new Letters("ddan"), // 0x34
  new Letters("ddanj"), // 0x35
  new Letters("ddanh"), // 0x36
  new Letters("ddad"), // 0x37
  new Letters("ddal"), // 0x38
  new Letters("ddalg"), // 0x39
  new Letters("ddalm"), // 0x3a
  new Letters("ddalb"), // 0x3b
  new Letters("ddals"), // 0x3c
  new Letters("ddalt"), // 0x3d
  new Letters("ddalp"), // 0x3e
  new Letters("ddalh"), // 0x3f
  new Letters("ddam"), // 0x40
  new Letters("ddab"), // 0x41
  new Letters("ddabs"), // 0x42
  new Letters("ddas"), // 0x43
  new Letters("ddass"), // 0x44
  new Letters("ddang"), // 0x45
  new Letters("ddaj"), // 0x46
  new Letters("ddac"), // 0x47
  new Letters("ddak"), // 0x48
  new Letters("ddat"), // 0x49
  new Letters("ddap"), // 0x4a
  new Letters("ddah"), // 0x4b
  new Letters("ddae"), // 0x4c
  new Letters("ddaeg"), // 0x4d
  new Letters("ddaegg"), // 0x4e
  new Letters("ddaegs"), // 0x4f
  new Letters("ddaen"), // 0x50
  new Letters("ddaenj"), // 0x51
  new Letters("ddaenh"), // 0x52
  new Letters("ddaed"), // 0x53
  new Letters("ddael"), // 0x54
  new Letters("ddaelg"), // 0x55
  new Letters("ddaelm"), // 0x56
  new Letters("ddaelb"), // 0x57
  new Letters("ddaels"), // 0x58
  new Letters("ddaelt"), // 0x59
  new Letters("ddaelp"), // 0x5a
  new Letters("ddaelh"), // 0x5b
  new Letters("ddaem"), // 0x5c
  new Letters("ddaeb"), // 0x5d
  new Letters("ddaebs"), // 0x5e
  new Letters("ddaes"), // 0x5f
  new Letters("ddaess"), // 0x60
  new Letters("ddaeng"), // 0x61
  new Letters("ddaej"), // 0x62
  new Letters("ddaec"), // 0x63
  new Letters("ddaek"), // 0x64
  new Letters("ddaet"), // 0x65
  new Letters("ddaep"), // 0x66
  new Letters("ddaeh"), // 0x67
  new Letters("ddya"), // 0x68
  new Letters("ddyag"), // 0x69
  new Letters("ddyagg"), // 0x6a
  new Letters("ddyags"), // 0x6b
  new Letters("ddyan"), // 0x6c
  new Letters("ddyanj"), // 0x6d
  new Letters("ddyanh"), // 0x6e
  new Letters("ddyad"), // 0x6f
  new Letters("ddyal"), // 0x70
  new Letters("ddyalg"), // 0x71
  new Letters("ddyalm"), // 0x72
  new Letters("ddyalb"), // 0x73
  new Letters("ddyals"), // 0x74
  new Letters("ddyalt"), // 0x75
  new Letters("ddyalp"), // 0x76
  new Letters("ddyalh"), // 0x77
  new Letters("ddyam"), // 0x78
  new Letters("ddyab"), // 0x79
  new Letters("ddyabs"), // 0x7a
  new Letters("ddyas"), // 0x7b
  new Letters("ddyass"), // 0x7c
  new Letters("ddyang"), // 0x7d
  new Letters("ddyaj"), // 0x7e
  new Letters("ddyac"), // 0x7f
  new Letters("ddyak"), // 0x80
  new Letters("ddyat"), // 0x81
  new Letters("ddyap"), // 0x82
  new Letters("ddyah"), // 0x83
  new Letters("ddyae"), // 0x84
  new Letters("ddyaeg"), // 0x85
  new Letters("ddyaegg"), // 0x86
  new Letters("ddyaegs"), // 0x87
  new Letters("ddyaen"), // 0x88
  new Letters("ddyaenj"), // 0x89
  new Letters("ddyaenh"), // 0x8a
  new Letters("ddyaed"), // 0x8b
  new Letters("ddyael"), // 0x8c
  new Letters("ddyaelg"), // 0x8d
  new Letters("ddyaelm"), // 0x8e
  new Letters("ddyaelb"), // 0x8f
  new Letters("ddyaels"), // 0x90
  new Letters("ddyaelt"), // 0x91
  new Letters("ddyaelp"), // 0x92
  new Letters("ddyaelh"), // 0x93
  new Letters("ddyaem"), // 0x94
  new Letters("ddyaeb"), // 0x95
  new Letters("ddyaebs"), // 0x96
  new Letters("ddyaes"), // 0x97
  new Letters("ddyaess"), // 0x98
  new Letters("ddyaeng"), // 0x99
  new Letters("ddyaej"), // 0x9a
  new Letters("ddyaec"), // 0x9b
  new Letters("ddyaek"), // 0x9c
  new Letters("ddyaet"), // 0x9d
  new Letters("ddyaep"), // 0x9e
  new Letters("ddyaeh"), // 0x9f
  new Letters("ddeo"), // 0xa0
  new Letters("ddeog"), // 0xa1
  new Letters("ddeogg"), // 0xa2
  new Letters("ddeogs"), // 0xa3
  new Letters("ddeon"), // 0xa4
  new Letters("ddeonj"), // 0xa5
  new Letters("ddeonh"), // 0xa6
  new Letters("ddeod"), // 0xa7
  new Letters("ddeol"), // 0xa8
  new Letters("ddeolg"), // 0xa9
  new Letters("ddeolm"), // 0xaa
  new Letters("ddeolb"), // 0xab
  new Letters("ddeols"), // 0xac
  new Letters("ddeolt"), // 0xad
  new Letters("ddeolp"), // 0xae
  new Letters("ddeolh"), // 0xaf
  new Letters("ddeom"), // 0xb0
  new Letters("ddeob"), // 0xb1
  new Letters("ddeobs"), // 0xb2
  new Letters("ddeos"), // 0xb3
  new Letters("ddeoss"), // 0xb4
  new Letters("ddeong"), // 0xb5
  new Letters("ddeoj"), // 0xb6
  new Letters("ddeoc"), // 0xb7
  new Letters("ddeok"), // 0xb8
  new Letters("ddeot"), // 0xb9
  new Letters("ddeop"), // 0xba
  new Letters("ddeoh"), // 0xbb
  new Letters("dde"), // 0xbc
  new Letters("ddeg"), // 0xbd
  new Letters("ddegg"), // 0xbe
  new Letters("ddegs"), // 0xbf
  new Letters("dden"), // 0xc0
  new Letters("ddenj"), // 0xc1
  new Letters("ddenh"), // 0xc2
  new Letters("dded"), // 0xc3
  new Letters("ddel"), // 0xc4
  new Letters("ddelg"), // 0xc5
  new Letters("ddelm"), // 0xc6
  new Letters("ddelb"), // 0xc7
  new Letters("ddels"), // 0xc8
  new Letters("ddelt"), // 0xc9
  new Letters("ddelp"), // 0xca
  new Letters("ddelh"), // 0xcb
  new Letters("ddem"), // 0xcc
  new Letters("ddeb"), // 0xcd
  new Letters("ddebs"), // 0xce
  new Letters("ddes"), // 0xcf
  new Letters("ddess"), // 0xd0
  new Letters("ddeng"), // 0xd1
  new Letters("ddej"), // 0xd2
  new Letters("ddec"), // 0xd3
  new Letters("ddek"), // 0xd4
  new Letters("ddet"), // 0xd5
  new Letters("ddep"), // 0xd6
  new Letters("ddeh"), // 0xd7
  new Letters("ddyeo"), // 0xd8
  new Letters("ddyeog"), // 0xd9
  new Letters("ddyeogg"), // 0xda
  new Letters("ddyeogs"), // 0xdb
  new Letters("ddyeon"), // 0xdc
  new Letters("ddyeonj"), // 0xdd
  new Letters("ddyeonh"), // 0xde
  new Letters("ddyeod"), // 0xdf
  new Letters("ddyeol"), // 0xe0
  new Letters("ddyeolg"), // 0xe1
  new Letters("ddyeolm"), // 0xe2
  new Letters("ddyeolb"), // 0xe3
  new Letters("ddyeols"), // 0xe4
  new Letters("ddyeolt"), // 0xe5
  new Letters("ddyeolp"), // 0xe6
  new Letters("ddyeolh"), // 0xe7
  new Letters("ddyeom"), // 0xe8
  new Letters("ddyeob"), // 0xe9
  new Letters("ddyeobs"), // 0xea
  new Letters("ddyeos"), // 0xeb
  new Letters("ddyeoss"), // 0xec
  new Letters("ddyeong"), // 0xed
  new Letters("ddyeoj"), // 0xee
  new Letters("ddyeoc"), // 0xef
  new Letters("ddyeok"), // 0xf0
  new Letters("ddyeot"), // 0xf1
  new Letters("ddyeop"), // 0xf2
  new Letters("ddyeoh"), // 0xf3
  new Letters("ddye"), // 0xf4
  new Letters("ddyeg"), // 0xf5
  new Letters("ddyegg"), // 0xf6
  new Letters("ddyegs"), // 0xf7
  new Letters("ddyen"), // 0xf8
  new Letters("ddyenj"), // 0xf9
  new Letters("ddyenh"), // 0xfa
  new Letters("ddyed"), // 0xfb
  new Letters("ddyel"), // 0xfc
  new Letters("ddyelg"), // 0xfd
  new Letters("ddyelm"), // 0xfe
  new Letters("ddyelb") // 0xff
  };
}