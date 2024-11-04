/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

import java.util.Arrays;

import io.github.mmm.text.hyphenation.Hyphenation;
import io.github.mmm.text.hyphenation.Hyphenator;

/**
 * This is the implementation of the {@link Hyphenation} interface.
 *
 * @since 1.0.0
 */
public class HyphenationImpl implements Hyphenation {

  private final CharSequence word;

  private final int[] hyphenationPoints;

  private final String hyphen;

  /**
   * The constructor.
   *
   * @param word is the {@link #getWord() word}.
   * @param hyphen is the {@link #getHyphen() hyphen-character}.
   * @param hyphenationPoints are the actual {@link #getHyphenation(int) hyphenation-points}.
   */
  public HyphenationImpl(CharSequence word, String hyphen, int... hyphenationPoints) {

    super();
    this.word = word;
    this.hyphen = hyphen;
    this.hyphenationPoints = hyphenationPoints;
  }

  /**
   * The constructor.
   *
   * @param hyphenatedWord is the hyphenated word.
   */
  public HyphenationImpl(String hyphenatedWord) {

    this(hyphenatedWord, Hyphenator.HYPHEN_DEFAULT);
  }

  /**
   * The constructor.
   *
   * @param hyphenatedWord is the hyphenated word.
   * @param hyphen is the {@link #getHyphen() hyphen-character}.
   */
  public HyphenationImpl(String hyphenatedWord, String hyphen) {

    super();
    this.hyphen = hyphen;
    int hyp = this.hyphen.codePointAt(0);
    int length = hyphenatedWord.length();
    StringBuilder wordBuilder = new StringBuilder(length);
    int maxPointsLength = length - 2;
    if (maxPointsLength < 0) {
      maxPointsLength = 0;
    }
    int[] points = new int[maxPointsLength];
    int hyphenationPointCount = 0;
    for (int i = 0; i < length; i++) {
      int cp = hyphenatedWord.codePointAt(i);
      if (cp == hyp) {
        if (hyphenationPointCount >= points.length) {
          // e.g. if hypernatedWord is "-" or "a--".
          throw new IllegalArgumentException(hyphenatedWord);
        }
        points[hyphenationPointCount] = wordBuilder.length();
        hyphenationPointCount++;
      } else {
        wordBuilder.appendCodePoint(cp);
      }
    }
    this.hyphenationPoints = Arrays.copyOf(points, hyphenationPointCount);
    this.word = wordBuilder.toString();
  }

  @Override
  public int getHyphenationCount() {

    return this.hyphenationPoints.length;
  }

  @Override
  public int getHyphenation(int hyphenationIndex) {

    return this.hyphenationPoints[hyphenationIndex];
  }

  @Override
  public int getHyphenationBefore(int offset) {

    int result = -1;
    for (int i = this.hyphenationPoints.length - 1; i >= 0; i--) {
      if (this.hyphenationPoints[i] < offset) {
        result = this.hyphenationPoints[i];
        break;
      }
    }
    return result;
  }

  /**
   * @return the hyphenationPoints
   */
  public int[] getHyphenationPoints() {

    return this.hyphenationPoints;
  }

  @Override
  public CharSequence getWord() {

    return this.word;
  }

  @Override
  public String getHyphen() {

    return this.hyphen;
  }

  @Override
  public String toString() {

    StringBuilder result = new StringBuilder(this.word.length() + 4);
    int start = 0;
    for (int offset : this.hyphenationPoints) {
      int end = offset;
      result.append(this.word, start, end);
      result.append(this.hyphen);
      start = end;
    }
    result.append(this.word, start, this.word.length());
    return result.toString();
  }
}
