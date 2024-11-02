/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+5Exx (CJK Unified Ideographs).
 */
final class X5e extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Za"), // 0x00
  new Word("Bi"), // 0x01
  new Word("Shi"), // 0x02
  new Word("Bu"), // 0x03
  new Word("Ding"), // 0x04
  new Word("Shuai"), // 0x05
  new Word("Fan"), // 0x06
  new Word("Nie"), // 0x07
  new Word("Shi"), // 0x08
  new Word("Fen"), // 0x09
  new Word("Pa"), // 0x0a
  new Word("Zhi"), // 0x0b
  new Word("Xi"), // 0x0c
  new Word("Hu"), // 0x0d
  new Word("Dan"), // 0x0e
  new Word("Wei"), // 0x0f
  new Word("Zhang"), // 0x10
  new Word("Tang"), // 0x11
  new Word("Dai"), // 0x12
  new Word("Ma"), // 0x13
  new Word("Pei"), // 0x14
  new Word("Pa"), // 0x15
  new Word("Tie"), // 0x16
  new Word("Fu"), // 0x17
  new Word("Lian"), // 0x18
  new Word("Zhi"), // 0x19
  new Word("Zhou"), // 0x1a
  new Word("Bo"), // 0x1b
  new Word("Zhi"), // 0x1c
  new Word("Di"), // 0x1d
  new Word("Mo"), // 0x1e
  new Word("Yi"), // 0x1f
  new Word("Yi"), // 0x20
  new Word("Ping"), // 0x21
  new Word("Qia"), // 0x22
  new Word("Juan"), // 0x23
  new Word("Ru"), // 0x24
  new Word("Shuai"), // 0x25
  new Word("Dai"), // 0x26
  new Word("Zheng"), // 0x27
  new Word("Shui"), // 0x28
  new Word("Qiao"), // 0x29
  new Word("Zhen"), // 0x2a
  new Word("Shi"), // 0x2b
  new Word("Qun"), // 0x2c
  new Word("Xi"), // 0x2d
  new Word("Bang"), // 0x2e
  new Word("Dai"), // 0x2f
  new Word("Gui"), // 0x30
  new Word("Chou"), // 0x31
  new Word("Ping"), // 0x32
  new Word("Zhang"), // 0x33
  new Word("Sha"), // 0x34
  new Word("Wan"), // 0x35
  new Word("Dai"), // 0x36
  new Word("Wei"), // 0x37
  new Word("Chang"), // 0x38
  new Word("Sha"), // 0x39
  new Word("Qi"), // 0x3a
  new Word("Ze"), // 0x3b
  new Word("Guo"), // 0x3c
  new Word("Mao"), // 0x3d
  new Word("Du"), // 0x3e
  new Word("Hou"), // 0x3f
  new Word("Zheng"), // 0x40
  new Word("Xu"), // 0x41
  new Word("Mi"), // 0x42
  new Word("Wei"), // 0x43
  new Word("Wo"), // 0x44
  new Word("Fu"), // 0x45
  new Word("Yi"), // 0x46
  new Word("Bang"), // 0x47
  new Word("Ping"), // 0x48
  new Word("Tazuna"), // 0x49
  new Word("Gong"), // 0x4a
  new Word("Pan"), // 0x4b
  new Word("Huang"), // 0x4c
  new Word("Dao"), // 0x4d
  new Word("Mi"), // 0x4e
  new Word("Jia"), // 0x4f
  new Word("Teng"), // 0x50
  new Word("Hui"), // 0x51
  new Word("Zhong"), // 0x52
  new Word("Shan"), // 0x53
  new Word("Man"), // 0x54
  new Word("Mu"), // 0x55
  new Word("Biao"), // 0x56
  new Word("Guo"), // 0x57
  new Word("Ze"), // 0x58
  new Word("Mu"), // 0x59
  new Word("Bang"), // 0x5a
  new Word("Zhang"), // 0x5b
  new Word("Jiong"), // 0x5c
  new Word("Chan"), // 0x5d
  new Word("Fu"), // 0x5e
  new Word("Zhi"), // 0x5f
  new Word("Hu"), // 0x60
  new Word("Fan"), // 0x61
  new Word("Chuang"), // 0x62
  new Word("Bi"), // 0x63
  new Word("Hei"), // 0x64
  null, // 0x65
  new Word("Mi"), // 0x66
  new Word("Qiao"), // 0x67
  new Word("Chan"), // 0x68
  new Word("Fen"), // 0x69
  new Word("Meng"), // 0x6a
  new Word("Bang"), // 0x6b
  new Word("Chou"), // 0x6c
  new Word("Mie"), // 0x6d
  new Word("Chu"), // 0x6e
  new Word("Jie"), // 0x6f
  new Word("Xian"), // 0x70
  new Word("Lan"), // 0x71
  new Word("Gan"), // 0x72
  new Word("Ping"), // 0x73
  new Word("Nian"), // 0x74
  new Word("Qian"), // 0x75
  new Word("Bing"), // 0x76
  new Word("Bing"), // 0x77
  new Word("Xing"), // 0x78
  new Word("Gan"), // 0x79
  new Word("Yao"), // 0x7a
  new Word("Huan"), // 0x7b
  new Word("You"), // 0x7c
  new Word("You"), // 0x7d
  new Word("Ji"), // 0x7e
  new Word("Yan"), // 0x7f
  new Word("Pi"), // 0x80
  new Word("Ting"), // 0x81
  new Word("Ze"), // 0x82
  new Word("Guang"), // 0x83
  new Word("Zhuang"), // 0x84
  new Word("Mo"), // 0x85
  new Word("Qing"), // 0x86
  new Word("Bi"), // 0x87
  new Word("Qin"), // 0x88
  new Word("Dun"), // 0x89
  new Word("Chuang"), // 0x8a
  new Word("Gui"), // 0x8b
  new Word("Ya"), // 0x8c
  new Word("Bai"), // 0x8d
  new Word("Jie"), // 0x8e
  new Word("Xu"), // 0x8f
  new Word("Lu"), // 0x90
  new Word("Wu"), // 0x91
  null, // 0x92
  new Word("Ku"), // 0x93
  new Word("Ying"), // 0x94
  new Word("Di"), // 0x95
  new Word("Pao"), // 0x96
  new Word("Dian"), // 0x97
  new Word("Ya"), // 0x98
  new Word("Miao"), // 0x99
  new Word("Geng"), // 0x9a
  new Word("Ci"), // 0x9b
  new Word("Fu"), // 0x9c
  new Word("Tong"), // 0x9d
  new Word("Pang"), // 0x9e
  new Word("Fei"), // 0x9f
  new Word("Xiang"), // 0xa0
  new Word("Yi"), // 0xa1
  new Word("Zhi"), // 0xa2
  new Word("Tiao"), // 0xa3
  new Word("Zhi"), // 0xa4
  new Word("Xiu"), // 0xa5
  new Word("Du"), // 0xa6
  new Word("Zuo"), // 0xa7
  new Word("Xiao"), // 0xa8
  new Word("Tu"), // 0xa9
  new Word("Gui"), // 0xaa
  new Word("Ku"), // 0xab
  new Word("Pang"), // 0xac
  new Word("Ting"), // 0xad
  new Word("You"), // 0xae
  new Word("Bu"), // 0xaf
  new Word("Ding"), // 0xb0
  new Word("Cheng"), // 0xb1
  new Word("Lai"), // 0xb2
  new Word("Bei"), // 0xb3
  new Word("Ji"), // 0xb4
  new Word("An"), // 0xb5
  new Word("Shu"), // 0xb6
  new Word("Kang"), // 0xb7
  new Word("Yong"), // 0xb8
  new Word("Tuo"), // 0xb9
  new Word("Song"), // 0xba
  new Word("Shu"), // 0xbb
  new Word("Qing"), // 0xbc
  new Word("Yu"), // 0xbd
  new Word("Yu"), // 0xbe
  new Word("Miao"), // 0xbf
  new Word("Sou"), // 0xc0
  new Word("Ce"), // 0xc1
  new Word("Xiang"), // 0xc2
  new Word("Fei"), // 0xc3
  new Word("Jiu"), // 0xc4
  new Word("He"), // 0xc5
  new Word("Hui"), // 0xc6
  new Word("Liu"), // 0xc7
  new Word("Sha"), // 0xc8
  new Word("Lian"), // 0xc9
  new Word("Lang"), // 0xca
  new Word("Sou"), // 0xcb
  new Word("Jian"), // 0xcc
  new Word("Pou"), // 0xcd
  new Word("Qing"), // 0xce
  new Word("Jiu"), // 0xcf
  new Word("Jiu"), // 0xd0
  new Word("Qin"), // 0xd1
  new Word("Ao"), // 0xd2
  new Word("Kuo"), // 0xd3
  new Word("Lou"), // 0xd4
  new Word("Yin"), // 0xd5
  new Word("Liao"), // 0xd6
  new Word("Dai"), // 0xd7
  new Word("Lu"), // 0xd8
  new Word("Yi"), // 0xd9
  new Word("Chu"), // 0xda
  new Word("Chan"), // 0xdb
  new Word("Tu"), // 0xdc
  new Word("Si"), // 0xdd
  new Word("Xin"), // 0xde
  new Word("Miao"), // 0xdf
  new Word("Chang"), // 0xe0
  new Word("Wu"), // 0xe1
  new Word("Fei"), // 0xe2
  new Word("Guang"), // 0xe3
  new Word("Koc"), // 0xe4
  new Word("Kuai"), // 0xe5
  new Word("Bi"), // 0xe6
  new Word("Qiang"), // 0xe7
  new Word("Xie"), // 0xe8
  new Word("Lin"), // 0xe9
  new Word("Lin"), // 0xea
  new Word("Liao"), // 0xeb
  new Word("Lu"), // 0xec
  null, // 0xed
  new Word("Ying"), // 0xee
  new Word("Xian"), // 0xef
  new Word("Ting"), // 0xf0
  new Word("Yong"), // 0xf1
  new Word("Li"), // 0xf2
  new Word("Ting"), // 0xf3
  new Word("Yin"), // 0xf4
  new Word("Xun"), // 0xf5
  new Word("Yan"), // 0xf6
  new Word("Ting"), // 0xf7
  new Word("Di"), // 0xf8
  new Word("Po"), // 0xf9
  new Word("Jian"), // 0xfa
  new Word("Hui"), // 0xfb
  new Word("Nai"), // 0xfc
  new Word("Hui"), // 0xfd
  new Word("Gong"), // 0xfe
  new Word("Nian") // 0xff
  };
}