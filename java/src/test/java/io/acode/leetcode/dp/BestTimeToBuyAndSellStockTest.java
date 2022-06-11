package io.acode.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {
  BestTimeToBuyAndSellStock target = new BestTimeToBuyAndSellStock();

  @Test
  void testBasic() {
    assertEquals(0, target.maxProfit(new int[]{}));
    assertEquals(0, target.maxProfit(new int[]{1}));
    assertEquals(1, target.maxProfit(new int[]{1, 2}));
    assertEquals(0, target.maxProfit(new int[]{2, 1}));
    assertEquals(2, target.maxProfit(new int[]{1, 2, 3}));
    assertEquals(2, target.maxProfit(new int[]{2, 1, 3}));
    assertEquals(2, target.maxProfit(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3}));
  }

  @Test
  void testLeetExamples() {
    assertEquals(5, target.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    assertEquals(0, target.maxProfit(new int[]{7, 6, 4, 3, 1}));
  }

  @Test
  void testWorstExample() {
    int[] test = new int[10000];
    for (int i = 0; i < 10000; i++) {
      test[i] = test.length - i;
    }

    assertEquals(0, target.maxProfit(test));
  }
}
