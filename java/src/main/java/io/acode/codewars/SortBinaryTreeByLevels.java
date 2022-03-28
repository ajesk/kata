package io.acode.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class SortBinaryTreeByLevels {
  private static List<List<Integer>> order = new ArrayList<>();

  public static List<Integer> treeByLevels(Node node) {
    treeByLevels(node, 0);
    return order.stream().flatMap(Collection::stream).collect(Collectors.toList());
  }

  public static void treeByLevels(Node node, int level) {
    if (node == null) return;
    if (level == order.size()) order.add(new ArrayList<>());
    Optional.ofNullable(order.get(level))
      .ifPresentOrElse(
        x -> x.add(node.value),
        () -> order.add(List.of(node.value)));
    treeByLevels(node.left, level + 1);
    treeByLevels(node.right, level + 1);
  }

  public static void reset() {
    order = new ArrayList<>();
  }
}


class Node {
  public Node left;
  public Node right;
  public int value;

  public Node(Node l, Node r, int v) {
    left = l;
    right = r;
    value = v;
  }
}