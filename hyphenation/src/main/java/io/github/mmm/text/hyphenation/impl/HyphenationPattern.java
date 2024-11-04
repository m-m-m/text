/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

/**
 * A {@link HyphenationPattern} is a pattern that acts as rule for a hyphenation algorithm. <br>
 * The concept is based on the thesis <em>Word Hy-phen-a-tion by Com-put-er</em> by <em>Franklin Mark Liang</em>. Out of
 * an entire dictionary of hyphenated words for a specific language, a set of {@link HyphenationPattern patterns} is
 * extracted. To allow correct results with a reasonable small set of patterns, these patterns form a chain of positive
 * rules and exceptions. Therefore a pattern can {@link HyphenationPatternPosition#ranking rank} a potential
 * hyphenation-position with a number from {@code 1} to {@code 9}. If two patterns apply for a hyphenation-position the
 * higher number wins. Odd numbers indicate a hyphenation while even values indicate an exception that should NOT be
 * hyphenated. The character '.' is used at the beginning and/or end of a pattern to indicate that it should only match
 * at the beginning/end of the word to hyphenate. <br>
 * Logically for each start-index of the (normalized) word to hyphenate (enclosed with '.') all
 * {@link HyphenationPattern patterns} are checked if they match (please note that the order of the patterns is
 * important!). Matching means that the pattern stripped from digits is a substring of the word at this start-index. If
 * the pattern matches the {@link HyphenationPatternPosition hyphenation-positions} are applied. <br>
 * <br>
 * Here is an example to illustrate the algorithm:<br>
 * The string {@code "Computer"} will be transformed to {@code ".computer."} that matches the following patterns:
 * <ul>
 * <li>4m1p</li>
 * <li>pu2t</li>
 * <li>5pute</li>
 * <li>put3er</li>
 * </ul>
 * This results to {@code co4m5pu2t3er} so the hyphenated input String is finally <code>"Com-put-er"</code>. The
 * challenge is to implement this algorithm in an efficient way.
 *
 * @since 1.0.0
 */
public class HyphenationPattern {

  final String word;

  final int wordHash;

  final int length;

  private final HyphenationPatternPosition[] hyphenationPositions;

  /**
   * The constructor.
   *
   * @param pattern is the raw {@link HyphenationPattern pattern}.
   */
  public HyphenationPattern(String pattern) {

    super();
    int patternLength = pattern.length();
    if (patternLength < 2) {
      throw new IllegalArgumentException("'" + pattern + "'");
    }
    int hpLength = 0;
    for (int i = 0; i < patternLength; i++) {
      char c = pattern.charAt(i);
      if ((c >= '0') && (c <= '9')) {
        hpLength++;
      }
    }
    this.hyphenationPositions = new HyphenationPatternPosition[hpLength];
    int hash = 0;
    int hpIndex = 0;
    int len = 0;
    StringBuilder sb = new StringBuilder(patternLength);
    for (int i = 0; i < patternLength; i++) {
      int cp = pattern.codePointAt(i);
      if ((cp >= '0') && (cp <= '9')) {
        this.hyphenationPositions[hpIndex++] = new HyphenationPatternPosition(sb.length(), cp - '0');
      } else {
        if (cp != '.') {
          len++;
        }
        sb.appendCodePoint(cp);
        hash = (hash * HyphenationState.HASH_FACTOR) + cp;
      }
    }
    this.word = sb.toString();
    this.wordHash = hash;
    this.length = len;
  }

  /**
   * This method gets the {@link HyphenationPatternPosition hyphenation-positions} of the pattern.
   *
   * @return the {@link HyphenationPatternPosition}s.
   */
  protected HyphenationPatternPosition[] getHyphenationPositions() {

    return this.hyphenationPositions;
  }

  /**
   * @return the <em>word-part</em>, that is the {@link HyphenationPattern pattern} without digits. If the word-part is
   *         a substring of the word to hyphenate (enclosed with '.'), the {@link #getHyphenationPositions()
   *         hyphenation-points} are {@link HyphenationState#apply(HyphenationPattern) applied} to the
   *         {@link HyphenationState}.
   * @see HyphenationState#apply(HyphenationPattern)
   */
  public String getWord() {

    return this.word;
  }

  /**
   * @return the the pre-calculated hash of {@link #getWord() word}.
   */
  public int getWordHash() {

    return this.wordHash;
  }

  /**
   * @return the length of the {@link #getWord() word} excluding terminating dots.
   */
  public int getLength() {

    return this.length;
  }

  /**
   * <b>ATTENTION:</b><br>
   * This method is intended for debugging purposes. It rebuilds the pattern wasting performance.
   *
   * @return the original pattern ({@link #getWord() word-part} with {@link #getHyphenationPositions()
   *         hyphenation-points}) (e.g. ".af1t").
   */
  public String getPattern() {

    StringBuilder pattern = new StringBuilder(this.word.length() + this.hyphenationPositions.length);
    int start = 0;
    for (HyphenationPatternPosition position : this.hyphenationPositions) {
      int end = position.index;
      pattern.append(this.word, start, end);
      pattern.append(Integer.toString(position.ranking));
      start = end;
    }
    pattern.append(this.word, start, this.word.length());
    return pattern.toString();
  }

  /**
   * @return the original {@link #getPattern() pattern}.
   */
  @Override
  public String toString() {

    return getPattern();
  }

}
