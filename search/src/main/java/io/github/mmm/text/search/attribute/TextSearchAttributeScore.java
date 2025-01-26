/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.attribute;

import io.github.mmm.base.score.Score;

/**
 * Interface for an object that {@link #getScore() has} a {@link Score}.
 */
public interface TextSearchAttributeScore {

  /**
   * @return the actual {@link Score} of this object.
   */
  Score getScore();

}
