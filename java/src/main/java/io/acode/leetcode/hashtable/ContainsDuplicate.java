package io.acode.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> tracker = new HashSet<>();

    for (int num : nums) {
      if (tracker.contains(num)) return true;
      tracker.add(num);
    }

    return false;
  }
}
