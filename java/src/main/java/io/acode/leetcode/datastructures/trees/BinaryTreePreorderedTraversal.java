package io.acode.leetcode.datastructures.trees;

import io.acode.leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePreorderedTraversal {
  public List<Integer> preorderTraversal(TreeNode root) {
    if (root == null) return Collections.emptyList();
    List<Integer> treeVals = new ArrayList<>();
    treeVals.add(root.val);
    if (root.left != null) treeVals.addAll(preorderTraversal(root.left));
    if (root.right != null) treeVals.addAll(preorderTraversal(root.right));
    return treeVals;
  }
}
