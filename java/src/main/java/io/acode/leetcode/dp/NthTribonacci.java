package io.acode.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class NthTribonacci {

  private Map<Integer, Integer> memory;

  private int dp(int i) {
    if (i == 0) return 0;
    if (i == 1 || i == 2) return 1;

    if (!memory.containsKey(i)) {
      memory.put(i, dp(i - 1) + dp(i - 2) + dp(i - 3));
    }

    return memory.get(i);
  }

  public int tribonacci(int n) {
    memory = new HashMap<>();
    return dp(n);
  }
}
