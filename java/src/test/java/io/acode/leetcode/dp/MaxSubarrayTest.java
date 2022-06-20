package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubarrayTest {
  MaxSubarray target = new MaxSubarray();

  @Test
  void testBasic() {
    assertEquals(1, target.maxSubArray(new int[]{1}));
    assertEquals(2, target.maxSubArray(new int[]{1, 1}));
    assertEquals(1, target.maxSubArray(new int[]{1, -1}));
    assertEquals(1, target.maxSubArray(new int[]{-1, 1}));
    assertEquals(-1, target.maxSubArray(new int[]{-1, -1}));
  }

  @Test
  void testAllNegative() {
    assertEquals(-1, target.maxSubArray(new int[]{-1, -2, -3, -4, -5, -6}));
  }

  @Test
  void testAllButOneNegative() {
    assertEquals(100, target.maxSubArray(new int[]{-1, -2, -4, -5, 100, -6}));
  }

  @Test
  void testSimpleSeparated() {
    assertEquals(10, target.maxSubArray(new int[]{6, -2, 6}));
  }

  @Test
  void testAllSeparated() {
    assertEquals(140, target.maxSubArray(new int[]{50, -2, -4, -4, 100, -6}));
  }

  @Test
  void testLeetExample() {
    assertEquals(6, target.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    assertEquals(23, target.maxSubArray(new int[]{5,4,-1,7,8}));
  }
}
