/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+BFxx (Hangul Syllables for Korean).
 */
final class Xbf extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("bbess"), // 0x00
  new Letters("bbeng"), // 0x01
  new Letters("bbej"), // 0x02
  new Letters("bbec"), // 0x03
  new Letters("bbek"), // 0x04
  new Letters("bbet"), // 0x05
  new Letters("bbep"), // 0x06
  new Letters("bbeh"), // 0x07
  new Letters("bbyeo"), // 0x08
  new Letters("bbyeog"), // 0x09
  new Letters("bbyeogg"), // 0x0a
  new Letters("bbyeogs"), // 0x0b
  new Letters("bbyeon"), // 0x0c
  new Letters("bbyeonj"), // 0x0d
  new Letters("bbyeonh"), // 0x0e
  new Letters("bbyeod"), // 0x0f
  new Letters("bbyeol"), // 0x10
  new Letters("bbyeolg"), // 0x11
  new Letters("bbyeolm"), // 0x12
  new Letters("bbyeolb"), // 0x13
  new Letters("bbyeols"), // 0x14
  new Letters("bbyeolt"), // 0x15
  new Letters("bbyeolp"), // 0x16
  new Letters("bbyeolh"), // 0x17
  new Letters("bbyeom"), // 0x18
  new Letters("bbyeob"), // 0x19
  new Letters("bbyeobs"), // 0x1a
  new Letters("bbyeos"), // 0x1b
  new Letters("bbyeoss"), // 0x1c
  new Letters("bbyeong"), // 0x1d
  new Letters("bbyeoj"), // 0x1e
  new Letters("bbyeoc"), // 0x1f
  new Letters("bbyeok"), // 0x20
  new Letters("bbyeot"), // 0x21
  new Letters("bbyeop"), // 0x22
  new Letters("bbyeoh"), // 0x23
  new Letters("bbye"), // 0x24
  new Letters("bbyeg"), // 0x25
  new Letters("bbyegg"), // 0x26
  new Letters("bbyegs"), // 0x27
  new Letters("bbyen"), // 0x28
  new Letters("bbyenj"), // 0x29
  new Letters("bbyenh"), // 0x2a
  new Letters("bbyed"), // 0x2b
  new Letters("bbyel"), // 0x2c
  new Letters("bbyelg"), // 0x2d
  new Letters("bbyelm"), // 0x2e
  new Letters("bbyelb"), // 0x2f
  new Letters("bbyels"), // 0x30
  new Letters("bbyelt"), // 0x31
  new Letters("bbyelp"), // 0x32
  new Letters("bbyelh"), // 0x33
  new Letters("bbyem"), // 0x34
  new Letters("bbyeb"), // 0x35
  new Letters("bbyebs"), // 0x36
  new Letters("bbyes"), // 0x37
  new Letters("bbyess"), // 0x38
  new Letters("bbyeng"), // 0x39
  new Letters("bbyej"), // 0x3a
  new Letters("bbyec"), // 0x3b
  new Letters("bbyek"), // 0x3c
  new Letters("bbyet"), // 0x3d
  new Letters("bbyep"), // 0x3e
  new Letters("bbyeh"), // 0x3f
  new Letters("bbo"), // 0x40
  new Letters("bbog"), // 0x41
  new Letters("bbogg"), // 0x42
  new Letters("bbogs"), // 0x43
  new Letters("bbon"), // 0x44
  new Letters("bbonj"), // 0x45
  new Letters("bbonh"), // 0x46
  new Letters("bbod"), // 0x47
  new Letters("bbol"), // 0x48
  new Letters("bbolg"), // 0x49
  new Letters("bbolm"), // 0x4a
  new Letters("bbolb"), // 0x4b
  new Letters("bbols"), // 0x4c
  new Letters("bbolt"), // 0x4d
  new Letters("bbolp"), // 0x4e
  new Letters("bbolh"), // 0x4f
  new Letters("bbom"), // 0x50
  new Letters("bbob"), // 0x51
  new Letters("bbobs"), // 0x52
  new Letters("bbos"), // 0x53
  new Letters("bboss"), // 0x54
  new Letters("bbong"), // 0x55
  new Letters("bboj"), // 0x56
  new Letters("bboc"), // 0x57
  new Letters("bbok"), // 0x58
  new Letters("bbot"), // 0x59
  new Letters("bbop"), // 0x5a
  new Letters("bboh"), // 0x5b
  new Letters("bbwa"), // 0x5c
  new Letters("bbwag"), // 0x5d
  new Letters("bbwagg"), // 0x5e
  new Letters("bbwags"), // 0x5f
  new Letters("bbwan"), // 0x60
  new Letters("bbwanj"), // 0x61
  new Letters("bbwanh"), // 0x62
  new Letters("bbwad"), // 0x63
  new Letters("bbwal"), // 0x64
  new Letters("bbwalg"), // 0x65
  new Letters("bbwalm"), // 0x66
  new Letters("bbwalb"), // 0x67
  new Letters("bbwals"), // 0x68
  new Letters("bbwalt"), // 0x69
  new Letters("bbwalp"), // 0x6a
  new Letters("bbwalh"), // 0x6b
  new Letters("bbwam"), // 0x6c
  new Letters("bbwab"), // 0x6d
  new Letters("bbwabs"), // 0x6e
  new Letters("bbwas"), // 0x6f
  new Letters("bbwass"), // 0x70
  new Letters("bbwang"), // 0x71
  new Letters("bbwaj"), // 0x72
  new Letters("bbwac"), // 0x73
  new Letters("bbwak"), // 0x74
  new Letters("bbwat"), // 0x75
  new Letters("bbwap"), // 0x76
  new Letters("bbwah"), // 0x77
  new Letters("bbwae"), // 0x78
  new Letters("bbwaeg"), // 0x79
  new Letters("bbwaegg"), // 0x7a
  new Letters("bbwaegs"), // 0x7b
  new Letters("bbwaen"), // 0x7c
  new Letters("bbwaenj"), // 0x7d
  new Letters("bbwaenh"), // 0x7e
  new Letters("bbwaed"), // 0x7f
  new Letters("bbwael"), // 0x80
  new Letters("bbwaelg"), // 0x81
  new Letters("bbwaelm"), // 0x82
  new Letters("bbwaelb"), // 0x83
  new Letters("bbwaels"), // 0x84
  new Letters("bbwaelt"), // 0x85
  new Letters("bbwaelp"), // 0x86
  new Letters("bbwaelh"), // 0x87
  new Letters("bbwaem"), // 0x88
  new Letters("bbwaeb"), // 0x89
  new Letters("bbwaebs"), // 0x8a
  new Letters("bbwaes"), // 0x8b
  new Letters("bbwaess"), // 0x8c
  new Letters("bbwaeng"), // 0x8d
  new Letters("bbwaej"), // 0x8e
  new Letters("bbwaec"), // 0x8f
  new Letters("bbwaek"), // 0x90
  new Letters("bbwaet"), // 0x91
  new Letters("bbwaep"), // 0x92
  new Letters("bbwaeh"), // 0x93
  new Letters("bboe"), // 0x94
  new Letters("bboeg"), // 0x95
  new Letters("bboegg"), // 0x96
  new Letters("bboegs"), // 0x97
  new Letters("bboen"), // 0x98
  new Letters("bboenj"), // 0x99
  new Letters("bboenh"), // 0x9a
  new Letters("bboed"), // 0x9b
  new Letters("bboel"), // 0x9c
  new Letters("bboelg"), // 0x9d
  new Letters("bboelm"), // 0x9e
  new Letters("bboelb"), // 0x9f
  new Letters("bboels"), // 0xa0
  new Letters("bboelt"), // 0xa1
  new Letters("bboelp"), // 0xa2
  new Letters("bboelh"), // 0xa3
  new Letters("bboem"), // 0xa4
  new Letters("bboeb"), // 0xa5
  new Letters("bboebs"), // 0xa6
  new Letters("bboes"), // 0xa7
  new Letters("bboess"), // 0xa8
  new Letters("bboeng"), // 0xa9
  new Letters("bboej"), // 0xaa
  new Letters("bboec"), // 0xab
  new Letters("bboek"), // 0xac
  new Letters("bboet"), // 0xad
  new Letters("bboep"), // 0xae
  new Letters("bboeh"), // 0xaf
  new Letters("bbyo"), // 0xb0
  new Letters("bbyog"), // 0xb1
  new Letters("bbyogg"), // 0xb2
  new Letters("bbyogs"), // 0xb3
  new Letters("bbyon"), // 0xb4
  new Letters("bbyonj"), // 0xb5
  new Letters("bbyonh"), // 0xb6
  new Letters("bbyod"), // 0xb7
  new Letters("bbyol"), // 0xb8
  new Letters("bbyolg"), // 0xb9
  new Letters("bbyolm"), // 0xba
  new Letters("bbyolb"), // 0xbb
  new Letters("bbyols"), // 0xbc
  new Letters("bbyolt"), // 0xbd
  new Letters("bbyolp"), // 0xbe
  new Letters("bbyolh"), // 0xbf
  new Letters("bbyom"), // 0xc0
  new Letters("bbyob"), // 0xc1
  new Letters("bbyobs"), // 0xc2
  new Letters("bbyos"), // 0xc3
  new Letters("bbyoss"), // 0xc4
  new Letters("bbyong"), // 0xc5
  new Letters("bbyoj"), // 0xc6
  new Letters("bbyoc"), // 0xc7
  new Letters("bbyok"), // 0xc8
  new Letters("bbyot"), // 0xc9
  new Letters("bbyop"), // 0xca
  new Letters("bbyoh"), // 0xcb
  new Letters("bbu"), // 0xcc
  new Letters("bbug"), // 0xcd
  new Letters("bbugg"), // 0xce
  new Letters("bbugs"), // 0xcf
  new Letters("bbun"), // 0xd0
  new Letters("bbunj"), // 0xd1
  new Letters("bbunh"), // 0xd2
  new Letters("bbud"), // 0xd3
  new Letters("bbul"), // 0xd4
  new Letters("bbulg"), // 0xd5
  new Letters("bbulm"), // 0xd6
  new Letters("bbulb"), // 0xd7
  new Letters("bbuls"), // 0xd8
  new Letters("bbult"), // 0xd9
  new Letters("bbulp"), // 0xda
  new Letters("bbulh"), // 0xdb
  new Letters("bbum"), // 0xdc
  new Letters("bbub"), // 0xdd
  new Letters("bbubs"), // 0xde
  new Letters("bbus"), // 0xdf
  new Letters("bbuss"), // 0xe0
  new Letters("bbung"), // 0xe1
  new Letters("bbuj"), // 0xe2
  new Letters("bbuc"), // 0xe3
  new Letters("bbuk"), // 0xe4
  new Letters("bbut"), // 0xe5
  new Letters("bbup"), // 0xe6
  new Letters("bbuh"), // 0xe7
  new Letters("bbweo"), // 0xe8
  new Letters("bbweog"), // 0xe9
  new Letters("bbweogg"), // 0xea
  new Letters("bbweogs"), // 0xeb
  new Letters("bbweon"), // 0xec
  new Letters("bbweonj"), // 0xed
  new Letters("bbweonh"), // 0xee
  new Letters("bbweod"), // 0xef
  new Letters("bbweol"), // 0xf0
  new Letters("bbweolg"), // 0xf1
  new Letters("bbweolm"), // 0xf2
  new Letters("bbweolb"), // 0xf3
  new Letters("bbweols"), // 0xf4
  new Letters("bbweolt"), // 0xf5
  new Letters("bbweolp"), // 0xf6
  new Letters("bbweolh"), // 0xf7
  new Letters("bbweom"), // 0xf8
  new Letters("bbweob"), // 0xf9
  new Letters("bbweobs"), // 0xfa
  new Letters("bbweos"), // 0xfb
  new Letters("bbweoss"), // 0xfc
  new Letters("bbweong"), // 0xfd
  new Letters("bbweoj"), // 0xfe
  new Letters("bbweoc") // 0xff
  };
}