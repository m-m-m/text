/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+6Bxx (CJK Unified Ideographs).
 */
final class X6b extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Xiang"), // 0x00
  new Word("Nong"), // 0x01
  new Word("Bo"), // 0x02
  new Word("Chan"), // 0x03
  new Word("Lan"), // 0x04
  new Word("Ju"), // 0x05
  new Word("Shuang"), // 0x06
  new Word("She"), // 0x07
  new Word("Wei"), // 0x08
  new Word("Cong"), // 0x09
  new Word("Quan"), // 0x0a
  new Word("Qu"), // 0x0b
  new Word("Cang"), // 0x0c
  null, // 0x0d
  new Word("Yu"), // 0x0e
  new Word("Luo"), // 0x0f
  new Word("Li"), // 0x10
  new Word("Zan"), // 0x11
  new Word("Luan"), // 0x12
  new Word("Dang"), // 0x13
  new Word("Jue"), // 0x14
  new Word("Em"), // 0x15
  new Word("Lan"), // 0x16
  new Word("Lan"), // 0x17
  new Word("Zhu"), // 0x18
  new Word("Lei"), // 0x19
  new Word("Li"), // 0x1a
  new Word("Ba"), // 0x1b
  new Word("Nang"), // 0x1c
  new Word("Yu"), // 0x1d
  new Word("Ling"), // 0x1e
  new Word("Tsuki"), // 0x1f
  new Word("Qian"), // 0x20
  new Word("Ci"), // 0x21
  new Word("Huan"), // 0x22
  new Word("Xin"), // 0x23
  new Word("Yu"), // 0x24
  new Word("Yu"), // 0x25
  new Word("Qian"), // 0x26
  new Word("Ou"), // 0x27
  new Word("Xu"), // 0x28
  new Word("Chao"), // 0x29
  new Word("Chu"), // 0x2a
  new Word("Chi"), // 0x2b
  new Word("Kai"), // 0x2c
  new Word("Yi"), // 0x2d
  new Word("Jue"), // 0x2e
  new Word("Xi"), // 0x2f
  new Word("Xu"), // 0x30
  new Word("Xia"), // 0x31
  new Word("Yu"), // 0x32
  new Word("Kuai"), // 0x33
  new Word("Lang"), // 0x34
  new Word("Kuan"), // 0x35
  new Word("Shuo"), // 0x36
  new Word("Xi"), // 0x37
  new Word("Ai"), // 0x38
  new Word("Yi"), // 0x39
  new Word("Qi"), // 0x3a
  new Word("Hu"), // 0x3b
  new Word("Chi"), // 0x3c
  new Word("Qin"), // 0x3d
  new Word("Kuan"), // 0x3e
  new Word("Kan"), // 0x3f
  new Word("Kuan"), // 0x40
  new Word("Kan"), // 0x41
  new Word("Chuan"), // 0x42
  new Word("Sha"), // 0x43
  new Word("Gua"), // 0x44
  new Word("Yin"), // 0x45
  new Word("Xin"), // 0x46
  new Word("Xie"), // 0x47
  new Word("Yu"), // 0x48
  new Word("Qian"), // 0x49
  new Word("Xiao"), // 0x4a
  new Word("Yi"), // 0x4b
  new Word("Ge"), // 0x4c
  new Word("Wu"), // 0x4d
  new Word("Tan"), // 0x4e
  new Word("Jin"), // 0x4f
  new Word("Ou"), // 0x50
  new Word("Hu"), // 0x51
  new Word("Ti"), // 0x52
  new Word("Huan"), // 0x53
  new Word("Xu"), // 0x54
  new Word("Pen"), // 0x55
  new Word("Xi"), // 0x56
  new Word("Xiao"), // 0x57
  new Word("Xu"), // 0x58
  new Word("Xi"), // 0x59
  new Word("Sen"), // 0x5a
  new Word("Lian"), // 0x5b
  new Word("Chu"), // 0x5c
  new Word("Yi"), // 0x5d
  new Word("Kan"), // 0x5e
  new Word("Yu"), // 0x5f
  new Word("Chuo"), // 0x60
  new Word("Huan"), // 0x61
  new Word("Zhi"), // 0x62
  new Word("Zheng"), // 0x63
  new Word("Ci"), // 0x64
  new Word("Bu"), // 0x65
  new Word("Wu"), // 0x66
  new Word("Qi"), // 0x67
  new Word("Bu"), // 0x68
  new Word("Bu"), // 0x69
  new Word("Wai"), // 0x6a
  new Word("Ju"), // 0x6b
  new Word("Qian"), // 0x6c
  new Word("Chi"), // 0x6d
  new Word("Se"), // 0x6e
  new Word("Chi"), // 0x6f
  new Word("Se"), // 0x70
  new Word("Zhong"), // 0x71
  new Word("Sui"), // 0x72
  new Word("Sui"), // 0x73
  new Word("Li"), // 0x74
  new Word("Cuo"), // 0x75
  new Word("Yu"), // 0x76
  new Word("Li"), // 0x77
  new Word("Gui"), // 0x78
  new Word("Dai"), // 0x79
  new Word("Dai"), // 0x7a
  new Word("Si"), // 0x7b
  new Word("Jian"), // 0x7c
  new Word("Zhe"), // 0x7d
  new Word("Mo"), // 0x7e
  new Word("Mo"), // 0x7f
  new Word("Yao"), // 0x80
  new Word("Mo"), // 0x81
  new Word("Cu"), // 0x82
  new Word("Yang"), // 0x83
  new Word("Tian"), // 0x84
  new Word("Sheng"), // 0x85
  new Word("Dai"), // 0x86
  new Word("Shang"), // 0x87
  new Word("Xu"), // 0x88
  new Word("Xun"), // 0x89
  new Word("Shu"), // 0x8a
  new Word("Can"), // 0x8b
  new Word("Jue"), // 0x8c
  new Word("Piao"), // 0x8d
  new Word("Qia"), // 0x8e
  new Word("Qiu"), // 0x8f
  new Word("Su"), // 0x90
  new Word("Qing"), // 0x91
  new Word("Yun"), // 0x92
  new Word("Lian"), // 0x93
  new Word("Yi"), // 0x94
  new Word("Fou"), // 0x95
  new Word("Zhi"), // 0x96
  new Word("Ye"), // 0x97
  new Word("Can"), // 0x98
  new Word("Hun"), // 0x99
  new Word("Dan"), // 0x9a
  new Word("Ji"), // 0x9b
  new Word("Ye"), // 0x9c
  new Word("Zhen"), // 0x9d
  new Word("Yun"), // 0x9e
  new Word("Wen"), // 0x9f
  new Word("Chou"), // 0xa0
  new Word("Bin"), // 0xa1
  new Word("Ti"), // 0xa2
  new Word("Jin"), // 0xa3
  new Word("Shang"), // 0xa4
  new Word("Yin"), // 0xa5
  new Word("Diao"), // 0xa6
  new Word("Cu"), // 0xa7
  new Word("Hui"), // 0xa8
  new Word("Cuan"), // 0xa9
  new Word("Yi"), // 0xaa
  new Word("Dan"), // 0xab
  new Word("Du"), // 0xac
  new Word("Jiang"), // 0xad
  new Word("Lian"), // 0xae
  new Word("Bin"), // 0xaf
  new Word("Du"), // 0xb0
  new Word("Tsukusu"), // 0xb1
  new Word("Jian"), // 0xb2
  new Word("Shu"), // 0xb3
  new Word("Ou"), // 0xb4
  new Word("Duan"), // 0xb5
  new Word("Zhu"), // 0xb6
  new Word("Yin"), // 0xb7
  new Word("Qing"), // 0xb8
  new Word("Yi"), // 0xb9
  new Word("Sha"), // 0xba
  new Word("Que"), // 0xbb
  new Word("Ke"), // 0xbc
  new Word("Yao"), // 0xbd
  new Word("Jun"), // 0xbe
  new Word("Dian"), // 0xbf
  new Word("Hui"), // 0xc0
  new Word("Hui"), // 0xc1
  new Word("Gu"), // 0xc2
  new Word("Que"), // 0xc3
  new Word("Ji"), // 0xc4
  new Word("Yi"), // 0xc5
  new Word("Ou"), // 0xc6
  new Word("Hui"), // 0xc7
  new Word("Duan"), // 0xc8
  new Word("Yi"), // 0xc9
  new Word("Xiao"), // 0xca
  new Word("Wu"), // 0xcb
  new Word("Guan"), // 0xcc
  new Word("Mu"), // 0xcd
  new Word("Mei"), // 0xce
  new Word("Mei"), // 0xcf
  new Word("Ai"), // 0xd0
  new Word("Zuo"), // 0xd1
  new Word("Du"), // 0xd2
  new Word("Yu"), // 0xd3
  new Word("Bi"), // 0xd4
  new Word("Bi"), // 0xd5
  new Word("Bi"), // 0xd6
  new Word("Pi"), // 0xd7
  new Word("Pi"), // 0xd8
  new Word("Bi"), // 0xd9
  new Word("Chan"), // 0xda
  new Word("Mao"), // 0xdb
  null, // 0xdc
  null, // 0xdd
  new Word("Pu"), // 0xde
  new Word("Mushiru"), // 0xdf
  new Word("Jia"), // 0xe0
  new Word("Zhan"), // 0xe1
  new Word("Sai"), // 0xe2
  new Word("Mu"), // 0xe3
  new Word("Tuo"), // 0xe4
  new Word("Xun"), // 0xe5
  new Word("Er"), // 0xe6
  new Word("Rong"), // 0xe7
  new Word("Xian"), // 0xe8
  new Word("Ju"), // 0xe9
  new Word("Mu"), // 0xea
  new Word("Hao"), // 0xeb
  new Word("Qiu"), // 0xec
  new Word("Dou"), // 0xed
  new Word("Mushiru"), // 0xee
  new Word("Tan"), // 0xef
  new Word("Pei"), // 0xf0
  new Word("Ju"), // 0xf1
  new Word("Duo"), // 0xf2
  new Word("Cui"), // 0xf3
  new Word("Bi"), // 0xf4
  new Word("San"), // 0xf5
  null, // 0xf6
  new Word("Mao"), // 0xf7
  new Word("Sui"), // 0xf8
  new Word("Yu"), // 0xf9
  new Word("Yu"), // 0xfa
  new Word("Tuo"), // 0xfb
  new Word("He"), // 0xfc
  new Word("Jian"), // 0xfd
  new Word("Ta"), // 0xfe
  new Word("San") // 0xff
  };
}