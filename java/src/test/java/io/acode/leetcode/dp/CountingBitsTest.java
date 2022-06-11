package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingBitsTest {
  CountingBits target = new CountingBits();

  @Test
  void testBasic() {
    assertArrayEquals(new int[]{0}, target.countBits(0));
    assertArrayEquals(new int[]{0, 1}, target.countBits(1));
    assertArrayEquals(new int[]{0, 1, 1}, target.countBits(2));
    assertArrayEquals(new int[]{0, 1, 1, 2}, target.countBits(3));
    assertArrayEquals(new int[]{0, 1, 1, 2, 1}, target.countBits(4));
    assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, target.countBits(5));
    assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2}, target.countBits(6));
  }

  @Test
  void testSecondary() {
    assertArrayEquals(new int[]{0}, target.countBits2(0));
    assertArrayEquals(new int[]{0, 1}, target.countBits2(1));
    assertArrayEquals(new int[]{0, 1, 1}, target.countBits2(2));
    assertArrayEquals(new int[]{0, 1, 1, 2}, target.countBits2(3));
    assertArrayEquals(new int[]{0, 1, 1, 2, 1}, target.countBits2(4));
    assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, target.countBits2(5));
    assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2}, target.countBits2(6));
  }
}