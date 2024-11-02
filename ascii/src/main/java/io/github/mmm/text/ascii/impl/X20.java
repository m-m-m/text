/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link Xxx} for codepoint U+20xx (General Punctuation, Superscripts and Subscripts, Currency Symbols).
 */
final class X20 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  Char.SPACE, // 0x00
  Char.SPACE, // 0x01
  Char.SPACE, // 0x02
  Char.SPACE, // 0x03
  Char.SPACE, // 0x04
  Char.SPACE, // 0x05
  Char.SPACE, // 0x06
  Char.SPACE, // 0x07
  Char.SPACE, // 0x08
  Char.SPACE, // 0x09
  Char.SPACE, // 0x0a
  Char.SPACE, // 0x0b
  null, // 0x0c
  null, // 0x0d
  null, // 0x0e
  null, // 0x0f
  Char.MINUS, // 0x10
  Char.MINUS, // 0x11
  Char.MINUS, // 0x12
  Char.MINUS, // 0x13
  new Chars("--"), // 0x14
  new Chars("--"), // 0x15
  new Chars("||"), // 0x16
  Char.UNDSCORE, // 0x17
  Char.QUOTE1, // 0x18
  Char.QUOTE1, // 0x19
  Char.COMMA, // 0x1a
  Char.QUOTE1, // 0x1b
  Char.QUOTE2, // 0x1c
  Char.QUOTE2, // 0x1d
  new Chars(",,"), // 0x1e
  Char.QUOTE2, // 0x1f
  Char.PLUS, // 0x20
  new Chars("++"), // 0x21
  Char.ASTERISK, // 0x22
  new Chars("*>"), // 0x23
  Char.PERIOD, // 0x24
  new Chars(".."), // 0x25
  new Chars("..."), // 0x26
  Char.PERIOD, // 0x27
  Char.LF, // 0x28
  new Chars("\n\n"), // 0x29
  null, // 0x2a
  null, // 0x2b
  null, // 0x2c
  null, // 0x2d
  null, // 0x2e
  Char.SPACE, // 0x2f
  new Chars("%0"), // 0x30
  new Chars("%00"), // 0x31
  Char.QUOTE1, // 0x32
  new Chars("\'\'"), // 0x33
  new Chars("\'\'\'"), // 0x34
  Char.GRAVE, // 0x35
  new Chars("``"), // 0x36
  new Chars("```"), // 0x37
  Char.CARET, // 0x38
  Char.LESS, // 0x39
  Char.GREATER, // 0x3a
  Char.ASTERISK, // 0x3b
  new Chars("!!"), // 0x3c
  new Chars("!?"), // 0x3d
  Char.MINUS, // 0x3e
  Char.UNDSCORE, // 0x3f
  Char.MINUS, // 0x40
  Char.CARET, // 0x41
  new Chars("***"), // 0x42
  new Chars("--"), // 0x43
  Char.SLASH, // 0x44
  new Chars("-["), // 0x45
  new Chars("]-"), // 0x46
  null, // 0x47
  new Chars("?!"), // 0x48
  new Chars("!?"), // 0x49
  Digit._7, // 0x4a
  new Chars("PP"), // 0x4b
  new Chars("(]"), // 0x4c
  new Chars("[)"), // 0x4d
  null, // 0x4e
  null, // 0x4f
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
  Digit._0, // 0x70
  null, // 0x71
  null, // 0x72
  null, // 0x73
  Digit._4, // 0x74
  Digit._5, // 0x75
  Digit._6, // 0x76
  Digit._7, // 0x77
  Digit._8, // 0x78
  Digit._9, // 0x79
  Char.PLUS, // 0x7a
  Char.MINUS, // 0x7b
  Char.EQUAL, // 0x7c
  Char.PARENT0, // 0x7d
  Char.PARENT1, // 0x7e
  Letter.LO_N, // 0x7f
  Digit._0, // 0x80
  Digit._1, // 0x81
  Digit._2, // 0x82
  Digit._3, // 0x83
  Digit._4, // 0x84
  Digit._5, // 0x85
  Digit._6, // 0x86
  Digit._7, // 0x87
  Digit._8, // 0x88
  Digit._9, // 0x89
  Char.PLUS, // 0x8a
  Char.MINUS, // 0x8b
  Char.EQUAL, // 0x8c
  Char.PARENT0, // 0x8d
  Char.PARENT1, // 0x8e
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
  Currency.ECU, // 0xa0
  Currency.COLON, // 0xa1
  Currency.CRUZEIRO, // 0xa2
  Currency.FRANC, // 0xa3
  Currency.POUND, // 0xa4
  Currency.MIL, // 0xa5
  Currency.NAIRA, // 0xa6
  Currency.PESETA, // 0xa7
  Currency.RUPEE, // 0xa8
  Currency.WON, // 0xa9
  Currency.SHEKEL, // 0xaa
  Currency.DONG, // 0xab
  Currency.EURO, // 0xac
  Currency.KIP, // 0xad
  Currency.TUGRIK, // 0xae
  Currency.DRACHMA, // 0xaf
  Currency.PFENNIG, // 0xb0
  Currency.PESO, // 0xb1
  Currency.GUARANI, // 0xb2
  Currency.AUSTRAL, // 0xb3
  Currency.HRYVNIA, // 0xb4
  Currency.CEDI, // 0xb5
  Currency.LIVRE_TOURNOIS, // 0xb6
  Currency.SPESMILO, // 0xb7
  Currency.TENGE, // 0xb8
  Currency.I_RUPEE, // 0xb9
  Currency.LIRA, // 0xba
  Currency.RIGSDALER, // 0xbb
  Currency.MANAT, // 0xbc
  Currency.RUBLE, // 0xbd
  Currency.LARI, // 0xbe
  Currency.BITCOIN, // 0xbf
  Currency.SOM, // 0xc0
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
