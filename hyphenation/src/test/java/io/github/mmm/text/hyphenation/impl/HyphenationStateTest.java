/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test of {@link HyphenationState}.
 */
public class HyphenationStateTest extends Assertions {

  @Test
  public void testGetHashCodes() {

    // arrange
    String word = "construction";
    String full = HyphenationState.TERMINATOR + word + HyphenationState.TERMINATOR;
    int[] codePoints = word.codePoints().toArray();

    for (int i = -1; i < full.length() + 2; i++) {
      int[] hashes = HyphenationState.getHashCodes(codePoints, i);
      if ((i <= 0) || (i > full.length())) {
        assertThat(hashes).isNull();
      } else {
        int[] expectedHashes = new int[full.length() - i + 1];
        for (int j = 0; j < expectedHashes.length; j++) {
          expectedHashes[j] = full.substring(j, j + i).hashCode();
        }
        assertThat(hashes).isEqualTo(expectedHashes);
      }
    }
  }

  @Test
  public void testState() {

    // arrange
    HyphenationState state = new HyphenationState("Construction", "-", 9);

    // assert
    assertThat(state).hasToString("Construction");

    // act
    state.apply(new HyphenationPattern("on3s"));

    // assert
    assertThat(state).hasToString("Con3struction");

    // act
    state.apply(new HyphenationPattern("st4r"));

    // assert
    assertThat(state).hasToString("Con3st4ruction");

    // act
    state.apply(new HyphenationPattern("1tio"));

    // assert
    assertThat(state).hasToString("Con3st4ruc1tion");

    // act
    state.apply(new HyphenationPattern("1co"));

    // assert
    assertThat(state).hasToString("Con3st4ruc1tion");

    // act
    state.apply(new HyphenationPattern("2c1t"));

    // assert
    assertThat(state).hasToString("Con3st4ru2c1tion");

    // act
    state.apply(new HyphenationPattern("2io"));

    // assert
    assertThat(state).hasToString("Con3st4ru2c1t2ion");

    // act
    state.apply(new HyphenationPattern("2n1s2"));

    // assert
    assertThat(state).hasToString("Co2n3s2t4ru2c1t2ion");

    // act
    state.apply(new HyphenationPattern("o2n"));

    // assert
    assertThat(state).hasToString("Co2n3s2t4ru2c1t2ion");

    assertThat(state.toHyphenation()).hasToString("Con-struc-tion");
  }

}
