package io.acode.leetcode.dp;

public class MaxSubarray {

  public int maxSubArray(int[] nums) {
    int localMax = 0;
    int globalMax = Integer.MIN_VALUE;

    for (int num : nums) {
      localMax = Math.max(num, num + localMax);

      if (localMax > globalMax) {
        globalMax = localMax;
      }
    }

    return globalMax;
  }
}
