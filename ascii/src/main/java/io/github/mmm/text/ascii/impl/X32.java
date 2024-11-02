/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+32xx (Enclosed CJK Letters and Months).
 */
final class X32 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Chars("(g)"), // 0x00
  new Chars("(n)"), // 0x01
  new Chars("(d)"), // 0x02
  new Chars("(r)"), // 0x03
  new Chars("(m)"), // 0x04
  new Chars("(b)"), // 0x05
  new Chars("(s)"), // 0x06
  new Chars("()"), // 0x07
  new Chars("(j)"), // 0x08
  new Chars("(c)"), // 0x09
  new Chars("(k)"), // 0x0a
  new Chars("(t)"), // 0x0b
  new Chars("(p)"), // 0x0c
  new Chars("(h)"), // 0x0d
  new Chars("(ga)"), // 0x0e
  new Chars("(na)"), // 0x0f
  new Chars("(da)"), // 0x10
  new Chars("(ra)"), // 0x11
  new Chars("(ma)"), // 0x12
  new Chars("(ba)"), // 0x13
  new Chars("(sa)"), // 0x14
  new Chars("(a)"), // 0x15
  new Chars("(ja)"), // 0x16
  new Chars("(ca)"), // 0x17
  new Chars("(ka)"), // 0x18
  new Chars("(ta)"), // 0x19
  new Chars("(pa)"), // 0x1a
  new Chars("(ha)"), // 0x1b
  new Chars("(ju)"), // 0x1c
  null, // 0x1d
  null, // 0x1e
  null, // 0x1f
  new GenericNumber(1, "(1)"), // 0x20
  new GenericNumber(2, "(2)"), // 0x21
  new GenericNumber(3, "(3)"), // 0x22
  new GenericNumber(4, "(4)"), // 0x23
  new GenericNumber(5, "(5)"), // 0x24
  new GenericNumber(6, "(6)"), // 0x25
  new GenericNumber(7, "(7)"), // 0x26
  new GenericNumber(8, "(8)"), // 0x27
  new GenericNumber(9, "(9)"), // 0x28
  new GenericNumber(10, "(10)"), // 0x29
  new Chars("(Yue)"), // 0x2a
  new Chars("(Huo)"), // 0x2b
  new Chars("(Shui)"), // 0x2c
  new Chars("(Mu)"), // 0x2d
  new Chars("(Jin)"), // 0x2e
  new Chars("(Tu)"), // 0x2f
  new Chars("(Ri)"), // 0x30
  new Chars("(Zhu)"), // 0x31
  new Chars("(You)"), // 0x32
  new Chars("(She)"), // 0x33
  new Chars("(Ming)"), // 0x34
  new Chars("(Te)"), // 0x35
  new Chars("(Cai)"), // 0x36
  new Chars("(Zhu)"), // 0x37
  new Chars("(Lao)"), // 0x38
  new Chars("(Dai)"), // 0x39
  new Chars("(Hu)"), // 0x3a
  new Chars("(Xue)"), // 0x3b
  new Chars("(Jian)"), // 0x3c
  new Chars("(Qi)"), // 0x3d
  new Chars("(Zi)"), // 0x3e
  new Chars("(Xie)"), // 0x3f
  new Chars("(Ji)"), // 0x40
  new Chars("(Xiu)"), // 0x41
  new Chars("<<"), // 0x42
  new Chars(">>"), // 0x43
  new Chars("(?)"), // 0x44
  new Chars("(kindergarden)"), // 0x45
  new Chars("(school)"), // 0x46
  new Chars("(koto)"), // 0x47
  new GenericNumber(10, "(10)"), // 0x48
  new GenericNumber(20, "(20)"), // 0x49
  new GenericNumber(30, "(30)"), // 0x4a
  new GenericNumber(40, "(40)"), // 0x4b
  new GenericNumber(50, "(50)"), // 0x4c
  new GenericNumber(60, "(60)"), // 0x4d
  new GenericNumber(70, "(70)"), // 0x4e
  new GenericNumber(80, "(80)"), // 0x4f
  new Word("PTE"), // 0x50
  new GenericNumber(21, "(21)"), // 0x51
  new GenericNumber(22, "(22)"), // 0x52
  new GenericNumber(23, "(23)"), // 0x53
  new GenericNumber(24, "(24)"), // 0x54
  new GenericNumber(25, "(25)"), // 0x55
  new GenericNumber(26, "(26)"), // 0x56
  new GenericNumber(27, "(27)"), // 0x57
  new GenericNumber(28, "(28)"), // 0x58
  new GenericNumber(29, "(29)"), // 0x59
  new GenericNumber(30, "(30)"), // 0x5a
  new GenericNumber(31, "(31)"), // 0x5b
  new GenericNumber(32, "(32)"), // 0x5c
  new GenericNumber(33, "(33)"), // 0x5d
  new GenericNumber(34, "(34)"), // 0x5e
  new GenericNumber(35, "(35)"), // 0x5f
  new Chars("(g)"), // 0x60
  new Chars("(n)"), // 0x61
  new Chars("(d)"), // 0x62
  new Chars("(r)"), // 0x63
  new Chars("(m)"), // 0x64
  new Chars("(b)"), // 0x65
  new Chars("(s)"), // 0x66
  new Chars("()"), // 0x67
  new Chars("(j)"), // 0x68
  new Chars("(c)"), // 0x69
  new Chars("(k)"), // 0x6a
  new Chars("(t)"), // 0x6b
  new Chars("(p)"), // 0x6c
  new Chars("(h)"), // 0x6d
  new Chars("(ga)"), // 0x6e
  new Chars("(na)"), // 0x6f
  new Chars("(da)"), // 0x70
  new Chars("(ra)"), // 0x71
  new Chars("(ma)"), // 0x72
  new Chars("(ba)"), // 0x73
  new Chars("(sa)"), // 0x74
  new Chars("(a)"), // 0x75
  new Chars("(ja)"), // 0x76
  new Chars("(ca)"), // 0x77
  new Chars("(ka)"), // 0x78
  new Chars("(ta)"), // 0x79
  new Chars("(pa)"), // 0x7a
  new Chars("(ha)"), // 0x7b
  null, // 0x7c
  null, // 0x7d
  null, // 0x7e
  new Word("KIS"), // 0x7f
  new GenericNumber(1, "(1)"), // 0x80
  new GenericNumber(2, "(2)"), // 0x81
  new GenericNumber(3, "(3)"), // 0x82
  new GenericNumber(4, "(4)"), // 0x83
  new GenericNumber(5, "(5)"), // 0x84
  new GenericNumber(6, "(6)"), // 0x85
  new GenericNumber(7, "(7)"), // 0x86
  new GenericNumber(8, "(8)"), // 0x87
  new GenericNumber(9, "(9)"), // 0x88
  new GenericNumber(10, "(10)"), // 0x89
  new Chars("(Yue)"), // 0x8a
  new Chars("(Huo)"), // 0x8b
  new Chars("(Shui)"), // 0x8c
  new Chars("(Mu)"), // 0x8d
  new Chars("(Jin)"), // 0x8e
  new Chars("(Tu)"), // 0x8f
  new Chars("(Ri)"), // 0x90
  new Chars("(Zhu)"), // 0x91
  new Chars("(You)"), // 0x92
  new Chars("(She)"), // 0x93
  new Chars("(Ming)"), // 0x94
  new Chars("(Te)"), // 0x95
  new Chars("(Cai)"), // 0x96
  new Chars("(Zhu)"), // 0x97
  new Chars("(Lao)"), // 0x98
  new Chars("(Mi)"), // 0x99
  new Chars("(Nan)"), // 0x9a
  new Chars("(Nu)"), // 0x9b
  new Chars("(Shi)"), // 0x9c
  new Chars("(You)"), // 0x9d
  new Chars("(Yin)"), // 0x9e
  new Chars("(Zhu)"), // 0x9f
  new Chars("(Xiang)"), // 0xa0
  new Chars("(Xiu)"), // 0xa1
  new Chars("(Xie)"), // 0xa2
  new Chars("(Zheng)"), // 0xa3
  new Chars("(Shang)"), // 0xa4
  new Chars("(Zhong)"), // 0xa5
  new Chars("(Xia)"), // 0xa6
  new Chars("(Zuo)"), // 0xa7
  new Chars("(You)"), // 0xa8
  new Chars("(Yi)"), // 0xa9
  new Chars("(Zong)"), // 0xaa
  new Chars("(Xue)"), // 0xab
  new Chars("(Jian)"), // 0xac
  new Chars("(Qi)"), // 0xad
  new Chars("(Zi)"), // 0xae
  new Chars("(Xie)"), // 0xaf
  new Chars("(Ye)"), // 0xb0
  new GenericNumber(36, "(36)"), // 0xb1
  new GenericNumber(37, "(37)"), // 0xb2
  new GenericNumber(38, "(38)"), // 0xb3
  new GenericNumber(39, "(39)"), // 0xb4
  new GenericNumber(40, "(40)"), // 0xb5
  new GenericNumber(41, "(41)"), // 0xb6
  new GenericNumber(42, "(42)"), // 0xb7
  new GenericNumber(43, "(43)"), // 0xb8
  new GenericNumber(44, "(44)"), // 0xb9
  new GenericNumber(45, "(45)"), // 0xba
  new GenericNumber(46, "(46)"), // 0xbb
  new GenericNumber(47, "(47)"), // 0xbc
  new GenericNumber(48, "(48)"), // 0xbd
  new GenericNumber(49, "(49)"), // 0xbe
  new GenericNumber(50, "(50)"), // 0xbf
  new Chars("1M"), // 0xc0
  new Chars("2M"), // 0xc1
  new Chars("3M"), // 0xc2
  new Chars("4M"), // 0xc3
  new Chars("5M"), // 0xc4
  new Chars("6M"), // 0xc5
  new Chars("7M"), // 0xc6
  new Chars("8M"), // 0xc7
  new Chars("9M"), // 0xc8
  new Chars("10M"), // 0xc9
  new Chars("11M"), // 0xca
  new Chars("12M"), // 0xcb
  new Word("Hg"), // 0xcc
  new Word("erg"), // 0xcd
  new Word("eV"), // 0xce
  new Word("LTD"), // 0xcf
  Letter.LO_A, // 0xd0
  Letter.LO_I, // 0xd1
  Letter.LO_U, // 0xd2
  Letter.LO_U, // 0xd3
  Letter.LO_O, // 0xd4
  LO_KA, // 0xd5
  LO_KI, // 0xd6
  LO_KU, // 0xd7
  LO_KE, // 0xd8
  LO_KO, // 0xd9
  LO_SA, // 0xda
  LO_SI, // 0xdb
  LO_SU, // 0xdc
  LO_SE, // 0xdd
  LO_SO, // 0xde
  LO_TA, // 0xdf
  LO_TI, // 0xe0
  LO_TU, // 0xe1
  LO_TE, // 0xe2
  LO_TO, // 0xe3
  LO_NA, // 0xe4
  LO_NI, // 0xe5
  LO_NU, // 0xe6
  LO_NE, // 0xe7
  LO_NO, // 0xe8
  LO_HA, // 0xe9
  LO_HI, // 0xea
  LO_HU, // 0xeb
  LO_HE, // 0xec
  LO_HO, // 0xed
  LO_MA, // 0xee
  LO_MI, // 0xef
  LO_MU, // 0xf0
  LO_ME, // 0xf1
  LO_MO, // 0xf2
  LO_YA, // 0xf3
  LO_YU, // 0xf4
  LO_YO, // 0xf5
  LO_RA, // 0xf6
  LO_RI, // 0xf7
  LO_RU, // 0xf8
  LO_RE, // 0xf9
  LO_RO, // 0xfa
  LO_WA, // 0xfb
  LO_WI, // 0xfc
  LO_WE, // 0xfd
  LO_WO, // 0xfe
  null, // 0xff
  };
}