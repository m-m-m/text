/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.mmm.text.hyphenation.Hyphenation;
import io.github.mmm.text.hyphenation.Hyphenator;

/**
 * This is the test-case for {@link HyphenationImpl}.
 */
class HyphenationImplTest extends Assertions {

  /**
   * This method performs general tests on {@link HyphenationImpl}, especially {@link HyphenationImpl#toString()}.
   */
  @Test
  void testAll() {

    verify("everybody", "everybody");
    verify("everybody", "ev-ery-body", 2, 5);
    verify("everybody", "e-very-bo-dy", 1, 5, 7);
    verify("unavailable", "un-avail-able", 2, 7);
  }

  private Hyphenation verify(String word, String hyphenated, int... points) {

    return verify(word, hyphenated, Hyphenator.HYPHEN_DEFAULT, points);
  }

  // arrange
  private Hyphenation verify(String word, String hyphenated, String hyphen, int... points) {

    // act
    Hyphenation hyphenation = new HyphenationImpl(word, hyphen, points);
    // assert
    assertThat(hyphenation.getWord()).isEqualTo(word);
    assertThat(hyphenation.toString()).isEqualTo(hyphenated);
    assertThat(hyphenation.getHyphenationCount()).isEqualTo(points.length);
    assertThat(hyphenation.getHyphenationBefore(0)).isEqualTo(-1);
    for (int i = 0; i < points.length; i++) {
      int point = points[i];
      assertThat(hyphenation.getHyphenation(i)).isEqualTo(point);
      int hyphenationBefore = hyphenation.getHyphenationBefore(point);
      if (i == 0) {
        assertThat(hyphenationBefore).isEqualTo(-1);
      } else {
        assertThat(hyphenationBefore).isEqualTo(points[i - 1]);
        if (i == (points.length - 1)) {
          assertThat(hyphenation.getHyphenationBefore(word.length())).isEqualTo(point);
        }
      }
    }
    return hyphenation;
  }
}
