package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.TreeNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;

    Queue<TreeNode> leftTree = new LinkedBlockingQueue<>();
    Queue<TreeNode> rightTree = new LinkedBlockingQueue<>();
    TreeNode leftNode = root.left;
    TreeNode rightNode = root.right;

    if (leftNode != null) leftTree.add(root.left);
    if (rightNode != null) rightTree.add(root.right);

    while (!leftTree.isEmpty() || !rightTree.isEmpty()) {
      if (leftTree.size() != rightTree.size()) return false;
      leftNode = leftTree.remove();
      rightNode = rightTree.remove();
      if (leftNode.val != rightNode.val) return false;
      if ((leftNode.left == null) != (rightNode.right == null) || (leftNode.right == null) != (rightNode.left == null)) return false;

      if (leftNode.left != null) leftTree.add(leftNode.left);
      if (leftNode.right != null) leftTree.add(leftNode.right);
      if (rightNode.right != null) rightTree.add(rightNode.right);
      if (rightNode.left != null) rightTree.add(rightNode.left);
    }

    return true;
  }
}
