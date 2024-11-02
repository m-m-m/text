/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Roman {@link Number} (I, II, III, X, L, C, D, M).
 */
class RomanNumber extends Letters implements Number {

  private static final RomanNumber ZERO = new RomanNumber("", 0);

  private final int value;

  RomanNumber(String s, int value) {

    super(s);
    this.value = value;
  }

  @Override
  public Type getType() {

    return Type.NUMBER;
  }

  @Override
  public long getNumerator() {

    return this.value;
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    if (builder.config.normalizeNumbers) {
      return new RomanNumberState(this);
    }
    return super.append(builder, codePoint, next);
  }

  static class RomanNumberState extends AsciiState {

    long sum;

    RomanNumber current;

    RomanNumberState(RomanNumber current) {

      super();
      this.current = current;
    }

    @Override
    public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

      if (next instanceof RomanNumber rn) {
        if (this.current.value < rn.value) {
          this.sum += rn.value - this.current.value;
          this.current = ZERO;
        } else {
          this.sum += this.current.value;
          this.current = rn;
        }
        return this;
      } else {
        this.sum += this.current.value;
        builder.sb.append(this.sum);
        return next;
      }
    }

  }

}
