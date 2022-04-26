package io.acode.leetcode.binarysearch;

public class IsPerfectSquareRoot {

  private static final int MAX_ROOT = 46340;

  public boolean isPerfectSquare(int num) {
    if (num == 1 || num == MAX_ROOT * MAX_ROOT) return true;

    int left = 0;
    int right = Math.min(num, MAX_ROOT);

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (mid * mid == num) return true;

      if (mid * mid > num) right = mid;
      else left = mid + 1;
    }
    return false;
  }
}
