/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import java.util.Iterator;

import io.github.mmm.base.score.Score;
import io.github.mmm.text.search.hit.TextSearchHit;
import io.github.mmm.text.search.query.TextSearchQuery;
import io.github.mmm.text.search.query.TextSearchQueryParser;

/**
 * A {@link TextSearchEngine} allows to {@link #index(Object) index} any number of objects with textual representation
 * and then perform a {@link #search(String) highly efficient full-text search} on the data.
 *
 * @param <V> type of the values to index.
 * @param <P> type of the {@link TextSearchDecomposer#getProperties(Object) properties} of a value.
 */
public interface TextSearchEngine<V, P> {

  /**
   * @return the underlying {@link TextNormalizer} used by this index.
   */
  TextNormalizer getNormalizer();

  /**
   * @return the underlying {@link TextSearchDecomposer} used by this index.
   */
  TextSearchDecomposer<V, P> getDecomposer();

  /**
   * @param value the value to add to or update in this index.
   * @return {@code true} if the value has been added, {@code false} if it was updated (or nothing was index at all).
   */
  default boolean index(V value) {

    TextSearchDecomposer<V, P> decomposer = getDecomposer();
    String type = decomposer.getType(value);
    Object id = decomposer.getId(value);
    Iterator<P> properties = decomposer.getProperties(value);
    boolean added = false;
    while (properties.hasNext()) {
      P property = properties.next();
      Score propertyScore = decomposer.getScore(property);
      if (propertyScore != Score.MIN) {
        String propertyName = decomposer.getName(property);
        String propertyText = decomposer.getText(property);
        boolean addedProperty = index(value, id, type, property, propertyName, propertyScore, propertyText);
        if (addedProperty) {
          added = true;
        }
      }
    }
    return added;
  }

  /**
   * @param value the actual value to index.
   * @param id the {@link TextSearchDecomposer#getId(Object) ID} of the value.
   * @param type the {@link TextSearchDecomposer#getType(Object) type} of the value.
   * @param property the {@link TextSearchDecomposer#getProperties(Object) property} of the value to index.
   * @param propertyName the {@link TextSearchDecomposer#getName(Object) name} of the property to index.
   * @param propertyScore the {@link TextSearchDecomposer#getScore(Object) score} of the property to index.
   * @return {@code true} if the value has been added, {@code false} if it was updated (or nothing was index at all).
   */
  default boolean index(V value, Object id, String type, P property, String propertyName, Score propertyScore) {

    return index(value, id, type, property, propertyName, propertyScore, getDecomposer().getText(property));
  }

  /**
   * @param value the actual value to index.
   * @param id the {@link TextSearchDecomposer#getId(Object) ID} of the value.
   * @param type the {@link TextSearchDecomposer#getType(Object) type} of the value.
   * @param property the {@link TextSearchDecomposer#getProperties(Object) property} of the value to index.
   * @param propertyName the {@link TextSearchDecomposer#getName(Object) name} of the property to index.
   * @param propertyScore the {@link TextSearchDecomposer#getScore(Object) score} of the property to index.
   * @param propertyText the {@link TextSearchDecomposer#getText(Object) text} of the property to index.
   * @return {@code true} if the value has been added, {@code false} if it was updated (or nothing was index at all).
   */
  boolean index(V value, Object id, String type, P property, String propertyName, Score propertyScore,
      String propertyText);

  /**
   * @param id the {@link TextSearchDecomposer#getId(Object) ID} of the value to remove.
   * @return {@code true} if the value has been removed, {@code false} otherwise (no value with this ID is stored in the
   *         index).
   */
  boolean remove(Object id);

  /**
   * @param query the search query.
   * @return the {@link Iterator} of matching {@link TextSearchHit}s.
   */
  default Iterator<TextSearchHit> search(String query) {

    return search(TextSearchQueryParser.get().parse(query));
  }

  /**
   * @param query the {@link TextSearchQuery}.
   * @return the {@link Iterator} of matching {@link TextSearchHit}s.
   */
  Iterator<TextSearchHit> search(TextSearchQuery query);

}
