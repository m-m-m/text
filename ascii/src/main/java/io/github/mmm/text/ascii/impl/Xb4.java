/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+B4xx (Hangul Syllables for Korean).
 */
final class Xb4 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("dwaen"), // 0x00
  new Letters("dwaenj"), // 0x01
  new Letters("dwaenh"), // 0x02
  new Letters("dwaed"), // 0x03
  new Letters("dwael"), // 0x04
  new Letters("dwaelg"), // 0x05
  new Letters("dwaelm"), // 0x06
  new Letters("dwaelb"), // 0x07
  new Letters("dwaels"), // 0x08
  new Letters("dwaelt"), // 0x09
  new Letters("dwaelp"), // 0x0a
  new Letters("dwaelh"), // 0x0b
  new Letters("dwaem"), // 0x0c
  new Letters("dwaeb"), // 0x0d
  new Letters("dwaebs"), // 0x0e
  new Letters("dwaes"), // 0x0f
  new Letters("dwaess"), // 0x10
  new Letters("dwaeng"), // 0x11
  new Letters("dwaej"), // 0x12
  new Letters("dwaec"), // 0x13
  new Letters("dwaek"), // 0x14
  new Letters("dwaet"), // 0x15
  new Letters("dwaep"), // 0x16
  new Letters("dwaeh"), // 0x17
  new Letters("doe"), // 0x18
  new Letters("doeg"), // 0x19
  new Letters("doegg"), // 0x1a
  new Letters("doegs"), // 0x1b
  new Letters("doen"), // 0x1c
  new Letters("doenj"), // 0x1d
  new Letters("doenh"), // 0x1e
  new Letters("doed"), // 0x1f
  new Letters("doel"), // 0x20
  new Letters("doelg"), // 0x21
  new Letters("doelm"), // 0x22
  new Letters("doelb"), // 0x23
  new Letters("doels"), // 0x24
  new Letters("doelt"), // 0x25
  new Letters("doelp"), // 0x26
  new Letters("doelh"), // 0x27
  new Letters("doem"), // 0x28
  new Letters("doeb"), // 0x29
  new Letters("doebs"), // 0x2a
  new Letters("does"), // 0x2b
  new Letters("doess"), // 0x2c
  new Letters("doeng"), // 0x2d
  new Letters("doej"), // 0x2e
  new Letters("doec"), // 0x2f
  new Letters("doek"), // 0x30
  new Letters("doet"), // 0x31
  new Letters("doep"), // 0x32
  new Letters("doeh"), // 0x33
  new Letters("dyo"), // 0x34
  new Letters("dyog"), // 0x35
  new Letters("dyogg"), // 0x36
  new Letters("dyogs"), // 0x37
  new Letters("dyon"), // 0x38
  new Letters("dyonj"), // 0x39
  new Letters("dyonh"), // 0x3a
  new Letters("dyod"), // 0x3b
  new Letters("dyol"), // 0x3c
  new Letters("dyolg"), // 0x3d
  new Letters("dyolm"), // 0x3e
  new Letters("dyolb"), // 0x3f
  new Letters("dyols"), // 0x40
  new Letters("dyolt"), // 0x41
  new Letters("dyolp"), // 0x42
  new Letters("dyolh"), // 0x43
  new Letters("dyom"), // 0x44
  new Letters("dyob"), // 0x45
  new Letters("dyobs"), // 0x46
  new Letters("dyos"), // 0x47
  new Letters("dyoss"), // 0x48
  new Letters("dyong"), // 0x49
  new Letters("dyoj"), // 0x4a
  new Letters("dyoc"), // 0x4b
  new Letters("dyok"), // 0x4c
  new Letters("dyot"), // 0x4d
  new Letters("dyop"), // 0x4e
  new Letters("dyoh"), // 0x4f
  LO_DU, // 0x50
  new Letters("dug"), // 0x51
  new Letters("dugg"), // 0x52
  new Letters("dugs"), // 0x53
  new Letters("dun"), // 0x54
  new Letters("dunj"), // 0x55
  new Letters("dunh"), // 0x56
  new Letters("dud"), // 0x57
  new Letters("dul"), // 0x58
  new Letters("dulg"), // 0x59
  new Letters("dulm"), // 0x5a
  new Letters("dulb"), // 0x5b
  new Letters("duls"), // 0x5c
  new Letters("dult"), // 0x5d
  new Letters("dulp"), // 0x5e
  new Letters("dulh"), // 0x5f
  new Letters("dum"), // 0x60
  new Letters("dub"), // 0x61
  new Letters("dubs"), // 0x62
  new Letters("dus"), // 0x63
  new Letters("duss"), // 0x64
  new Letters("dung"), // 0x65
  new Letters("duj"), // 0x66
  new Letters("duc"), // 0x67
  new Letters("duk"), // 0x68
  new Letters("dut"), // 0x69
  new Letters("dup"), // 0x6a
  new Letters("duh"), // 0x6b
  new Letters("dweo"), // 0x6c
  new Letters("dweog"), // 0x6d
  new Letters("dweogg"), // 0x6e
  new Letters("dweogs"), // 0x6f
  new Letters("dweon"), // 0x70
  new Letters("dweonj"), // 0x71
  new Letters("dweonh"), // 0x72
  new Letters("dweod"), // 0x73
  new Letters("dweol"), // 0x74
  new Letters("dweolg"), // 0x75
  new Letters("dweolm"), // 0x76
  new Letters("dweolb"), // 0x77
  new Letters("dweols"), // 0x78
  new Letters("dweolt"), // 0x79
  new Letters("dweolp"), // 0x7a
  new Letters("dweolh"), // 0x7b
  new Letters("dweom"), // 0x7c
  new Letters("dweob"), // 0x7d
  new Letters("dweobs"), // 0x7e
  new Letters("dweos"), // 0x7f
  new Letters("dweoss"), // 0x80
  new Letters("dweong"), // 0x81
  new Letters("dweoj"), // 0x82
  new Letters("dweoc"), // 0x83
  new Letters("dweok"), // 0x84
  new Letters("dweot"), // 0x85
  new Letters("dweop"), // 0x86
  new Letters("dweoh"), // 0x87
  new Letters("dwe"), // 0x88
  new Letters("dweg"), // 0x89
  new Letters("dwegg"), // 0x8a
  new Letters("dwegs"), // 0x8b
  new Letters("dwen"), // 0x8c
  new Letters("dwenj"), // 0x8d
  new Letters("dwenh"), // 0x8e
  new Letters("dwed"), // 0x8f
  new Letters("dwel"), // 0x90
  new Letters("dwelg"), // 0x91
  new Letters("dwelm"), // 0x92
  new Letters("dwelb"), // 0x93
  new Letters("dwels"), // 0x94
  new Letters("dwelt"), // 0x95
  new Letters("dwelp"), // 0x96
  new Letters("dwelh"), // 0x97
  new Letters("dwem"), // 0x98
  new Letters("dweb"), // 0x99
  new Letters("dwebs"), // 0x9a
  new Letters("dwes"), // 0x9b
  new Letters("dwess"), // 0x9c
  new Letters("dweng"), // 0x9d
  new Letters("dwej"), // 0x9e
  new Letters("dwec"), // 0x9f
  new Letters("dwek"), // 0xa0
  new Letters("dwet"), // 0xa1
  new Letters("dwep"), // 0xa2
  new Letters("dweh"), // 0xa3
  new Letters("dwi"), // 0xa4
  new Letters("dwig"), // 0xa5
  new Letters("dwigg"), // 0xa6
  new Letters("dwigs"), // 0xa7
  new Letters("dwin"), // 0xa8
  new Letters("dwinj"), // 0xa9
  new Letters("dwinh"), // 0xaa
  new Letters("dwid"), // 0xab
  new Letters("dwil"), // 0xac
  new Letters("dwilg"), // 0xad
  new Letters("dwilm"), // 0xae
  new Letters("dwilb"), // 0xaf
  new Letters("dwils"), // 0xb0
  new Letters("dwilt"), // 0xb1
  new Letters("dwilp"), // 0xb2
  new Letters("dwilh"), // 0xb3
  new Letters("dwim"), // 0xb4
  new Letters("dwib"), // 0xb5
  new Letters("dwibs"), // 0xb6
  new Letters("dwis"), // 0xb7
  new Letters("dwiss"), // 0xb8
  new Letters("dwing"), // 0xb9
  new Letters("dwij"), // 0xba
  new Letters("dwic"), // 0xbb
  new Letters("dwik"), // 0xbc
  new Letters("dwit"), // 0xbd
  new Letters("dwip"), // 0xbe
  new Letters("dwih"), // 0xbf
  new Letters("dyu"), // 0xc0
  new Letters("dyug"), // 0xc1
  new Letters("dyugg"), // 0xc2
  new Letters("dyugs"), // 0xc3
  new Letters("dyun"), // 0xc4
  new Letters("dyunj"), // 0xc5
  new Letters("dyunh"), // 0xc6
  new Letters("dyud"), // 0xc7
  new Letters("dyul"), // 0xc8
  new Letters("dyulg"), // 0xc9
  new Letters("dyulm"), // 0xca
  new Letters("dyulb"), // 0xcb
  new Letters("dyuls"), // 0xcc
  new Letters("dyult"), // 0xcd
  new Letters("dyulp"), // 0xce
  new Letters("dyulh"), // 0xcf
  new Letters("dyum"), // 0xd0
  new Letters("dyub"), // 0xd1
  new Letters("dyubs"), // 0xd2
  new Letters("dyus"), // 0xd3
  new Letters("dyuss"), // 0xd4
  new Letters("dyung"), // 0xd5
  new Letters("dyuj"), // 0xd6
  new Letters("dyuc"), // 0xd7
  new Letters("dyuk"), // 0xd8
  new Letters("dyut"), // 0xd9
  new Letters("dyup"), // 0xda
  new Letters("dyuh"), // 0xdb
  new Letters("deu"), // 0xdc
  new Letters("deug"), // 0xdd
  new Letters("deugg"), // 0xde
  new Letters("deugs"), // 0xdf
  new Letters("deun"), // 0xe0
  new Letters("deunj"), // 0xe1
  new Letters("deunh"), // 0xe2
  new Letters("deud"), // 0xe3
  new Letters("deul"), // 0xe4
  new Letters("deulg"), // 0xe5
  new Letters("deulm"), // 0xe6
  new Letters("deulb"), // 0xe7
  new Letters("deuls"), // 0xe8
  new Letters("deult"), // 0xe9
  new Letters("deulp"), // 0xea
  new Letters("deulh"), // 0xeb
  new Letters("deum"), // 0xec
  new Letters("deub"), // 0xed
  new Letters("deubs"), // 0xee
  new Letters("deus"), // 0xef
  new Letters("deuss"), // 0xf0
  new Letters("deung"), // 0xf1
  new Letters("deuj"), // 0xf2
  new Letters("deuc"), // 0xf3
  new Letters("deuk"), // 0xf4
  new Letters("deut"), // 0xf5
  new Letters("deup"), // 0xf6
  new Letters("deuh"), // 0xf7
  new Letters("dyi"), // 0xf8
  new Letters("dyig"), // 0xf9
  new Letters("dyigg"), // 0xfa
  new Letters("dyigs"), // 0xfb
  new Letters("dyin"), // 0xfc
  new Letters("dyinj"), // 0xfd
  new Letters("dyinh"), // 0xfe
  new Letters("dyid") // 0xff
  };
}