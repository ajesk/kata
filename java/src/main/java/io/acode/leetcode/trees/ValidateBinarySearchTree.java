package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;

public class ValidateBinarySearchTree {
  private Integer maxValue(TreeNode root) {
    if (root == null) return null;
    int res = root.val;
    res = root.left == null ? res : Math.max(maxValue(root.left), res);
    res = root.right == null ? res : Math.max(maxValue(root.right), res);

    return res;
  }

  private Integer minValue(TreeNode root) {
    if (root == null) return null;
    int res = root.val;
    res = root.left == null ? res : Math.min(minValue(root.left), res);
    res = root.right == null ? res : Math.min(minValue(root.right), res);

    return res;
  }

  public boolean isValidBST(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) return true;
    Integer maxLeft = maxValue(root.left);
    Integer minRight = minValue(root.right);
    if (maxLeft != null && maxLeft >= root.val) return false;
    if (minRight != null && minRight <= root.val) return false;

    return isValidBST(root.left) && isValidBST(root.right);
  }

  TreeNode prev;
  public boolean isValidBST2(TreeNode root) {
    if (root == null) return true;
    return inOrder(root);
  }

  private boolean inOrder(TreeNode root) {
    if (root == null) return true;

    if (!inOrder(root.left)) return false;

    if (prev != null && root.val <= prev.val) {
      return false;
    }
    prev = root;

    return inOrder(root.right);
  }
}
