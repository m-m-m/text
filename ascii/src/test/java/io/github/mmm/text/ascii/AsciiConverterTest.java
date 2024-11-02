/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii;

import java.util.Locale;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.mmm.base.text.CaseConversion;

/**
 * Test of {@link AsciiConverter}.
 */
public class AsciiConverterTest extends Assertions {

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} and its variants with pure 7-Bit ASCII text.
   */
  @Test
  public void testAscii() {

    // arrange
    String text = "abcdefghijklmnopqrstuvwxyz\nABCDEFGHIJKLMNOPQRSTUVWXYZ\t0123456789+-([{}])/*#~$'\".,;:!?";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text)).isEqualTo(text);
    assertThat(converter.convert(text, AsciiConverterConfig.of().withCaseConversion(CaseConversion.ORIGINAL_CASE)))
        .isEqualTo(text);
    assertThat(converter.convert(text, AsciiConverterConfig.of().withCaseConversion(CaseConversion.UPPER_CASE)))
        .isEqualTo(text.toUpperCase(Locale.ROOT));
    assertThat(converter.convert(text, AsciiConverterConfig.of().withCaseConversion(CaseConversion.LOWER_CASE)))
        .isEqualTo(text.toLowerCase(Locale.ROOT));
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for German transliteration (exact resolution of Umlauts).
   */
  @Test
  public void testGerman() {

    // arrange
    String text = "Diese Komponente ermöglicht eine einfache Transliteration von Unicode nach ASCII ohne übermäßige Komplexität.\n"
        + "Auch Österreich, die Schweiz, Lichtenstein sowie anderssprachige Länder wie Ägypten oder aus Übersee können davon profitieren.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text)).isEqualTo(
        "Diese Komponente ermoeglicht eine einfache Transliteration von Unicode nach ASCII ohne uebermaessige Komplexitaet.\n"
            + "Auch Oesterreich, die Schweiz, Lichtenstein sowie anderssprachige Laender wie Aegypten oder aus Uebersee koennen davon profitieren.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for German transliteration (exact resolution of Umlauts).
   */
  @Test
  public void testFrench() {

    // arrange
    String text = "Ce composant permet une translittération facile d'Unicode vers ASCII sans complexité excessive.\n"
        + "L'Autriche, la Suisse, le Liechtenstein et les pays avec d'autres langues comme l'Égypte ou l'étranger peuvent également en bénéficier.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text))
        .isEqualTo("Ce composant permet une translitteration facile d'Unicode vers ASCII sans complexite excessive.\n"
            + "L'Autriche, la Suisse, le Liechtenstein et les pays avec d'autres langues comme l'Egypte ou l'etranger peuvent egalement en beneficier.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Danish transliteration (exact resolution of Umlauts).
   */
  @Test
  public void testDanish() {

    // arrange
    String text = "Denne komponent hjælper med let translitteration fra Unicode til ASCII uden overdreven kompleksitet.\n"
        + "Østrig, Schweiz, Lichtenstein og lande med andre sprog som Egypten eller oversøiske kan også drage fordel af dette.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text)).isEqualTo(
        "Denne komponent hjaelper med let translitteration fra Unicode til ASCII uden overdreven kompleksitet.\n"
            + "Oestrig, Schweiz, Lichtenstein og lande med andre sprog som Egypten eller oversoeiske kan ogsae drage fordel af dette.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Swedish transliteration (exact resolution of Umlauts).
   */
  @Test
  public void testSwedish() {

    // arrange
    String text = "Denna komponent möjliggör enkel translitterering från Unicode till ASCII utan onödig komplexitet.\n"
        + "Österrike, Schweiz, Lichtenstein och länder med andra språk som Egypten eller utomlands kan också dra nytta av detta.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text)).isEqualTo(
        "Denna komponent moejliggoer enkel translitterering fraen Unicode till ASCII utan onoedig komplexitet.\n"
            + "Oesterrike, Schweiz, Lichtenstein och laender med andra spraek som Egypten eller utomlands kan ocksae dra nytta av detta.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Norwegian transliteration (exact resolution of Umlauts).
   */
  @Test
  public void testNorwegian() {

    // arrange
    String text = "Denne komponenten muliggjør enkel translitterasjon fra Unicode til ASCII uten unødig kompleksitet.\n"
        + "Østerrike, Sveits, Lichtenstein og land med andre språk som Egypt eller utenlands kan også dra nytte av dette.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text)).isEqualTo(
        "Denne komponenten muliggjoer enkel translitterasjon fra Unicode til ASCII uten unoedig kompleksitet.\n"
            + "Oesterrike, Sveits, Lichtenstein og land med andre spraek som Egypt eller utenlands kan ogsae dra nytte av dette.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Hungarian transliteration.
   */
  @Test
  public void testHungarian() {

    // arrange
    String text = "Ez az összetevő lehetővé teszi az egyszerű átírást Unicode-ról ASCII-re, felesleges bonyolultság nélkül.\n"
        + "Ausztria, Svájc, Lichtenstein és más nyelvű országok, mint például Egyiptom vagy a tengerentúlon is részesülhetnek ebből.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text)).isEqualTo(
        "Ez az oesszetevo lehetove teszi az egyszeru atirast Unicode-rol ASCII-re, felesleges bonyolultsag nelkuel.\n"
            + "Ausztria, Svajc, Lichtenstein es mas nyelvu orszagok, mint peldaul Egyiptom vagy a tengerentulon is reszesuelhetnek ebbol.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Greek transliteration (not exact but close to ISO-843).
   */
  @Test
  public void testGreek() {

    // arrange
    String text = "Αυτό το στοιχείο επιτρέπει την εύκολη μεταγραφή από Unicode σε ASCII χωρίς αδικαιολόγητη πολυπλοκότητα.\n"
        + "Η Αυστρία, η Ελβετία, το Λιχτενστάιν, καθώς και χώρες με άλλες γλώσσες όπως η Αίγυπτος ή το εξωτερικό μπορούν επίσης να επωφεληθούν από αυτό.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text)).isEqualTo(
        "Auto to stoikheio epitrepei ten eukole metagraphe apo Unicode se ASCII khoris adikaiologete poluplokoteta.\n"
            + "E Austria, e Elbetia, to Likhtenstain, kathos kai khores me alles glosses opos e Aiguptos e to exoteriko mporoun epises na epophelethoun apo auto.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Russian/Cyrillic transliteration (not exact but close to
   * ISO-9:1995).
   */
  @Test
  public void testRussian() {

    // arrange
    String text = "Этот компонент позволяет легко транслитерировать из Unicode в ASCII без излишней сложности.\n"
        + "Австрия, Швейцария, Лихтенштейн и страны с другими языками, такие как Египет или зарубежные страны, также могут извлечь из этого выгоду.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert

    // Etot komponent pozvolyayet legko transliterirovat' iz Unicode v ASCII bez izlishney slozhnosti.
    // Avstriya, Shveytsariya, Likhtenshteyn i strany s drugimi yazykami, takiye kak Yegipet ili zarubezhnyye strany,
    // takzhe mogut izvlech' iz etogo vygodu
    assertThat(converter.convert(text))
        .isEqualTo("Etot komponent pozvolyaet legko transliterirovat' iz Unicode v ASCII bez izlishney slozhnosti.\n"
            + "Avstriya, Shveytsariya, Likhtenshteyn i strany s drugimi yazykami, takie kak Egipet ili zarubezhnye strany, takzhe mogut izvlech' iz etogo vygodu.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Vietnamese transliteration.
   */
  @Test
  public void testVietnamese() {

    // arrange
    String text = "Thành phần này cho phép chuyển ngữ dễ dàng từ Unicode sang ASCII mà không quá phức tạp.\n"
        + "Áo, Thụy Sĩ, Lichtenstein và các quốc gia có ngôn ngữ khác như Ai Cập hoặc nước ngoài cũng có thể được hưởng lợi từ việc này.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert
    assertThat(converter.convert(text))
        .isEqualTo("Thanh phan nay cho phep chuyen ngu de dang tu Unicode sang ASCII ma khong qua phuc tap.\n"
            + "Ao, Thuy Si, Lichtenstein va cac quoc gia co ngon ngu khac nhu Ai Cap hoac nuoc ngoai cung co the duoc huong loi tu viec nay.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Jiddish transliteration.
   */
  @Test
  public void testJiddish() {

    // arrange
    String text = "דער קאָמפּאָנענט אַלאַוז גרינג טראַנסליטעראַטיאָן פון אוניקאָד צו ASCII אָן יבעריק קאַמפּלעקסיטי.\n"
        + "מיעסטרייַאַ, שווייץ, ליכטנשטיין און לענדער מיט אנדערע שפּראַכן אַזאַ ווי מצרים אָדער מעייווער - לייאַם קענען אויך נוץ פון דעם.";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert

    // der komponent alauz gring transliteratyon fun aunikod tsu ASCII on iberik kamplexiti.
    // myestraya, shveyts, likhtnshteyn aun lender mit andere shprakhn aza vi mtsrim oder meeyver - leyam kenen aoykh
    // nuts fun dem.
    assertThat(converter.convert(text))
        .isEqualTo("der qamp'anent alavz gryng translyteratyan pvn vnyqad tsv ASCII an yberyq qamp'leqsyty.\n"
            + "myestryyaa, shvvyyts, lyktnshtyyn vn lender myt ndere shp'rakn aza vvy mtsrym ader meyyvver - lyyam qenen vyk nvts pvn dem.");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Thai transliteration.
   */
  @Test
  public void testThai() {

    // arrange
    String text = "ส่วนประกอบนี้ช่วยให้สามารถทับศัพท์จาก Unicode ไปเป็น ASCII ได้อย่างง่ายดายโดยไม่ซับซ้อนเกินไป\n"
        + "ออสเตรีย สวิตเซอร์แลนด์ ลิกเตนสไตน์ และประเทศที่มีภาษาอื่น เช่น อียิปต์ หรือต่างประเทศก็สามารถได้รับประโยชน์จากสิ่งนี้เช่นกัน";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert

    // Swn prakxb ni chwy hi samarth thab saphth̒ cak Unicode pi pen ASCII di xyang ngayday doy mi sab sxn kein pi
    // Xxsteriy s wit sexr̒ laend̒ li k tens tin̒ laea prathes thi mi phasʹa xun chen xiyipt̒ hrux tang prathes k
    // samarth di rab prayochn̒ cak sing ni chen kan
    assertThat(converter.convert(text)).isEqualTo(
        "swnprak`bniichwyaihsaamaarththabsaphthcchaak Unicode aipepn ASCII aid`yaangngaaydaayodyaimchabch`nekinaip\n"
            + "``setriiy switech`raelnd liketnsaitn aelapraethsthiimiiphaasaa`uuen echn `iiyipt hruue`taangpraethsksaamaarthaidrabpraoychncchaaksingniiechnkan");
  }

  /**
   * Test {@link AsciiConverter#convert(CharSequence)} for Chinese (simplified) transliteration.
   */
  @Test
  public void testChinese() {

    // arrange
    String text = "该组件允许轻松地从 Unicode 音译到 ASCII，而不会产生过度的复杂性。\n" //
        + "奥地利、瑞士、列支敦士登以及埃及或海外等使用其他语言的国家也可以从中受益。";
    AsciiConverter converter = AsciiConverter.get();
    // act + assert

    // Gāi zǔjiàn yǔnxǔ qīngsōng de cóng Unicode yīnyì dào ASCII, ér bù huì chǎnshēng guòdù de fùzá xìng.
    // Àodìlì, ruìshì, lièzhīdūnshìdēng yǐjí āijí huò hǎiwài děng shǐyòng qítā yǔyán de guójiā yě kěyǐ
    assertThat(converter.convert(text)).isEqualTo(
        "Gai Zu Jian Yun Xu Qing Song Di Cong Unicode Yin Yi Dao ASCII,Er Bu Hui Chan Sheng Guo Du De Fu Za Xing.\n"
            + "Ao Di Li,Rui Shi,Lie Zhi Dun Shi Deng Yi Ji Ai Ji Huo Hai Wai Deng Shi Yong Qi Ta Yu Yan De Guo Jia Ye Ke Yi Cong Zhong Shou Yi.");
  }

}
