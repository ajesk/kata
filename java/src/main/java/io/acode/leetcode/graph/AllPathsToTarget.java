package io.acode.leetcode.graph;

import java.util.*;

public class AllPathsToTarget {
  Set<Integer> visited;
  private List<List<Integer>> paths = new ArrayList<>();

  private void findPaths(int[][] graph, int source, int target) {
    visited.add(source);
    if (source == target) {
      paths.add(new ArrayList<>(visited));
      visited.remove(source);
      return;
    }

    for (int neighbor : graph[source]) {
      findPaths(graph, neighbor, target);
    }

    visited.remove(source);
  }

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    int target = graph.length - 1;
    visited = new LinkedHashSet<>();

    findPaths(graph, 0, target);
    return paths;
  }
}
