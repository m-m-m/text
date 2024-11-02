/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@link AsciiState} for {@link io.github.mmm.text.ascii.AsciiConverterConfig#withNormalizeNumbers(boolean) number
 * normalization}.
 */
public class NumberState extends AsciiState {

  long sum;

  NumberState() {

    this(0);
  }

  NumberState(long value) {

    super();
    this.sum = value;
  }

  @Override
  public CodePointMapping append(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    if (next instanceof Number num) {
      this.sum += num.getNumerator();
      return this;
    }
    builder.sb.append(this.sum);
    return next;
  }

}
