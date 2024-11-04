/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.hyphenation;

import java.util.Locale;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import io.github.mmm.text.hyphenation.impl.HyphenationImpl;

/**
 * Test of {@link Hyphenator}.
 */
public class HyphenatorTest extends Assertions {

  private Hyphenator getHyphenator(Locale locale) {

    Hyphenator hyphenator = Hyphenator.get(locale);
    assertThat(hyphenator).isNotNull();
    // load again to test caching...
    Hyphenator hyphenator2 = Hyphenator.get(locale);
    assertThat(hyphenator2).isSameAs(hyphenator);
    return hyphenator;
  }

  /**
   * This method tests the {@link Hyphenator} for {@link Locale#GERMAN} and {@link Locale#GERMANY}.
   */
  @ParameterizedTest
  @ValueSource(strings = { "Wort", "ein", "o", "Zer-streu-ung", "Be-werk-stel-li-gung", "Sil-ben-tren-nung",
  "selb-stän-dig", "Ein-ge-ständ-nis", "Ver-un-si-che-rung", "Aus-sen-dung", "Au-to-rin", "Ak-ten-ord-ner", "Ar-ma-da",
  "Darm-ein-lauf", "Beige" })
  public void testDe(String word) {

    Hyphenator hyphenator = getHyphenator(Locale.GERMANY);
    assertThat(hyphenator.getLocale()).isEqualTo(Locale.GERMAN);
    checkHyphenation(hyphenator, word);
  }

  /**
   * This method tests the {@link Hyphenator} for {@link Locale#UK}.
   */
  @ParameterizedTest
  @ValueSource(strings = { "word", "this", "a", "con-struc-tion", "spec-tro-elec-tro-chem-istry", "hy-phen-ation",
  "hyp-not-ic", "care-tak-er", "as-pirin", "as-pir-ing", "in-de-pen-dent", "tri-bune", "pro-gress", "even-ing",
  "pe-ri-od-ic", "as-so-ciate", "squirmed", "bio-rhythm", "ho-mol-o-gous", "be-tray-al", "de-spair", "per-fect-ly",
  "pro-gress", "pro-ject", "as-so-ciate", "ta-ble", "dec-li-na-tion", "obli-ga-to-ry" })
  // English hyphernation is as crazy as its pronunciation:
  // I would expect "re-ci-pro-ci-ty" but web resources say "re-ciproc-i-ty" or "reci-procity"
  // https://www.hyphenator.net/en/word/reciprocity
  // https://www.hyphenation24.com/word/reciprocity/
  public void testEnUk(String word) {

    Hyphenator hyphenator = getHyphenator(Locale.UK);
    assertThat(hyphenator.getLocale()).isEqualTo(Locale.ROOT);
    checkHyphenation(hyphenator, word);
  }

  /**
   * This method tests the {@link Hyphenator} for Spanish {@link Locale}.
   */
  @ParameterizedTest
  @ValueSource(strings = { "Pa-la-bra", "a", "Se-pa-ra-ción" })
  public void testEs(String word) {

    Locale locale = Locale.forLanguageTag("es");
    Hyphenator hyphenator = getHyphenator(locale);
    assertThat(hyphenator.getLocale()).isEqualTo(locale);
    checkHyphenation(hyphenator, word);
  }

  /**
   * This method tests the {@link Hyphenator} for {@link Locale#FRANCE} and {@link Locale#FRENCH}.
   */
  @ParameterizedTest
  @ValueSource(strings = { "Mot", "un", "Cé-sure", "dé-vé-rouiller" })
  public void testFr(String word) {

    Hyphenator hyphenator = getHyphenator(Locale.FRANCE);
    assertThat(hyphenator.getLocale()).isEqualTo(Locale.FRENCH);

    checkHyphenation(hyphenator, word);
  }

  /**
   * This method checks if a given {@code hyphenatedWord} is properly hyphenated using the given {@code hyphenator}.
   *
   * @param hyphenator is the {@link Hyphenator} to test.
   * @param hyphenatedWord is the hyphenated word.
   */
  protected void checkHyphenation(Hyphenator hyphenator, String hyphenatedWord) {

    Hyphenation hyphenation = new HyphenationImpl(hyphenatedWord);
    String word = hyphenation.getWord().toString();
    Hyphenation result = hyphenator.hyphenate(word);
    assertThat(result).isNotNull();
    assertThat(result.getWord()).isEqualTo(word);
    assertThat(result.toString()).isEqualTo(hyphenatedWord);
  }

}
