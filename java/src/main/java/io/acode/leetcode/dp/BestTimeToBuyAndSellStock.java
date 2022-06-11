package io.acode.leetcode.dp;

public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int max = 0;


    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      } else {
        max = Math.max(max, prices[i] - minPrice);
      }

    }
    return max;
  }
}
