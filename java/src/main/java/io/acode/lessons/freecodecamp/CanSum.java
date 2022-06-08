package io.acode.lessons.freecodecamp;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
  Map<Integer, Boolean> memo;

  private boolean getCanSum(int target, int[] numbers) {
    if (target == 0) return true;
    if (target < 0) return false;
    if (memo.containsKey(target)) return memo.get(target);

    for (int number : numbers) {
      if (getCanSum(target - number, numbers)) {
        memo.put(target, true);
        return memo.get(target);
      }
    }
    memo.put(target, false);
    return memo.get(target);

  }

  public boolean canSum(int target, int[] numbers) {
    memo = new HashMap<>();
    return getCanSum(target, numbers);
  }
}
