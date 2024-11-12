/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import io.github.mmm.text.hyphenation.Hyphenation;
import io.github.mmm.text.hyphenation.Hyphenator;

/**
 * Implementation of {@link Hyphenator}. It uses a list of rules to determine hyphenation-points.
 *
 * @since 1.0.0
 */
public class HyphenatorImpl implements Hyphenator {

  private final Locale locale;

  private final String hyphen;

  /** The {@link Map} with explicit exceptions. */
  private final Map<String, HyphenationImpl> exceptionMap;

  /** The {@link HyphenationPattern patterns}. */
  private final HyphenationPattern[] patterns;

  /** The maximum length of the {@link #patterns}. */
  private final int maxPatternLength;

  /**
   * The constructor.
   *
   * @param locale is the {@link #getLocale() locale}.
   * @param patternList is the {@link List} of {@link HyphenationPattern patterns}.
   * @param exceptionList is the list of pre-hyphenated exceptions (e.g. "as-so-ciate").
   */
  public HyphenatorImpl(Locale locale, List<String> patternList, List<String> exceptionList) {

    super();
    this.locale = locale;
    String hyp = null;
    this.exceptionMap = new HashMap<>(exceptionList.size());
    for (String exception : exceptionList) {
      if (hyp == null) {
        int length = exception.length();
        for (int i = 0; i < length; i++) {
          int cp = exception.codePointAt(i);
          if (!Character.isLetter(cp)) {
            assert (i > 0);
            hyp = Character.toString(cp);
            break;
          }
        }
      }
      HyphenationImpl hypenation = new HyphenationImpl(exception, hyp);
      this.exceptionMap.put(hypenation.getWord().toString(), hypenation);
    }
    if (hyp == null) {
      hyp = HYPHEN_DEFAULT;
    }
    this.hyphen = hyp;
    HyphenationPattern[] patternArray = new HyphenationPattern[patternList.size()];
    int maxLength = 2;
    for (int i = 0; i < patternArray.length; i++) {
      patternArray[i] = new HyphenationPattern(patternList.get(i));
      // assert (patternList.get(i).equals(this.patterns[i].getPattern()));
      int len = patternArray[i].getWord().length();
      if (len > maxLength) {
        maxLength = len;
      }
    }
    patternArray = sortPatterns(patternArray);
    this.patterns = patternArray;
    this.maxPatternLength = maxLength;
  }

  /**
   * This method sorts the given {@link HyphenationPattern patterns} according to the {@link String#length() length} of
   * their {@link HyphenationPattern#getWord() word-part}.
   *
   * @param patternArray are the unsorted {@link HyphenationPattern patterns}.
   * @return the sorted {@link HyphenationPattern patterns}.
   */
  private static HyphenationPattern[] sortPatterns(HyphenationPattern[] patternArray) {

    Comparator<HyphenationPattern> comparator = new Comparator<>() {

      @Override
      public int compare(HyphenationPattern p1, HyphenationPattern p2) {

        return (p2.getWord().length() - p1.getWord().length());
      }
    };
    Arrays.sort(patternArray, comparator);
    return patternArray;
  }

  @Override
  public Locale getLocale() {

    return this.locale;
  }

  @Override
  public String getHyphen() {

    return this.hyphen;
  }

  /**
   * @return the maximum {@link String#length() length} of all {@link HyphenationPattern#getWord() pattern words}.
   */
  public int getMaxPatternLength() {

    return this.maxPatternLength;
  }

  @Override
  public Hyphenation hyphenate(String word) {

    if (word.length() <= 1) {
      return new HyphenationImpl(word, getHyphen());
    }
    // TODO loLowerCase can change the lenght of the String and is therefore in-appropriate
    String normalizedWord = word.toLowerCase(getLocale());
    Hyphenation hyphenation;
    HyphenationImpl exception = this.exceptionMap.get(normalizedWord);
    if (exception != null) {
      hyphenation = new HyphenationImpl(word, getHyphen(), exception.getHyphenationPoints());
    } else {
      HyphenationState state = new HyphenationState(word, this.hyphen, this.maxPatternLength,
          normalizedWord.codePoints().toArray());
      for (HyphenationPattern pattern : this.patterns) {
        state.apply(pattern);
      }
      hyphenation = state.toHyphenation();
    }
    return hyphenation;
  }

  @Override
  public String toString() {

    return "Hyphenator for " + getLocale();
  }

}
