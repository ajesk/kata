package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;

public class DiameterOfTree {
  private int maxDiameterOfTree;

  public int diameterOfBinaryTree(TreeNode root) {
    maxDiameterOfTree = 0;
    depthOfTree(root);
    return maxDiameterOfTree;
  }

  private int depthOfTree(TreeNode root) {
    if (root == null) return 0;

    int leftDepth = depthOfTree(root.left);
    int rightDepth = depthOfTree(root.right);

    maxDiameterOfTree = Math.max(maxDiameterOfTree, leftDepth + rightDepth);
    return Math.max(leftDepth, rightDepth) + 1;
  }
}
