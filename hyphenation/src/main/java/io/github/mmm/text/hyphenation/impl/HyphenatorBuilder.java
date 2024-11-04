/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation.impl;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import io.github.mmm.base.i18n.LocaleHelper;
import io.github.mmm.text.hyphenation.Hyphenator;

/**
 * Factory for {@link Hyphenator}.
 *
 * @since 1.0.0
 */
public class HyphenatorBuilder {

  /** @see #createHyphenator(String) */
  public static final String HYPHENATION_XML_CONFIG_PREFIX = "l10n/io/github/mmm/text/hyphenation/hyphenation";

  /** @see #createHyphenator(String) */
  public static final String HYPHENATION_XML_CONFIG_SUFFIX = ".xml";

  /** The XML root tag ({@code hyphenation}). */
  private static final String XML_TAG_HYPHENATION = "hyphenation";

  /** The XML attribute for the hyphen character ({@code hyphen}). */
  private static final String XML_ATR_HYPHEN = "hyphen";

  /** The XML tag for the list of exceptions to hyphenation rules ({@code exceptions}). */
  private static final String XML_TAG_EXCEPTION_LIST = "exceptions";

  /** The XML tag for the list of patterns ({@code patterns}). */
  private static final String XML_TAG_PATTERN_LIST = "patterns";

  /** The XML tag for an exception ({@code e}). */
  private static final String XML_TAG_EXCEPTION = "e";

  /** The XML tag for a pattern ({@code p}). */
  private static final String XML_TAG_PATTERN = "p";

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

    String classpath = HYPHENATION_XML_CONFIG_PREFIX + localeInfix + HYPHENATION_XML_CONFIG_SUFFIX;
    URL url = Thread.currentThread().getContextClassLoader().getResource(classpath);
    if (url != null) {
      Locale locale = LocaleHelper.fromString(localeInfix);
      return createHyphenator(locale, url);
    }
    return null;
  }

  /**
   * @param locale is the {@link Hyphenator#getLocale() locale}.
   * @param resource is the {@link URL} to the XML-configuration.
   * @return the {@link Hyphenator} instance.
   */
  protected Hyphenator createHyphenator(Locale locale, URL resource) {

    try {
      SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
      SAXParser saxParser = saxParserFactory.newSAXParser();
      XmlHandler handler = new XmlHandler();
      try (InputStream inputStream = resource.openStream()) {
        saxParser.parse(inputStream, handler);
        if (handler.patterns.isEmpty()) {
          throw new IllegalStateException("No patterns in XML config!");
        }
        HyphenatorImpl hyphenator = new HyphenatorImpl(locale, handler.hyphen, handler.patterns, handler.exceptions);
        return hyphenator;
      }
    } catch (Exception e) {
      throw new IllegalStateException("Error parsing XML from " + resource, e);
    }
  }

  private static class XmlHandler extends DefaultHandler {

    private boolean rootPresent;

    private String hyphen;

    private List<String> patterns;

    private List<String> exceptions;

    private List<String> activeList;

    public XmlHandler() {

      super();
      this.hyphen = Hyphenator.HYPHEN_DEFAULT;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

      this.activeList = null;
      if (!this.rootPresent) {
        if (!qName.equals(XML_TAG_HYPHENATION)) {
          throw new IllegalStateException("Invalid root tag '" + qName + "'.");
        }
        this.rootPresent = true;
        String hyp = attributes.getValue(XML_ATR_HYPHEN);
        if (hyp != null) {
          assert hyp.length() == 1 : "invalid hyphen character " + hyp;
          this.hyphen = hyp;
        }
      }
      if (qName.equals(XML_TAG_PATTERN)) {
        this.activeList = this.patterns;
      } else if (qName.equals(XML_TAG_EXCEPTION)) {
        this.activeList = this.exceptions;
      } else if (qName.equals(XML_TAG_PATTERN_LIST)) {
        if (this.patterns == null) {
          this.patterns = new ArrayList<>();
        }
      } else if (qName.equals(XML_TAG_EXCEPTION_LIST)) {
        if (this.exceptions == null) {
          this.exceptions = new ArrayList<>();
        }
      }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

      this.activeList = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

      if (this.activeList != null) {
        this.activeList.add(new String(ch, start, length));
      }
    }

  }

}
