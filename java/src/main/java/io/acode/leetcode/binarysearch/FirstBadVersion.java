package io.acode.leetcode.binarysearch;

public class FirstBadVersion {
  private int bad = -1;

  public void setBad(int bad) {
    this.bad = bad;
  }

  public boolean isBadVersion(int version) {
    return version >= bad;
  }

  public int firstBadVersion(int n) {
    if (n == 1) return 1;
    int upper = n;
    int lower = 1;

    while (lower < upper) {
      int mid = lower + (upper - lower) / 2;
      if (isBadVersion(mid)) {
        upper = mid;
      } else {
        lower = mid + 1;
      }
    }

    return lower;
  }
}
