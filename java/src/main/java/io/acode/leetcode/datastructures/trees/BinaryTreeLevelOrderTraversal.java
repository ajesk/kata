package io.acode.leetcode.datastructures.trees;

import io.acode.leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> nodes = new LinkedBlockingQueue<>();
    Queue<TreeNode> nextLevel = new LinkedBlockingQueue<>();
    List<List<Integer>> result = new ArrayList<>();
    int level = 0;
    if (root != null) nodes.add(root);

    while (!nodes.isEmpty()) {
      TreeNode current = nodes.remove();
      if (result.size() == level) result.add(new ArrayList<>());
      result.get(level).add(current.val);
      if (current.left != null) nextLevel.add(current.left);
      if (current.right != null) nextLevel.add(current.right);
      if (nodes.isEmpty()) {
        nodes.addAll(nextLevel);
        nextLevel.clear();
        level++;
      }
    }

    return result;
  }
}
