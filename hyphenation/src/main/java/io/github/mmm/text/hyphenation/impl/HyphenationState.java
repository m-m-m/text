/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

import java.util.PrimitiveIterator.OfInt;

import io.github.mmm.text.hyphenation.Hyphenation;

/**
 * Represents the current state of the hyphenation of a specific word.
 *
 * @see io.github.mmm.text.hyphenation.Hyphenator#hyphenate(String, int, int)
 *
 * @since 1.0.0
 */
public class HyphenationState {

  /** The word-terminator representing start end end of a word. */
  public static final char TERMINATOR = '.';

  private final CharSequence word;

  /** The normalized word. */
  private final int[] normalizedWord;

  /**
   * The hashes of all substrings of {@link #normalizedWord}. The first index indicates the substring-length - 2, the
   * second is the offset in {@link #normalizedWord}.
   */
  private int[][] hashes;

  /** The {@link HyphenationPatternPosition#ranking}s */
  private final int[] rankings;

  private final String hyphen;

  static final int HASH_FACTOR = 31;

  /**
   * The constructor.
   *
   * @param word is the {@link #getWord() word to hyphenate}.
   * @param hyphen is the {@link io.github.mmm.text.hyphenation.Hyphenator#getHyphen() hyphen}.
   * @param maxPatternLength is the maximum {@link String#length() length} of all {@link HyphenationPattern patterns}.
   */
  public HyphenationState(CharSequence word, String hyphen, int maxPatternLength) {

    this(word, hyphen, maxPatternLength, lowerCodePoints(word));
  }

  /**
   * The constructor.
   *
   * @param word is the {@link #getWord() word to hyphenate}.
   * @param hyphen is the {@link io.github.mmm.text.hyphenation.Hyphenator#getHyphen() hyphen}.
   * @param maxPatternLength is the maximum {@link String#length() length} of all {@link HyphenationPattern patterns}.
   * @param normalizedWord is the {@link #getNormalizedWord() normalized word}.
   */
  public HyphenationState(CharSequence word, String hyphen, int maxPatternLength, int[] normalizedWord) {

    super();
    int length = word.length();
    if (length < 2) {
      throw new IllegalArgumentException(word.toString());
    }
    if (length != normalizedWord.length) {
      throw new IllegalArgumentException(word.toString() + "\n" + new String(normalizedWord, 0, normalizedWord.length));
    }
    this.word = word;
    this.hyphen = hyphen;
    this.normalizedWord = normalizedWord;
    // a hyphenation can never occur at the beginning or the end of a word.
    this.rankings = new int[length - 1];
    this.hashes = new int[maxPatternLength][];
  }

  static int[] lowerCodePoints(CharSequence string) {

    int length = string.length();
    int[] codePoints = new int[length];
    OfInt cpIterator = string.codePoints().iterator();
    int i = 0;
    while (i < length) {
      codePoints[i++] = cpIterator.nextInt();
    }
    return codePoints;
  }

  /**
   * @param length is the {@link String#length() length} of the substrings to get hashes for.
   * @return the array with the hashes of all substrings of the {@link #getNormalizedWord() normalized word} that have
   *         the given {@link String#length() length}.
   */
  private int[] getHashes(int length) {

    int i = length - 2;
    int[] subHashes = this.hashes[i];
    if (subHashes == null) {
      subHashes = getHashCodes(this.normalizedWord, length);
      this.hashes[i] = subHashes;
    }
    return subHashes;
  }

  static int[] getHashCodes(int[] string, int length) {

    int wordLength = string.length;
    if ((wordLength == 0) || (length <= 0)) {
      return null;
    }
    int[] hashCodes = null;
    int hashCodesSize = wordLength - length + 3;
    if (hashCodesSize > 0) {
      hashCodes = new int[hashCodesSize];
      int hash = TERMINATOR;
      int powFactor = 1;
      int stop = length - 1;
      if (hashCodesSize == 1) {
        for (int i = 0; i < wordLength; i++) {
          hash = hash * HASH_FACTOR + string[i];
        }
        hash = hash * HASH_FACTOR + TERMINATOR;
        hashCodes[0] = hash;
        return hashCodes;
      } else {
        for (int i = 0; i < stop; i++) {
          hash = hash * HASH_FACTOR + string[i];
          powFactor = powFactor * HASH_FACTOR;
        }
      }
      hashCodes[0] = hash;
      hash = hash - powFactor * TERMINATOR;
      int headIndex = 0;
      int tailIndex = length - 1;
      hashCodesSize--;
      for (int i = 1; i < hashCodesSize; i++) {
        if (i > 1) {
          hash = hash - powFactor * string[headIndex++];
        }
        hash = hash * HASH_FACTOR + string[tailIndex++];
        hashCodes[i] = hash;
      }
      if (hashCodesSize > 1) {
        hash = hash - powFactor * string[headIndex];
      }
      hash = hash * HASH_FACTOR + TERMINATOR;
      hashCodes[hashCodesSize] = hash;
    }
    return hashCodes;
  }

  /**
   * This is the heart of the hyphenation algorithm. It checks if the {@link HyphenationPattern pattern} is a substring
   * of the word to hyphenate and if so apply the hyphenation ranks from the pattern to the state. Since we have
   * thousands of patterns and for each pattern we need to find all substrings this would be extremely slow with regular
   * string operations. Therefore we compute the hashes of all substrings of our string and only compare them with the
   * pre-calculated hash of the patterns via primitive int comparison. Since already computing the hashes of all
   * substrings requires some computation, we use a rolling hash-algorithm so we can "remove" the effect of the leading
   * code-point (character) and add the training code-point to the hash giving us a linear complexity for each single
   * hash.
   *
   * @param pattern is the pattern to check and potentially apply.
   */
  public void apply(HyphenationPattern pattern) {

    if (this.normalizedWord.length < pattern.length) {
      return;
    }
    String wordPart = pattern.word;
    int wordPartLength = wordPart.length();
    if (wordPartLength == 1) {
      int cp = wordPart.codePointAt(0);
      assert (cp != HyphenationState.TERMINATOR);
      for (int i = 0; i < this.normalizedWord.length; i++) {
        if (cp == this.normalizedWord[i]) {
          apply(pattern, i);
        }
      }
      return;
    }
    int wordPartHash = pattern.getWordHash();
    int[] subHashes = getHashes(wordPartLength);
    if (subHashes == null || subHashes.length == 0) {
      return;
    }
    int start = 0;
    int end = subHashes.length - 1;
    if (wordPart.charAt(0) == HyphenationState.TERMINATOR) {
      end = 0;
    } else if (wordPart.charAt(wordPartLength - 1) == HyphenationState.TERMINATOR) {
      start = end;
    }
    for (int i = start; i <= end; i++) {
      if (subHashes[i] == wordPartHash) {
        if (isSubstring(this.normalizedWord, wordPart, i)) {
          apply(pattern, i - 1);
        }
      }
    }
  }

  static boolean isSubstring(int[] codePoints, String substring, int offset) {

    int substringLength = substring.length();
    if (substringLength + offset <= codePoints.length + 2) {
      int start = 0;
      int cpIndex = offset - 1; // leading .
      if (cpIndex == -1) {
        if (substring.codePointAt(0) != TERMINATOR) {
          return false;
        }
        cpIndex++;
        start++;
      }
      if (cpIndex + substringLength - start > codePoints.length) {
        substringLength--;
        if (substring.codePointAt(substringLength) != TERMINATOR) {
          return false;
        }
      }
      for (int i = start; i < substringLength; i++) {
        int cp = substring.codePointAt(i);
        if (codePoints[cpIndex++] != cp) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  /**
   * This method applies the {@link HyphenationPattern pattern} matching at the given {@code offset}.
   *
   * @param pattern is the matching {@link HyphenationPattern pattern}.
   * @param pos is the offset in the word to hyphenate.
   */
  private void apply(HyphenationPattern pattern, int pos) {

    HyphenationPatternPosition[] positions = pattern.getHyphenationPositions();
    for (HyphenationPatternPosition hyphenationPosition : positions) {
      int i = hyphenationPosition.index + pos;
      if ((i > 0) && (i < this.rankings.length) && (hyphenationPosition.ranking > this.rankings[i])) {
        this.rankings[i] = hyphenationPosition.ranking;
      }
    }
  }

  /**
   * This method creates the {@link HyphenationImpl#getHyphenation(int) hyphenationPoints} of a hyphenated word.
   *
   * @see #toHyphenation()
   *
   * @return the hyphenation points.
   */
  protected int[] toHyphenationPoints() {

    int hyphenationCount = 0;
    for (int i = 0; i < this.rankings.length; i++) {
      if ((this.rankings[i] & 1) == 1) {
        // odd ranking --> hyphenation...
        hyphenationCount++;
      }
    }
    int[] hyphenationPoints = new int[hyphenationCount];
    hyphenationCount = 0;
    for (int i = 0; i < this.rankings.length; i++) {
      if ((this.rankings[i] & 1) == 1) {
        // odd ranking --> hyphenation...
        hyphenationPoints[hyphenationCount] = i;
        hyphenationCount++;
      }
    }
    return hyphenationPoints;
  }

  /**
   * This method gets the {@link Hyphenation} from this state.
   *
   * @return the {@link Hyphenation}.
   */
  public Hyphenation toHyphenation() {

    return new HyphenationImpl(this.word, this.hyphen, toHyphenationPoints());
  }

  /**
   * This method gets the word to hyphenate.
   *
   * @return the word to hyphenate.
   */
  public CharSequence getWord() {

    return this.word;
  }

  /**
   * @return the normalized word. This is the {@link #getWord() word} in normalized form (lower case) and surrounded by
   *         {@link HyphenationState#TERMINATOR}.
   */
  protected int[] getNormalizedWord() {

    return this.normalizedWord;
  }

  /**
   * @return the word with {@link HyphenationPatternPosition#ranking hyphenation ranks}. Only for debugging purposes.
   */
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    int start = 0;
    for (int i = 0; i < this.rankings.length; i++) {
      int rank = this.rankings[i];
      if (rank > 0) {
        sb.append(this.word, start, i);
        sb.append(rank);
        start = i;
      }
    }
    sb.append(this.word, start, this.word.length());
    return sb.toString();
  }

}
