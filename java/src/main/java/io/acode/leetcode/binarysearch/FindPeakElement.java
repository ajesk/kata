package io.acode.leetcode.binarysearch;

public class FindPeakElement {
  public int findPeakElement(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    if (nums.length == 2) return nums[0] > nums[1] ? 0 : 1;

    while (right > left) {
      int mid = left + (right - left) / 2;
      if (mid == 0 || mid == nums.length - 1) return mid;
      if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
        return mid;
      } else if (nums[mid - 1] > nums[mid + 1]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

  public int findSimplerPeak(int[] nums) {
    int start = 0;
    int end = nums.length-1;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] < nums[mid+1]) {
        start = mid+1;
      } else {
        end = mid;
      }
    }

    return start;
  }
}
