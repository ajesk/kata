package io.acode.leetcode.misc;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> indices = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (indices.containsKey(target - num)) return new int[]{indices.get(target - num), i};

      indices.put(num, i);
    }
    return new int[]{}; // there is an assumption that there will always be a correct solution, this should not hit
  }
}
