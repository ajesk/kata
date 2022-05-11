package io.acode.leetcode.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PathExistsInGraphBFS {
  ArrayList<Integer>[] graph;
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

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    if (n == 1 || source == destination) return true;
    init(n, edges);

    Queue<Integer> nodes = new PriorityQueue<>();
    nodes.add(source);

    while (!nodes.isEmpty()) {
      int currentNode = nodes.remove();
      if (visited[currentNode]) continue;
      visited[currentNode] = true;
      if (currentNode == destination) return true;

      List<Integer> neighbors = graph[currentNode];
      nodes.addAll(neighbors);
    }

    return false;
  }
}
