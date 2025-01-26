/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.attribute;

import io.github.mmm.text.search.TextSearchDecomposer;

/**
 * Interface for an object that {@link #getType() has a type}.
 */
public interface TextSearchAttributeType {

  /**
   * @return the type of the object. Typically a {@link String} (e.g. a mimetype such as "application/pdf") but may also
   *         be a {@link Class} or something else that reflects the type of the object.
   * @see TextSearchDecomposer#getType(Object)
   */
  String getType();

}
