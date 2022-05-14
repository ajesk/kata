package io.acode.leetcode.graph;

import java.util.*;

public class CostToConnectAllPointsPrims {

  public int minCostConnectPoints(int[][] points) {
    PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a.edgeWeight));
    boolean[] inMST = new boolean[points.length];
    int treeCost = 0;
    int edgesUsed = 0;

    heap.add(new Pair<>(0, 0));

    while (edgesUsed < points.length) {
      Pair<Integer, Integer> topElement = heap.poll();

      int weight = topElement.edgeWeight;
      int currentNode = topElement.node;

      if (inMST[currentNode]) continue;

      inMST[currentNode] = true;
      treeCost += weight;
      edgesUsed++;

      for (int nextNode = 0; nextNode < points.length; nextNode++) {
        if (!inMST[nextNode]) {
          int nextWeight = Math.abs(points[currentNode][0] - points[nextNode][0]) +
            Math.abs(points[currentNode][1] - points[nextNode][1]);
          heap.add(new Pair<>(nextWeight, nextNode));
        }
      }
    }


    return treeCost;
  }

  private static class Pair<I extends Number, I1 extends Number> {
    public I edgeWeight;
    public I1 node;

    public Pair(I edgeWeight, I1 node) {
      this.edgeWeight = edgeWeight;
      this.node = node;
    }
  }
}
