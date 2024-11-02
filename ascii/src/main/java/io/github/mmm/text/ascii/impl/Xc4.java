/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+C4xx (Hangul Syllables for Korean).
 */
final class Xc4 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("sswals"), // 0x00
  new Letters("sswalt"), // 0x01
  new Letters("sswalp"), // 0x02
  new Letters("sswalh"), // 0x03
  new Letters("sswam"), // 0x04
  new Letters("sswab"), // 0x05
  new Letters("sswabs"), // 0x06
  new Letters("sswas"), // 0x07
  new Letters("sswass"), // 0x08
  new Letters("sswang"), // 0x09
  new Letters("sswaj"), // 0x0a
  new Letters("sswac"), // 0x0b
  new Letters("sswak"), // 0x0c
  new Letters("sswat"), // 0x0d
  new Letters("sswap"), // 0x0e
  new Letters("sswah"), // 0x0f
  new Letters("sswae"), // 0x10
  new Letters("sswaeg"), // 0x11
  new Letters("sswaegg"), // 0x12
  new Letters("sswaegs"), // 0x13
  new Letters("sswaen"), // 0x14
  new Letters("sswaenj"), // 0x15
  new Letters("sswaenh"), // 0x16
  new Letters("sswaed"), // 0x17
  new Letters("sswael"), // 0x18
  new Letters("sswaelg"), // 0x19
  new Letters("sswaelm"), // 0x1a
  new Letters("sswaelb"), // 0x1b
  new Letters("sswaels"), // 0x1c
  new Letters("sswaelt"), // 0x1d
  new Letters("sswaelp"), // 0x1e
  new Letters("sswaelh"), // 0x1f
  new Letters("sswaem"), // 0x20
  new Letters("sswaeb"), // 0x21
  new Letters("sswaebs"), // 0x22
  new Letters("sswaes"), // 0x23
  new Letters("sswaess"), // 0x24
  new Letters("sswaeng"), // 0x25
  new Letters("sswaej"), // 0x26
  new Letters("sswaec"), // 0x27
  new Letters("sswaek"), // 0x28
  new Letters("sswaet"), // 0x29
  new Letters("sswaep"), // 0x2a
  new Letters("sswaeh"), // 0x2b
  new Letters("ssoe"), // 0x2c
  new Letters("ssoeg"), // 0x2d
  new Letters("ssoegg"), // 0x2e
  new Letters("ssoegs"), // 0x2f
  new Letters("ssoen"), // 0x30
  new Letters("ssoenj"), // 0x31
  new Letters("ssoenh"), // 0x32
  new Letters("ssoed"), // 0x33
  new Letters("ssoel"), // 0x34
  new Letters("ssoelg"), // 0x35
  new Letters("ssoelm"), // 0x36
  new Letters("ssoelb"), // 0x37
  new Letters("ssoels"), // 0x38
  new Letters("ssoelt"), // 0x39
  new Letters("ssoelp"), // 0x3a
  new Letters("ssoelh"), // 0x3b
  new Letters("ssoem"), // 0x3c
  new Letters("ssoeb"), // 0x3d
  new Letters("ssoebs"), // 0x3e
  new Letters("ssoes"), // 0x3f
  new Letters("ssoess"), // 0x40
  new Letters("ssoeng"), // 0x41
  new Letters("ssoej"), // 0x42
  new Letters("ssoec"), // 0x43
  new Letters("ssoek"), // 0x44
  new Letters("ssoet"), // 0x45
  new Letters("ssoep"), // 0x46
  new Letters("ssoeh"), // 0x47
  new Letters("ssyo"), // 0x48
  new Letters("ssyog"), // 0x49
  new Letters("ssyogg"), // 0x4a
  new Letters("ssyogs"), // 0x4b
  new Letters("ssyon"), // 0x4c
  new Letters("ssyonj"), // 0x4d
  new Letters("ssyonh"), // 0x4e
  new Letters("ssyod"), // 0x4f
  new Letters("ssyol"), // 0x50
  new Letters("ssyolg"), // 0x51
  new Letters("ssyolm"), // 0x52
  new Letters("ssyolb"), // 0x53
  new Letters("ssyols"), // 0x54
  new Letters("ssyolt"), // 0x55
  new Letters("ssyolp"), // 0x56
  new Letters("ssyolh"), // 0x57
  new Letters("ssyom"), // 0x58
  new Letters("ssyob"), // 0x59
  new Letters("ssyobs"), // 0x5a
  new Letters("ssyos"), // 0x5b
  new Letters("ssyoss"), // 0x5c
  new Letters("ssyong"), // 0x5d
  new Letters("ssyoj"), // 0x5e
  new Letters("ssyoc"), // 0x5f
  new Letters("ssyok"), // 0x60
  new Letters("ssyot"), // 0x61
  new Letters("ssyop"), // 0x62
  new Letters("ssyoh"), // 0x63
  new Letters("ssu"), // 0x64
  new Letters("ssug"), // 0x65
  new Letters("ssugg"), // 0x66
  new Letters("ssugs"), // 0x67
  new Letters("ssun"), // 0x68
  new Letters("ssunj"), // 0x69
  new Letters("ssunh"), // 0x6a
  new Letters("ssud"), // 0x6b
  new Letters("ssul"), // 0x6c
  new Letters("ssulg"), // 0x6d
  new Letters("ssulm"), // 0x6e
  new Letters("ssulb"), // 0x6f
  new Letters("ssuls"), // 0x70
  new Letters("ssult"), // 0x71
  new Letters("ssulp"), // 0x72
  new Letters("ssulh"), // 0x73
  new Letters("ssum"), // 0x74
  new Letters("ssub"), // 0x75
  new Letters("ssubs"), // 0x76
  new Letters("ssus"), // 0x77
  new Letters("ssuss"), // 0x78
  new Letters("ssung"), // 0x79
  new Letters("ssuj"), // 0x7a
  new Letters("ssuc"), // 0x7b
  new Letters("ssuk"), // 0x7c
  new Letters("ssut"), // 0x7d
  new Letters("ssup"), // 0x7e
  new Letters("ssuh"), // 0x7f
  new Letters("ssweo"), // 0x80
  new Letters("ssweog"), // 0x81
  new Letters("ssweogg"), // 0x82
  new Letters("ssweogs"), // 0x83
  new Letters("ssweon"), // 0x84
  new Letters("ssweonj"), // 0x85
  new Letters("ssweonh"), // 0x86
  new Letters("ssweod"), // 0x87
  new Letters("ssweol"), // 0x88
  new Letters("ssweolg"), // 0x89
  new Letters("ssweolm"), // 0x8a
  new Letters("ssweolb"), // 0x8b
  new Letters("ssweols"), // 0x8c
  new Letters("ssweolt"), // 0x8d
  new Letters("ssweolp"), // 0x8e
  new Letters("ssweolh"), // 0x8f
  new Letters("ssweom"), // 0x90
  new Letters("ssweob"), // 0x91
  new Letters("ssweobs"), // 0x92
  new Letters("ssweos"), // 0x93
  new Letters("ssweoss"), // 0x94
  new Letters("ssweong"), // 0x95
  new Letters("ssweoj"), // 0x96
  new Letters("ssweoc"), // 0x97
  new Letters("ssweok"), // 0x98
  new Letters("ssweot"), // 0x99
  new Letters("ssweop"), // 0x9a
  new Letters("ssweoh"), // 0x9b
  new Letters("sswe"), // 0x9c
  new Letters("ssweg"), // 0x9d
  new Letters("sswegg"), // 0x9e
  new Letters("sswegs"), // 0x9f
  new Letters("sswen"), // 0xa0
  new Letters("sswenj"), // 0xa1
  new Letters("sswenh"), // 0xa2
  new Letters("sswed"), // 0xa3
  new Letters("sswel"), // 0xa4
  new Letters("sswelg"), // 0xa5
  new Letters("sswelm"), // 0xa6
  new Letters("sswelb"), // 0xa7
  new Letters("sswels"), // 0xa8
  new Letters("sswelt"), // 0xa9
  new Letters("sswelp"), // 0xaa
  new Letters("sswelh"), // 0xab
  new Letters("sswem"), // 0xac
  new Letters("ssweb"), // 0xad
  new Letters("sswebs"), // 0xae
  new Letters("sswes"), // 0xaf
  new Letters("sswess"), // 0xb0
  new Letters("ssweng"), // 0xb1
  new Letters("sswej"), // 0xb2
  new Letters("sswec"), // 0xb3
  new Letters("sswek"), // 0xb4
  new Letters("sswet"), // 0xb5
  new Letters("sswep"), // 0xb6
  new Letters("ssweh"), // 0xb7
  new Letters("sswi"), // 0xb8
  new Letters("sswig"), // 0xb9
  new Letters("sswigg"), // 0xba
  new Letters("sswigs"), // 0xbb
  new Letters("sswin"), // 0xbc
  new Letters("sswinj"), // 0xbd
  new Letters("sswinh"), // 0xbe
  new Letters("sswid"), // 0xbf
  new Letters("sswil"), // 0xc0
  new Letters("sswilg"), // 0xc1
  new Letters("sswilm"), // 0xc2
  new Letters("sswilb"), // 0xc3
  new Letters("sswils"), // 0xc4
  new Letters("sswilt"), // 0xc5
  new Letters("sswilp"), // 0xc6
  new Letters("sswilh"), // 0xc7
  new Letters("sswim"), // 0xc8
  new Letters("sswib"), // 0xc9
  new Letters("sswibs"), // 0xca
  new Letters("sswis"), // 0xcb
  new Letters("sswiss"), // 0xcc
  new Letters("sswing"), // 0xcd
  new Letters("sswij"), // 0xce
  new Letters("sswic"), // 0xcf
  new Letters("sswik"), // 0xd0
  new Letters("sswit"), // 0xd1
  new Letters("sswip"), // 0xd2
  new Letters("sswih"), // 0xd3
  new Letters("ssyu"), // 0xd4
  new Letters("ssyug"), // 0xd5
  new Letters("ssyugg"), // 0xd6
  new Letters("ssyugs"), // 0xd7
  new Letters("ssyun"), // 0xd8
  new Letters("ssyunj"), // 0xd9
  new Letters("ssyunh"), // 0xda
  new Letters("ssyud"), // 0xdb
  new Letters("ssyul"), // 0xdc
  new Letters("ssyulg"), // 0xdd
  new Letters("ssyulm"), // 0xde
  new Letters("ssyulb"), // 0xdf
  new Letters("ssyuls"), // 0xe0
  new Letters("ssyult"), // 0xe1
  new Letters("ssyulp"), // 0xe2
  new Letters("ssyulh"), // 0xe3
  new Letters("ssyum"), // 0xe4
  new Letters("ssyub"), // 0xe5
  new Letters("ssyubs"), // 0xe6
  new Letters("ssyus"), // 0xe7
  new Letters("ssyuss"), // 0xe8
  new Letters("ssyung"), // 0xe9
  new Letters("ssyuj"), // 0xea
  new Letters("ssyuc"), // 0xeb
  new Letters("ssyuk"), // 0xec
  new Letters("ssyut"), // 0xed
  new Letters("ssyup"), // 0xee
  new Letters("ssyuh"), // 0xef
  new Letters("sseu"), // 0xf0
  new Letters("sseug"), // 0xf1
  new Letters("sseugg"), // 0xf2
  new Letters("sseugs"), // 0xf3
  new Letters("sseun"), // 0xf4
  new Letters("sseunj"), // 0xf5
  new Letters("sseunh"), // 0xf6
  new Letters("sseud"), // 0xf7
  new Letters("sseul"), // 0xf8
  new Letters("sseulg"), // 0xf9
  new Letters("sseulm"), // 0xfa
  new Letters("sseulb"), // 0xfb
  new Letters("sseuls"), // 0xfc
  new Letters("sseult"), // 0xfd
  new Letters("sseulp"), // 0xfe
  new Letters("sseulh") // 0xff
  };
}