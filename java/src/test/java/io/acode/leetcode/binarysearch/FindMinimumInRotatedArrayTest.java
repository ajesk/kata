package io.acode.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedArrayTest {
  FindMinimumInRotatedArray target = new FindMinimumInRotatedArray();

  @Test
  public void testBasic() {
    assertEquals(3, target.findMin(new int[]{3}));
  }

  @Test
  public void testTwoValues() {
    assertEquals(1, target.findMin(new int[]{1, 2}));
    assertEquals(1, target.findMin(new int[]{2, 1}));
  }

  @Test
  public void testNValues() {
    assertEquals(4, target.findMin(new int[]{6,7,8,9,10,13,15,16,17,18,4,5}));
  }
}
