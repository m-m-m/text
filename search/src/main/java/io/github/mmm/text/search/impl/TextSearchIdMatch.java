/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import io.github.mmm.text.search.attribute.TextSearchAttributeId;

/**
 * A match for an {@link #getId() ID}.
 */
public class TextSearchIdMatch implements TextSearchAttributeId {

  private final Object id;

  TextSearchIdMatch next;

  /**
   * The constructor.
   *
   * @param id the {@link #getId() ID}.
   * @param next the {@link #getNext() next} {@link TextSearchIdMatch} or {@code null}.
   */
  public TextSearchIdMatch(Object id, TextSearchIdMatch next) {

    super();
    this.id = id;
    this.next = next;
  }

  @Override
  public Object getId() {

    return this.id;
  }

  /**
   * @return the next {@link TextSearchIdMatch} if further ID is matching or {@code null} if this is the last one.
   */
  public TextSearchIdMatch getNext() {

    return this.next;
  }

}
