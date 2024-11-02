/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Abstract base class for mapping of unicode code-points for specific high-byte.<br>
 * Here we declare constants for all {@link CodePointMapping} used more than once with following naming:
 * <ul>
 * <li>{@code LO_*} for letter or string all in lower-case</li>
 * <li>{@code UP_*} for letter or string all in upper-case</li>
 * <li>{@code CAP_*} for capitalized string</li>
 * <li>{@code C_*} for non-letter ASCII character (including digits)</li>
 * <li>{@code CUR_*} for currency</li>
 * <li>{@code WD_*} for word</li>
 * </ul>
 */
abstract class Xxx {

  // strings

  static final Letters LO_AA = new Letters("aa");

  static final Letters LO_AE = new Letters("ae");

  static final Letters LO_AI = new Letters("ai");

  static final Letters LO_AT = new Letters("at");

  static final Letters LO_AN = new Letters("an");

  static final Letters LO_AU = new Letters("au");

  static final Letters LO_BA = new Letters("ba");

  static final Letters LO_BB = new Letters("bb");

  static final Letters LO_BE = new Letters("be");

  static final Letters LO_BH = new Letters("bh");

  static final Letters LO_BI = new Letters("bi");

  static final Letters LO_BO = new Letters("bo");

  static final Letters LO_BS = new Letters("bs");

  static final Letters LO_BU = new Letters("bu");

  static final Letters LO_CA = new Letters("ca");

  static final Letters LO_CE = new Letters("ce");

  static final Letters LO_CH = new Letters("ch");

  static final Letters LO_DA = new Letters("da");

  static final Letters LO_DD = new Letters("dd");

  static final Letters LO_DE = new Letters("de");

  static final Letters LO_DH = new Letters("dh");

  static final Letters LO_DI = new Letters("di");

  static final Letters LO_DO = new Letters("do");

  static final Letters LO_DU = new Letters("du");

  static final Letters LO_DZ = new Letters("dz");

  static final Letters LO_EE = new Letters("ee");

  static final Letters LO_EN = new Letters("en");

  static final Letters LO_EO = new Letters("eo");

  static final Letters LO_EU = new Letters("eu");

  static final Letters LO_FA = new Letters("fa");

  static final Letters LO_FE = new Letters("fe");

  static final Letters LO_FI = new Letters("fi");

  static final Letters LO_FO = new Letters("fo");

  static final Letters LO_FU = new Letters("fu");

  static final Letters LO_GA = new Letters("ga");

  static final Letters LO_GE = new Letters("ge");

  static final Letters LO_GG = new Letters("gg");

  static final Letters LO_GH = new Letters("gh");

  static final Letters LO_GI = new Letters("gi");

  static final Letters LO_GO = new Letters("go");

  static final Letters LO_GS = new Letters("gs");

  static final Letters LO_GU = new Letters("gu");

  static final Letters LO_HA = new Letters("ha");

  static final Letters LO_HE = new Letters("he");

  static final Letters LO_HI = new Letters("hi");

  static final Letters LO_HO = new Letters("ho");

  static final Letters LO_HU = new Letters("hu");

  static final Letters LO_IE = new Letters("ie");

  static final Letters LO_IN = new Letters("in");

  static final Letters LO_IO = new Letters("io");

  static final Letters LO_IJ = new Letters("ij");

  static final Letters LO_JA = new Letters("ja");

  static final Letters LO_JE = new Letters("je");

  static final Letters LO_JH = new Letters("jh");

  static final Letters LO_JI = new Letters("ji");

  static final Letters LO_JJ = new Letters("jj");

  static final Letters LO_JO = new Letters("jo");

  static final Letters LO_JU = new Letters("ju");

  static final Letters LO_KA = new Letters("ka");

  static final Letters LO_KE = new Letters("ke");

  static final Letters LO_KH = new Letters("kh");

  static final Letters LO_KI = new Letters("ki");

  static final Letters LO_KO = new Letters("ko");

  static final Letters LO_KU = new Letters("ku");

  static final Letters LO_LA = new Letters("la");

  static final Letters LO_LB = new Letters("lb");

  static final Letters LO_LE = new Letters("le");

  static final Letters LO_LG = new Letters("lg");

  static final Letters LO_LI = new Letters("li");

  static final Letters LO_LM = new Letters("lm");

  static final Letters LO_LO = new Letters("lo");

  static final Letters LO_LU = new Letters("lu");

  static final Letters LO_II = new Letters("ii");

  static final Letters LO_LJ = new Letters("lj");

  static final Letters LO_LL = new Letters("ll");

  static final Letters LO_LP = new Letters("lp");

  static final Letters LO_LS = new Letters("ls");

  static final Letters LO_LT = new Letters("lt");

  static final Letters LO_MA = new Letters("ma");

  static final Letters LO_ME = new Letters("me");

  static final Letters LO_MI = new Letters("mi");

  static final Letters LO_MO = new Letters("mo");

  static final Letters LO_MU = new Letters("mu");

  static final Letters LO_NA = new Letters("na");

  static final Letters LO_NE = new Letters("ne");

  static final Letters LO_NG = new Letters("ng");

  static final Letters LO_NH = new Letters("nh");

  static final Letters LO_NI = new Letters("ni");

  static final Letters LO_NJ = new Letters("nj");

  static final Letters LO_NN = new Letters("nn");

  static final Letters LO_NO = new Letters("no");

  static final Letters LO_NU = new Letters("nu");

  static final Letters LO_NY = new Letters("ny");

  static final Letters LO_OE = new Letters("oe");

  static final Letters LO_OI = new Letters("oi");

  static final Letters LO_ON = new Letters("on");

  static final Letters LO_OO = new Letters("oo");

  static final Letters LO_OT = new Letters("ot");

  static final Letters LO_PA = new Letters("pa");

  static final Letters LO_PE = new Letters("pe");

  static final Letters LO_PI = new Letters("pi");

  static final Letters LO_PO = new Letters("po");

  static final Letters LO_PU = new Letters("pu");

  static final Letters LO_PH = new Letters("ph");

  static final Letters LO_PS = new Letters("ps");

  static final Letters LO_RA = new Letters("ra");

  static final Letters LO_RE = new Letters("re");

  static final Letters LO_RH = new Letters("rh");

  static final Letters LO_RI = new Letters("ri");

  static final Letters LO_RR = new Letters("rr");

  static final Letters LO_RO = new Letters("ro");

  static final Letters LO_RU = new Letters("ru");

  static final Letters LO_SA = new Letters("sa");

  static final Letters LO_SE = new Letters("se");

  static final Letters LO_SH = new Letters("sh");

  static final Letters LO_SI = new Letters("si");

  static final Letters LO_SO = new Letters("so");

  static final Letters LO_SP = new Letters("sp");

  static final Letters LO_SS = new Letters("ss");

  static final Letters LO_ST = new Letters("st");

  static final Letters LO_SU = new Letters("su");

  static final Letters LO_TA = new Letters("ta");

  static final Letters LO_TE = new Letters("te");

  static final Letters LO_TH = new Letters("th");

  static final Letters LO_TI = new Letters("ti");

  static final Letters LO_TO = new Letters("to");

  static final Letters LO_TS = new Letters("ts");

  static final Letters LO_TT = new Letters("tt");

  static final Letters LO_TU = new Letters("tu");

  static final Letters LO_UE = new Letters("ue");

  static final Letters LO_UU = new Letters("uu");

  static final Letters LO_VA = new Letters("va");

  static final Letters LO_VE = new Letters("ve");

  static final Letters LO_VI = new Letters("vi");

  static final Letters LO_VO = new Letters("vo");

  static final Letters LO_VU = new Letters("vu");

  static final Letters LO_WA = new Letters("wa");

  static final Letters LO_WE = new Letters("we");

  static final Letters LO_WI = new Letters("wi");

  static final Letters LO_WO = new Letters("wo");

  static final Letters LO_YA = new Letters("ya");

  static final Letters LO_YE = new Letters("ye");

  static final Letters LO_YI = new Letters("yi");

  static final Letters LO_YO = new Letters("yo");

  static final Letters LO_YU = new Letters("yu");

  static final Letters LO_YR = new Letters("yr");

  static final Letters LO_YY = new Letters("yy");

  static final Letters LO_ZA = new Letters("za");

  static final Letters LO_ZE = new Letters("ze");

  static final Letters LO_ZH = new Letters("zh");

  static final Letters LO_ZI = new Letters("zi");

  static final Letters LO_ZO = new Letters("zo");

  static final Letters LO_ZU = new Letters("zu");

  // strings
  static final Letters UP_CH = new Letters("CH");

  static final Letters UP_NJ = new Letters("NJ");

  static final Letters UP_DZ = new Letters("DZ");

  static final Letters UP_LL = new Letters("LL");

  // Capitalized

  static final Letters UP_AE = new Letters("Ae");

  static final Letters CAP_CH = new Letters("Ch");

  static final Letters CAP_DZ = new Letters("Dz");

  static final Letters CAP_IE = new Letters("Ie");

  static final Letters CAP_IJ = new Letters("Ij");

  static final Letters CAP_IO = new Letters("Io");

  static final Letters CAP_KH = new Letters("Kh");

  static final Letters CAP_KS = new Letters("Ks");

  static final Letters CAP_NJ = new Letters("Nj");

  static final Letters UP_OE = new Letters("Oe");

  static final Letters UP_OI = new Letters("Oi");

  static final Letters CAP_PS = new Letters("Ps");

  static final Letters CAP_SH = new Letters("Sh");

  static final Letters CAP_TH = new Letters("Th");

  static final Letters UP_UE = new Letters("Ue");

  static final Letters CAP_ZH = new Letters("Zh");

  // digits

  // currencies

}
