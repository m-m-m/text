/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.query;

import io.github.mmm.text.search.attribute.TextSearchAttributeProperty;
import io.github.mmm.text.search.impl.query.AbstractTextSearchQuery;
import io.github.mmm.text.search.impl.query.CompositeTextSearchQuery;
import io.github.mmm.text.search.impl.query.TextSearchConjunction;

/**
 * Interface for a search query.
 */
public interface TextSearchQuery extends Iterable<TextSearchQuery>, TextSearchAttributeProperty {

  @Override
  default String getProperty() {

    return null;
  }

  /**
   * @param i the index of the requested child.
   * @return the child {@link TextSearchQuery} for the given index or {@code null} if not in the range from {@code 0} to
   *         <code>{@link #getChildCount()}-1</code>.
   */
  TextSearchQuery getChild(int i);

  /**
   * @return the number of {@link #iterator() children}.
   */
  int getChildCount();

  /**
   * @return {@code true} if {@link #negate() negated}, {@code false} otherwise.
   */
  boolean isNegated();

  /**
   * @return the negation of this {@link TextSearchQuery}.
   */
  TextSearchQuery negate();

  static TextSearchQuery of(String text, boolean literal) {

    return of(text, literal, null);
  }

  static TextSearchQuery of(String text, boolean literal, String property) {

    return null;
  }

  static TextSearchQuery and(TextSearchQuery... queries) {

    if (queries.length == 0) {
      return null;
    } else if (queries.length == 1) {
      return queries[0];
    }
    return new CompositeTextSearchQuery(TextSearchConjunction.AND, (AbstractTextSearchQuery[]) queries);
  }

  static TextSearchQuery or(TextSearchQuery... queries) {

    if (queries.length == 0) {
      return null;
    } else if (queries.length == 1) {
      return queries[0];
    }
    return new CompositeTextSearchQuery(TextSearchConjunction.OR, (AbstractTextSearchQuery[]) queries);
  }

}
