package io.acode.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToNumberTest {
  RomanToNumber target = new RomanToNumber();

  @Test
  public void testBasic() {
    assertEquals(1, target.romanToInt("I"));
    assertEquals(5, target.romanToInt("V"));
  }

  @Test
  public void test2Chars() {
    assertEquals(2, target.romanToInt("II"));
    assertEquals(6, target.romanToInt("VI"));
  }

  @Test
  public void testCompositeChar() {
    assertEquals(4, target.romanToInt("IV"));
    assertEquals(9, target.romanToInt("IX"));
    assertEquals(40, target.romanToInt("XL"));
    assertEquals(90, target.romanToInt("XC"));
    assertEquals(400, target.romanToInt("CD"));
    assertEquals(900, target.romanToInt("CM"));
  }

  @Test
  public void testPutItAllTogether() {
//    assertEquals(3, target.romanToInt("III"));
//    assertEquals(58, target.romanToInt("LVIII"));
//    assertEquals(1994, target.romanToInt("MCMXCIV"));
    assertEquals(621, target.romanToInt("DCXXI"));
  }
}
