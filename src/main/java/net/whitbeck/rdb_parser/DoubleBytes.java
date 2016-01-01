/**
 * Copyright (c) 2015-2016 John Whitbeck. All rights reserved.
 *
 * The use and distribution terms for this software are covered by the
 * Apache License 2.0 (https://www.apache.org/licenses/LICENSE-2.0.txt)
 * which can be found in the file al-v20.txt at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by
 * the terms of this license.
 *
 * You must not remove this notice, or any other, from this software.
 */

package net.whitbeck.rdb_parser;

import java.nio.charset.Charset;

final class DoubleBytes {

  private final static Charset ASCII = Charset.forName("ASCII");

  final static byte[]
    POSITIVE_INFINITY = String.valueOf(Double.POSITIVE_INFINITY).getBytes(ASCII),
    NEGATIVE_INFINITY = String.valueOf(Double.NEGATIVE_INFINITY).getBytes(ASCII),
    NaN = String.valueOf(Double.NaN).getBytes(ASCII);

}
