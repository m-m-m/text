/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Interface for a state object of {@link AsciiConverterImpl ASCII conversion}.
 *
 * @see #append(AsciiBuilder, int, CodePointMapping)
 */
public abstract class AsciiState extends AbstractCodePointMapping {

  AsciiState() {

    super();
  }

}
