package io.acode.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

  public int bottomUp(int base) {
    if (base == 0) return base;

    int[] arr = new int[base + 1];
    arr[0] = 0;
    arr[1] = 1;

    for (int i = 2; i <= base; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    return arr[base];
  }

  Map<Integer, Integer> memory;

  public int topDown(int base) {
    memory = new HashMap<>();
    return topDownExecute(base);
  }

  public int topDownExecute(int base) {
    if (base == 0 || base == 1) return base;

    if (!memory.containsKey(base)) {
      memory.put(base, topDownExecute(base - 1) + topDownExecute(base - 2));
    }

    return memory.get(base);
  }
}
