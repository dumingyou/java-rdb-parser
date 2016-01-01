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

/**
 * End-of-file entry. This is always the last entry in the file and, as of RDB version 6, contains an 8 byte
 * checksum of the file.
 *
 * @author John Whitbeck
 */
public class Eof extends Entry {

  private final byte[] checksum;

  Eof(byte[] checksum) {
    this.checksum = checksum;
  }

  @Override
  public int getType() {
    return Entry.EOF;
  }


  /**
   * @return the 8-byte checksum of the rdb file.
   */
  public byte[] getChecksum() {
    return checksum;
  }
}
