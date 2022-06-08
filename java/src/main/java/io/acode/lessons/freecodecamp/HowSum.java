package io.acode.lessons.freecodecamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {

  public List<Integer> howSum(int targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {
    if (targetSum == 0) return new ArrayList<>();
    if (targetSum < 0) return null;
    if (memo.containsKey(targetSum)) return memo.get(targetSum);

    for (int number : numbers) {
      List<Integer> result = howSum(targetSum - number, numbers, memo);
      if (result != null) {
        result.add(number);
        memo.put(targetSum, result);
        return memo.get(targetSum);
      }
    }
    memo.put(targetSum, null);
    return memo.get(targetSum);
  }

  public List<Integer> howSum(int targetSum, int[] numbers) {
    return howSum(targetSum, numbers, new HashMap<>());
  }
}
