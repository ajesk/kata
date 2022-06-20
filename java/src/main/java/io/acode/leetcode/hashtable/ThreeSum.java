package io.acode.leetcode.hashtable;

import java.util.*;

public class ThreeSum {

  List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    Set<Integer> touchedValues = new HashSet<>();
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (touchedValues.contains(nums[i])) continue;
      touchedValues.add(nums[i]);

      int innerTarget = nums[i] * -1;
      Map<Integer, Integer> alternates = new HashMap<>();
      Set<Integer> innerTouched = new HashSet<>();

      for (int j = i + 1; j < nums.length; j++) {
        if (innerTouched.contains(nums[j])) continue;
        if (alternates.containsKey(nums[j])) {
          result.add(List.of(nums[i], nums[j], alternates.get(nums[j])));
          innerTouched.add(nums[j]);
          innerTouched.add(alternates.get(nums[j]));
        }
        alternates.put(innerTarget - nums[j], nums[j]);
      }
    }

    return result;
  }
}
