/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.attribute;

import io.github.mmm.text.search.TextSearchDecomposer;

/**
 * Interface for an object that {@link #getProperty() has a property name}.
 */
public interface TextSearchAttributeProperty {

  /**
   * @return the name of the specific property containing the text. May be {@code null} if undefined.
   * @see TextSearchDecomposer#getName(Object)
   */
  String getProperty();

}
