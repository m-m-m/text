/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import java.util.Iterator;

/**
 * Test of {@link TextTokenizer#tokenize(String)}.
 */
public class TextTokenizerStringTest extends AbstractTextTokenizerTest {

  @Override
  protected Iterator<PositionedTextToken> tokenize(String text) {

    return TextTokenizer.get().tokenize(text);
  }

}
