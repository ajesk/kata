package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimizeWaterSupplyTest {
  OptimizeWaterSupply target = new OptimizeWaterSupply();

  @Test
  public void testBasic() {
    assertEquals(2,
      target.minCostToSupplyWater(2, new int[]{1, 1}, new int[][]{{1, 2, 1}})
    );
  }

  @Test
  public void testTwoDifferentPrices() {
    assertEquals(2,
      target.minCostToSupplyWater(2, new int[]{1, 1}, new int[][]{{1, 2, 1}, {1, 2, 2}})
    );
    assertEquals(2,
      target.minCostToSupplyWater(2, new int[]{1, 1}, new int[][]{{1, 2, 2}, {1, 2, 1}})
    );
  }

  @Test
  public void testMultipleWellOption() {
    assertEquals(2,
      target.minCostToSupplyWater(2, new int[]{2, 1}, new int[][]{{1, 2, 1}})
    );
    assertEquals(2,
      target.minCostToSupplyWater(2, new int[]{1, 2}, new int[][]{{1, 2, 1}})
    );
  }

  @Test
  public void testVaryingPricing() {
    assertEquals(3,
      target.minCostToSupplyWater(2, new int[]{2, 3}, new int[][]{{1, 2, 1}}));
  }

  @Test
  public void testThirdNode() {
    assertEquals(3,
      target.minCostToSupplyWater(3, new int[]{1,1,1}, new int[][]{{1,2,1},{2,3,1}}));
  }

  @Test
  public void testThirdNodeVariablePaths() {
    assertEquals(3,
      target.minCostToSupplyWater(3, new int[]{3,2,1}, new int[][]{{1,3,4}, {2,3,1}, {2,1,1}}));
  }

//  @Test
//  public void testIslands() {
//    assertEquals(131704,
//      target.minCostToSupplyWater(5, new int[]{46012, 72474, 64965, 751, 33304}, new int[][]{{2,1,6719}, {3,2,75312}, {5,3,44918}}));
//  }
}
