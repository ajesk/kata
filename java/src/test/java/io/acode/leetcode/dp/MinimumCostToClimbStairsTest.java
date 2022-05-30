package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCostToClimbStairsTest {
  MinimumCostToClimbStairs target = new MinimumCostToClimbStairs();

  @Test
  public void testBasic() {
    assertEquals(1, target.minCostClimbingStairs(new int[]{1, 1}));
    assertEquals(1, target.minCostClimbingStairs(new int[]{2, 1}));
    assertEquals(1, target.minCostClimbingStairs(new int[]{1, 2}));
  }

  @Test
  public void testSingleChoice() {
    assertEquals(2, target.minCostClimbingStairs(new int[]{1, 2, 1}));
    assertEquals(1, target.minCostClimbingStairs(new int[]{1, 1, 1}));
    assertEquals(1, target.minCostClimbingStairs(new int[]{2, 1, 1}));
    assertEquals(1, target.minCostClimbingStairs(new int[]{2, 1, 2}));
  }

  @Test
  public void testMultiChoice() {
    assertEquals(4, target.minCostClimbingStairs(new int[]{1, 100, 1, 100, 1, 100, 1}));
  }

  @Test
  public void testLeet() {
    assertEquals(15, target.minCostClimbingStairs(new int[]{10, 15, 20}));
    assertEquals(6, target.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}

