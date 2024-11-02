/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+B8xx (Hangul Syllables for Korean).
 */
final class Xb8 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("reoss"), // 0x00
  new Letters("reong"), // 0x01
  new Letters("reoj"), // 0x02
  new Letters("reoc"), // 0x03
  new Letters("reok"), // 0x04
  new Letters("reot"), // 0x05
  new Letters("reop"), // 0x06
  new Letters("reoh"), // 0x07
  LO_RE, // 0x08
  new Letters("reg"), // 0x09
  new Letters("regg"), // 0x0a
  new Letters("regs"), // 0x0b
  new Letters("ren"), // 0x0c
  new Letters("renj"), // 0x0d
  new Letters("renh"), // 0x0e
  new Letters("red"), // 0x0f
  new Letters("rel"), // 0x10
  new Letters("relg"), // 0x11
  new Letters("relm"), // 0x12
  new Letters("relb"), // 0x13
  new Letters("rels"), // 0x14
  new Letters("relt"), // 0x15
  new Letters("relp"), // 0x16
  new Letters("relh"), // 0x17
  new Letters("rem"), // 0x18
  new Letters("reb"), // 0x19
  new Letters("rebs"), // 0x1a
  new Letters("res"), // 0x1b
  new Letters("ress"), // 0x1c
  new Letters("reng"), // 0x1d
  new Letters("rej"), // 0x1e
  new Letters("rec"), // 0x1f
  new Letters("rek"), // 0x20
  new Letters("ret"), // 0x21
  new Letters("rep"), // 0x22
  new Letters("reh"), // 0x23
  new Letters("ryeo"), // 0x24
  new Letters("ryeog"), // 0x25
  new Letters("ryeogg"), // 0x26
  new Letters("ryeogs"), // 0x27
  new Letters("ryeon"), // 0x28
  new Letters("ryeonj"), // 0x29
  new Letters("ryeonh"), // 0x2a
  new Letters("ryeod"), // 0x2b
  new Letters("ryeol"), // 0x2c
  new Letters("ryeolg"), // 0x2d
  new Letters("ryeolm"), // 0x2e
  new Letters("ryeolb"), // 0x2f
  new Letters("ryeols"), // 0x30
  new Letters("ryeolt"), // 0x31
  new Letters("ryeolp"), // 0x32
  new Letters("ryeolh"), // 0x33
  new Letters("ryeom"), // 0x34
  new Letters("ryeob"), // 0x35
  new Letters("ryeobs"), // 0x36
  new Letters("ryeos"), // 0x37
  new Letters("ryeoss"), // 0x38
  new Letters("ryeong"), // 0x39
  new Letters("ryeoj"), // 0x3a
  new Letters("ryeoc"), // 0x3b
  new Letters("ryeok"), // 0x3c
  new Letters("ryeot"), // 0x3d
  new Letters("ryeop"), // 0x3e
  new Letters("ryeoh"), // 0x3f
  new Letters("rye"), // 0x40
  new Letters("ryeg"), // 0x41
  new Letters("ryegg"), // 0x42
  new Letters("ryegs"), // 0x43
  new Letters("ryen"), // 0x44
  new Letters("ryenj"), // 0x45
  new Letters("ryenh"), // 0x46
  new Letters("ryed"), // 0x47
  new Letters("ryel"), // 0x48
  new Letters("ryelg"), // 0x49
  new Letters("ryelm"), // 0x4a
  new Letters("ryelb"), // 0x4b
  new Letters("ryels"), // 0x4c
  new Letters("ryelt"), // 0x4d
  new Letters("ryelp"), // 0x4e
  new Letters("ryelh"), // 0x4f
  new Letters("ryem"), // 0x50
  new Letters("ryeb"), // 0x51
  new Letters("ryebs"), // 0x52
  new Letters("ryes"), // 0x53
  new Letters("ryess"), // 0x54
  new Letters("ryeng"), // 0x55
  new Letters("ryej"), // 0x56
  new Letters("ryec"), // 0x57
  new Letters("ryek"), // 0x58
  new Letters("ryet"), // 0x59
  new Letters("ryep"), // 0x5a
  new Letters("ryeh"), // 0x5b
  LO_RO, // 0x5c
  new Letters("rog"), // 0x5d
  new Letters("rogg"), // 0x5e
  new Letters("rogs"), // 0x5f
  new Letters("ron"), // 0x60
  new Letters("ronj"), // 0x61
  new Letters("ronh"), // 0x62
  new Letters("rod"), // 0x63
  new Letters("rol"), // 0x64
  new Letters("rolg"), // 0x65
  new Letters("rolm"), // 0x66
  new Letters("rolb"), // 0x67
  new Letters("rols"), // 0x68
  new Letters("rolt"), // 0x69
  new Letters("rolp"), // 0x6a
  new Letters("rolh"), // 0x6b
  new Letters("rom"), // 0x6c
  new Letters("rob"), // 0x6d
  new Letters("robs"), // 0x6e
  new Letters("ros"), // 0x6f
  new Letters("ross"), // 0x70
  new Letters("rong"), // 0x71
  new Letters("roj"), // 0x72
  new Letters("roc"), // 0x73
  new Letters("rok"), // 0x74
  new Letters("rot"), // 0x75
  new Letters("rop"), // 0x76
  new Letters("roh"), // 0x77
  new Letters("rwa"), // 0x78
  new Letters("rwag"), // 0x79
  new Letters("rwagg"), // 0x7a
  new Letters("rwags"), // 0x7b
  new Letters("rwan"), // 0x7c
  new Letters("rwanj"), // 0x7d
  new Letters("rwanh"), // 0x7e
  new Letters("rwad"), // 0x7f
  new Letters("rwal"), // 0x80
  new Letters("rwalg"), // 0x81
  new Letters("rwalm"), // 0x82
  new Letters("rwalb"), // 0x83
  new Letters("rwals"), // 0x84
  new Letters("rwalt"), // 0x85
  new Letters("rwalp"), // 0x86
  new Letters("rwalh"), // 0x87
  new Letters("rwam"), // 0x88
  new Letters("rwab"), // 0x89
  new Letters("rwabs"), // 0x8a
  new Letters("rwas"), // 0x8b
  new Letters("rwass"), // 0x8c
  new Letters("rwang"), // 0x8d
  new Letters("rwaj"), // 0x8e
  new Letters("rwac"), // 0x8f
  new Letters("rwak"), // 0x90
  new Letters("rwat"), // 0x91
  new Letters("rwap"), // 0x92
  new Letters("rwah"), // 0x93
  new Letters("rwae"), // 0x94
  new Letters("rwaeg"), // 0x95
  new Letters("rwaegg"), // 0x96
  new Letters("rwaegs"), // 0x97
  new Letters("rwaen"), // 0x98
  new Letters("rwaenj"), // 0x99
  new Letters("rwaenh"), // 0x9a
  new Letters("rwaed"), // 0x9b
  new Letters("rwael"), // 0x9c
  new Letters("rwaelg"), // 0x9d
  new Letters("rwaelm"), // 0x9e
  new Letters("rwaelb"), // 0x9f
  new Letters("rwaels"), // 0xa0
  new Letters("rwaelt"), // 0xa1
  new Letters("rwaelp"), // 0xa2
  new Letters("rwaelh"), // 0xa3
  new Letters("rwaem"), // 0xa4
  new Letters("rwaeb"), // 0xa5
  new Letters("rwaebs"), // 0xa6
  new Letters("rwaes"), // 0xa7
  new Letters("rwaess"), // 0xa8
  new Letters("rwaeng"), // 0xa9
  new Letters("rwaej"), // 0xaa
  new Letters("rwaec"), // 0xab
  new Letters("rwaek"), // 0xac
  new Letters("rwaet"), // 0xad
  new Letters("rwaep"), // 0xae
  new Letters("rwaeh"), // 0xaf
  new Letters("roe"), // 0xb0
  new Letters("roeg"), // 0xb1
  new Letters("roegg"), // 0xb2
  new Letters("roegs"), // 0xb3
  new Letters("roen"), // 0xb4
  new Letters("roenj"), // 0xb5
  new Letters("roenh"), // 0xb6
  new Letters("roed"), // 0xb7
  new Letters("roel"), // 0xb8
  new Letters("roelg"), // 0xb9
  new Letters("roelm"), // 0xba
  new Letters("roelb"), // 0xbb
  new Letters("roels"), // 0xbc
  new Letters("roelt"), // 0xbd
  new Letters("roelp"), // 0xbe
  new Letters("roelh"), // 0xbf
  new Letters("roem"), // 0xc0
  new Letters("roeb"), // 0xc1
  new Letters("roebs"), // 0xc2
  new Letters("roes"), // 0xc3
  new Letters("roess"), // 0xc4
  new Letters("roeng"), // 0xc5
  new Letters("roej"), // 0xc6
  new Letters("roec"), // 0xc7
  new Letters("roek"), // 0xc8
  new Letters("roet"), // 0xc9
  new Letters("roep"), // 0xca
  new Letters("roeh"), // 0xcb
  new Letters("ryo"), // 0xcc
  new Letters("ryog"), // 0xcd
  new Letters("ryogg"), // 0xce
  new Letters("ryogs"), // 0xcf
  new Letters("ryon"), // 0xd0
  new Letters("ryonj"), // 0xd1
  new Letters("ryonh"), // 0xd2
  new Letters("ryod"), // 0xd3
  new Letters("ryol"), // 0xd4
  new Letters("ryolg"), // 0xd5
  new Letters("ryolm"), // 0xd6
  new Letters("ryolb"), // 0xd7
  new Letters("ryols"), // 0xd8
  new Letters("ryolt"), // 0xd9
  new Letters("ryolp"), // 0xda
  new Letters("ryolh"), // 0xdb
  new Letters("ryom"), // 0xdc
  new Letters("ryob"), // 0xdd
  new Letters("ryobs"), // 0xde
  new Letters("ryos"), // 0xdf
  new Letters("ryoss"), // 0xe0
  new Letters("ryong"), // 0xe1
  new Letters("ryoj"), // 0xe2
  new Letters("ryoc"), // 0xe3
  new Letters("ryok"), // 0xe4
  new Letters("ryot"), // 0xe5
  new Letters("ryop"), // 0xe6
  new Letters("ryoh"), // 0xe7
  LO_RU, // 0xe8
  new Letters("rug"), // 0xe9
  new Letters("rugg"), // 0xea
  new Letters("rugs"), // 0xeb
  new Letters("run"), // 0xec
  new Letters("runj"), // 0xed
  new Letters("runh"), // 0xee
  new Letters("rud"), // 0xef
  new Letters("rul"), // 0xf0
  new Letters("rulg"), // 0xf1
  new Letters("rulm"), // 0xf2
  new Letters("rulb"), // 0xf3
  new Letters("ruls"), // 0xf4
  new Letters("rult"), // 0xf5
  new Letters("rulp"), // 0xf6
  new Letters("rulh"), // 0xf7
  new Letters("rum"), // 0xf8
  new Letters("rub"), // 0xf9
  new Letters("rubs"), // 0xfa
  new Letters("rus"), // 0xfb
  new Letters("russ"), // 0xfc
  new Letters("rung"), // 0xfd
  new Letters("ruj"), // 0xfe
  new Letters("ruc") // 0xff
  };
}