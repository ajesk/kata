package io.acode.leetcode.dp;

public class MinimumCostToClimbStairs {

  public int minCostClimbingStairs(int[] cost) {
    if (cost.length == 2) {
      return Math.min(cost[0], cost[1]);
    }
    int[] memory = new int[cost.length];
    memory[0] = cost[0];
    memory[1] = cost[1];

    for (int i = 2; i < cost.length; i++) {
      int currentStairCost = cost[i];
      memory[i] = Math.min(memory[i - 1], memory[i - 2]) + currentStairCost;
    }

    return Math.min(memory[memory.length - 1], memory[memory.length - 2]);
  }
}
