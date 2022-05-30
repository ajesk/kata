package io.acode.leetcode.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
  TwoSum target = new TwoSum();

  @Test
  void testBasic() {
    assertArrayEquals(new int[]{0, 1}, target.twoSum(new int[]{1, 2}, 3));
    assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{4, 1, 2}, 3));
  }

  @Test
  void testLeetCodeExamples() {
    assertArrayEquals(new int[]{0, 1}, target.twoSum(new int[]{2, 7, 11, 15}, 9));
    assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{3, 2, 4}, 6));
    assertArrayEquals(new int[]{0, 1}, target.twoSum(new int[]{3, 3}, 6));

  }
}
