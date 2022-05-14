package io.acode.leetcode.graph;

import java.util.*;

public class CostToConnectAllPointsKruskals {
  int[] connectedPoints;
  int[] rank;
  List<List<Integer>> edges;

  public int minCostConnectPoints(int[][] points) {
    int connectedCount = 0;
    int treeCost = 0;
    init(points);

    edges.sort(Comparator.comparing(l -> l.get(0)));

    for (List<Integer> edge : edges) {
      int point1 = edge.get(1);
      int point2 = edge.get(2);

      if (find(point1) != find(point2)) {
        union(point1, point2);
        treeCost += edge.get(0);
        connectedCount++;
        if (connectedCount == points.length - 1) {
          break;
        }
      }
    }

    return treeCost;
  }

  int find(int x) {
    if (x == connectedPoints[x]) return x;
    connectedPoints[x] = find(connectedPoints[x]);
    return connectedPoints[x];
  }

  private void union(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);
    if (rootX != rootY) {
      if (rank[rootX] > rank[rootY]) {
        connectedPoints[rootY] = rootX;
      } else if (rank[rootX] < rank[rootY]) {
        connectedPoints[rootX] = rootY;
      } else {
        connectedPoints[rootY] = rootX;
        rank[rootX] += 1;
      }
    }
  }

  private void init(int[][] points) {
    edges = new LinkedList<>();
    connectedPoints = new int[points.length];
    rank = new int[points.length];

    for (int i = 0; i < points.length; i++) {
      connectedPoints[i] = i;
      rank[i] = 1;
      for (int j = i + 1; j < points.length; j++) {
        int[] pointA = points[i];
        int[] pointB = points[j];

        int weight = Math.abs(pointA[0] - pointB[0]) + Math.abs(pointA[1] - pointB[1]);
        edges.add(List.of(weight, i, j));
      }
    }
  }
}
