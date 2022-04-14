package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;

public class InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;

    TreeNode holder = invertTree(root.left);
    root.left = invertTree(root.right);
    root.right = holder;
    return root;
  }
}
