package io.acode.leetcode.graph;

import java.util.*;

public class AllPathsToTargetBFS {

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    int target = graph.length - 1;
    Queue<List<Integer>> nodes = new LinkedList<>();
    List<List<Integer>> completions = new ArrayList<>();
    nodes.add(List.of(0));

    while (!nodes.isEmpty()) {
      List<Integer> currentTrial = nodes.remove();
      int lastElement = currentTrial.get(currentTrial.size() - 1);

      for (int neighbor : graph[lastElement]) {
        List<Integer> copy = new ArrayList<>(currentTrial);
        copy.add(neighbor);
        if (neighbor == target) {
          completions.add(copy);
        } else {
          nodes.add(copy);
        }
      }
    }

    return completions;
  }
}
