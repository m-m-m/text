/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl.query;

import io.github.mmm.text.search.query.TextSearchQuery;

/**
 * Abstract base implementation of {@link TextSearchQuery}.
 */
public abstract class AbstractTextSearchQuery implements TextSearchQuery {

  @Override
  public TextSearchQuery negate() {

    return new NegatedTextSearchQuery(this);
  }

  @Override
  public boolean isNegated() {

    return false;
  }

  @Override
  public final String toString() {

    StringBuilder sb = new StringBuilder();
    toString(sb, false);
    return sb.toString();
  }

  /**
   * @param sb the {@link StringBuilder} where to {@link StringBuilder#append(CharSequence) append} the
   *        {@link #toString() string representation}.
   * @param addParenthesisIfNeeded - {@code true} if parenthesis should be added if needed, {@code false} otherwise.
   */
  protected abstract void toString(StringBuilder sb, boolean addParenthesisIfNeeded);

}
