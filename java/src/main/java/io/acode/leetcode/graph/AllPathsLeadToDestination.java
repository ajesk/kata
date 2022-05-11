package io.acode.leetcode.graph;

import java.util.*;

public class AllPathsLeadToDestination {
  Map<Integer, Set<Integer>> graph;
  Stack<Integer> visited;

  public void init(int n, int[][] edges) {
    graph = new HashMap<>();
    visited = new Stack<>();
    for (int i = 0; i < n; i++) {
      graph.put(i, new HashSet<>());
    }

    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
    }
  }

  public boolean allLeadToDestination(int source, int destination) {
    if (visited.contains(source)) return false;

    visited.push(source);
    Set<Integer> neighbors = graph.get(source);
    if (source == destination && !neighbors.isEmpty()) return false;
    if (source != destination && neighbors.isEmpty()) return false;


    for (int neighbor : neighbors) {
      if (!allLeadToDestination(neighbor, destination)) return false;
    }

    visited.pop();
    return true;
  }

  public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
    init(n, edges);

    return allLeadToDestination(source, destination);
  }
}
