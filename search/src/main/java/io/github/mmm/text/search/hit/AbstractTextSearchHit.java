/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.hit;

import java.util.Objects;

import io.github.mmm.base.score.Score;

/**
 * Abstract base implementation of {@link TextSearchHit}.
 */
public abstract class AbstractTextSearchHit implements TextSearchHit {

  private final Object id;

  private final String type;

  private final Score score;

  /**
   * The constructor.
   *
   * @param id the {@link #getId() ID}.
   * @param type the {@link #getType() type}.
   * @param score the {@link #getScore() score}.
   */
  public AbstractTextSearchHit(Object id, String type, Score score) {

    super();
    Objects.requireNonNull(score);
    this.id = id;
    this.type = type;
    this.score = score;
  }

  @Override
  public Object getId() {

    return this.id;
  }

  @Override
  public String getType() {

    return this.type;
  }

  @Override
  public Score getScore() {

    return this.score;
  }

  @Override
  public String toString() {

    return "Hit [" + this.id + "/" + this.type + "@" + this.score + "]";
  }

}
