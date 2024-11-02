/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+CFxx (Hangul Syllables for Korean).
 */
final class Xcf extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  LO_KE, // 0x00
  new Letters("keg"), // 0x01
  new Letters("kegg"), // 0x02
  new Letters("kegs"), // 0x03
  new Letters("ken"), // 0x04
  new Letters("kenj"), // 0x05
  new Letters("kenh"), // 0x06
  new Letters("ked"), // 0x07
  new Letters("kel"), // 0x08
  new Letters("kelg"), // 0x09
  new Letters("kelm"), // 0x0a
  new Letters("kelb"), // 0x0b
  new Letters("kels"), // 0x0c
  new Letters("kelt"), // 0x0d
  new Letters("kelp"), // 0x0e
  new Letters("kelh"), // 0x0f
  new Letters("kem"), // 0x10
  new Letters("keb"), // 0x11
  new Letters("kebs"), // 0x12
  new Letters("kes"), // 0x13
  new Letters("kess"), // 0x14
  new Letters("keng"), // 0x15
  new Letters("kej"), // 0x16
  new Letters("kec"), // 0x17
  new Letters("kek"), // 0x18
  new Letters("ket"), // 0x19
  new Letters("kep"), // 0x1a
  new Letters("keh"), // 0x1b
  new Letters("kyeo"), // 0x1c
  new Letters("kyeog"), // 0x1d
  new Letters("kyeogg"), // 0x1e
  new Letters("kyeogs"), // 0x1f
  new Letters("kyeon"), // 0x20
  new Letters("kyeonj"), // 0x21
  new Letters("kyeonh"), // 0x22
  new Letters("kyeod"), // 0x23
  new Letters("kyeol"), // 0x24
  new Letters("kyeolg"), // 0x25
  new Letters("kyeolm"), // 0x26
  new Letters("kyeolb"), // 0x27
  new Letters("kyeols"), // 0x28
  new Letters("kyeolt"), // 0x29
  new Letters("kyeolp"), // 0x2a
  new Letters("kyeolh"), // 0x2b
  new Letters("kyeom"), // 0x2c
  new Letters("kyeob"), // 0x2d
  new Letters("kyeobs"), // 0x2e
  new Letters("kyeos"), // 0x2f
  new Letters("kyeoss"), // 0x30
  new Letters("kyeong"), // 0x31
  new Letters("kyeoj"), // 0x32
  new Letters("kyeoc"), // 0x33
  new Letters("kyeok"), // 0x34
  new Letters("kyeot"), // 0x35
  new Letters("kyeop"), // 0x36
  new Letters("kyeoh"), // 0x37
  new Letters("kye"), // 0x38
  new Letters("kyeg"), // 0x39
  new Letters("kyegg"), // 0x3a
  new Letters("kyegs"), // 0x3b
  new Letters("kyen"), // 0x3c
  new Letters("kyenj"), // 0x3d
  new Letters("kyenh"), // 0x3e
  new Letters("kyed"), // 0x3f
  new Letters("kyel"), // 0x40
  new Letters("kyelg"), // 0x41
  new Letters("kyelm"), // 0x42
  new Letters("kyelb"), // 0x43
  new Letters("kyels"), // 0x44
  new Letters("kyelt"), // 0x45
  new Letters("kyelp"), // 0x46
  new Letters("kyelh"), // 0x47
  new Letters("kyem"), // 0x48
  new Letters("kyeb"), // 0x49
  new Letters("kyebs"), // 0x4a
  new Letters("kyes"), // 0x4b
  new Letters("kyess"), // 0x4c
  new Letters("kyeng"), // 0x4d
  new Letters("kyej"), // 0x4e
  new Letters("kyec"), // 0x4f
  new Letters("kyek"), // 0x50
  new Letters("kyet"), // 0x51
  new Letters("kyep"), // 0x52
  new Letters("kyeh"), // 0x53
  LO_KO, // 0x54
  new Letters("kog"), // 0x55
  new Letters("kogg"), // 0x56
  new Letters("kogs"), // 0x57
  new Letters("kon"), // 0x58
  new Letters("konj"), // 0x59
  new Letters("konh"), // 0x5a
  new Letters("kod"), // 0x5b
  new Letters("kol"), // 0x5c
  new Letters("kolg"), // 0x5d
  new Letters("kolm"), // 0x5e
  new Letters("kolb"), // 0x5f
  new Letters("kols"), // 0x60
  new Letters("kolt"), // 0x61
  new Letters("kolp"), // 0x62
  new Letters("kolh"), // 0x63
  new Letters("kom"), // 0x64
  new Letters("kob"), // 0x65
  new Letters("kobs"), // 0x66
  new Letters("kos"), // 0x67
  new Letters("koss"), // 0x68
  new Letters("kong"), // 0x69
  new Letters("koj"), // 0x6a
  new Letters("koc"), // 0x6b
  new Letters("kok"), // 0x6c
  new Letters("kot"), // 0x6d
  new Letters("kop"), // 0x6e
  new Letters("koh"), // 0x6f
  new Letters("kwa"), // 0x70
  new Letters("kwag"), // 0x71
  new Letters("kwagg"), // 0x72
  new Letters("kwags"), // 0x73
  new Letters("kwan"), // 0x74
  new Letters("kwanj"), // 0x75
  new Letters("kwanh"), // 0x76
  new Letters("kwad"), // 0x77
  new Letters("kwal"), // 0x78
  new Letters("kwalg"), // 0x79
  new Letters("kwalm"), // 0x7a
  new Letters("kwalb"), // 0x7b
  new Letters("kwals"), // 0x7c
  new Letters("kwalt"), // 0x7d
  new Letters("kwalp"), // 0x7e
  new Letters("kwalh"), // 0x7f
  new Letters("kwam"), // 0x80
  new Letters("kwab"), // 0x81
  new Letters("kwabs"), // 0x82
  new Letters("kwas"), // 0x83
  new Letters("kwass"), // 0x84
  new Letters("kwang"), // 0x85
  new Letters("kwaj"), // 0x86
  new Letters("kwac"), // 0x87
  new Letters("kwak"), // 0x88
  new Letters("kwat"), // 0x89
  new Letters("kwap"), // 0x8a
  new Letters("kwah"), // 0x8b
  new Letters("kwae"), // 0x8c
  new Letters("kwaeg"), // 0x8d
  new Letters("kwaegg"), // 0x8e
  new Letters("kwaegs"), // 0x8f
  new Letters("kwaen"), // 0x90
  new Letters("kwaenj"), // 0x91
  new Letters("kwaenh"), // 0x92
  new Letters("kwaed"), // 0x93
  new Letters("kwael"), // 0x94
  new Letters("kwaelg"), // 0x95
  new Letters("kwaelm"), // 0x96
  new Letters("kwaelb"), // 0x97
  new Letters("kwaels"), // 0x98
  new Letters("kwaelt"), // 0x99
  new Letters("kwaelp"), // 0x9a
  new Letters("kwaelh"), // 0x9b
  new Letters("kwaem"), // 0x9c
  new Letters("kwaeb"), // 0x9d
  new Letters("kwaebs"), // 0x9e
  new Letters("kwaes"), // 0x9f
  new Letters("kwaess"), // 0xa0
  new Letters("kwaeng"), // 0xa1
  new Letters("kwaej"), // 0xa2
  new Letters("kwaec"), // 0xa3
  new Letters("kwaek"), // 0xa4
  new Letters("kwaet"), // 0xa5
  new Letters("kwaep"), // 0xa6
  new Letters("kwaeh"), // 0xa7
  new Letters("koe"), // 0xa8
  new Letters("koeg"), // 0xa9
  new Letters("koegg"), // 0xaa
  new Letters("koegs"), // 0xab
  new Letters("koen"), // 0xac
  new Letters("koenj"), // 0xad
  new Letters("koenh"), // 0xae
  new Letters("koed"), // 0xaf
  new Letters("koel"), // 0xb0
  new Letters("koelg"), // 0xb1
  new Letters("koelm"), // 0xb2
  new Letters("koelb"), // 0xb3
  new Letters("koels"), // 0xb4
  new Letters("koelt"), // 0xb5
  new Letters("koelp"), // 0xb6
  new Letters("koelh"), // 0xb7
  new Letters("koem"), // 0xb8
  new Letters("koeb"), // 0xb9
  new Letters("koebs"), // 0xba
  new Letters("koes"), // 0xbb
  new Letters("koess"), // 0xbc
  new Letters("koeng"), // 0xbd
  new Letters("koej"), // 0xbe
  new Letters("koec"), // 0xbf
  new Letters("koek"), // 0xc0
  new Letters("koet"), // 0xc1
  new Letters("koep"), // 0xc2
  new Letters("koeh"), // 0xc3
  new Letters("kyo"), // 0xc4
  new Letters("kyog"), // 0xc5
  new Letters("kyogg"), // 0xc6
  new Letters("kyogs"), // 0xc7
  new Letters("kyon"), // 0xc8
  new Letters("kyonj"), // 0xc9
  new Letters("kyonh"), // 0xca
  new Letters("kyod"), // 0xcb
  new Letters("kyol"), // 0xcc
  new Letters("kyolg"), // 0xcd
  new Letters("kyolm"), // 0xce
  new Letters("kyolb"), // 0xcf
  new Letters("kyols"), // 0xd0
  new Letters("kyolt"), // 0xd1
  new Letters("kyolp"), // 0xd2
  new Letters("kyolh"), // 0xd3
  new Letters("kyom"), // 0xd4
  new Letters("kyob"), // 0xd5
  new Letters("kyobs"), // 0xd6
  new Letters("kyos"), // 0xd7
  new Letters("kyoss"), // 0xd8
  new Letters("kyong"), // 0xd9
  new Letters("kyoj"), // 0xda
  new Letters("kyoc"), // 0xdb
  new Letters("kyok"), // 0xdc
  new Letters("kyot"), // 0xdd
  new Letters("kyop"), // 0xde
  new Letters("kyoh"), // 0xdf
  LO_KU, // 0xe0
  new Letters("kug"), // 0xe1
  new Letters("kugg"), // 0xe2
  new Letters("kugs"), // 0xe3
  new Letters("kun"), // 0xe4
  new Letters("kunj"), // 0xe5
  new Letters("kunh"), // 0xe6
  new Letters("kud"), // 0xe7
  new Letters("kul"), // 0xe8
  new Letters("kulg"), // 0xe9
  new Letters("kulm"), // 0xea
  new Letters("kulb"), // 0xeb
  new Letters("kuls"), // 0xec
  new Letters("kult"), // 0xed
  new Letters("kulp"), // 0xee
  new Letters("kulh"), // 0xef
  new Letters("kum"), // 0xf0
  new Letters("kub"), // 0xf1
  new Letters("kubs"), // 0xf2
  new Letters("kus"), // 0xf3
  new Letters("kuss"), // 0xf4
  new Letters("kung"), // 0xf5
  new Letters("kuj"), // 0xf6
  new Letters("kuc"), // 0xf7
  new Letters("kuk"), // 0xf8
  new Letters("kut"), // 0xf9
  new Letters("kup"), // 0xfa
  new Letters("kuh"), // 0xfb
  new Letters("kweo"), // 0xfc
  new Letters("kweog"), // 0xfd
  new Letters("kweogg"), // 0xfe
  new Letters("kweogs") // 0xff
  };
}