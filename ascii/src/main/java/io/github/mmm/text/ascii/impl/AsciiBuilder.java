/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * State for {@link AsciiConverterImpl}.
 *
 * @see CodePointMapping#append(AsciiBuilder, int, CodePointMapping)
 */
public class AsciiBuilder {

  final StringBuilder sb;

  final AsciiConverterConfigImpl config;

  AsciiState state;

  AsciiBuilder(int capacity, AsciiConverterConfigImpl config) {

    super();
    this.sb = new StringBuilder(capacity);
    this.config = config;
  }

  String getAscii() {

    return this.sb.toString();
  }

  @Override
  public String toString() {

    return this.sb.toString();
  }

}
