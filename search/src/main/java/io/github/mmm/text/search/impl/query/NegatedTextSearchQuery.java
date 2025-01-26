/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl.query;

import java.util.Iterator;
import java.util.Objects;

import io.github.mmm.base.collection.SingleElementIterator;
import io.github.mmm.text.search.query.TextSearchQuery;

/**
 * {@link #isNegated() Negated} {@link AtomicTextSearchQuery}.
 */
public final class NegatedTextSearchQuery extends AbstractTextSearchQuery {

  private final AbstractTextSearchQuery query;

  /**
   * The constructor.
   *
   * @param query the {@link AbstractTextSearchQuery} to {@link #negate() negate}.
   */
  public NegatedTextSearchQuery(AbstractTextSearchQuery query) {

    super();
    Objects.requireNonNull(query);
    this.query = query;
  }

  @Override
  public boolean isNegated() {

    return true;
  }

  @Override
  public TextSearchQuery negate() {

    return this.query;
  }

  @Override
  public String getProperty() {

    return this.query.getProperty();
  }

  @Override
  public TextSearchQuery getChild(int i) {

    if (i == 0) {
      return this.query;
    }
    return null;
  }

  @Override
  public int getChildCount() {

    return 1;
  }

  @Override
  public Iterator<TextSearchQuery> iterator() {

    return new SingleElementIterator<>(this.query);
  }

  @Override
  protected void toString(StringBuilder sb, boolean addParenthesisIfNeeded) {

    sb.append("!");
    this.query.toString(sb, true);
  }

}
