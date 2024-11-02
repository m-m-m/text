package io.github.mmm.text.ascii;

import io.github.mmm.base.text.CaseConversion;
import io.github.mmm.text.ascii.impl.AsciiConverterConfigImpl;

/**
 * Interface for the configuration of {@link AsciiConverter} usage. Abstraction via interface allows to change
 * implementation as record, bean, enum, or whatever without breaking compatibility. Example usage:
 *
 * <pre>
 * {@link AsciiConverterConfig} config = {@link AsciiConverterConfig}.{@link #of()}.{@link #withCaseConversion(CaseConversion) withCaseConversion}(
 * {@link CaseConversion#LOWER_CASE}).{@link #withUnmappedCodePoint(String) withUnmappedCodePoint}("[?]").{@link #withIncludeControlChars(boolean) withIncludeControlCharacters}(true);
 * </pre>
 *
 * @see #of()
 * @see AsciiConverter#convert(CharSequence, AsciiConverterConfig)
 */
public interface AsciiConverterConfig {

  /**
   * @return the {@link #withCaseConversion(CaseConversion) configured} {@link CaseConversion}.
   */
  CaseConversion caseConversion();

  /**
   * @param conversion the {@link CaseConversion} to use. Allows you to get the result in UPPER or lower-case what is
   *        faster than converting the result to that after ASCII conversion.
   * @return this {@link AsciiConverterConfig} for fluent API calls.
   */
  AsciiConverterConfig withCaseConversion(CaseConversion conversion);

  /**
   * @return the {@link #withUnmappedCodePoint(String) configured undefined code-point}.
   */
  String unmappedCodePoint();

  /**
   * @param ascii the {@link String} to use for unmapped {@link String#codePointAt(int) code-points}. The default is the
   *        empty {@link String} to ignore them. You may use something like "?" or "[?]" instead to make them visible.
   *        This {@link String} should consist only of 7-bit ASCII characters or your converted result may not be ASCII.
   * @return this {@link AsciiConverterConfig} for fluent API calls.
   */
  AsciiConverterConfig withUnmappedCodePoint(String ascii);

  /**
   * @return the {@link #withIncludeControlChars(boolean) configured include-control-characters flag}.
   */
  boolean includeControlChars();

  /**
   * @param include - the ASCII control characters 0x00-0x1F except 0x09 and 0x0A are typically stripped out. This
   *        happens if this flag is {@code false}. However, provide {@code true} to include these control characters
   *        into the result.
   * @return this {@link AsciiConverterConfig} for fluent API calls.
   */
  AsciiConverterConfig withIncludeControlChars(boolean include);

  /**
   * @return the {@link #withNormalizeNumbers(boolean) configured normalize-numbers flag}.
   */
  boolean normalizeNumbers();

  /**
   * @param normalize - usually foreign number symbols are added as text, what happens if this flag is {@code false}. If
   *        you provide {@code true} here, sequential number symbols may be added and the result converted to Arabic
   *        numbers with ASCII digits. E.g. "ⅩⅭ" ("XC") will result in "90".
   * @return this {@link AsciiConverterConfig} for fluent API calls.
   */
  AsciiConverterConfig withNormalizeNumbers(boolean normalize);

  /**
   * @return the {@link #withUseLongForms(boolean) configured use-long-forms flag}.
   */
  boolean useLongForms();

  /**
   * @param longForms - usually a compact ASCII form is preferred, what happens if this flag is {@code false}. If you
   *        provide {@code true} here, long forms will be preferred for currencies, numbers, and units.
   * @return this {@link AsciiConverterConfig} for fluent API calls.
   */
  AsciiConverterConfig withUseLongForms(boolean longForms);

  /**
   * @return a default instance of {@link AsciiConverterConfig}.
   */
  static AsciiConverterConfig of() {

    return AsciiConverterConfigImpl.DEFAULT;
  }

}
