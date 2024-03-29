package io.acode.leetcode.misc;

import io.acode.leetcode.misc.ZigZagConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigZagConversionTest {
  ZigZagConversion zigZagConversion = new ZigZagConversion();

  @Test
  public void basicTest() {
    assertEquals("abdc", zigZagConversion.convert("abcd", 3));
    assertEquals("PAHNAPLSIIGYIR", zigZagConversion.convert("PAYPALISHIRING", 3));
    assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PAYPALISHIRING", 4));
    assertEquals("A", zigZagConversion.convert("A", 1));
    assertEquals("AB", zigZagConversion.convert("AB", 1));
  }
}
