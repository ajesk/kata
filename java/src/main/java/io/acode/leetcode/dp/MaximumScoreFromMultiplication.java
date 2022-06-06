package io.acode.leetcode.dp;

public class MaximumScoreFromMultiplication {
  private int[][] memory;
  private int[] nums, multipliers;
  private int n, m;

  private int dp(int i, int left) {
    if (i == m) {
      return 0;
    }

    int mult = multipliers[i];
    int right = n - 1 - (i - left);

    if (memory[i][left] == 0) {
      memory[i][left] = Math.max(mult * nums[left] + dp(i + 1, left + 1), mult * nums[right] + dp(i + 1, left));
    }

    return memory[i][left];
  }

  public int maximumScore(int[] nums, int[] multipliers) {
    n = nums.length;
    m = multipliers.length;
    this.nums = nums;
    this.multipliers = multipliers;
    this.memory = new int[m][n];
    return dp(0,0);
  }
}
