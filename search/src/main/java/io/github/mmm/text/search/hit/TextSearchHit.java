/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.hit;

import io.github.mmm.text.search.attribute.TextSearchAttributeId;
import io.github.mmm.text.search.attribute.TextSearchAttributeProperty;
import io.github.mmm.text.search.attribute.TextSearchAttributeScore;
import io.github.mmm.text.search.attribute.TextSearchAttributeType;

/**
 * Interface for a single result of a full-text search query.
 */
public interface TextSearchHit
    extends TextSearchAttributeId, TextSearchAttributeScore, TextSearchAttributeProperty, TextSearchAttributeType {

}
