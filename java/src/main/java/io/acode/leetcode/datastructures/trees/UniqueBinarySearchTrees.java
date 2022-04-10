package io.acode.leetcode.datastructures.trees;

public class UniqueBinarySearchTrees {

  // Catalan numbers can be used for searching through binary trees.
  //
  public int numTrees(int n) {
    if (n <= 1 ) return 1;

    int res = 0;
    for (int i = 0; i < n; i++) {
      res += numTrees(i) * numTrees(n - i - 1);
    }
    return res;
  }
}
