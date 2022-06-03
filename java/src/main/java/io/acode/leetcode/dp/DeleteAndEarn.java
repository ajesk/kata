package io.acode.leetcode.dp;

import java.util.HashMap;

public class DeleteAndEarn {

  HashMap<Integer, Integer> values;
  HashMap<Integer, Integer> cache;

  private int dp(int i) {
    if (i == 0) {
      return 0;
    } else if (i == 1) {
      return values.getOrDefault(1, 0);
    }

    if (cache.containsKey(i)) return cache.get(i);

    int gain = values.getOrDefault(i, 0);
    cache.put(i, Math.max(dp(i - 1), dp(i - 2) + gain));
    return cache.get(i);
  }

  public int deleteAndEarn(int[] nums) {
    values = new HashMap<>();
    cache = new HashMap<>();
    int max = 0;
    for (int number : nums) {
      max = Math.max(max, number);
      values.put(number, values.getOrDefault(number, 0) + number);
    }

    return dp(max);
  }
}
