/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl.query;

import java.util.Iterator;

import io.github.mmm.base.collection.ArrayIterator;
import io.github.mmm.text.search.query.TextSearchQuery;

/**
 * A composite implementation of {@link TextSearchQuery} that aggregates a number of {@link #getChild(int) children} via
 * a {@link #getConjunction() conjunction}.
 */
public class CompositeTextSearchQuery extends AbstractTextSearchQuery {

  private final TextSearchConjunction conjunction;

  private final AbstractTextSearchQuery[] children;

  /**
   * The constructor.
   *
   * @param conjunction the {@link #getConjunction() conjunction}.
   * @param children the {@link #getChild(int) children} to compose.
   */
  public CompositeTextSearchQuery(TextSearchConjunction conjunction, AbstractTextSearchQuery... children) {

    super();
    assert (children.length > 1);
    this.conjunction = conjunction;
    this.children = children;
  }

  /**
   * @return the {@link TextSearchConjunction} to compose the {@link #getChild(int) children}.
   */
  public TextSearchConjunction getConjunction() {

    return this.conjunction;
  }

  @Override
  public AbstractTextSearchQuery getChild(int i) {

    if ((i >= 0) && (i < this.children.length)) {
      return this.children[i];
    }
    return null;
  }

  /**
   * @return the number of {@link #getChild(int) children}.
   */
  @Override
  public int getChildCount() {

    return this.children.length;
  }

  @Override
  public Iterator<TextSearchQuery> iterator() {

    return new ArrayIterator<>(this.children);
  }

  @Override
  protected void toString(StringBuilder sb, boolean addParenthesisIfNeeded) {

    String prefix = "";
    String suffix = "";
    if (this.conjunction == TextSearchConjunction.PHRASE) {
      prefix = "\"";
      suffix = "\"";
    } else if (addParenthesisIfNeeded) {
      prefix = "(";
      suffix = ")";
    }
    String infix = this.conjunction.getInfix();
    for (AbstractTextSearchQuery child : this.children) {
      sb.append(prefix);
      child.toString(sb, true);
      prefix = infix;
    }
    sb.append(suffix);
  }

}
