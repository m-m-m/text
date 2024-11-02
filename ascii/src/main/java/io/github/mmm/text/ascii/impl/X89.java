/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+89xx (CJK Unified Ideographs).
 */
final class X89 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Ji"), // 0x00
  new Word("Zhi"), // 0x01
  new Word("Gua"), // 0x02
  new Word("Ken"), // 0x03
  new Word("Che"), // 0x04
  new Word("Ti"), // 0x05
  new Word("Ti"), // 0x06
  new Word("Fu"), // 0x07
  new Word("Chong"), // 0x08
  new Word("Xie"), // 0x09
  new Word("Bian"), // 0x0a
  new Word("Die"), // 0x0b
  new Word("Kun"), // 0x0c
  new Word("Duan"), // 0x0d
  new Word("Xiu"), // 0x0e
  new Word("Xiu"), // 0x0f
  new Word("He"), // 0x10
  new Word("Yuan"), // 0x11
  new Word("Bao"), // 0x12
  new Word("Bao"), // 0x13
  new Word("Fu"), // 0x14
  new Word("Yu"), // 0x15
  new Word("Tuan"), // 0x16
  new Word("Yan"), // 0x17
  new Word("Hui"), // 0x18
  new Word("Bei"), // 0x19
  new Word("Chu"), // 0x1a
  new Word("Lu"), // 0x1b
  new Word("Ena"), // 0x1c
  new Word("Hitoe"), // 0x1d
  new Word("Yun"), // 0x1e
  new Word("Da"), // 0x1f
  new Word("Gou"), // 0x20
  new Word("Da"), // 0x21
  new Word("Huai"), // 0x22
  new Word("Rong"), // 0x23
  new Word("Yuan"), // 0x24
  new Word("Ru"), // 0x25
  new Word("Nai"), // 0x26
  new Word("Jiong"), // 0x27
  new Word("Suo"), // 0x28
  new Word("Ban"), // 0x29
  new Word("Tun"), // 0x2a
  new Word("Chi"), // 0x2b
  new Word("Sang"), // 0x2c
  new Word("Niao"), // 0x2d
  new Word("Ying"), // 0x2e
  new Word("Jie"), // 0x2f
  new Word("Qian"), // 0x30
  new Word("Huai"), // 0x31
  new Word("Ku"), // 0x32
  new Word("Lian"), // 0x33
  new Word("Bao"), // 0x34
  new Word("Li"), // 0x35
  new Word("Zhe"), // 0x36
  new Word("Shi"), // 0x37
  new Word("Lu"), // 0x38
  new Word("Yi"), // 0x39
  new Word("Die"), // 0x3a
  new Word("Xie"), // 0x3b
  new Word("Xian"), // 0x3c
  new Word("Wei"), // 0x3d
  new Word("Biao"), // 0x3e
  new Word("Cao"), // 0x3f
  new Word("Ji"), // 0x40
  new Word("Jiang"), // 0x41
  new Word("Sen"), // 0x42
  new Word("Bao"), // 0x43
  new Word("Xiang"), // 0x44
  new Word("Chihaya"), // 0x45
  new Word("Pu"), // 0x46
  new Word("Jian"), // 0x47
  new Word("Zhuan"), // 0x48
  new Word("Jian"), // 0x49
  new Word("Zui"), // 0x4a
  new Word("Ji"), // 0x4b
  new Word("Dan"), // 0x4c
  new Word("Za"), // 0x4d
  new Word("Fan"), // 0x4e
  new Word("Bo"), // 0x4f
  new Word("Xiang"), // 0x50
  new Word("Xin"), // 0x51
  new Word("Bie"), // 0x52
  new Word("Rao"), // 0x53
  new Word("Man"), // 0x54
  new Word("Lan"), // 0x55
  new Word("Ao"), // 0x56
  new Word("Duo"), // 0x57
  new Word("Gui"), // 0x58
  new Word("Cao"), // 0x59
  new Word("Sui"), // 0x5a
  new Word("Nong"), // 0x5b
  new Word("Chan"), // 0x5c
  new Word("Lian"), // 0x5d
  new Word("Bi"), // 0x5e
  new Word("Jin"), // 0x5f
  new Word("Dang"), // 0x60
  new Word("Shu"), // 0x61
  new Word("Tan"), // 0x62
  new Word("Bi"), // 0x63
  new Word("Lan"), // 0x64
  new Word("Pu"), // 0x65
  new Word("Ru"), // 0x66
  new Word("Zhi"), // 0x67
  null, // 0x68
  new Word("Shu"), // 0x69
  new Word("Wa"), // 0x6a
  new Word("Shi"), // 0x6b
  new Word("Bai"), // 0x6c
  new Word("Xie"), // 0x6d
  new Word("Bo"), // 0x6e
  new Word("Chen"), // 0x6f
  new Word("Lai"), // 0x70
  new Word("Long"), // 0x71
  new Word("Xi"), // 0x72
  new Word("Xian"), // 0x73
  new Word("Lan"), // 0x74
  new Word("Zhe"), // 0x75
  new Word("Dai"), // 0x76
  new Word("Tasuki"), // 0x77
  new Word("Zan"), // 0x78
  new Word("Shi"), // 0x79
  new Word("Jian"), // 0x7a
  new Word("Pan"), // 0x7b
  new Word("Yi"), // 0x7c
  new Word("Ran"), // 0x7d
  new Word("Ya"), // 0x7e
  new Word("Xi"), // 0x7f
  new Word("Xi"), // 0x80
  new Word("Yao"), // 0x81
  new Word("Feng"), // 0x82
  new Word("Tan"), // 0x83
  null, // 0x84
  new Word("Biao"), // 0x85
  new Word("Fu"), // 0x86
  new Word("Ba"), // 0x87
  new Word("He"), // 0x88
  new Word("Ji"), // 0x89
  new Word("Ji"), // 0x8a
  new Word("Jian"), // 0x8b
  new Word("Guan"), // 0x8c
  new Word("Bian"), // 0x8d
  new Word("Yan"), // 0x8e
  new Word("Gui"), // 0x8f
  new Word("Jue"), // 0x90
  new Word("Pian"), // 0x91
  new Word("Mao"), // 0x92
  new Word("Mi"), // 0x93
  new Word("Mi"), // 0x94
  new Word("Mie"), // 0x95
  new Word("Shi"), // 0x96
  new Word("Si"), // 0x97
  new Word("Zhan"), // 0x98
  new Word("Luo"), // 0x99
  new Word("Jue"), // 0x9a
  new Word("Mi"), // 0x9b
  new Word("Tiao"), // 0x9c
  new Word("Lian"), // 0x9d
  new Word("Yao"), // 0x9e
  new Word("Zhi"), // 0x9f
  new Word("Jun"), // 0xa0
  new Word("Xi"), // 0xa1
  new Word("Shan"), // 0xa2
  new Word("Wei"), // 0xa3
  new Word("Xi"), // 0xa4
  new Word("Tian"), // 0xa5
  new Word("Yu"), // 0xa6
  new Word("Lan"), // 0xa7
  new Word("E"), // 0xa8
  new Word("Du"), // 0xa9
  new Word("Qin"), // 0xaa
  new Word("Pang"), // 0xab
  new Word("Ji"), // 0xac
  new Word("Ming"), // 0xad
  new Word("Ying"), // 0xae
  new Word("Gou"), // 0xaf
  new Word("Qu"), // 0xb0
  new Word("Zhan"), // 0xb1
  new Word("Jin"), // 0xb2
  new Word("Guan"), // 0xb3
  new Word("Deng"), // 0xb4
  new Word("Jian"), // 0xb5
  new Word("Luo"), // 0xb6
  new Word("Qu"), // 0xb7
  new Word("Jian"), // 0xb8
  new Word("Wei"), // 0xb9
  new Word("Jue"), // 0xba
  new Word("Qu"), // 0xbb
  new Word("Luo"), // 0xbc
  new Word("Lan"), // 0xbd
  new Word("Shen"), // 0xbe
  new Word("Di"), // 0xbf
  new Word("Guan"), // 0xc0
  new Word("Jian"), // 0xc1
  new Word("Guan"), // 0xc2
  new Word("Yan"), // 0xc3
  new Word("Gui"), // 0xc4
  new Word("Mi"), // 0xc5
  new Word("Shi"), // 0xc6
  new Word("Zhan"), // 0xc7
  new Word("Lan"), // 0xc8
  new Word("Jue"), // 0xc9
  new Word("Ji"), // 0xca
  new Word("Xi"), // 0xcb
  new Word("Di"), // 0xcc
  new Word("Tian"), // 0xcd
  new Word("Yu"), // 0xce
  new Word("Gou"), // 0xcf
  new Word("Jin"), // 0xd0
  new Word("Qu"), // 0xd1
  new Word("Jiao"), // 0xd2
  new Word("Jiu"), // 0xd3
  new Word("Jin"), // 0xd4
  new Word("Cu"), // 0xd5
  new Word("Jue"), // 0xd6
  new Word("Zhi"), // 0xd7
  new Word("Chao"), // 0xd8
  new Word("Ji"), // 0xd9
  new Word("Gu"), // 0xda
  new Word("Dan"), // 0xdb
  new Word("Zui"), // 0xdc
  new Word("Di"), // 0xdd
  new Word("Shang"), // 0xde
  new Word("Hua"), // 0xdf
  new Word("Quan"), // 0xe0
  new Word("Ge"), // 0xe1
  new Word("Chi"), // 0xe2
  new Word("Jie"), // 0xe3
  new Word("Gui"), // 0xe4
  new Word("Gong"), // 0xe5
  new Word("Hong"), // 0xe6
  new Word("Jie"), // 0xe7
  new Word("Hun"), // 0xe8
  new Word("Qiu"), // 0xe9
  new Word("Xing"), // 0xea
  new Word("Su"), // 0xeb
  new Word("Ni"), // 0xec
  new Word("Ji"), // 0xed
  new Word("Lu"), // 0xee
  new Word("Zhi"), // 0xef
  new Word("Zha"), // 0xf0
  new Word("Bi"), // 0xf1
  new Word("Xing"), // 0xf2
  new Word("Hu"), // 0xf3
  new Word("Shang"), // 0xf4
  new Word("Gong"), // 0xf5
  new Word("Zhi"), // 0xf6
  new Word("Xue"), // 0xf7
  new Word("Chu"), // 0xf8
  new Word("Xi"), // 0xf9
  new Word("Yi"), // 0xfa
  new Word("Lu"), // 0xfb
  new Word("Jue"), // 0xfc
  new Word("Xi"), // 0xfd
  new Word("Yan"), // 0xfe
  new Word("Xi") // 0xff
  };
}