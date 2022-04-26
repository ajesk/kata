package io.acode.leetcode.binarysearch;

public class FindMinimumInRotatedArrayII {
  public int findMin(int[] nums) {
    int upper = nums.length - 1;
    int lower = 0;

    if (nums[lower] < nums[upper]) return nums[lower];

    while (lower < upper) {
      int mid = lower + (upper - lower) / 2;
      if (nums[mid] < nums[upper]) {
        upper = mid;
      } else if (nums[mid] > nums[upper]) {
        lower = mid + 1;
      } else if (nums[lower] > nums[upper]) {
        lower++;
      } else if (nums[lower] < nums[upper]) {
        upper--;
      } else {
        lower++;
        upper--;
      }
    }

    return nums[lower];
  }
}
