package io.acode.leetcode.binarysearch;

public class SquareRoot {
  private static final int MAX_ROOT = 46340;

  public int mySqrt(int x) {
    if (x == 0) return 0;
    int upper = Math.min(MAX_ROOT,x);
    int lower = 0;
    int mid;

    if (x >= MAX_ROOT * MAX_ROOT) {
      return MAX_ROOT;
    }
    while (upper > lower + 1) {
      mid = (upper + lower) / 2;

      if (mid * mid == x) {
        return mid;
      } else if (mid * mid > x) {
        upper = mid - 1;
      } else {
        if (lower < mid) lower = mid;
        else lower++;
      }
    }

    return upper * upper <= x ? upper : lower;
  }
}
