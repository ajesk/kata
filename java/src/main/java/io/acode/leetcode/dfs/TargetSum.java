package io.acode.leetcode.dfs;

public class TargetSum {
  public int dfs(int[] nums, int target, int index, int runningTotal) {
    int addTotal = runningTotal + nums[index];
    int subtractTotal = runningTotal - nums[index];

    if (index == nums.length - 1) {
      if (addTotal == target && subtractTotal == target) return 2;
      return (addTotal == target || subtractTotal == target) ? 1 : 0;
    }

    return dfs(nums, target, index + 1, addTotal) + dfs(nums, target, index + 1, subtractTotal);
  }

  public int findTargetSumWays(int[] nums, int target) {
    return dfs(nums, target, 0, 0);
  }
}
