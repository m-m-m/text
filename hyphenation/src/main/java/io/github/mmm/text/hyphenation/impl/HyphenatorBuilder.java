/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

import io.github.mmm.base.i18n.LocaleHelper;
import io.github.mmm.text.hyphenation.Hyphenator;

/**
 * Factory for {@link Hyphenator}.
 *
 * @since 1.0.0
 */
public class HyphenatorBuilder {

  /** @see #createHyphenator(String) */
  static final String HYPHENATION_CONFIG_PREFIX = "l10n/io/github/mmm/text/hyphenation/";

  /** @see #createHyphenator(String) */
  static final String HYPHENATION_CONFIG_SUFIX = ".txt";

  /** Cache for {@link #getHyphenator(Locale)}. */
  private final ConcurrentHashMap<String, WeakReference<Hyphenator>> hyphenatorCache;

  /** The singleton instance. */
  public static final HyphenatorBuilder INSTANCE = new HyphenatorBuilder();

  /**
   * The constructor.
   */
  private HyphenatorBuilder() {

    super();
    this.hyphenatorCache = new ConcurrentHashMap<>();
  }

  /**
   * This method gets the {@link Hyphenator} for the given {@link Locale}. If no hyphenation-rules are available for the
   * given {@link Locale}, a {@link Hyphenator} for a more general {@link Locale} is build.
   *
   * @param locale is the {@link Locale} used to determine the hyphenation-rules for the according country and region.
   * @return the according {@link Hyphenator}.
   */
  public Hyphenator getHyphenator(Locale locale) {

    Hyphenator hyphenator = null;
    String[] localeInfixes = LocaleHelper.toInfixes(locale);
    for (int i = 0; i < localeInfixes.length; i++) {
      WeakReference<Hyphenator> reference = this.hyphenatorCache.get(localeInfixes[i]);
      if (reference != null) {
        hyphenator = reference.get();
      }
      if (hyphenator == null) {
        hyphenator = createHyphenator(localeInfixes[i]);
        if (hyphenator != null) {
          reference = new WeakReference<>(hyphenator);
          // put to cache including cache misses...
          for (int j = i; j >= 0; j--) {
            this.hyphenatorCache.put(localeInfixes[j], reference);
          }
        }
      }
      if (hyphenator != null) {
        break;
      }
    }
    return hyphenator;
  }

  /**
   * This method creates a new {@link Hyphenator}.
   *
   * @see #getHyphenator(Locale)
   *
   * @param localeInfix is the {@link LocaleHelper#toInfix(Locale) locale-infix} of the requested {@link Hyphenator}.
   * @return the requested {@link Hyphenator} or {@code null} if no hyphenation configuration is available for the given
   *         {@code localeInfix}.
   */
  protected Hyphenator createHyphenator(String localeInfix) {

    String patternsLocation = HYPHENATION_CONFIG_PREFIX + "patterns" + localeInfix + ".txt";
    URL patternsUrl = Thread.currentThread().getContextClassLoader().getResource(patternsLocation);
    if (patternsUrl != null) {
      String exceptionsLocation = HYPHENATION_CONFIG_PREFIX + "exceptions" + localeInfix + ".txt";
      URL exceptionsUrl = Thread.currentThread().getContextClassLoader().getResource(exceptionsLocation);
      Locale locale = LocaleHelper.fromString(localeInfix);
      return createHyphenator(locale, patternsUrl, exceptionsUrl);
    }
    return null;
  }

  /**
   * @param locale is the {@link Hyphenator#getLocale() locale}.
   * @param patternsUrl is the {@link URL} to the file with the patterns.
   * @param exceptionsUrl is the {@link URL} to the file with the exceptions.
   * @return the {@link Hyphenator} instance.
   */
  protected Hyphenator createHyphenator(Locale locale, URL patternsUrl, URL exceptionsUrl) {

    List<String> patterns = readRules(patternsUrl, 32_000);
    List<String> exceptions = readRules(exceptionsUrl, 256);
    HyphenatorImpl hyphenator = new HyphenatorImpl(locale, patterns, exceptions);
    return hyphenator;
  }

  private List<String> readRules(URL url, int capacity) {

    if (url == null) {
      return Collections.emptyList();
    }
    List<String> list = new ArrayList<>(capacity);
    try (InputStream in = url.openStream();
        Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(reader)) {
      while (true) {
        String line = bufferedReader.readLine();
        if (line == null) {
          break;
        } else if (!line.isEmpty()) {
          list.add(line);
        }
      }
    } catch (IOException e) {
      throw new IllegalStateException("Error parsing hyphenation config from " + url, e);
    }
    return list;
  }

}
