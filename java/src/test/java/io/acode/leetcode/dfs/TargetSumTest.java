package io.acode.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetSumTest {
  TargetSum target = new TargetSum();

  @Test
  public void testBasic() {
    assertEquals(1, target.findTargetSumWays(new int[]{1}, 1));
  }

  @Test
  public void testSimple2NumberList() {
    assertEquals(1, target.findTargetSumWays(new int[]{1, 1}, 2));
    assertEquals(2, target.findTargetSumWays(new int[]{1, 1}, 0));
  }

  @Test
  public void testLeet() {
    assertEquals(5, target.findTargetSumWays(new int[]{1,1,1,1,1}, 3));
  }

  @Test
  public void testSlightlyLonger() {
    assertEquals(1, target.findTargetSumWays(new int[]{1,2,3,4,5}, 15));
    assertEquals(1, target.findTargetSumWays(new int[]{1,2,3,4,5}, -15));
    assertEquals(2, target.findTargetSumWays(new int[]{1,2,3,4,5}, -9));
    assertEquals(0, target.findTargetSumWays(new int[]{1,2,3,4,5}, 8));
  }

  @Test
  public void testEndsIn0() {
    assertEquals(2, target.findTargetSumWays(new int[]{1, 0}, 1));
    assertEquals(2, target.findTargetSumWays(new int[]{0, 1}, 1));
  }
}
