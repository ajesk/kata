package io.acode.leetcode.graph;

import java.util.*;

public class PathExistsInGraph {
  List<Integer> graph[];
  boolean[] visited;

  private void init(int n, int[][] edges) {
    visited = new boolean[n];
    graph = new ArrayList[n];

    for (int i = 0; i < n; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int[] edge : edges) {
      graph[edge[0]].add(edge[1]);
      graph[edge[1]].add(edge[0]);
    }
  }

  private boolean find(int source, int destination) {

    boolean found = false;
    for (Integer next : graph[source]) {
      if (!visited[next]) {
        visited[next] = true;
        if (next == destination) return true;
        found = find(next, destination);
      }
      if (found) return true;
    }
    return false;
  }

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    if (n == 1 || source == destination) return true;
    init(n, edges);

    return find(source, destination);
  }
}
