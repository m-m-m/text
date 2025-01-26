/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import java.util.Iterator;

import io.github.mmm.base.score.Score;

/**
 * Interface for a decomposer of a value to index into its properties and to get its type.
 *
 * @param <V> type of the values to index.
 * @param <P> type of the {@link #getProperties(Object) properties} of a value.
 */
public interface TextSearchDecomposer<V, P> {

  /**
   * @param value the value to decompose.
   * @return an {@link Iterator} of the properties of the value to index.
   */
  Iterator<P> getProperties(V value);

  /**
   * @param value the value.
   * @return an object to uniquely identify the value. Supported types are {@link String}, {@link Long},
   *         {@link Integer}, and {@link java.util.UUID}.
   */
  Object getId(V value);

  /**
   * @param value the value.
   * @return the type of the given {@code value}. Could be a mime-type, {@link Class#getName() class-name}, or the like.
   */
  String getType(V value);

  /**
   * @param property the property.
   * @return the name of the given {@code property}.
   */
  String getName(P property);

  /**
   * @param property the property.
   * @return the text content of the {@code property}.
   */
  String getText(P property);

  /**
   * @param property the property.
   * @return the score of the given {@code property}. E.g. {@link Score#MEDIUM}.
   */
  Score getScore(P property);

}
