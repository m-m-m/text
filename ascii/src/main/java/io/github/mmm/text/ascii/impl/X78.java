/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+78xx (CJK Unified Ideographs).
 */
final class X78 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Dang"), // 0x00
  new Word("Ma"), // 0x01
  new Word("Sha"), // 0x02
  new Word("Dan"), // 0x03
  new Word("Jue"), // 0x04
  new Word("Li"), // 0x05
  new Word("Fu"), // 0x06
  new Word("Min"), // 0x07
  new Word("Nuo"), // 0x08
  new Word("Huo"), // 0x09
  new Word("Kang"), // 0x0a
  new Word("Zhi"), // 0x0b
  new Word("Qi"), // 0x0c
  new Word("Kan"), // 0x0d
  new Word("Jie"), // 0x0e
  new Word("Fen"), // 0x0f
  new Word("E"), // 0x10
  new Word("Ya"), // 0x11
  new Word("Pi"), // 0x12
  new Word("Zhe"), // 0x13
  new Word("Yan"), // 0x14
  new Word("Sui"), // 0x15
  new Word("Zhuan"), // 0x16
  new Word("Che"), // 0x17
  new Word("Dun"), // 0x18
  new Word("Pan"), // 0x19
  new Word("Yan"), // 0x1a
  null, // 0x1b
  new Word("Feng"), // 0x1c
  new Word("Fa"), // 0x1d
  new Word("Mo"), // 0x1e
  new Word("Zha"), // 0x1f
  new Word("Qu"), // 0x20
  new Word("Yu"), // 0x21
  new Word("Luo"), // 0x22
  new Word("Tuo"), // 0x23
  new Word("Tuo"), // 0x24
  new Word("Di"), // 0x25
  new Word("Zhai"), // 0x26
  new Word("Zhen"), // 0x27
  new Word("Ai"), // 0x28
  new Word("Fei"), // 0x29
  new Word("Mu"), // 0x2a
  new Word("Zhu"), // 0x2b
  new Word("Li"), // 0x2c
  new Word("Bian"), // 0x2d
  new Word("Nu"), // 0x2e
  new Word("Ping"), // 0x2f
  new Word("Peng"), // 0x30
  new Word("Ling"), // 0x31
  new Word("Pao"), // 0x32
  new Word("Le"), // 0x33
  new Word("Po"), // 0x34
  new Word("Bo"), // 0x35
  new Word("Po"), // 0x36
  new Word("Shen"), // 0x37
  new Word("Za"), // 0x38
  new Word("Nuo"), // 0x39
  new Word("Li"), // 0x3a
  new Word("Long"), // 0x3b
  new Word("Tong"), // 0x3c
  null, // 0x3d
  new Word("Li"), // 0x3e
  new Word("Aragane"), // 0x3f
  new Word("Chu"), // 0x40
  new Word("Keng"), // 0x41
  new Word("Quan"), // 0x42
  new Word("Zhu"), // 0x43
  new Word("Kuang"), // 0x44
  new Word("Huo"), // 0x45
  new Word("E"), // 0x46
  new Word("Nao"), // 0x47
  new Word("Jia"), // 0x48
  new Word("Lu"), // 0x49
  new Word("Wei"), // 0x4a
  new Word("Ai"), // 0x4b
  new Word("Luo"), // 0x4c
  new Word("Ken"), // 0x4d
  new Word("Xing"), // 0x4e
  new Word("Yan"), // 0x4f
  new Word("Tong"), // 0x50
  new Word("Peng"), // 0x51
  new Word("Xi"), // 0x52
  null, // 0x53
  new Word("Hong"), // 0x54
  new Word("Shuo"), // 0x55
  new Word("Xia"), // 0x56
  new Word("Qiao"), // 0x57
  null, // 0x58
  new Word("Wei"), // 0x59
  new Word("Qiao"), // 0x5a
  null, // 0x5b
  new Word("Keng"), // 0x5c
  new Word("Xiao"), // 0x5d
  new Word("Que"), // 0x5e
  new Word("Chan"), // 0x5f
  new Word("Lang"), // 0x60
  new Word("Hong"), // 0x61
  new Word("Yu"), // 0x62
  new Word("Xiao"), // 0x63
  new Word("Xia"), // 0x64
  new Word("Mang"), // 0x65
  new Word("Long"), // 0x66
  new Word("Iong"), // 0x67
  new Word("Che"), // 0x68
  new Word("Che"), // 0x69
  new Word("E"), // 0x6a
  new Word("Liu"), // 0x6b
  new Word("Ying"), // 0x6c
  new Word("Mang"), // 0x6d
  new Word("Que"), // 0x6e
  new Word("Yan"), // 0x6f
  new Word("Sha"), // 0x70
  new Word("Kun"), // 0x71
  new Word("Yu"), // 0x72
  null, // 0x73
  new Word("Kaki"), // 0x74
  new Word("Lu"), // 0x75
  new Word("Chen"), // 0x76
  new Word("Jian"), // 0x77
  new Word("Nue"), // 0x78
  new Word("Song"), // 0x79
  new Word("Zhuo"), // 0x7a
  new Word("Keng"), // 0x7b
  new Word("Peng"), // 0x7c
  new Word("Yan"), // 0x7d
  new Word("Zhui"), // 0x7e
  new Word("Kong"), // 0x7f
  new Word("Ceng"), // 0x80
  new Word("Qi"), // 0x81
  new Word("Zong"), // 0x82
  new Word("Qing"), // 0x83
  new Word("Lin"), // 0x84
  new Word("Jun"), // 0x85
  new Word("Bo"), // 0x86
  new Word("Ding"), // 0x87
  new Word("Min"), // 0x88
  new Word("Diao"), // 0x89
  new Word("Jian"), // 0x8a
  new Word("He"), // 0x8b
  new Word("Lu"), // 0x8c
  new Word("Ai"), // 0x8d
  new Word("Sui"), // 0x8e
  new Word("Que"), // 0x8f
  new Word("Ling"), // 0x90
  new Word("Bei"), // 0x91
  new Word("Yin"), // 0x92
  new Word("Dui"), // 0x93
  new Word("Wu"), // 0x94
  new Word("Qi"), // 0x95
  new Word("Lun"), // 0x96
  new Word("Wan"), // 0x97
  new Word("Dian"), // 0x98
  new Word("Gang"), // 0x99
  new Word("Pei"), // 0x9a
  new Word("Qi"), // 0x9b
  new Word("Chen"), // 0x9c
  new Word("Ruan"), // 0x9d
  new Word("Yan"), // 0x9e
  new Word("Die"), // 0x9f
  new Word("Ding"), // 0xa0
  new Word("Du"), // 0xa1
  new Word("Tuo"), // 0xa2
  new Word("Jie"), // 0xa3
  new Word("Ying"), // 0xa4
  new Word("Bian"), // 0xa5
  new Word("Ke"), // 0xa6
  new Word("Bi"), // 0xa7
  new Word("Wei"), // 0xa8
  new Word("Shuo"), // 0xa9
  new Word("Zhen"), // 0xaa
  new Word("Duan"), // 0xab
  new Word("Xia"), // 0xac
  new Word("Dang"), // 0xad
  new Word("Ti"), // 0xae
  new Word("Nao"), // 0xaf
  new Word("Peng"), // 0xb0
  new Word("Jian"), // 0xb1
  new Word("Di"), // 0xb2
  new Word("Tan"), // 0xb3
  new Word("Cha"), // 0xb4
  new Word("Seki"), // 0xb5
  new Word("Qi"), // 0xb6
  null, // 0xb7
  new Word("Feng"), // 0xb8
  new Word("Xuan"), // 0xb9
  new Word("Que"), // 0xba
  new Word("Que"), // 0xbb
  new Word("Ma"), // 0xbc
  new Word("Gong"), // 0xbd
  new Word("Nian"), // 0xbe
  new Word("Su"), // 0xbf
  new Word("E"), // 0xc0
  new Word("Ci"), // 0xc1
  new Word("Liu"), // 0xc2
  new Word("Si"), // 0xc3
  new Word("Tang"), // 0xc4
  new Word("Bang"), // 0xc5
  new Word("Hua"), // 0xc6
  new Word("Pi"), // 0xc7
  new Word("Wei"), // 0xc8
  new Word("Sang"), // 0xc9
  new Word("Lei"), // 0xca
  new Word("Cuo"), // 0xcb
  new Word("Zhen"), // 0xcc
  new Word("Xia"), // 0xcd
  new Word("Qi"), // 0xce
  new Word("Lian"), // 0xcf
  new Word("Pan"), // 0xd0
  new Word("Wei"), // 0xd1
  new Word("Yun"), // 0xd2
  new Word("Dui"), // 0xd3
  new Word("Zhe"), // 0xd4
  new Word("Ke"), // 0xd5
  new Word("La"), // 0xd6
  null, // 0xd7
  new Word("Qing"), // 0xd8
  new Word("Gun"), // 0xd9
  new Word("Zhuan"), // 0xda
  new Word("Chan"), // 0xdb
  new Word("Qi"), // 0xdc
  new Word("Ao"), // 0xdd
  new Word("Peng"), // 0xde
  new Word("Lu"), // 0xdf
  new Word("Lu"), // 0xe0
  new Word("Kan"), // 0xe1
  new Word("Qiang"), // 0xe2
  new Word("Chen"), // 0xe3
  new Word("Yin"), // 0xe4
  new Word("Lei"), // 0xe5
  new Word("Biao"), // 0xe6
  new Word("Qi"), // 0xe7
  new Word("Mo"), // 0xe8
  new Word("Qi"), // 0xe9
  new Word("Cui"), // 0xea
  new Word("Zong"), // 0xeb
  new Word("Qing"), // 0xec
  new Word("Chuo"), // 0xed
  null, // 0xee
  new Word("Ji"), // 0xef
  new Word("Shan"), // 0xf0
  new Word("Lao"), // 0xf1
  new Word("Qu"), // 0xf2
  new Word("Zeng"), // 0xf3
  new Word("Deng"), // 0xf4
  new Word("Jian"), // 0xf5
  new Word("Xi"), // 0xf6
  new Word("Lin"), // 0xf7
  new Word("Ding"), // 0xf8
  new Word("Dian"), // 0xf9
  new Word("Huang"), // 0xfa
  new Word("Pan"), // 0xfb
  new Word("Za"), // 0xfc
  new Word("Qiao"), // 0xfd
  new Word("Di"), // 0xfe
  new Word("Li") // 0xff
  };
}