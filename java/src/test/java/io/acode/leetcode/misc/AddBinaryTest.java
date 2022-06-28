package io.acode.leetcode.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
  AddBinary target = new AddBinary();

  @Test
  void testBasic() {
    assertEquals("1", target.addBinary("1", "0"));
    assertEquals("0", target.addBinary("0", "0"));
    assertEquals("10", target.addBinary("1", "1"));
  }

  @Test
  void testDifferentLength() {
    assertEquals("100", target.addBinary("11", "1"));
    assertEquals("100", target.addBinary("1", "11"));
  }

  @Test
  void testLeet() {
    assertEquals("10101", target.addBinary("1010", "1011"));
  }
}
