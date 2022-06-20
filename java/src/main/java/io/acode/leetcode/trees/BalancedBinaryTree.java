package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;

public class BalancedBinaryTree {
  private boolean balanced;

  private int maxDepth(TreeNode root) {
    if (root == null) return 0;
    if (!balanced) return 1;

    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    if (1 < Math.abs(leftDepth - rightDepth)) {
      balanced = false;
      return 0;
    }

    return Math.max(leftDepth, rightDepth) + 1;
  }

  public boolean isBalanced(TreeNode root) {
    balanced = true;
    maxDepth(root);
    return balanced;
  }
}
