/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+FBxx (Alphabetic Presentation Forms, Arabic Presentation Forms-A).
 */
final class Xfb extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("ff"), // 0x00
  LO_FI, // 0x01
  new Letters("fl"), // 0x02
  new Letters("ffi"), // 0x03
  new Letters("ffl"), // 0x04
  LO_ST, // 0x05
  LO_ST, // 0x06
  null, // 0x07
  null, // 0x08
  null, // 0x09
  null, // 0x0a
  null, // 0x0b
  null, // 0x0c
  null, // 0x0d
  null, // 0x0e
  null, // 0x0f
  null, // 0x10
  null, // 0x11
  null, // 0x12
  new Letters("mn"), // 0x13
  LO_ME, // 0x14
  LO_MI, // 0x15
  new Letters("vn"), // 0x16
  new Letters("mkh"), // 0x17
  null, // 0x18
  null, // 0x19
  null, // 0x1a
  null, // 0x1b
  null, // 0x1c
  LO_YI, // 0x1d
  null, // 0x1e
  new Letters("ay"), // 0x1f
  Char.GRAVE, // 0x20
  null, // 0x21
  Letter.LO_D, // 0x22
  Letter.LO_H, // 0x23
  Letter.LO_K, // 0x24
  Letter.LO_L, // 0x25
  Letter.LO_M, // 0x26
  Letter.LO_M, // 0x27
  Letter.LO_T, // 0x28
  Char.PLUS, // 0x29
  LO_SH, // 0x2a
  Letter.LO_S, // 0x2b
  LO_SH, // 0x2c
  Letter.LO_S, // 0x2d
  Letter.LO_A, // 0x2e
  Letter.LO_A, // 0x2f
  null, // 0x30
  Letter.LO_B, // 0x31
  Letter.LO_G, // 0x32
  Letter.LO_D, // 0x33
  Letter.LO_H, // 0x34
  Letter.LO_V, // 0x35
  Letter.LO_Z, // 0x36
  null, // 0x37
  Letter.LO_T, // 0x38
  Letter.LO_Y, // 0x39
  Letter.LO_K, // 0x3a
  Letter.LO_K, // 0x3b
  Letter.LO_L, // 0x3c
  null, // 0x3d
  Letter.LO_L, // 0x3e
  null, // 0x3f
  Letter.LO_N, // 0x40
  Letter.LO_N, // 0x41
  null, // 0x42
  Letter.LO_P, // 0x43
  Letter.LO_P, // 0x44
  null, // 0x45
  LO_TS, // 0x46
  LO_TS, // 0x47
  Letter.LO_R, // 0x48
  LO_SH, // 0x49
  Letter.LO_T, // 0x4a
  LO_VO, // 0x4b
  Letter.LO_B, // 0x4c
  Letter.LO_K, // 0x4d
  Letter.LO_P, // 0x4e
  Letter.LO_L, // 0x4f
  null, // 0x50
  null, // 0x51
  null, // 0x52
  null, // 0x53
  null, // 0x54
  null, // 0x55
  null, // 0x56
  null, // 0x57
  null, // 0x58
  null, // 0x59
  null, // 0x5a
  null, // 0x5b
  null, // 0x5c
  null, // 0x5d
  null, // 0x5e
  null, // 0x5f
  null, // 0x60
  null, // 0x61
  null, // 0x62
  null, // 0x63
  null, // 0x64
  null, // 0x65
  null, // 0x66
  null, // 0x67
  null, // 0x68
  null, // 0x69
  null, // 0x6a
  null, // 0x6b
  null, // 0x6c
  null, // 0x6d
  null, // 0x6e
  null, // 0x6f
  null, // 0x70
  null, // 0x71
  null, // 0x72
  null, // 0x73
  null, // 0x74
  null, // 0x75
  null, // 0x76
  null, // 0x77
  null, // 0x78
  null, // 0x79
  null, // 0x7a
  null, // 0x7b
  null, // 0x7c
  null, // 0x7d
  null, // 0x7e
  null, // 0x7f
  null, // 0x80
  null, // 0x81
  null, // 0x82
  null, // 0x83
  null, // 0x84
  null, // 0x85
  null, // 0x86
  null, // 0x87
  null, // 0x88
  null, // 0x89
  null, // 0x8a
  null, // 0x8b
  null, // 0x8c
  null, // 0x8d
  null, // 0x8e
  null, // 0x8f
  null, // 0x90
  null, // 0x91
  null, // 0x92
  null, // 0x93
  null, // 0x94
  null, // 0x95
  null, // 0x96
  null, // 0x97
  null, // 0x98
  null, // 0x99
  null, // 0x9a
  null, // 0x9b
  null, // 0x9c
  null, // 0x9d
  null, // 0x9e
  null, // 0x9f
  null, // 0xa0
  null, // 0xa1
  null, // 0xa2
  null, // 0xa3
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
  null // 0xff
  };
}