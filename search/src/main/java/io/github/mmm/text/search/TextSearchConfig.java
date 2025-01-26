package io.github.mmm.text.search;

import io.github.mmm.text.search.impl.TextSearchConfigImpl;
import io.github.mmm.text.search.query.TextSearchQueryParser;

/**
 * Interface for the configuration of full text search. Abstraction via interface allows to change implementation as
 * record, bean, enum, or whatever without breaking compatibility. Example usage:
 *
 * <pre>
 * {@link TextSearchConfig} config = {@link TextSearchConfig}.{@link #of()}.{@link #withTokenizer(TextTokenizer) withTokenizer}(
 * {@link TextTokenizer#get()}).{@link #withNormalizer(TextNormalizer) withNormalizer}({@link TextNormalizer#of()});
 * {@link TextSearchQueryParser} queryParser = {@link TextSearchQueryParser#of(TextSearchConfig) of}(config);
 * config = config.{@link #withQueryParser(TextSearchQueryParser) withQueryParser}(queryParser);
 * </pre>
 *
 * @see #of()
 */
public interface TextSearchConfig {

  /**
   * @return the {@link #withTokenizer(TextTokenizer) configured} {@link TextTokenizer}.
   */
  TextTokenizer tokenizer();

  /**
   * @param tokenizer the {@link TextTokenizer} to use.
   * @return this {@link TextSearchConfig} for fluent API calls.
   */
  TextSearchConfig withTokenizer(TextTokenizer tokenizer);

  /**
   * @return the {@link #withNormalizer(TextNormalizer) configured} {@link TextNormalizer}.
   */
  TextNormalizer normalizer();

  /**
   * @param normalizer the {@link TextNormalizer} to use.
   * @return this {@link TextSearchConfig} for fluent API calls.
   */
  TextSearchConfig withNormalizer(TextNormalizer normalizer);

  /**
   * @return the {@link #withQueryParser(TextSearchQueryParser) configured} {@link TextSearchQueryParser}.
   */
  TextSearchQueryParser queryParser();

  /**
   * @param queryParser the {@link TextSearchQueryParser}.
   * @return this {@link TextSearchConfig} for fluent API calls.
   */
  TextSearchConfig withQueryParser(TextSearchQueryParser queryParser);

  /**
   * @return a default instance of {@link TextSearchConfig}.
   */
  static TextSearchConfig of() {

    return TextSearchConfigImpl.DEFAULT;
  }

}
