/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+9Fxx (CJK Unified Ideographs).
 */
final class X9f extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Cu"), // 0x00
  new Word("Qu"), // 0x01
  new Word("Chao"), // 0x02
  new Word("Wa"), // 0x03
  new Word("Zhu"), // 0x04
  new Word("Zhi"), // 0x05
  new Word("Mang"), // 0x06
  new Word("Ao"), // 0x07
  new Word("Bie"), // 0x08
  new Word("Tuo"), // 0x09
  new Word("Bi"), // 0x0a
  new Word("Yuan"), // 0x0b
  new Word("Chao"), // 0x0c
  new Word("Tuo"), // 0x0d
  new Word("Ding"), // 0x0e
  new Word("Mi"), // 0x0f
  new Word("Nai"), // 0x10
  new Word("Ding"), // 0x11
  new Word("Zi"), // 0x12
  new Word("Gu"), // 0x13
  new Word("Gu"), // 0x14
  new Word("Dong"), // 0x15
  new Word("Fen"), // 0x16
  new Word("Tao"), // 0x17
  new Word("Yuan"), // 0x18
  new Word("Pi"), // 0x19
  new Word("Chang"), // 0x1a
  new Word("Gao"), // 0x1b
  new Word("Qi"), // 0x1c
  new Word("Yuan"), // 0x1d
  new Word("Tang"), // 0x1e
  new Word("Teng"), // 0x1f
  new Word("Shu"), // 0x20
  new Word("Shu"), // 0x21
  new Word("Fen"), // 0x22
  new Word("Fei"), // 0x23
  new Word("Wen"), // 0x24
  new Word("Ba"), // 0x25
  new Word("Diao"), // 0x26
  new Word("Tuo"), // 0x27
  new Word("Tong"), // 0x28
  new Word("Qu"), // 0x29
  new Word("Sheng"), // 0x2a
  new Word("Shi"), // 0x2b
  new Word("You"), // 0x2c
  new Word("Shi"), // 0x2d
  new Word("Ting"), // 0x2e
  new Word("Wu"), // 0x2f
  new Word("Nian"), // 0x30
  new Word("Jing"), // 0x31
  new Word("Hun"), // 0x32
  new Word("Ju"), // 0x33
  new Word("Yan"), // 0x34
  new Word("Tu"), // 0x35
  new Word("Ti"), // 0x36
  new Word("Xi"), // 0x37
  new Word("Xian"), // 0x38
  new Word("Yan"), // 0x39
  new Word("Lei"), // 0x3a
  new Word("Bi"), // 0x3b
  new Word("Yao"), // 0x3c
  new Word("Qiu"), // 0x3d
  new Word("Han"), // 0x3e
  new Word("Wu"), // 0x3f
  new Word("Wu"), // 0x40
  new Word("Hou"), // 0x41
  new Word("Xi"), // 0x42
  new Word("Ge"), // 0x43
  new Word("Zha"), // 0x44
  new Word("Xiu"), // 0x45
  new Word("Weng"), // 0x46
  new Word("Zha"), // 0x47
  new Word("Nong"), // 0x48
  new Word("Nang"), // 0x49
  new Word("Qi"), // 0x4a
  new Word("Zhai"), // 0x4b
  new Word("Ji"), // 0x4c
  new Word("Zi"), // 0x4d
  new Word("Ji"), // 0x4e
  new Word("Ji"), // 0x4f
  new Word("Qi"), // 0x50
  new Word("Ji"), // 0x51
  new Word("Chi"), // 0x52
  new Word("Chen"), // 0x53
  new Word("Chen"), // 0x54
  new Word("He"), // 0x55
  new Word("Ya"), // 0x56
  new Word("Ken"), // 0x57
  new Word("Xie"), // 0x58
  new Word("Pao"), // 0x59
  new Word("Cuo"), // 0x5a
  new Word("Shi"), // 0x5b
  new Word("Zi"), // 0x5c
  new Word("Chi"), // 0x5d
  new Word("Nian"), // 0x5e
  new Word("Ju"), // 0x5f
  new Word("Tiao"), // 0x60
  new Word("Ling"), // 0x61
  new Word("Ling"), // 0x62
  new Word("Chu"), // 0x63
  new Word("Quan"), // 0x64
  new Word("Xie"), // 0x65
  new Word("Ken"), // 0x66
  new Word("Nie"), // 0x67
  new Word("Jiu"), // 0x68
  new Word("Yao"), // 0x69
  new Word("Chuo"), // 0x6a
  new Word("Kun"), // 0x6b
  new Word("Yu"), // 0x6c
  new Word("Chu"), // 0x6d
  new Word("Yi"), // 0x6e
  new Word("Ni"), // 0x6f
  new Word("Cuo"), // 0x70
  new Word("Zou"), // 0x71
  new Word("Qu"), // 0x72
  new Word("Nen"), // 0x73
  new Word("Xian"), // 0x74
  new Word("Ou"), // 0x75
  new Word("E"), // 0x76
  new Word("Wo"), // 0x77
  new Word("Yi"), // 0x78
  new Word("Chuo"), // 0x79
  new Word("Zou"), // 0x7a
  new Word("Dian"), // 0x7b
  new Word("Chu"), // 0x7c
  new Word("Jin"), // 0x7d
  new Word("Ya"), // 0x7e
  new Word("Chi"), // 0x7f
  new Word("Chen"), // 0x80
  new Word("He"), // 0x81
  new Word("Ken"), // 0x82
  new Word("Ju"), // 0x83
  new Word("Ling"), // 0x84
  new Word("Pao"), // 0x85
  new Word("Tiao"), // 0x86
  new Word("Zi"), // 0x87
  new Word("Ken"), // 0x88
  new Word("Yu"), // 0x89
  new Word("Chuo"), // 0x8a
  new Word("Qu"), // 0x8b
  new Word("Wo"), // 0x8c
  new Word("Long"), // 0x8d
  new Word("Pang"), // 0x8e
  new Word("Gong"), // 0x8f
  new Word("Pang"), // 0x90
  new Word("Yan"), // 0x91
  new Word("Long"), // 0x92
  new Word("Long"), // 0x93
  new Word("Gong"), // 0x94
  new Word("Kan"), // 0x95
  new Word("Ta"), // 0x96
  new Word("Ling"), // 0x97
  new Word("Ta"), // 0x98
  new Word("Long"), // 0x99
  new Word("Gong"), // 0x9a
  new Word("Kan"), // 0x9b
  new Word("Gui"), // 0x9c
  new Word("Qiu"), // 0x9d
  new Word("Bie"), // 0x9e
  new Word("Gui"), // 0x9f
  new Word("Yue"), // 0xa0
  new Word("Chui"), // 0xa1
  new Word("He"), // 0xa2
  new Word("Jue"), // 0xa3
  new Word("Xie"), // 0xa4
  new Word("Yu"), // 0xa5
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