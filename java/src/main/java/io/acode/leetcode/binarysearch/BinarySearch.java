package io.acode.leetcode.binarysearch;

import java.util.Arrays;

public class BinarySearch {
  public int search(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int pivot = nums.length / 2;
    int pivotVal = nums[pivot];

    if (nums.length == 1 && nums[0] != target) {
      return -1;
    }

    if (pivotVal == target) {
      return pivot;
    }

    int recurResult;
    if (pivotVal > target) {
      recurResult = search(Arrays.copyOfRange(nums, 0, pivot), target);
    } else {
      recurResult = search(Arrays.copyOfRange(nums, pivot + 1, nums.length), target);
      if (recurResult == -1) return recurResult;
      recurResult += pivot + 1;
    }

    return recurResult;
  }

  public int recursiveSearch(int[] nums, int target) {
    if (nums.length == 0) return -1;
    return recursiveSearch(nums, target, 0, nums.length - 1);
  }

  public int recursiveSearch(int[] nums, int target, int left, int right) {
    if (right >= left) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (target < nums[mid]) {
        return recursiveSearch(nums, target, left, mid - 1);
      } else {
        return recursiveSearch(nums, target, mid + 1, right);
      }
    }
    return -1;
  }

  public int iterativeSearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (right >= left) {
      int mid = (left + right) / 2;
      if (target == nums[mid]) {
        return mid;
      } else if (target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return -1;
  }
}
