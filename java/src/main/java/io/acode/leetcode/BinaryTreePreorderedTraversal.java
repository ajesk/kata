package io.acode.leetcode;

import io.acode.leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePreorderedTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null) return Collections.emptyList();
    List<Integer> treeVals = new ArrayList<>();
    treeVals.add(root.val);
    if (root.left != null) treeVals.addAll(inorderTraversal(root.left));
    if (root.right != null) treeVals.addAll(inorderTraversal(root.right));
    return treeVals;
  }
}
