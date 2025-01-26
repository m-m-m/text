/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Interface for the mapping result of a code-point.
 */
public interface CodePointMapping {

  /**
   * @param builder the {@link AsciiBuilder}.
   * @param codePoint the original {@link String#codePointAt(int) code point}.
   * @param next the next {@link CodePointMapping}.
   * @return an {@link AsciiState} for stateful processing.
   */
  CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next);

  /**
   * @return the {@link #toString() string representation}.
   */
  String asString();

  /**
   * @return a longer {@link #toString() string representation} as available (may be the same as {@link #asString()}).
   */
  default String asStringLong() {

    return asString();
  }

  /**
   * @return the {@link Type}.
   */
  default Type getType() {

    return Type.OTHER;
  }

  /**
   * {@link Enum} with the available {@link CodePointMapping#getType() type}s for a {@link CodePointMapping}.
   */
  enum Type {

    TEXT,

    NUMBER,

    CURRENCY,

    OTHER
  }

}
