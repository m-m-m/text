/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import java.util.Objects;

import io.github.mmm.text.search.TextToken;

/**
 * Abstract base implementation of {@link TextToken}.
 */
public abstract class AbstractTextToken implements TextToken {

  /** @see #get() */
  protected final String value;

  /**
   * The constructor.
   *
   * @param value the {@link #get() value}.
   */
  public AbstractTextToken(String value) {

    super();
    Objects.requireNonNull(value);
    this.value = value;
  }

  @Override
  public final String get() {

    return this.value;
  }

  @Override
  public final String toString() {

    return this.value;
  }

}
