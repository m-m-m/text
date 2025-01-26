/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.search.impl;

import java.io.Reader;
import java.util.Collections;
import java.util.Iterator;

import io.github.mmm.base.collection.AbstractIterator;
import io.github.mmm.base.io.ReaderHelper;
import io.github.mmm.text.search.PositionedTextToken;
import io.github.mmm.text.search.TextTokenizer;

/**
 * Simple implementation of {@link TextTokenizer}.
 *
 * @since 1.0.0
 */
public class TextTokenizerImpl implements TextTokenizer {

  /** The singleton instance. */
  public static final TextTokenizerImpl INSTANCE = new TextTokenizerImpl();

  private final int bufferSize;

  private TextTokenizerImpl() {

    this(1024);
  }

  /**
   * The constructor.
   *
   * @param bufferSize the buffer capacity for {@link Reader} usage.
   * @deprecated shall only be used for testing.
   */
  @Deprecated
  public TextTokenizerImpl(int bufferSize) {

    super();
    this.bufferSize = bufferSize;
  }

  @Override
  public Iterator<PositionedTextToken> tokenize(String text) {

    int length = 0;
    if (text != null) {
      length = text.length();
    }
    if (length == 0) {
      return Collections.emptyIterator();
    }
    return new TextTokenStringIterator(text);
  }

  @Override
  public Iterator<PositionedTextToken> tokenize(Reader reader) {

    return new TextTokenReaderIterator(reader, this.bufferSize);
  }

  private static abstract class TextTokenIterator extends AbstractIterator<PositionedTextToken> {

    protected int index;

    protected int limit;

    protected int textOffset;

    /**
     * @return the current {@link String#codePointAt(int) code-point} or {@code -1} of the end ot the text has been
     *         reached.
     */
    protected abstract int peekCodePoint();

    /**
     * @param codePoint the {@link #peekCodePoint() current code point}.
     * @return {@code true} if the {@link #peekCodePoint() current code point} was proceeded and a next code point is
     *         available, {@code false} otherwise (end of the buffered text was reached).
     * @see #refillBuffer()
     */
    protected boolean proceedCodePoint(int codePoint) {

      this.index += Character.charCount(codePoint);
      if (this.index >= this.limit) {
        return false;
      }
      return true;
    }

    /**
     * @param start the inclusive start index.
     * @param end the exclusive end index.
     * @return the requested {@link String#substring(int, int) substring}.
     * @see String#substring(int, int)
     */
    protected abstract String substring(int start, int end);

    /**
     * @param sb the {@link StringBuilder} to {@link StringBuilder#append(CharSequence, int, int) append to}.
     * @param start the inclusive start index.
     * @param end the exclusive end index.
     * @see StringBuilder#append(CharSequence, int, int)
     */
    protected abstract void append(StringBuilder sb, int start, int end);

    /**
     * Refills the internal buffer and updates all state variables. Should be called if {@link #proceedCodePoint(int)}
     * returned {@code false}.
     *
     * @return {@code true} if the internal buffer has been refilled, {@code false} otherwise (end of text is reached).
     */
    protected boolean refillBuffer() {

      return false; // nothing to do by default
    }

    /**
     * {@link #proceedCodePoint(int) Skips} all {@link #peekCodePoint() code-points} until an alpha-numeric character
     * (or the end of the text) was found.
     */
    protected void skipToNextAlphaNumeric() {

      while (true) {
        int codePoint = peekCodePoint();
        if ((codePoint == -1) || Character.isAlphabetic(codePoint) || Character.isDigit(codePoint)) {
          return;
        }
        boolean success = proceedCodePoint(codePoint);
        if (!success) {
          refillBuffer();
        }
      }
    }

    protected String readToken() {

      StringBuilder sb = null;
      int sbLength = 0;
      int tokenStart = this.index;
      int tokenEnd = -1;
      while (true) {
        int codePoint = peekCodePoint();
        if ((codePoint == -1) || Character.isWhitespace(codePoint)) {
          if (sb == null) {
            if (tokenEnd > tokenStart) {
              return substring(tokenStart, tokenEnd);
            }
            return null;
          } else {
            if (tokenEnd > tokenStart) {
              append(sb, tokenStart, tokenEnd);
            } else {
              sb.setLength(sbLength);
            }
            return sb.toString();
          }
        }
        boolean success = proceedCodePoint(codePoint);
        if (Character.isAlphabetic(codePoint) || Character.isDigit(codePoint)) {
          tokenEnd = this.index;
        }
        if (!success) {
          if (sb == null) {
            sb = new StringBuilder(this.limit - tokenStart + 8);
          }
          int tokenLength = tokenEnd - tokenStart;
          if (tokenLength > 0) {
            sbLength = sb.length() + tokenLength;
          }
          append(sb, tokenStart, this.limit);
          refillBuffer();
          tokenStart = 0;
          tokenEnd = -1;
        }
      }
    }

    @Override
    protected PositionedTextToken findNext() {

      skipToNextAlphaNumeric();
      int textStart = this.index + this.textOffset;
      String token = readToken();
      if (token != null) {
        return new PositionedTextTokenImpl(token, textStart);
      }
      return null;
    }
  }

  private static class TextTokenStringIterator extends TextTokenIterator {

    private final String text;

    private TextTokenStringIterator(String text) {

      super();
      this.text = text;
      this.limit = text.length();
      findFirst();
    }

    @Override
    protected int peekCodePoint() {

      if (this.index >= this.limit) {
        return -1;
      }
      return this.text.codePointAt(this.index);
    }

    @Override
    protected boolean proceedCodePoint(int codePoint) {

      super.proceedCodePoint(codePoint);
      return true;
    }

    @Override
    protected String substring(int start, int end) {

      return this.text.substring(start, end);
    }

    @Override
    protected void append(StringBuilder sb, int start, int end) {

      sb.append(this.text, start, end);
    }

  }

  private static class TextTokenReaderIterator extends TextTokenIterator {

    private final Reader reader;

    private final char[] buffer;

    private TextTokenReaderIterator(Reader reader, int bufferSize) {

      super();
      this.reader = reader;
      this.buffer = new char[bufferSize];
      findFirst();
    }

    @Override
    protected int peekCodePoint() {

      if (this.index >= this.limit) {
        if (this.limit == 0) {
          boolean success = refillBuffer();
          if (!success) {
            return -1;
          }
        } else {
          return -1;
        }
      }
      char c = this.buffer[this.index];
      int cp = c;
      if (Character.isSurrogate(c)) {
        int nextIndex = this.index + 1;
        if (nextIndex < this.limit) {
          cp = Character.toCodePoint(c, this.buffer[nextIndex]);
        }
      }
      return cp;
    }

    @Override
    protected boolean refillBuffer() {

      this.textOffset += this.limit;
      this.limit = ReaderHelper.read(this.reader, this.buffer);
      if (this.limit == -1) {
        return false;
      }
      this.index = 0;
      return true;
    }

    @Override
    protected String substring(int start, int end) {

      return new String(this.buffer, start, end - start);
    }

    @Override
    protected void append(StringBuilder sb, int start, int end) {

      sb.append(this.buffer, start, end - start);
    }
  }

}
