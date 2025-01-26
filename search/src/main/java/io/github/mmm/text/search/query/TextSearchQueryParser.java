/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.query;

/**
 * Parser of {@link TextSearchQuery}.
 */
public interface TextSearchQueryParser {

  /**
   * @param queryText the {@link TextSearchQuery} to parse as {@link TextSearchQuery#toString() string representation}.
   * @return the parsed {@link TextSearchQuery}.
   */
  TextSearchQuery parse(String queryText);

  /**
   * @return the instance of {@link TextSearchQueryParser}.
   */
  static TextSearchQueryParser get() {

    return null; // TODO
  }

}
