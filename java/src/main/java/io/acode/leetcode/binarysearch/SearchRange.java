package io.acode.leetcode.binarysearch;

public class SearchRange {
  public int[] searchRange(int[] nums, int target) {
    if (nums.length == 0) return new int[]{-1, -1};
    if (nums.length == 1) {
      if (nums[0] == target) {
        return new int[]{0, 0};
      } else {
        return new int[]{-1, -1};
      }
    }

    int beginning = getBeginning(nums, target);
    int end = getEnd(nums, target);

    return new int[]{beginning, end};
  }

  private int getBeginning(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        if (mid == 0 || nums[mid - 1] != target) {
          return mid;
        } else {
          right = mid;
        }
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return (nums[left] == target) ? left : -1;
  }

  private int getEnd(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        if (mid == nums.length - 1 || nums[mid + 1] != target) {
          return mid;
        } else {
          left = mid + 1;
        }
      } else if (nums[mid] > target) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return (nums[left] == target) ? left : -1;
  }
}
