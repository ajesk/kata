package io.acode.leetcode.graph;

import io.acode.leetcode.datastructures.graph.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NAryTreeLevelTraversal {

  public List<List<Integer>> levelOrder(Node root) {
    if (root == null) return new ArrayList<>();
    Queue<Node> nodeQueue = new LinkedList<>();
    int nodeCount = 1;
    nodeQueue.add(root);
    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());

    while (!nodeQueue.isEmpty()) {
      if (nodeCount == 0) {
        result.add(new ArrayList<>());
        nodeCount = nodeQueue.size();
      }

      Node current = nodeQueue.remove();
      result.get(result.size() - 1).add(current.val);
      nodeCount--;
      nodeQueue.addAll(current.neighbors);
    }

    return result;
  }
}
