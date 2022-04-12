package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreeOrderedTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null) return Collections.emptyList();
    List<Integer> treeVals = new ArrayList<>();
    if (root.left != null) treeVals.addAll(inorderTraversal(root.left));
    treeVals.add(root.val);
    if (root.right != null) treeVals.addAll(inorderTraversal(root.right));
    return treeVals;
  }

  public List<Integer> inorderTraversalInterative(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while (true) {
      if (node != null) {
        stack.push(node);
        node = node.left;
      } else {
        if (stack.isEmpty()) break;
        node = stack.pop();
        result.add(node.val);
        node = node.right;

      }
    }
    return result;
  }
}
