package io.acode.leetcode.binarysearch;

public class TwoSumII {
  public int[] twoSum(int[] numbers, int target) {
    if (numbers.length == 2) {
      return new int[]{1, 2};
    }

    for (int i = 0, numbersLength = numbers.length; i < numbersLength; i++) {
      int baseNumber = numbers[i];
      int left = 0;
      int right = numbers.length - 1;

      while (left < right) {
        int mid = left + (right - left) / 2;

        if (numbers[mid] + baseNumber == target) {
          if (mid == i) mid++;
          return new int[]{i + 1, mid + 1};
        } else if (baseNumber + numbers[mid] < target) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
      if (numbers[left] + baseNumber == target) {
        return new int[]{i + 1, left + 1};
      }
    }
    return null;
  }

  public int[] twoPointer(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left<=right) {
      if (numbers[left] + numbers[right] == target) {
        break;
      } else if (numbers[left] + numbers[right] < target) {
        left++;
      } else {
        right--;
      }
    }

    return new int[]{left+1, right+1};
  }
}
