package io.acode.leetcode.misc;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
  TwoSum target = new TwoSum();

  @Test
  public void testBasic() {
    assertArrayEquals(new int[]{0, 1}, target.twoSum(new int[]{1, 2}, 3));
    assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{4, 1, 2}, 3));
  }

  @Test
  public void testLeetCodeExamples() {
    assertArrayEquals(new int[]{0, 1}, target.twoSum(new int[]{2, 7, 11, 15}, 9));
    assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{3, 2, 4}, 6));
    assertArrayEquals(new int[]{0, 1}, target.twoSum(new int[]{3, 3}, 6));

  }
}
