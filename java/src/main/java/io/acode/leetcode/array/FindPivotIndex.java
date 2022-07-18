package io.acode.leetcode.array;

public class FindPivotIndex {

  public int pivotIndex(int[] nums) {
    int[] lefts = new int[nums.length];
    int[] rights = new int[nums.length];

    lefts[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      lefts[i] = nums[i] + lefts[i-1];
    }

    rights[rights.length - 1] = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--) {
      rights[i] = nums[i] + rights[i + 1];
    }

    for (int i = 0; i < nums.length; i++) {
      if (lefts[i] == rights[i]) return i;
    }

    return -1;
  }
}
