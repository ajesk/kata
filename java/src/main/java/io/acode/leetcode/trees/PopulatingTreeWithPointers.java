package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.Node;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PopulatingTreeWithPointers {

  public Node connect(Node root) {
    if (root == null) return root;
    Queue<Node> nodeQueue = new LinkedBlockingQueue<>();
    int level = 0;
    int nodesToLink = 0;
    nodeQueue.add(root);

    while (!nodeQueue.isEmpty()) {
      Node currentNode = nodeQueue.remove();

      if (currentNode.left != null) nodeQueue.add(currentNode.left);
      if (currentNode.right != null) nodeQueue.add(currentNode.right);
      if (nodesToLink == 0) {
        level++;
        nodesToLink = (int) (Math.pow(2, level) - 1);
        continue;
      }

      currentNode.next = nodeQueue.peek();
      nodesToLink--;
    }

    return root;
  }
}
