/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+86xx (CJK Unified Ideographs).
 */
final class X86 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Tuo"), // 0x00
  new Word("Wu"), // 0x01
  new Word("Rui"), // 0x02
  new Word("Rui"), // 0x03
  new Word("Qi"), // 0x04
  new Word("Heng"), // 0x05
  new Word("Lu"), // 0x06
  new Word("Su"), // 0x07
  new Word("Tui"), // 0x08
  new Word("Mang"), // 0x09
  new Word("Yun"), // 0x0a
  new Word("Pin"), // 0x0b
  new Word("Yu"), // 0x0c
  new Word("Xun"), // 0x0d
  new Word("Ji"), // 0x0e
  new Word("Jiong"), // 0x0f
  new Word("Xian"), // 0x10
  new Word("Mo"), // 0x11
  new Word("Hagi"), // 0x12
  new Word("Su"), // 0x13
  new Word("Jiong"), // 0x14
  null, // 0x15
  new Word("Nie"), // 0x16
  new Word("Bo"), // 0x17
  new Word("Rang"), // 0x18
  new Word("Yi"), // 0x19
  new Word("Xian"), // 0x1a
  new Word("Yu"), // 0x1b
  new Word("Ju"), // 0x1c
  new Word("Lian"), // 0x1d
  new Word("Lian"), // 0x1e
  new Word("Yin"), // 0x1f
  new Word("Qiang"), // 0x20
  new Word("Ying"), // 0x21
  new Word("Long"), // 0x22
  new Word("Tong"), // 0x23
  new Word("Wei"), // 0x24
  new Word("Yue"), // 0x25
  new Word("Ling"), // 0x26
  new Word("Qu"), // 0x27
  new Word("Yao"), // 0x28
  new Word("Fan"), // 0x29
  new Word("Mi"), // 0x2a
  new Word("Lan"), // 0x2b
  new Word("Kui"), // 0x2c
  new Word("Lan"), // 0x2d
  new Word("Ji"), // 0x2e
  new Word("Dang"), // 0x2f
  new Word("Katsura"), // 0x30
  new Word("Lei"), // 0x31
  new Word("Lei"), // 0x32
  new Word("Hua"), // 0x33
  new Word("Feng"), // 0x34
  new Word("Zhi"), // 0x35
  new Word("Wei"), // 0x36
  new Word("Kui"), // 0x37
  new Word("Zhan"), // 0x38
  new Word("Huai"), // 0x39
  new Word("Li"), // 0x3a
  new Word("Ji"), // 0x3b
  new Word("Mi"), // 0x3c
  new Word("Lei"), // 0x3d
  new Word("Huai"), // 0x3e
  new Word("Luo"), // 0x3f
  new Word("Ji"), // 0x40
  new Word("Kui"), // 0x41
  new Word("Lu"), // 0x42
  new Word("Jian"), // 0x43
  new Word("San"), // 0x44
  null, // 0x45
  new Word("Lei"), // 0x46
  new Word("Quan"), // 0x47
  new Word("Xiao"), // 0x48
  new Word("Yi"), // 0x49
  new Word("Luan"), // 0x4a
  new Word("Men"), // 0x4b
  new Word("Bie"), // 0x4c
  new Word("Hu"), // 0x4d
  new Word("Hu"), // 0x4e
  new Word("Lu"), // 0x4f
  new Word("Nue"), // 0x50
  new Word("Lu"), // 0x51
  new Word("Si"), // 0x52
  new Word("Xiao"), // 0x53
  new Word("Qian"), // 0x54
  new Word("Chu"), // 0x55
  new Word("Hu"), // 0x56
  new Word("Xu"), // 0x57
  new Word("Cuo"), // 0x58
  new Word("Fu"), // 0x59
  new Word("Xu"), // 0x5a
  new Word("Xu"), // 0x5b
  new Word("Lu"), // 0x5c
  new Word("Hu"), // 0x5d
  new Word("Yu"), // 0x5e
  new Word("Hao"), // 0x5f
  new Word("Jiao"), // 0x60
  new Word("Ju"), // 0x61
  new Word("Guo"), // 0x62
  new Word("Bao"), // 0x63
  new Word("Yan"), // 0x64
  new Word("Zhan"), // 0x65
  new Word("Zhan"), // 0x66
  new Word("Kui"), // 0x67
  new Word("Ban"), // 0x68
  new Word("Xi"), // 0x69
  new Word("Shu"), // 0x6a
  new Word("Chong"), // 0x6b
  new Word("Qiu"), // 0x6c
  new Word("Diao"), // 0x6d
  new Word("Ji"), // 0x6e
  new Word("Qiu"), // 0x6f
  new Word("Cheng"), // 0x70
  new Word("Shi"), // 0x71
  null, // 0x72
  new Word("Di"), // 0x73
  new Word("Zhe"), // 0x74
  new Word("She"), // 0x75
  new Word("Yu"), // 0x76
  new Word("Gan"), // 0x77
  new Word("Zi"), // 0x78
  new Word("Hong"), // 0x79
  new Word("Hui"), // 0x7a
  new Word("Meng"), // 0x7b
  new Word("Ge"), // 0x7c
  new Word("Sui"), // 0x7d
  new Word("Xia"), // 0x7e
  new Word("Chai"), // 0x7f
  new Word("Shi"), // 0x80
  new Word("Yi"), // 0x81
  new Word("Ma"), // 0x82
  new Word("Xiang"), // 0x83
  new Word("Fang"), // 0x84
  new Word("E"), // 0x85
  new Word("Pa"), // 0x86
  new Word("Chi"), // 0x87
  new Word("Qian"), // 0x88
  new Word("Wen"), // 0x89
  new Word("Wen"), // 0x8a
  new Word("Rui"), // 0x8b
  new Word("Bang"), // 0x8c
  new Word("Bi"), // 0x8d
  new Word("Yue"), // 0x8e
  new Word("Yue"), // 0x8f
  new Word("Jun"), // 0x90
  new Word("Qi"), // 0x91
  new Word("Ran"), // 0x92
  new Word("Yin"), // 0x93
  new Word("Qi"), // 0x94
  new Word("Tian"), // 0x95
  new Word("Yuan"), // 0x96
  new Word("Jue"), // 0x97
  new Word("Hui"), // 0x98
  new Word("Qin"), // 0x99
  new Word("Qi"), // 0x9a
  new Word("Zhong"), // 0x9b
  new Word("Ya"), // 0x9c
  new Word("Ci"), // 0x9d
  new Word("Mu"), // 0x9e
  new Word("Wang"), // 0x9f
  new Word("Fen"), // 0xa0
  new Word("Fen"), // 0xa1
  new Word("Hang"), // 0xa2
  new Word("Gong"), // 0xa3
  new Word("Zao"), // 0xa4
  new Word("Fu"), // 0xa5
  new Word("Ran"), // 0xa6
  new Word("Jie"), // 0xa7
  new Word("Fu"), // 0xa8
  new Word("Chi"), // 0xa9
  new Word("Dou"), // 0xaa
  new Word("Piao"), // 0xab
  new Word("Xian"), // 0xac
  new Word("Ni"), // 0xad
  new Word("Te"), // 0xae
  new Word("Qiu"), // 0xaf
  new Word("You"), // 0xb0
  new Word("Zha"), // 0xb1
  new Word("Ping"), // 0xb2
  new Word("Chi"), // 0xb3
  new Word("You"), // 0xb4
  new Word("He"), // 0xb5
  new Word("Han"), // 0xb6
  new Word("Ju"), // 0xb7
  new Word("Li"), // 0xb8
  new Word("Fu"), // 0xb9
  new Word("Ran"), // 0xba
  new Word("Zha"), // 0xbb
  new Word("Gou"), // 0xbc
  new Word("Pi"), // 0xbd
  new Word("Bo"), // 0xbe
  new Word("Xian"), // 0xbf
  new Word("Zhu"), // 0xc0
  new Word("Diao"), // 0xc1
  new Word("Bie"), // 0xc2
  new Word("Bing"), // 0xc3
  new Word("Gu"), // 0xc4
  new Word("Ran"), // 0xc5
  new Word("Qu"), // 0xc6
  new Word("She"), // 0xc7
  new Word("Tie"), // 0xc8
  new Word("Ling"), // 0xc9
  new Word("Gu"), // 0xca
  new Word("Dan"), // 0xcb
  new Word("Gu"), // 0xcc
  new Word("Ying"), // 0xcd
  new Word("Li"), // 0xce
  new Word("Cheng"), // 0xcf
  new Word("Qu"), // 0xd0
  new Word("Mou"), // 0xd1
  new Word("Ge"), // 0xd2
  new Word("Ci"), // 0xd3
  new Word("Hui"), // 0xd4
  new Word("Hui"), // 0xd5
  new Word("Mang"), // 0xd6
  new Word("Fu"), // 0xd7
  new Word("Yang"), // 0xd8
  new Word("Wa"), // 0xd9
  new Word("Lie"), // 0xda
  new Word("Zhu"), // 0xdb
  new Word("Yi"), // 0xdc
  new Word("Xian"), // 0xdd
  new Word("Kuo"), // 0xde
  new Word("Jiao"), // 0xdf
  new Word("Li"), // 0xe0
  new Word("Yi"), // 0xe1
  new Word("Ping"), // 0xe2
  new Word("Ji"), // 0xe3
  new Word("Ha"), // 0xe4
  new Word("She"), // 0xe5
  new Word("Yi"), // 0xe6
  new Word("Wang"), // 0xe7
  new Word("Mo"), // 0xe8
  new Word("Qiong"), // 0xe9
  new Word("Qie"), // 0xea
  new Word("Gui"), // 0xeb
  new Word("Gong"), // 0xec
  new Word("Zhi"), // 0xed
  new Word("Man"), // 0xee
  new Word("Ebi"), // 0xef
  new Word("Zhi"), // 0xf0
  new Word("Jia"), // 0xf1
  new Word("Rao"), // 0xf2
  new Word("Si"), // 0xf3
  new Word("Qi"), // 0xf4
  new Word("Xing"), // 0xf5
  new Word("Lie"), // 0xf6
  new Word("Qiu"), // 0xf7
  new Word("Shao"), // 0xf8
  new Word("Yong"), // 0xf9
  new Word("Jia"), // 0xfa
  new Word("Shui"), // 0xfb
  new Word("Che"), // 0xfc
  new Word("Bai"), // 0xfd
  new Word("E"), // 0xfe
  new Word("Han") // 0xff
  };
}