package io.acode.leetcode.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumIITest {
  TwoSumII target = new TwoSumII();

  @Test
  public void testBasic() {
    assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{1, 1}, 2));
  }

  @Test
  public void testEnds() {
    assertArrayEquals(new int[]{1, 3}, target.twoSum(new int[]{1, 2, 3}, 4));
  }

  @Test
  public void testStartTwo() {
    assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{3, 4, 5, 6, 7, 8, 9}, 7));
  }

  @Test
  public void testLeet() {
    assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{2, 7, 11, 15}, 9));
  }

  @Test
  public void testIfTwoTheSame() {
    assertArrayEquals(new int[]{4, 5}, target.twoSum(new int[]{1,2,3,4,4,9,56,90}, 8));
  }

  @Test
  public void testBasicTwoPointer() {
    assertArrayEquals(new int[]{1, 2}, target.twoPointer(new int[]{1, 1}, 2));
  }

  @Test
  public void testEndsTwoPointer() {
    assertArrayEquals(new int[]{1, 3}, target.twoPointer(new int[]{1, 2, 3}, 4));
  }

  @Test
  public void testStartTwoTwoPointer() {
    assertArrayEquals(new int[]{1, 2}, target.twoPointer(new int[]{3, 4, 5, 6, 7, 8, 9}, 7));
  }

  @Test
  public void testLeetTwoPointer() {
    assertArrayEquals(new int[]{1, 2}, target.twoPointer(new int[]{2, 7, 11, 15}, 9));
  }

  @Test
  public void testIfTwoTheSameTwoPointer() {
    assertArrayEquals(new int[]{4, 5}, target.twoPointer(new int[]{1,2,3,4,4,9,56,90}, 8));
  }
}
