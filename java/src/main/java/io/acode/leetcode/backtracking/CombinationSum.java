package io.acode.leetcode.backtracking;

import java.util.*;

public class CombinationSum {

  private void backTrack(int[] candidates, int target, int start, LinkedList<Integer> comb, List<List<Integer>> result) {
    if (target == 0) {
      result.add(new ArrayList<>(comb));
      return;
    } else if (target < 0) {
      return;
    }

    for (int i = start; i < candidates.length; i++) {
      comb.add(candidates[i]);
      backTrack(candidates, target - candidates[i], i, comb, result);
      comb.removeLast();
    }
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    backTrack(candidates, target, 0, new LinkedList<>(), result);
    return result;
  }
}
