/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+D7xx (Hangul Syllables for Korean, Hangul Jamo Extended-B).
 */
final class Xd7 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("hwen"), // 0x00
  new Letters("hwenj"), // 0x01
  new Letters("hwenh"), // 0x02
  new Letters("hwed"), // 0x03
  new Letters("hwel"), // 0x04
  new Letters("hwelg"), // 0x05
  new Letters("hwelm"), // 0x06
  new Letters("hwelb"), // 0x07
  new Letters("hwels"), // 0x08
  new Letters("hwelt"), // 0x09
  new Letters("hwelp"), // 0x0a
  new Letters("hwelh"), // 0x0b
  new Letters("hwem"), // 0x0c
  new Letters("hweb"), // 0x0d
  new Letters("hwebs"), // 0x0e
  new Letters("hwes"), // 0x0f
  new Letters("hwess"), // 0x10
  new Letters("hweng"), // 0x11
  new Letters("hwej"), // 0x12
  new Letters("hwec"), // 0x13
  new Letters("hwek"), // 0x14
  new Letters("hwet"), // 0x15
  new Letters("hwep"), // 0x16
  new Letters("hweh"), // 0x17
  new Letters("hwi"), // 0x18
  new Letters("hwig"), // 0x19
  new Letters("hwigg"), // 0x1a
  new Letters("hwigs"), // 0x1b
  new Letters("hwin"), // 0x1c
  new Letters("hwinj"), // 0x1d
  new Letters("hwinh"), // 0x1e
  new Letters("hwid"), // 0x1f
  new Letters("hwil"), // 0x20
  new Letters("hwilg"), // 0x21
  new Letters("hwilm"), // 0x22
  new Letters("hwilb"), // 0x23
  new Letters("hwils"), // 0x24
  new Letters("hwilt"), // 0x25
  new Letters("hwilp"), // 0x26
  new Letters("hwilh"), // 0x27
  new Letters("hwim"), // 0x28
  new Letters("hwib"), // 0x29
  new Letters("hwibs"), // 0x2a
  new Letters("hwis"), // 0x2b
  new Letters("hwiss"), // 0x2c
  new Letters("hwing"), // 0x2d
  new Letters("hwij"), // 0x2e
  new Letters("hwic"), // 0x2f
  new Letters("hwik"), // 0x30
  new Letters("hwit"), // 0x31
  new Letters("hwip"), // 0x32
  new Letters("hwih"), // 0x33
  new Letters("hyu"), // 0x34
  new Letters("hyug"), // 0x35
  new Letters("hyugg"), // 0x36
  new Letters("hyugs"), // 0x37
  new Letters("hyun"), // 0x38
  new Letters("hyunj"), // 0x39
  new Letters("hyunh"), // 0x3a
  new Letters("hyud"), // 0x3b
  new Letters("hyul"), // 0x3c
  new Letters("hyulg"), // 0x3d
  new Letters("hyulm"), // 0x3e
  new Letters("hyulb"), // 0x3f
  new Letters("hyuls"), // 0x40
  new Letters("hyult"), // 0x41
  new Letters("hyulp"), // 0x42
  new Letters("hyulh"), // 0x43
  new Letters("hyum"), // 0x44
  new Letters("hyub"), // 0x45
  new Letters("hyubs"), // 0x46
  new Letters("hyus"), // 0x47
  new Letters("hyuss"), // 0x48
  new Letters("hyung"), // 0x49
  new Letters("hyuj"), // 0x4a
  new Letters("hyuc"), // 0x4b
  new Letters("hyuk"), // 0x4c
  new Letters("hyut"), // 0x4d
  new Letters("hyup"), // 0x4e
  new Letters("hyuh"), // 0x4f
  new Letters("heu"), // 0x50
  new Letters("heug"), // 0x51
  new Letters("heugg"), // 0x52
  new Letters("heugs"), // 0x53
  new Letters("heun"), // 0x54
  new Letters("heunj"), // 0x55
  new Letters("heunh"), // 0x56
  new Letters("heud"), // 0x57
  new Letters("heul"), // 0x58
  new Letters("heulg"), // 0x59
  new Letters("heulm"), // 0x5a
  new Letters("heulb"), // 0x5b
  new Letters("heuls"), // 0x5c
  new Letters("heult"), // 0x5d
  new Letters("heulp"), // 0x5e
  new Letters("heulh"), // 0x5f
  new Letters("heum"), // 0x60
  new Letters("heub"), // 0x61
  new Letters("heubs"), // 0x62
  new Letters("heus"), // 0x63
  new Letters("heuss"), // 0x64
  new Letters("heung"), // 0x65
  new Letters("heuj"), // 0x66
  new Letters("heuc"), // 0x67
  new Letters("heuk"), // 0x68
  new Letters("heut"), // 0x69
  new Letters("heup"), // 0x6a
  new Letters("heuh"), // 0x6b
  new Letters("hyi"), // 0x6c
  new Letters("hyig"), // 0x6d
  new Letters("hyigg"), // 0x6e
  new Letters("hyigs"), // 0x6f
  new Letters("hyin"), // 0x70
  new Letters("hyinj"), // 0x71
  new Letters("hyinh"), // 0x72
  new Letters("hyid"), // 0x73
  new Letters("hyil"), // 0x74
  new Letters("hyilg"), // 0x75
  new Letters("hyilm"), // 0x76
  new Letters("hyilb"), // 0x77
  new Letters("hyils"), // 0x78
  new Letters("hyilt"), // 0x79
  new Letters("hyilp"), // 0x7a
  new Letters("hyilh"), // 0x7b
  new Letters("hyim"), // 0x7c
  new Letters("hyib"), // 0x7d
  new Letters("hyibs"), // 0x7e
  new Letters("hyis"), // 0x7f
  new Letters("hyiss"), // 0x80
  new Letters("hying"), // 0x81
  new Letters("hyij"), // 0x82
  new Letters("hyic"), // 0x83
  new Letters("hyik"), // 0x84
  new Letters("hyit"), // 0x85
  new Letters("hyip"), // 0x86
  new Letters("hyih"), // 0x87
  LO_HI, // 0x88
  new Letters("hig"), // 0x89
  new Letters("higg"), // 0x8a
  new Letters("higs"), // 0x8b
  new Letters("hin"), // 0x8c
  new Letters("hinj"), // 0x8d
  new Letters("hinh"), // 0x8e
  new Letters("hid"), // 0x8f
  new Letters("hil"), // 0x90
  new Letters("hilg"), // 0x91
  new Letters("hilm"), // 0x92
  new Letters("hilb"), // 0x93
  new Letters("hils"), // 0x94
  new Letters("hilt"), // 0x95
  new Letters("hilp"), // 0x96
  new Letters("hilh"), // 0x97
  new Letters("him"), // 0x98
  new Letters("hib"), // 0x99
  new Letters("hibs"), // 0x9a
  new Letters("his"), // 0x9b
  new Letters("hiss"), // 0x9c
  new Letters("hing"), // 0x9d
  new Letters("hij"), // 0x9e
  new Letters("hic"), // 0x9f
  new Letters("hik"), // 0xa0
  new Letters("hit"), // 0xa1
  new Letters("hip"), // 0xa2
  new Letters("hih"), // 0xa3
  null, // 0xa4
  null, // 0xa5
  null, // 0xa6
  null, // 0xa7
  null, // 0xa8
  null, // 0xa9
  null, // 0xaa
  null, // 0xab
  null, // 0xac
  null, // 0xad
  null, // 0xae
  null, // 0xaf
  null, // 0xb0
  null, // 0xb1
  null, // 0xb2
  null, // 0xb3
  null, // 0xb4
  null, // 0xb5
  null, // 0xb6
  null, // 0xb7
  null, // 0xb8
  null, // 0xb9
  null, // 0xba
  null, // 0xbb
  null, // 0xbc
  null, // 0xbd
  null, // 0xbe
  null, // 0xbf
  null, // 0xc0
  null, // 0xc1
  null, // 0xc2
  null, // 0xc3
  null, // 0xc4
  null, // 0xc5
  null, // 0xc6
  null, // 0xc7
  null, // 0xc8
  null, // 0xc9
  null, // 0xca
  null, // 0xcb
  null, // 0xcc
  null, // 0xcd
  null, // 0xce
  null, // 0xcf
  null, // 0xd0
  null, // 0xd1
  null, // 0xd2
  null, // 0xd3
  null, // 0xd4
  null, // 0xd5
  null, // 0xd6
  null, // 0xd7
  null, // 0xd8
  null, // 0xd9
  null, // 0xda
  null, // 0xdb
  null, // 0xdc
  null, // 0xdd
  null, // 0xde
  null, // 0xdf
  null, // 0xe0
  null, // 0xe1
  null, // 0xe2
  null, // 0xe3
  null, // 0xe4
  null, // 0xe5
  null, // 0xe6
  null, // 0xe7
  null, // 0xe8
  null, // 0xe9
  null, // 0xea
  null, // 0xeb
  null, // 0xec
  null, // 0xed
  null, // 0xee
  null, // 0xef
  null, // 0xf0
  null, // 0xf1
  null, // 0xf2
  null, // 0xf3
  null, // 0xf4
  null, // 0xf5
  null, // 0xf6
  null, // 0xf7
  null, // 0xf8
  null, // 0xf9
  null, // 0xfa
  null, // 0xfb
  null, // 0xfc
  null, // 0xfd
  null, // 0xfe
  null, // 0xff
  };
}