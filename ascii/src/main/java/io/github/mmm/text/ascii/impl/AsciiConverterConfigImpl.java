/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

import java.util.Objects;

import io.github.mmm.base.text.CaseConversion;
import io.github.mmm.text.ascii.AsciiConverterConfig;

/**
 * Implementation of {@link AsciiConverterConfig}.
 */
public final class AsciiConverterConfigImpl implements AsciiConverterConfig {

  public static final AsciiConverterConfigImpl DEFAULT = new AsciiConverterConfigImpl();

  final CaseConversion caseConversion;

  final String unmappedCodePoint;

  final boolean includeControlChars;

  final boolean normalizeNumbers;

  final boolean useLongForms;

  /**
   * The constructor.
   */
  AsciiConverterConfigImpl() {

    this(CaseConversion.ORIGINAL_CASE, "", false, false, false);
  }

  AsciiConverterConfigImpl(CaseConversion caseConversion, String undefinedGlyph, boolean includeControlCharacters,
      boolean normalizeNumbers, boolean useLongForms) {

    super();
    if (caseConversion == null) {
      this.caseConversion = CaseConversion.ORIGINAL_CASE;
    } else {
      this.caseConversion = caseConversion;
    }
    if (undefinedGlyph == null) {
      this.unmappedCodePoint = "";
    } else {
      this.unmappedCodePoint = undefinedGlyph;
    }
    this.includeControlChars = includeControlCharacters;
    this.normalizeNumbers = normalizeNumbers;
    this.useLongForms = useLongForms;
  }

  @Override
  public CaseConversion caseConversion() {

    return this.caseConversion;
  }

  @Override
  public AsciiConverterConfig withCaseConversion(CaseConversion conversion) {

    if (conversion == null) {
      conversion = CaseConversion.ORIGINAL_CASE;
    }
    if (conversion == this.caseConversion) {
      return this;
    }
    return new AsciiConverterConfigImpl(conversion, this.unmappedCodePoint, this.includeControlChars,
        this.normalizeNumbers, this.useLongForms);
  }

  @Override
  public String unmappedCodePoint() {

    return this.unmappedCodePoint;
  }

  @Override
  public AsciiConverterConfig withUnmappedCodePoint(String glyph) {

    if (glyph == null) {
      glyph = "";
    }
    if (glyph == this.unmappedCodePoint) {
      return this;
    }
    return new AsciiConverterConfigImpl(this.caseConversion, glyph, this.includeControlChars, this.normalizeNumbers,
        this.useLongForms);
  }

  @Override
  public boolean includeControlChars() {

    return this.includeControlChars;
  }

  @Override
  public AsciiConverterConfig withIncludeControlChars(boolean include) {

    if (include == this.includeControlChars) {
      return this;
    }
    return new AsciiConverterConfigImpl(this.caseConversion, this.unmappedCodePoint, include, this.normalizeNumbers,
        this.useLongForms);
  }

  @Override
  public boolean normalizeNumbers() {

    return this.normalizeNumbers;
  }

  @Override
  public AsciiConverterConfig withNormalizeNumbers(boolean normalize) {

    if (normalize == this.normalizeNumbers) {
      return this;
    }
    return new AsciiConverterConfigImpl(this.caseConversion, this.unmappedCodePoint, this.includeControlChars,
        normalize, this.useLongForms);
  }

  @Override
  public boolean useLongForms() {

    return this.useLongForms;
  }

  @Override
  public AsciiConverterConfig withUseLongForms(boolean longForms) {

    if (longForms == this.useLongForms) {
      return this;
    }
    return new AsciiConverterConfigImpl(this.caseConversion, this.unmappedCodePoint, this.includeControlChars,
        this.normalizeNumbers, longForms);
  }

  @Override
  public int hashCode() {

    return Objects.hash(this.caseConversion, this.includeControlChars, this.normalizeNumbers, this.unmappedCodePoint);
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    } else if (obj instanceof AsciiConverterConfigImpl conf) {
      return (this.caseConversion == conf.caseConversion) && (this.includeControlChars == conf.includeControlChars)
          && (this.normalizeNumbers == conf.normalizeNumbers)
          && Objects.equals(this.unmappedCodePoint, conf.unmappedCodePoint);
    }
    return false;
  }

  @Override
  public String toString() {

    return "AsciiConversion[" + this.caseConversion + "/" + this.unmappedCodePoint + "/"
        + (this.includeControlChars ? "+" : "-") + "control/" + (this.normalizeNumbers ? "+" : "-") + "number]";
  }

}
