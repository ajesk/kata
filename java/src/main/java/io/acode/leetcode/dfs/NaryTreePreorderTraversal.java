package io.acode.leetcode.dfs;

import io.acode.leetcode.datastructures.graph.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {

  public void dfs(Node root, List<Integer> store) {
    store.add(root.val);
    for (Node next: root.neighbors) {
      dfs(next, store);
    }
  }

  public List<Integer> preorder(Node root) {
    List<Integer> nums = new ArrayList<>();
    dfs(root, nums);
    return nums;
  }
}
