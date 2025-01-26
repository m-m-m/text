/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import java.io.Reader;
import java.util.Iterator;

import io.github.mmm.text.search.impl.TextTokenizerImpl;

/**
 * Interface to tokenize arbitrary text into {@link PositionedTextToken}s.
 *
 * @since 1.0.0
 */
public interface TextTokenizer {

  /**
   * @param text the {@link String} to tokenize.
   * @return the {@link Iterator} of tokens (words).
   */
  Iterator<PositionedTextToken> tokenize(String text);

  /**
   * @param reader the {@link Reader} with the text to tokenize.
   * @return the {@link Iterator} of tokens (words).
   */
  Iterator<PositionedTextToken> tokenize(Reader reader);

  /**
   * @return the instance of {@link TextTokenizer}.
   */
  static TextTokenizer get() {

    return TextTokenizerImpl.INSTANCE;
  }

}
