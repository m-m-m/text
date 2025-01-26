/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

import io.github.mmm.text.search.impl.TextTokenizerImpl;

/**
 * Test of {@link TextTokenizer#tokenize(Reader)}.
 */
public class TextTokenizerReaderTest extends AbstractTextTokenizerTest {

  @SuppressWarnings("deprecation")
  @Override
  protected Iterator<PositionedTextToken> tokenize(String text) {

    Reader reader = new StringReader(text);
    // for testing we enforce minimum buffer capacity (2) to reveal all potential bugs with buffer limit and refill
    return new TextTokenizerImpl(2).tokenize(reader);
  }

}
