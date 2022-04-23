package io.acode.leetcode.binarysearch;

public class SearchInRotatedArray {

  public int search(int[] nums, int target) {
    if (nums.length == 1 && nums[0] == target) return 0;

    int pivot = findPivot(nums);
    int upper;
    int lower;
    if (target < nums[0] || pivot == 0) {
      upper = nums.length - 1;
      lower = pivot;
    } else {
      upper = pivot - 1;
      lower = 0;
    }

    while (upper > lower) {
      int mid = (upper + lower) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        upper = mid;
      } else {
        if (lower == mid) lower++;
        else lower = mid;
      }
    }

    return (nums[lower] == target) ? lower : -1;
  }

  public int findPivot(int[] nums) {
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
        return upper;
      }
    }
    return mid;
  }
}
