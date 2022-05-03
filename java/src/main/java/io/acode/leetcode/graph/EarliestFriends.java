package io.acode.leetcode.graph;

import java.util.Arrays;
import java.util.Comparator;

public class EarliestFriends {
  private int[] graph;
  private int[] rank;
  private int count;

  private void init(int x) {
    graph = new int[x];
    rank = new int[x];
    count = x - 1;

    for (int i = 0; i < x; i++) {
      graph[i] = i;
      rank[i] = 1;
    }
  }

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

  public int earliestAcq(int[][] logs, int n) {
    if (n == 1) return logs[0][0];

    init(n);
    Arrays.sort(logs, Comparator.comparingInt(o -> o[0]));

    for (int[] log: logs) {
      if (find(log[1]) != find(log[2])) count--;
      union(log[1], log[2]);
      if (count == 0) return log[0];
    }
    return -1;
  }
}
