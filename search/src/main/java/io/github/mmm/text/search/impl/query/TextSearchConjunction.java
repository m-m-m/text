/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl.query;

/**
 * {@link Enum} with the conjunction operators of a {@link CompositeTextSearchQuery}.
 *
 * @since 1.0.0
 */
public enum TextSearchConjunction {

  /** All terms should occur. */
  DEFAULT(" "),

  /** All terms must occur exactly and in order. */
  PHRASE(" "),

  /** All terms must occur. */
  AND(" & "),

  /** At least on of the terms must occur. */
  OR(" | ");

  private final String infix;

  /**
   * The constructor.
   *
   * @param name is the {@link #getName() name}.
   * @param infix is the {@link #getInfix() infix}.
   */
  private TextSearchConjunction(String infix) {

    this.infix = infix;
  }

  /**
   * @return infix the infix to insert between the query terms.
   */
  public String getInfix() {

    return this.infix;
  }

}
