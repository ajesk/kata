package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;

public class LowestCommonAncestor {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;

    if (root.val == p.val || root.val == q.val) {
      return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null) {
      return root;
    } else if (left != null) {
      return left;
    } else if (right != null) {
      return right;
    }

    return null;
  }
}
