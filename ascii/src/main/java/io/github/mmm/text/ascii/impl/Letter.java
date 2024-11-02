/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link Char} for Latin ASCII letter {@link Character}.
 */
class Letter extends Char {

  // lower case
  static final Letter LO_A = new Letter('a');

  static final Letter LO_B = new Letter('b');

  static final Letter LO_C = new Letter('c');

  static final Letter LO_D = new Letter('d');

  static final Letter LO_E = new Letter('e');

  static final Letter LO_F = new Letter('f');

  static final Letter LO_G = new Letter('g');

  static final Letter LO_H = new Letter('h');

  static final Letter LO_I = new Letter('i');

  static final Letter LO_J = new Letter('j');

  static final Letter LO_K = new Letter('k');

  static final Letter LO_L = new Letter('l');

  static final Letter LO_M = new Letter('m');

  static final Letter LO_N = new Letter('n');

  static final Letter LO_O = new Letter('o');

  static final Letter LO_P = new Letter('p');

  static final Letter LO_Q = new Letter('q');

  static final Letter LO_R = new Letter('r');

  static final Letter LO_S = new Letter('s');

  static final Letter LO_T = new Letter('t');

  static final Letter LO_U = new Letter('u');

  static final Letter LO_V = new Letter('v');

  static final Letter LO_W = new Letter('w');

  static final Letter LO_X = new Letter('x');

  static final Letter LO_Y = new Letter('y');

  static final Letter LO_Z = new Letter('z');

  // upper case
  static final Letter UP_A = new Letter('A');

  static final Letter UP_B = new Letter('B');

  static final Letter UP_C = new Letter('C');

  static final Letter UP_E = new Letter('E');

  static final Letter UP_I = new Letter('I');

  static final Letter UP_O = new Letter('O');

  static final Letter UP_U = new Letter('U');

  static final Letter UP_D = new Letter('D');

  static final Letter UP_N = new Letter('N');

  static final Letter UP_F = new Letter('F');

  static final Letter UP_G = new Letter('G');

  static final Letter UP_H = new Letter('H');

  static final Letter UP_J = new Letter('J');

  static final Letter UP_M = new Letter('M');

  static final Letter UP_L = new Letter('L');

  static final Letter UP_K = new Letter('K');

  static final Letter UP_S = new Letter('S');

  static final Letter UP_R = new Letter('R');

  static final Letter UP_Q = new Letter('Q');

  static final Letter UP_P = new Letter('P');

  static final Letter UP_T = new Letter('T');

  static final Letter UP_V = new Letter('V');

  static final Letter UP_W = new Letter('W');

  static final Letter UP_X = new Letter('X');

  static final Letter UP_Y = new Letter('Y');

  static final Letter UP_Z = new Letter('Z');

  Letter(char c) {

    super(c);
    assert isLatinLetter(c);
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    switch (builder.config.caseConversion) {
      case LOWER_CASE -> builder.sb.append(Character.toLowerCase(this.c));
      case UPPER_CASE -> builder.sb.append(Character.toUpperCase(this.c));
      default -> builder.sb.append(this.c);
    }
    return next;
  }

  @Override
  public Type getType() {

    return Type.TEXT;
  }

}
