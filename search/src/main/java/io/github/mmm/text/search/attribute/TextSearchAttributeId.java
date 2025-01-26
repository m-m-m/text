/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.attribute;

import io.github.mmm.text.search.TextSearchDecomposer;

/**
 * Interface for an object that {@link #getId() has} a unique {@code ID}.
 */
public interface TextSearchAttributeId {

  /**
   * @return the unique identifier (ID) of the object.
   * @see TextSearchDecomposer#getId(Object)
   */
  Object getId();

}
