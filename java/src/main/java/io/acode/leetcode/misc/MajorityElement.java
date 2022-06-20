package io.acode.leetcode.misc;

import java.util.Arrays;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    Integer currentNum = null;
    int count = 0;
    int maxCount = 0;
    Integer maxNum = null;

    Arrays.sort(nums);
    for (int num : nums) {
      if (currentNum != null && currentNum == num) {
        count++;
      } else {
        count = 1;
        currentNum = num;
      }

      if (count > maxCount) {
        maxCount = count;
        maxNum = num;
      }
    }

    return maxNum;
  }
}
