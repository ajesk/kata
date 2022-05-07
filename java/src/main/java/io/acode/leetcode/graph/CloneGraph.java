package io.acode.leetcode.graph;

import io.acode.leetcode.datastructures.graph.Node;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
  private Map<Node, Node> visited;
  private Node newHead;

  private void deepClone(Node node) {
    for (Node neighbor : node.neighbors) {
      Node clonedNeighbor;
      if (visited.containsKey(neighbor)) {
        clonedNeighbor = visited.get(neighbor);
      } else {
        clonedNeighbor = new Node(neighbor.val);
        visited.put(neighbor, clonedNeighbor);
        deepClone(neighbor);
      }

      visited.get(node).neighbors.add(clonedNeighbor);
    }
  }

  public Node cloneGraph(Node node) {
    if (node == null) return null;
    visited = new HashMap<>();
    newHead = new Node(node.val);
    visited.put(node, newHead);
    deepClone(node);

    return newHead;
  }
}
