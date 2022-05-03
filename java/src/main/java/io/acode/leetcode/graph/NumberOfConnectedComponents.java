package io.acode.leetcode.graph;

import java.util.HashSet;
import java.util.Set;

public class NumberOfConnectedComponents {
  int[] graph;
  int[] rank;

  private int find(int x) {
    if (x == graph[x]) return x;
    graph[x] = find(graph[x]);
    return graph[x];
  }

  private void union(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);
    if (rootX != rootY) {
      if (rank[rootX] > rank[rootY]) {
        graph[rootY] = rootX;
      } else if (rank[rootX] < rank[rootY]) {
        graph[rootX] = rootY;
      } else {
        graph[rootY] = rootX;
        rank[rootX] += 1;
      }
    }
  }

  public int countComponents(int n, int[][] edges) {
    graph = new int[n];
    rank = new int[n];
    for (int i = 0; i < n; i++) {
      graph[i] = i;
      rank[i] = 1;
    }

    for (int[] edge : edges) {
      union(edge[0], edge[1]);
    }

    Set<Integer> groups = new HashSet<>();
    for (int node : graph) {
      groups.add(find(node));
    }

    return groups.size();
  }
}
