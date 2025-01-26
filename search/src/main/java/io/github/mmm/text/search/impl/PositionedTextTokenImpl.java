/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import io.github.mmm.text.search.PositionedTextToken;

/**
 * Implementation of {@link PositionedTextToken}.
 */
public final class PositionedTextTokenImpl extends AbstractTextToken implements PositionedTextToken {

  private final int start;

  /**
   * The constructor.
   *
   * @param value the {@link #get() value}.
   * @param start the {@link #getStart() start position}.
   */
  public PositionedTextTokenImpl(String value, int start) {

    super(value);
    this.start = start;
  }

  @Override
  public int getStart() {

    return this.start;
  }

  @Override
  public int hashCode() {

    return this.value.hashCode();
  }

  @Override
  public boolean equals(Object obj) {

    if (obj == this) {
      return true;
    } else if (obj instanceof PositionedTextTokenImpl token) {
      return this.value.equals(token.value);
    }
    return false;
  }

}
