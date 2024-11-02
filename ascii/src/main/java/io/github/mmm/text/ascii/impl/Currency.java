/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * Extends {@link StructuredWord} for a currency.
 */
class Currency extends StructuredWord {

  static final Currency YEN = new Currency("Y=", "yen");

  static final Currency SIGN = new Currency("ox", "currency");

  static final Currency POUND = new Currency("L-", "pound");

  static final Currency CENT = new Currency("c|", "cent");

  static final Currency SOM = new Currency("C_", "som");

  static final Currency BITCOIN = new Currency("B||", "bitcoin");

  static final Currency LARI = new Currency("C_''", "lari");

  static final Currency RUBLE = new Currency("P-", "ruble");

  static final Currency MANAT = new Currency("/|\\", "manat");

  static final Currency RIGSDALER = new Currency("q~_", "rigsdaler");

  static final Currency LIRA = new Currency("t=", "lira");

  static final Currency I_RUPEE = new Currency("R=", "I-rupee");

  static final Currency TENGE = new Currency("T-", "tenge");

  static final Currency SPESMILO = new Currency("S~", "spesmilo");

  static final Currency LIVRE_TOURNOIS = new Currency("lt", "livre tournois");

  static final Currency CEDI = new Currency("C|", "cedi");

  static final Currency HRYVNIA = new Currency("?=", "hryvnia");

  static final Currency AUSTRAL = new Currency("A=", "austral");

  static final Currency GUARANI = new Currency("G/", "guarani");

  static final Currency PESO = new Currency("P=", "Peso");

  static final Currency PFENNIG = new Currency("f", "pfennig");

  static final Currency DRACHMA = new Currency("Dp", "drachma");

  static final Currency TUGRIK = new Currency("T=", "tugrik");

  static final Currency KIP = new Currency("K-", "kip");

  static final Currency EURO = new Currency("E=", "EUR");

  static final Currency DONG = new Currency("d+_", "dong");

  static final Currency SHEKEL = new Currency("nu", "shekel");

  static final Currency WON = new Currency("W=", "won");

  static final Currency RUPEE = new Currency("Rs", "rupee");

  static final Currency PESETA = new Currency("Pts", "peseta");

  static final Currency NAIRA = new Currency("N=", "naira");

  static final Currency MIL = new Currency("m/", "mil");

  static final Currency FRANC = new Currency("F-", "Franc");

  static final Currency COLON = new Currency("C//", "colon");

  static final Currency CRUZEIRO = new Currency("Cr", "Cruzeiro");

  static final Currency ECU = new Currency("CE", "ECU");

  static final Currency ESCUDO = new Currency("$|", "escudo");

  static final Currency KRONE = new Currency("kr.", "krone");

  static final Currency GUINEA = new Currency("gn.", "guinea");

  static final Currency GUILDER = new Currency("gulden");

  static final Currency KORUNA = new Currency("Kc", "koruna");

  static final Currency CENTIME = new Currency("cnt", "centime");

  static final Currency SHILLING = new Currency("shill.", "shilling");

  static final Currency DOLLAR = new Currency("$", "dollar");

  static final Currency BAHT = new Currency("B|", "baht");

  static final Currency PIASTER = new Currency("piaster");

  static final Currency PENNY = new Currency("penny", "p.");

  static final Currency MARK = new Currency("mark");

  static final Currency YUAN = new Currency("yuan");

  Currency(String s) {

    this(s, s);
  }

  Currency(String symbol, String full) {

    super(symbol, full);
  }

}
