/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import io.github.mmm.base.score.Score;
import io.github.mmm.text.search.hit.AbstractTextSearchHit;

/**
 * Implementation of {@link AbstractTextSearchHit} for a single property.
 */
public class TextSearchHitProperty extends AbstractTextSearchHit {

  private String propertyName;

  /**
   * The constructor.
   *
   * @param id the {@link #getId() ID}.
   * @param type the {@link #getType() type}.
   * @param score the {@link #getScore() score}.
   * @param propertyName the {@link #getProperty() property name}.
   */
  public TextSearchHitProperty(Object id, String type, Score score, String propertyName) {

    super(id, type, score);
    this.propertyName = propertyName;
  }

  @Override
  public String getProperty() {

    return this.propertyName;
  }

}
