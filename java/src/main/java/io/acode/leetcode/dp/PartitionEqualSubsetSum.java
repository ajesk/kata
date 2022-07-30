package io.acode.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class PartitionEqualSubsetSum {
  private boolean canPartition(int[] nums, int index, int target, Map<Integer, Boolean> memo) {
    if (target == 0) return true;
    if (target < 0 || index == nums.length) return false;
    if (memo.containsKey(target)) return memo.get(target);

    boolean result = canPartition(nums, index + 1, target - nums[index], memo) || canPartition(nums, index + 1, target, memo);

    memo.put(target, result);
    return memo.get(target);
  }

  public boolean canPartition(int[] nums) {
    int target = 0;
    for (int num : nums) {
      target += num;
    }
    if (target % 2 != 0) return false;
    target /= 2;

    for (int i = 0; i < nums.length; i++) {
      if (canPartition(nums, i + 1, target, new HashMap<>())) {
        return true;
      }
      target -= nums[i];
    }

    return false;
  }
}
