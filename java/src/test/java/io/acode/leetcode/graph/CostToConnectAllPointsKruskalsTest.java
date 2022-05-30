package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostToConnectAllPointsKruskalsTest {
  private CostToConnectAllPointsKruskals target = new CostToConnectAllPointsKruskals();

  @Test
  public void testBasic() {
    assertEquals(0, target.minCostConnectPoints(new int[][]{{0, 0}}));
  }

  @Test
  public void testSingleEdge() {
    assertEquals(1, target.minCostConnectPoints(new int[][]{{0, 1}, {0, 0}}));
    assertEquals(2, target.minCostConnectPoints(new int[][]{{1, 0}, {0, 1}}));
    assertEquals(3, target.minCostConnectPoints(new int[][]{{0, 1}, {3, 1}}));
  }

  @Test
  public void testLeetExample() {
    assertEquals(20, target.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}));
    assertEquals(18, target.minCostConnectPoints(new int[][]{{3, 12}, {-2, 5}, {-4, 1}}));
  }

  @Test
  public void testLeetFail() {
    assertEquals(53, target.minCostConnectPoints(new int[][]{{2,-3}, {-17,-8}, {13, 8}, {-17, -15}}));
  }
}
