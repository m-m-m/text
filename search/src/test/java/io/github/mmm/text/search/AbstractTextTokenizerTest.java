/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search;

import java.util.Iterator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.mmm.text.search.impl.PositionedTextTokenImpl;

/**
 * Test of {@link TextTokenizer}.
 */
public abstract class AbstractTextTokenizerTest extends Assertions {

  /**
   * @param text the text to tokenize.
   * @return the {@link Iterator} of {@link PositionedTextToken}s.
   * @see TextTokenizer#tokenize(String)
   * @see TextTokenizer#tokenize(java.io.Reader)
   */
  protected abstract Iterator<PositionedTextToken> tokenize(String text);

  private static PositionedTextToken token(String word, int position) {

    return new PositionedTextTokenImpl(word, position);
  }

  /**
   * Tests {@link TextTokenizer} with arbitrary texts (including Unicode surrogates, etc.).
   */
  @Test
  public void testTokenize() {

    assertThat(tokenize("Hello world! ¿Green, yellow, or red?")).toIterable().containsExactlyInAnyOrder(
        token("Hello", 0), token("world", 6), token("Green", 14), token("yellow", 21), token("or", 29),
        token("red", 32));

    assertThat(tokenize("-.:Garbage.- ..term-i.no:logy_ -#+~ email@domain.com ;")).toIterable()
        .containsExactlyInAnyOrder(token("Garbage", 3), token("term-i.no:logy", 16), token("email@domain.com", 36));

    // Egyptian hieroglyphs ("Past is history.")
    assertThat(tokenize("𓊪𓄿𓋴𓏏 𓇋𓋴 𓉔𓇋𓋴𓏏𓂋𓇌.")).toIterable().containsExactlyInAnyOrder(token("𓊪𓄿𓋴𓏏", 0),
        token("𓇋𓋴", 17), token("𓉔𓇋𓋴𓏏𓂋𓇌", 26));

  }

}
