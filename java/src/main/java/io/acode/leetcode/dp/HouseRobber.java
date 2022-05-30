package io.acode.leetcode.dp;

import java.util.HashMap;

public class HouseRobber {
  private HashMap<Integer, Integer> memo;
  private int[] nums;

  private int dp(int i) {
    if (i == 0) return nums[0];
    if (i == 1) return Math.max(nums[0], nums[1]);
    if (!memo.containsKey(i)) {
      memo.put(i, Math.max(dp(i - 1), dp(i - 2) + nums[i]));
    }
    return memo.get(i);
  }

  public int rob(int[] houses) {
    memo = new HashMap<>();
    this.nums = houses;
    return dp(nums.length - 1);
  }


  public int bottomUp(int[] houses) {
    if (houses.length == 1) return houses[0];

    int[] dp = new int[houses.length];

    dp[0] = houses[0];
    dp[1] = houses[1];

    for (int i = 2; i < houses.length; i++) {
      dp[i] = Math.max(dp[i -1], dp[i-2] + houses[i]);
    }

    return dp[houses.length - 1];
  }
}
