package io.acode.lessons.freecodecamp;

import java.util.*;

public class BestSum {

  public List<Integer> bestSum(int target, int[] numbers, Map<Integer, List<Integer>> memo) {
    if (target == 0) return new ArrayList<>();
    if (target < 0) return null;
    if (memo.containsKey(target)) return memo.get(target);

    List<Integer> result = null;
    for (int number : numbers) {
      List<Integer> next = bestSum(target- number, numbers, memo);
      if (next == null) continue;
      next.add(number);
      if (result == null || next.size() < result.size()) {
        result = next;
      }
    }
    if (!memo.containsKey(target)) {
      memo.put(target, result);
    }
    return memo.get(target);
  }

  public List<Integer> bestSum(int target, int[] numbers) {
    return bestSum(target, numbers, new HashMap<>());
  }
}
