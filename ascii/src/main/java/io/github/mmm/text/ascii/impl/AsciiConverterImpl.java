/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

import java.util.PrimitiveIterator.OfInt;

import io.github.mmm.text.ascii.AsciiConverter;
import io.github.mmm.text.ascii.AsciiConverterConfig;

/**
 * Implementation of {@link AsciiConverter}.
 */
public class AsciiConverterImpl implements AsciiConverter {

  /** @see AsciiConverter#get() */
  public static final AsciiConverterImpl INSTANCE = new AsciiConverterImpl();

  private static final CodePointMapping[][] CACHE = new CodePointMapping[256][];

  private static final CodePointMapping[] NO_MAP = new CodePointMapping[0];

  private AsciiConverterImpl() {

    super();
  }

  @Override
  public String convert(int codePoint) {

    CodePointMapping asc = getAsc(codePoint);
    if (asc == null) {
      return null;
    }
    return asc.toString();
  }

  private static CodePointMapping getAsc(int codePoint) {

    int hi = (codePoint >> 8) & 0xff;
    int low = codePoint & 0xff;
    // try to get map from CACHE and otherwise load from class and put in CACHE.
    // we could initialize the full String[256][256] in memory but this approach is better for maintenance and also
    // we can keep memory footprint smaller since Java loads the needed classes lazily.
    // When transliterating from we typically do not mix Greek, Cyrillic, Hiragana, etc.
    CodePointMapping[] map = CACHE[hi];
    if (null == map) {
      map = switch (hi) {
        case 0x00 -> X00.MAP;
        case 0x01 -> X01.MAP;
        case 0x02 -> X02.MAP;
        case 0x03 -> X03.MAP;
        case 0x04 -> X04.MAP;
        case 0x05 -> X05.MAP;
        case 0x06 -> X06.MAP;
        case 0x07 -> X07.MAP;
        case 0x09 -> X09.MAP;
        case 0x0a -> X0a.MAP;
        case 0x0b -> X0b.MAP;
        case 0x0c -> X0c.MAP;
        case 0x0d -> X0d.MAP;
        case 0x0e -> X0e.MAP;
        case 0x0f -> X0f.MAP;
        case 0x10 -> X10.MAP;
        case 0x11 -> X11.MAP;
        case 0x12 -> X12.MAP;
        case 0x13 -> X13.MAP;
        case 0x14 -> X14.MAP;
        case 0x15 -> X15.MAP;
        case 0x16 -> X16.MAP;
        case 0x17 -> X17.MAP;
        case 0x18 -> X18.MAP;
        case 0x1e -> X1e.MAP;
        case 0x1f -> X1f.MAP;
        case 0x20 -> X20.MAP;
        case 0x21 -> X21.MAP;
        case 0x25 -> X25.MAP;
        case 0x28 -> X28.MAP;
        case 0x30 -> X30.MAP;
        case 0x31 -> X31.MAP;
        case 0x32 -> X32.MAP;
        case 0x33 -> X33.MAP;
        case 0x4e -> X4e.MAP;
        case 0x4f -> X4f.MAP;
        case 0x50 -> X50.MAP;
        case 0x51 -> X51.MAP;
        case 0x52 -> X52.MAP;
        case 0x53 -> X53.MAP;
        case 0x54 -> X54.MAP;
        case 0x55 -> X55.MAP;
        case 0x56 -> X56.MAP;
        case 0x57 -> X57.MAP;
        case 0x58 -> X58.MAP;
        case 0x59 -> X59.MAP;
        case 0x5a -> X5a.MAP;
        case 0x5b -> X5b.MAP;
        case 0x5c -> X5c.MAP;
        case 0x5d -> X5d.MAP;
        case 0x5e -> X5e.MAP;
        case 0x5f -> X5f.MAP;
        case 0x60 -> X60.MAP;
        case 0x61 -> X61.MAP;
        case 0x62 -> X62.MAP;
        case 0x63 -> X63.MAP;
        case 0x64 -> X64.MAP;
        case 0x65 -> X65.MAP;
        case 0x66 -> X66.MAP;
        case 0x67 -> X67.MAP;
        case 0x68 -> X68.MAP;
        case 0x69 -> X69.MAP;
        case 0x6a -> X6a.MAP;
        case 0x6b -> X6b.MAP;
        case 0x6c -> X6c.MAP;
        case 0x6d -> X6d.MAP;
        case 0x6e -> X6e.MAP;
        case 0x6f -> X6f.MAP;
        case 0x70 -> X70.MAP;
        case 0x71 -> X71.MAP;
        case 0x72 -> X72.MAP;
        case 0x73 -> X73.MAP;
        case 0x74 -> X74.MAP;
        case 0x75 -> X75.MAP;
        case 0x76 -> X76.MAP;
        case 0x77 -> X77.MAP;
        case 0x78 -> X78.MAP;
        case 0x79 -> X79.MAP;
        case 0x7a -> X7a.MAP;
        case 0x7b -> X7b.MAP;
        case 0x7c -> X7c.MAP;
        case 0x7d -> X7d.MAP;
        case 0x7e -> X7e.MAP;
        case 0x7f -> X7f.MAP;
        case 0x80 -> X80.MAP;
        case 0x81 -> X81.MAP;
        case 0x82 -> X82.MAP;
        case 0x83 -> X83.MAP;
        case 0x84 -> X84.MAP;
        case 0x85 -> X85.MAP;
        case 0x86 -> X86.MAP;
        case 0x87 -> X87.MAP;
        case 0x88 -> X88.MAP;
        case 0x89 -> X89.MAP;
        case 0x8a -> X8a.MAP;
        case 0x8b -> X8b.MAP;
        case 0x8c -> X8c.MAP;
        case 0x8d -> X8d.MAP;
        case 0x8e -> X8e.MAP;
        case 0x8f -> X8f.MAP;
        case 0x90 -> X90.MAP;
        case 0x91 -> X91.MAP;
        case 0x92 -> X92.MAP;
        case 0x93 -> X93.MAP;
        case 0x94 -> X94.MAP;
        case 0x95 -> X95.MAP;
        case 0x96 -> X96.MAP;
        case 0x97 -> X97.MAP;
        case 0x98 -> X98.MAP;
        case 0x99 -> X99.MAP;
        case 0x9a -> X9a.MAP;
        case 0x9b -> X9b.MAP;
        case 0x9c -> X9c.MAP;
        case 0x9d -> X9d.MAP;
        case 0x9e -> X9e.MAP;
        case 0x9f -> X9f.MAP;
        case 0xa0 -> Xa0.MAP;
        case 0xa1 -> Xa1.MAP;
        case 0xa2 -> Xa2.MAP;
        case 0xa3 -> Xa3.MAP;
        case 0xa4 -> Xa4.MAP;
        case 0xac -> Xac.MAP;
        case 0xad -> Xad.MAP;
        case 0xae -> Xae.MAP;
        case 0xaf -> Xaf.MAP;
        case 0xb0 -> Xb0.MAP;
        case 0xb1 -> Xb1.MAP;
        case 0xb2 -> Xb2.MAP;
        case 0xb3 -> Xb3.MAP;
        case 0xb4 -> Xb4.MAP;
        case 0xb5 -> Xb5.MAP;
        case 0xb6 -> Xb6.MAP;
        case 0xb7 -> Xb7.MAP;
        case 0xb8 -> Xb8.MAP;
        case 0xb9 -> Xb9.MAP;
        case 0xba -> Xba.MAP;
        case 0xbb -> Xbb.MAP;
        case 0xbc -> Xbc.MAP;
        case 0xbd -> Xbd.MAP;
        case 0xbe -> Xbe.MAP;
        case 0xbf -> Xbf.MAP;
        case 0xc0 -> Xc0.MAP;
        case 0xc1 -> Xc1.MAP;
        case 0xc2 -> Xc2.MAP;
        case 0xc3 -> Xc3.MAP;
        case 0xc4 -> Xc4.MAP;
        case 0xc5 -> Xc5.MAP;
        case 0xc6 -> Xc6.MAP;
        case 0xc7 -> Xc7.MAP;
        case 0xc8 -> Xc8.MAP;
        case 0xc9 -> Xc9.MAP;
        case 0xca -> Xca.MAP;
        case 0xcb -> Xcb.MAP;
        case 0xcc -> Xcc.MAP;
        case 0xcd -> Xcd.MAP;
        case 0xce -> Xce.MAP;
        case 0xcf -> Xcf.MAP;
        case 0xd0 -> Xd0.MAP;
        case 0xd1 -> Xd1.MAP;
        case 0xd2 -> Xd2.MAP;
        case 0xd3 -> Xd3.MAP;
        case 0xd4 -> Xd4.MAP;
        case 0xd5 -> Xd5.MAP;
        case 0xd6 -> Xd6.MAP;
        case 0xd7 -> Xd7.MAP;
        case 0xf9 -> Xf9.MAP;
        case 0xfa -> Xfa.MAP;
        case 0xfb -> Xfb.MAP;
        case 0xfd -> Xfd.MAP;
        case 0xfe -> Xfe.MAP;
        case 0xff -> Xff.MAP;
        default -> NO_MAP;
      };
      // cache the map for reuse to speed up next lookups
      CACHE[hi] = map;
    }
    // Some code maps contain only less elements
    if (low < map.length) {
      return map[low];
    }
    return null;
  }

  @Override
  public String convert(CharSequence text, AsciiConverterConfig config) {

    if (text == null) {
      return null;
    } else if (text.isEmpty()) {
      return "";
    }
    AsciiConverterConfigImpl conf = (AsciiConverterConfigImpl) config;
    int capacity = text.length() + 2;
    AsciiBuilder builder = new AsciiBuilder(capacity, conf);
    CodePointMapping current = null;
    CodePointMapping next = null;
    int codePoint = 0;
    OfInt cpIterator = text.codePoints().iterator();
    while (cpIterator.hasNext()) {
      codePoint = cpIterator.nextInt();
      current = next;
      next = getAsc(codePoint);
      if (current != null) {
        next = current.append(builder, codePoint, next);
      }
    }
    // since text is not empty, we entered the while loop, next is the last mapping to process due to buffering.
    next.append(builder, codePoint, null);
    return builder.getAscii();
  }

}
