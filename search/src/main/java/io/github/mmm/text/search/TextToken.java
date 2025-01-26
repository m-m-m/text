/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import java.util.function.Supplier;

/**
 * Interface for a {@link TextToken} as a single word from a text or a query.
 *
 * @since 1.0.0
 * @see PositionedTextToken
 * @see NormalizedTextToken
 */
public interface TextToken extends Supplier<String> {

  /**
   * @return the token word.
   */
  @Override
  String get();

  /**
   * @param obj the object to compare.
   * @return {@code true} if this and the given {@link TextToken} are equal and have the same {@link #get() normalized
   *         value} value and therefore the same {@link #hashCode()}, {@code false} otherwise.
   */
  @Override
  boolean equals(Object obj);

  /**
   * @return the same as {@link #get()}.
   */
  @Override
  String toString();

}
