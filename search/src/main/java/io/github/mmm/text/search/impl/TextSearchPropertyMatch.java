/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import io.github.mmm.text.search.attribute.TextSearchAttributeProperty;

/**
 * A match for an {@link #getProperty() property name}.
 */
public class TextSearchPropertyMatch implements TextSearchAttributeProperty {

  private final String propertyName;

  TextSearchPropertyMatch next;

  /**
   * The constructor.
   *
   * @param propertyName the {@link #getProperty() property name}.
   * @param next the {@link #getNext() next} {@link TextSearchPropertyMatch} or {@code null}.
   */
  public TextSearchPropertyMatch(String propertyName, TextSearchPropertyMatch next) {

    super();
    this.propertyName = propertyName;
    this.next = next;
  }

  @Override
  public String getProperty() {

    return this.propertyName;
  }

  /**
   * @return the next {@link TextSearchPropertyMatch} if a further property is matching or {@code null} if this is the
   *         last one.
   */
  public TextSearchPropertyMatch getNext() {

    return this.next;
  }

}
