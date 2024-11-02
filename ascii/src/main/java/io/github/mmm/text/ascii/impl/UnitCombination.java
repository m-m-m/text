/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

import io.github.mmm.base.text.CaseConversion;

/**
 * A combination of {@link Unit} with a {@link Factor} and a {@link Power}.
 */
public class UnitCombination extends Word {

  final Unit unit;

  final Factor factor;

  final Power power;

  UnitCombination(Factor factor, Unit unit) {

    this(factor, unit, Power.ONE);
  }

  UnitCombination(Factor factor, Unit unit, Power power) {

    super("");
    this.unit = unit;
    this.factor = factor;
    this.power = power;
  }

  Unit getUnit() {

    return this.unit;
  }

  Factor getFactor() {

    return this.factor;
  }

  Power getPower() {

    return this.power;
  }

  @Override
  protected CodePointMapping doAppend(AsciiBuilder builder, int codePoint, CodePointMapping next) {

    CaseConversion caseConversion = builder.config.caseConversion;
    if (builder.config.useLongForms) {
      if (this.power != Power.ONE) {
        caseConversion.append(builder.sb, this.power.s);
        builder.sb.append('-');
      }
      if (this.factor != Factor.ONE) {
        caseConversion.append(builder.sb, this.factor.full);
        builder.sb.append('-');
      }
      caseConversion.append(builder.sb, this.unit.full);
    } else {
      if (this.factor != Factor.ONE) {
        caseConversion.append(builder.sb, this.factor.s);
      }
      caseConversion.append(builder.sb, this.unit.s);
      if (this.power != Power.ONE) {
        builder.sb.append('^');
        builder.sb.append(this.power.numerator);
      }
    }
    return next;
  }

}
