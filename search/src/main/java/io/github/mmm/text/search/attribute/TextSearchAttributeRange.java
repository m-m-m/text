/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.attribute;

/**
 * Interface for an object that has a range from {@link #getStart() start} to {@link #getEnd() end}.
 *
 * @since 1.0.0
 */
public interface TextSearchAttributeRange {

  /**
   * @return the inclusive start index in the original text. Shall be greater or equal to zero.
   * @see String#substring(int, int)
   */
  int getStart();

  /**
   * @return the exclusive end index in the original text. Shall be greater than {@link #getStart() start}.
   * @see String#substring(int, int)
   */
  int getEnd();

  /**
   * @return the length as <code>{@link #getEnd()} - {@link #getStart()}</code>. Shall be positive.
   */
  int length();

}
