/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link Letters} for a word. Subsequent words will be separated by space.
 */
public class Word extends Chars {

  Word(String s) {

    super(s);
  }

  @Override
  public Type getType() {

    return Type.TEXT;
  }

  /**
   * Default part of {@link #append(AsciiBuilder, int, CodePointMapping)} that can be overridden by sub-classes.
   *
   * @param builder the {@link AsciiBuilder}.
   * @param codePoint the original {@link String#codePointAt(int) code point}.
   * @param next the next {@link CodePointMapping}.
   * @return an {@link AsciiState} for stateful processing.
   */
  protected CodePointMapping doAppend(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    return super.append(builder, codePoint, next);
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    doAppend(builder, codePoint, next);
    if (next != null) {
      Type type = next.getType();
      if ((type == Type.TEXT) || (type == Type.NUMBER) || (type == Type.CURRENCY)) {
        builder.sb.append(' ');
      }
    }
    return next;
  }

}
