package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.Node;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PopulatingPerfectTreeWithPointers {

  public Node connect(Node root) {
    if (root == null) return root;
    Queue<Node> nodeQueue = new LinkedBlockingQueue<>();
    Queue<Node> nextLevelQueue = new LinkedBlockingQueue<>();
    nodeQueue.add(root);

    while (!nodeQueue.isEmpty()) {
      Node currentNode = nodeQueue.remove();

      if (currentNode.left != null) nextLevelQueue.add(currentNode.left);
      if (currentNode.right != null) nextLevelQueue.add(currentNode.right);
      if (nodeQueue.isEmpty()) {
        nodeQueue.addAll(nextLevelQueue);
        nextLevelQueue.clear();
        continue;
      }

      currentNode.next = nodeQueue.peek();
    }

    return root;
  }
}
