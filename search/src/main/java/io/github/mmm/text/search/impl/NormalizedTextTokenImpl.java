/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import io.github.mmm.text.search.NormalizedTextToken;

/**
 * Implementation of {@link NormalizedTextToken}.
 */
public final class NormalizedTextTokenImpl extends AbstractTextToken implements NormalizedTextToken {

  private final int hash;

  /**
   * The constructor.
   *
   * @param value the {@link #get() normalized value}.
   * @param hash the {@link #hashCode()}.
   */
  public NormalizedTextTokenImpl(String value, int hash) {

    super(value);
    this.hash = hash;
  }

  @Override
  public int hashCode() {

    return this.hash;
  }

  @Override
  public boolean equals(Object obj) {

    if (obj == this) {
      return true;
    } else if (obj instanceof NormalizedTextTokenImpl token) {
      return (this.hash == token.hash) && this.value.equals(token.value);
    }
    return false;
  }

}
