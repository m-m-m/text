/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl.query;

import java.util.Collections;
import java.util.Iterator;

import io.github.mmm.text.search.query.TextSearchQuery;

/**
 * {@link AbstractTextSearchQuery} that is atomic (has no {@link #iterator() children}.
 */
public abstract class AtomicTextSearchQuery extends AbstractTextSearchQuery {

  private final String property;

  /**
   * The constructor.
   *
   * @param property the {@link #getProperty() property name}.
   */
  public AtomicTextSearchQuery(String property) {

    super();
    this.property = property;
  }

  @Override
  public String getProperty() {

    return this.property;
  }

  @Override
  public final int getChildCount() {

    return 0;
  }

  @Override
  public TextSearchQuery getChild(int i) {

    return null;
  }

  @Override
  public final Iterator<TextSearchQuery> iterator() {

    return Collections.emptyIterator();
  }
}
