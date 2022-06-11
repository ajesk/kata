package io.acode.leetcode.dp;

public class ClimbingStairs {

  public int climbStairs(int n) {
    int[] memo = new int[n];
    if (n == 1) return 1;
    memo[0] = 1;
    memo[1] = 2;

    for (int i = 2; i < memo.length; i++) {
      memo[i] = memo[i - 1] + memo[i - 2];
    }

    return memo[memo.length - 1];
  }
}
