package io.acode.leetcode.binarysearch;

public class FindMinimumInRotatedArray {
  public int findMin(int[] nums) {
    int upper = nums.length - 1;
    int lower = 0;
    int mid = 0;

    while (nums[upper] < nums[lower]) {
      mid = (upper + lower) / 2;
      if (nums[mid] > nums[lower]) {
        lower = mid;
      } else if (nums[upper] > nums[mid]) {
        upper = mid;
      } else {
        return nums[upper];
      }
    }
    return nums[mid];
  }
}
