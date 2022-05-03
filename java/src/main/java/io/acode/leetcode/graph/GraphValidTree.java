package io.acode.leetcode.graph;

public class GraphValidTree {
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

  public boolean validTree(int n, int[][] edges) {
    graph = new int[n];
    rank = new int[n];
    for (int i = 0; i < graph.length; i++) {
      graph[i] = i;
      rank[i] = 1;
    }

    for (int[] edge : edges) {
      if (find(edge[0]) == find(edge[1])) return false;
      union(edge[0], edge[1]);
    }

    int firstParent = graph[0];
    for (int parent : graph) {
      if (firstParent != find(parent)) return false;
    }
    return true;
  }
}
