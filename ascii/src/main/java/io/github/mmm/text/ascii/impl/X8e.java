/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+8Exx (CJK Unified Ideographs).
 */
final class X8e extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Chu"), // 0x00
  new Word("Jing"), // 0x01
  new Word("Nie"), // 0x02
  new Word("Xiao"), // 0x03
  new Word("Bo"), // 0x04
  new Word("Chi"), // 0x05
  new Word("Qun"), // 0x06
  new Word("Mou"), // 0x07
  new Word("Shu"), // 0x08
  new Word("Lang"), // 0x09
  new Word("Yong"), // 0x0a
  new Word("Jiao"), // 0x0b
  new Word("Chou"), // 0x0c
  new Word("Qiao"), // 0x0d
  null, // 0x0e
  new Word("Ta"), // 0x0f
  new Word("Jian"), // 0x10
  new Word("Qi"), // 0x11
  new Word("Wo"), // 0x12
  new Word("Wei"), // 0x13
  new Word("Zhuo"), // 0x14
  new Word("Jie"), // 0x15
  new Word("Ji"), // 0x16
  new Word("Nie"), // 0x17
  new Word("Ju"), // 0x18
  new Word("Ju"), // 0x19
  new Word("Lun"), // 0x1a
  new Word("Lu"), // 0x1b
  new Word("Leng"), // 0x1c
  new Word("Huai"), // 0x1d
  new Word("Ju"), // 0x1e
  new Word("Chi"), // 0x1f
  new Word("Wan"), // 0x20
  new Word("Quan"), // 0x21
  new Word("Ti"), // 0x22
  new Word("Bo"), // 0x23
  new Word("Zu"), // 0x24
  new Word("Qie"), // 0x25
  new Word("Ji"), // 0x26
  new Word("Cu"), // 0x27
  new Word("Zong"), // 0x28
  new Word("Cai"), // 0x29
  new Word("Zong"), // 0x2a
  new Word("Peng"), // 0x2b
  new Word("Zhi"), // 0x2c
  new Word("Zheng"), // 0x2d
  new Word("Dian"), // 0x2e
  new Word("Zhi"), // 0x2f
  new Word("Yu"), // 0x30
  new Word("Duo"), // 0x31
  new Word("Dun"), // 0x32
  new Word("Chun"), // 0x33
  new Word("Yong"), // 0x34
  new Word("Zhong"), // 0x35
  new Word("Di"), // 0x36
  new Word("Zhe"), // 0x37
  new Word("Chen"), // 0x38
  new Word("Chuai"), // 0x39
  new Word("Jian"), // 0x3a
  new Word("Gua"), // 0x3b
  new Word("Tang"), // 0x3c
  new Word("Ju"), // 0x3d
  new Word("Fu"), // 0x3e
  new Word("Zu"), // 0x3f
  new Word("Die"), // 0x40
  new Word("Pian"), // 0x41
  new Word("Rou"), // 0x42
  new Word("Nuo"), // 0x43
  new Word("Ti"), // 0x44
  new Word("Cha"), // 0x45
  new Word("Tui"), // 0x46
  new Word("Jian"), // 0x47
  new Word("Dao"), // 0x48
  new Word("Cuo"), // 0x49
  new Word("Xi"), // 0x4a
  new Word("Ta"), // 0x4b
  new Word("Qiang"), // 0x4c
  new Word("Zhan"), // 0x4d
  new Word("Dian"), // 0x4e
  new Word("Ti"), // 0x4f
  new Word("Ji"), // 0x50
  new Word("Nie"), // 0x51
  new Word("Man"), // 0x52
  new Word("Liu"), // 0x53
  new Word("Zhan"), // 0x54
  new Word("Bi"), // 0x55
  new Word("Chong"), // 0x56
  new Word("Lu"), // 0x57
  new Word("Liao"), // 0x58
  new Word("Cu"), // 0x59
  new Word("Tang"), // 0x5a
  new Word("Dai"), // 0x5b
  new Word("Suo"), // 0x5c
  new Word("Xi"), // 0x5d
  new Word("Kui"), // 0x5e
  new Word("Ji"), // 0x5f
  new Word("Zhi"), // 0x60
  new Word("Qiang"), // 0x61
  new Word("Di"), // 0x62
  new Word("Man"), // 0x63
  new Word("Zong"), // 0x64
  new Word("Lian"), // 0x65
  new Word("Beng"), // 0x66
  new Word("Zao"), // 0x67
  new Word("Nian"), // 0x68
  new Word("Bie"), // 0x69
  new Word("Tui"), // 0x6a
  new Word("Ju"), // 0x6b
  new Word("Deng"), // 0x6c
  new Word("Ceng"), // 0x6d
  new Word("Xian"), // 0x6e
  new Word("Fan"), // 0x6f
  new Word("Chu"), // 0x70
  new Word("Zhong"), // 0x71
  new Word("Dun"), // 0x72
  new Word("Bo"), // 0x73
  new Word("Cu"), // 0x74
  new Word("Zu"), // 0x75
  new Word("Jue"), // 0x76
  new Word("Jue"), // 0x77
  new Word("Lin"), // 0x78
  new Word("Ta"), // 0x79
  new Word("Qiao"), // 0x7a
  new Word("Qiao"), // 0x7b
  new Word("Pu"), // 0x7c
  new Word("Liao"), // 0x7d
  new Word("Dun"), // 0x7e
  new Word("Cuan"), // 0x7f
  new Word("Kuang"), // 0x80
  new Word("Zao"), // 0x81
  new Word("Ta"), // 0x82
  new Word("Bi"), // 0x83
  new Word("Bi"), // 0x84
  new Word("Zhu"), // 0x85
  new Word("Ju"), // 0x86
  new Word("Chu"), // 0x87
  new Word("Qiao"), // 0x88
  new Word("Dun"), // 0x89
  new Word("Chou"), // 0x8a
  new Word("Ji"), // 0x8b
  new Word("Wu"), // 0x8c
  new Word("Yue"), // 0x8d
  new Word("Nian"), // 0x8e
  new Word("Lin"), // 0x8f
  new Word("Lie"), // 0x90
  new Word("Zhi"), // 0x91
  new Word("Li"), // 0x92
  new Word("Zhi"), // 0x93
  new Word("Chan"), // 0x94
  new Word("Chu"), // 0x95
  new Word("Duan"), // 0x96
  new Word("Wei"), // 0x97
  new Word("Long"), // 0x98
  new Word("Lin"), // 0x99
  new Word("Xian"), // 0x9a
  new Word("Wei"), // 0x9b
  new Word("Zuan"), // 0x9c
  new Word("Lan"), // 0x9d
  new Word("Xie"), // 0x9e
  new Word("Rang"), // 0x9f
  new Word("Xie"), // 0xa0
  new Word("Nie"), // 0xa1
  new Word("Ta"), // 0xa2
  new Word("Qu"), // 0xa3
  new Word("Jie"), // 0xa4
  new Word("Cuan"), // 0xa5
  new Word("Zuan"), // 0xa6
  new Word("Xi"), // 0xa7
  new Word("Kui"), // 0xa8
  new Word("Jue"), // 0xa9
  new Word("Lin"), // 0xaa
  new Word("Shen"), // 0xab
  new Word("Gong"), // 0xac
  new Word("Dan"), // 0xad
  new Word("Segare"), // 0xae
  new Word("Qu"), // 0xaf
  new Word("Ti"), // 0xb0
  new Word("Duo"), // 0xb1
  new Word("Duo"), // 0xb2
  new Word("Gong"), // 0xb3
  new Word("Lang"), // 0xb4
  new Word("Nerau"), // 0xb5
  new Word("Luo"), // 0xb6
  new Word("Ai"), // 0xb7
  new Word("Ji"), // 0xb8
  new Word("Ju"), // 0xb9
  new Word("Tang"), // 0xba
  new Word("Utsuke"), // 0xbb
  null, // 0xbc
  new Word("Yan"), // 0xbd
  new Word("Shitsuke"), // 0xbe
  new Word("Kang"), // 0xbf
  new Word("Qu"), // 0xc0
  new Word("Lou"), // 0xc1
  new Word("Lao"), // 0xc2
  new Word("Tuo"), // 0xc3
  new Word("Zhi"), // 0xc4
  new Word("Yagate"), // 0xc5
  new Word("Ti"), // 0xc6
  new Word("Dao"), // 0xc7
  new Word("Yagate"), // 0xc8
  new Word("Yu"), // 0xc9
  new Word("Che"), // 0xca
  new Word("Ya"), // 0xcb
  new Word("Gui"), // 0xcc
  new Word("Jun"), // 0xcd
  new Word("Wei"), // 0xce
  new Word("Yue"), // 0xcf
  new Word("Xin"), // 0xd0
  new Word("Di"), // 0xd1
  new Word("Xuan"), // 0xd2
  new Word("Fan"), // 0xd3
  new Word("Ren"), // 0xd4
  new Word("Shan"), // 0xd5
  new Word("Qiang"), // 0xd6
  new Word("Shu"), // 0xd7
  new Word("Tun"), // 0xd8
  new Word("Chen"), // 0xd9
  new Word("Dai"), // 0xda
  new Word("E"), // 0xdb
  new Word("Na"), // 0xdc
  new Word("Qi"), // 0xdd
  new Word("Mao"), // 0xde
  new Word("Ruan"), // 0xdf
  new Word("Ren"), // 0xe0
  new Word("Fan"), // 0xe1
  new Word("Zhuan"), // 0xe2
  new Word("Hong"), // 0xe3
  new Word("Hu"), // 0xe4
  new Word("Qu"), // 0xe5
  new Word("Huang"), // 0xe6
  new Word("Di"), // 0xe7
  new Word("Ling"), // 0xe8
  new Word("Dai"), // 0xe9
  new Word("Ao"), // 0xea
  new Word("Zhen"), // 0xeb
  new Word("Fan"), // 0xec
  new Word("Kuang"), // 0xed
  new Word("Ang"), // 0xee
  new Word("Peng"), // 0xef
  new Word("Bei"), // 0xf0
  new Word("Gu"), // 0xf1
  new Word("Ku"), // 0xf2
  new Word("Pao"), // 0xf3
  new Word("Zhu"), // 0xf4
  new Word("Rong"), // 0xf5
  new Word("E"), // 0xf6
  new Word("Ba"), // 0xf7
  new Word("Zhou"), // 0xf8
  new Word("Zhi"), // 0xf9
  new Word("Yao"), // 0xfa
  new Word("Ke"), // 0xfb
  new Word("Yi"), // 0xfc
  new Word("Qing"), // 0xfd
  new Word("Shi"), // 0xfe
  new Word("Ping") // 0xff
  };
}