package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePostOrderedTraversal {
  public List<Integer> postOrderTraversal(TreeNode root) {
    if (root == null) return Collections.emptyList();
    List<Integer> treeVals = new ArrayList<>();
    if (root.left != null) treeVals.addAll(postOrderTraversal(root.left));
    if (root.right != null) treeVals.addAll(postOrderTraversal(root.right));
    treeVals.add(root.val);
    return treeVals;
  }
}
