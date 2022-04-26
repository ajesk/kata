package io.acode.leetcode.misc;

public class PowXofN {

  public double myPow(double x, int n) {
    if (x == 0) return x;
    if (n == 0) return 1;
    double sub = myPow(x, n / 2);

    if (n % 2 == 1) {
      return sub * sub * x;
    } else if (n % 2 == -1) {
      return sub * sub * 1 / x;
    } else {
      return sub * sub;
    }
  }
}
