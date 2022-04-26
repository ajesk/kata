package io.acode.leetcode.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedArrayIITest {
  FindMinimumInRotatedArrayII target = new FindMinimumInRotatedArrayII();

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
  public void testUnrotatedList() {
    assertEquals(1, target.findMin(new int[]{1, 3, 3}));
  }

  @Test
  public void testAllButOne() {
    assertEquals(1, target.findMin(new int[]{10, 1, 10, 10, 10}));
  }

  @Test
  public void testLeetTests() {
    assertEquals(1, target.findMin(new int[]{3, 3, 1, 3}));
    assertEquals(1, target.findMin(new int[]{3, 1, 3}));
    assertEquals(1, target.findMin(new int[]{1, 3, 5}));
    assertEquals(0, target.findMin(new int[]{2, 2, 2, 0, 1}));
  }

  @Test
  public void test2s() {
    assertEquals(0, target.findMin(new int[]{2, 2, 2, 0, 2, 2}));
  }

  @Test
  public void testNValues() {
    assertEquals(4, target.findMin(new int[]{6, 7, 8, 9, 11, 13, 15, 15, 15, 15, 15, 15, 15, 15, 16, 17, 18, 4, 5}));
  }
}
