package io.acode.leetcode.backtracking;

import java.util.*;

public class Permutations {

  private void backtrack(int[] nums, LinkedList<Integer> comb, List<List<Integer>> result) {
    if (comb.size() == nums.length) {
      result.add(new ArrayList<>(comb));
      return;
    }

    for (int num : nums) {
      if (!comb.contains(num)) {
        comb.add(num);
        backtrack(nums, comb, result);
        comb.removeLast();
      }
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums, new LinkedList<>(), result);
    return result;
  }
}
