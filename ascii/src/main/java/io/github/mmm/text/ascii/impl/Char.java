/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Implementation of {@link CodePointMapping} for static {@link Character}.
 */
public class Char extends AbstractCodePointMapping {

  // other non-letters
  static final Char TAB = new Char('\t');

  static final Char LF = new Char('\n');

  static final Char SPACE = new Char(' ');

  static final Char EXCLAMATION = new Char('!');

  static final Char QUESTION = new Char('?');

  static final Char AT = new Char('@');

  static final Char GREATER = new Char('>');

  static final Char EQUAL = new Char('=');

  static final Char LESS = new Char('<');

  static final Char COMMA = new Char(',');

  static final Char COLON = new Char(':');

  static final Char SEMICOL = new Char(';');

  static final Char MINUS = new Char('-');

  static final Char PLUS = new Char('+');

  static final Char ASTERISK = new Char('*');

  static final Char SLASH = new Char('/');

  static final Char BKSLASH = new Char('\\');

  static final Char PIPE = new Char('|');

  static final Char TILDE = new Char('~');

  static final Char PERIOD = new Char('.');

  static final Char AMP = new Char('&');

  static final Char PERCENT = new Char('%');

  static final Char DOLAR = new Char('$');

  static final Char HASH = new Char('#');

  static final Char UNDSCORE = new Char('_');

  static final Char CARET = new Char('^');

  static final Char QUOTE1 = new Char('\'');

  static final Char QUOTE2 = new Char('"');

  static final Char GRAVE = new Char('`');

  static final Char PARENT0 = new Char('(');

  static final Char PARENT1 = new Char(')');

  static final Char BRACKET0 = new Char('[');

  static final Char BRACKET1 = new Char(']');

  static final Char CURLY0 = new Char('{');

  static final Char CURLY1 = new Char('}');

  final char c;

  Char(char c) {

    super();
    this.c = c;
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    builder.sb.append(this.c);
    return next;
  }

  @Override
  public String asString() {

    return Character.toString(this.c);
  }

}
