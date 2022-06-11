package io.acode.leetcode.dp;

public class CountingBits {
  public int countBits(int n, int[] memo) {
    if (n == 0) return 0;
    if (memo[n] != 0) return memo[n];

    memo[n] = n % 2 + countBits(n / 2, memo);
    return memo[n];
  }

  public int[] countBits(int n) {
    int[] memo = new int[n+1];
    for (int i = 0; i < memo.length; i++) {
      countBits(i, memo);
    }

    return memo;
  }

  public int[] countBits2(int n) {
    int[] arr = new int[n + 1];
    arr[0] = 0;
    for (int i = 1; i < arr.length; i++) {
      arr[i] = arr[i/2] + i%2;
    }

    return arr;
  }
}
