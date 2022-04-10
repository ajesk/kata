package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.TreeNode;

public class PathSum {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    return pathSumNavigate(root, targetSum, 0);
  }

  private boolean pathSumNavigate(TreeNode node, int targetSum, int runningTotal) {
    if (node == null) return false;
    if (node.val + runningTotal == targetSum && node.left == null && node.right == null) return true;
    return (
      pathSumNavigate(node.left, targetSum, node.val + runningTotal) ||
        pathSumNavigate(node.right, targetSum, node.val + runningTotal)
    );
  }
}
