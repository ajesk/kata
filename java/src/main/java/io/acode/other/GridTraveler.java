package io.acode.other;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {
  private Map<Integer, Integer> memo = new HashMap<>();

  public int gridTraveler(int m, int n) {
    if (m == 0 || n == 0) return 0;
    if (m == 1 || n == 1) return 1;

    if (!memo.containsKey(m * n)) {
      memo.put(m * n, gridTraveler(m - 1, n) + gridTraveler(m, n - 1));
    }

    return memo.get(m * n);
  }
}
