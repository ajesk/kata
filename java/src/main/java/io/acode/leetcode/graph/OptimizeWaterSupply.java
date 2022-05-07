package io.acode.leetcode.graph;

import java.util.*;
import java.util.stream.Collectors;

public class OptimizeWaterSupply {
  Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
  private int[] parentMapping;
  private int[] rank;

  private int find(int x) {
    if (x == parentMapping[x]) return x;
    parentMapping[x] = find(parentMapping[x]);
    return parentMapping[x];
  }

  private void parentUnion(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);
    if (rootX != rootY) {
      if (rank[rootX] > rank[rootY]) {
        parentMapping[rootY] = rootX;
      } else if (rank[rootX] < rank[rootY]) {
        parentMapping[rootX] = rootY;
      } else {
        parentMapping[rootY] = rootX;
        rank[rootX] += 1;
      }
    }
  }


  private int recursiveFind(int house, int cumulativeCost, Set<Integer> visited) {
    visited.add(house);

    Map<Integer, Integer> neighbors = graph.get(house);
    int total = cumulativeCost;
    for (Map.Entry<Integer, Integer> neighbor : neighbors.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toCollection(LinkedHashSet::new))) {
      int nextHouse = neighbor.getKey();
      if (!visited.contains(nextHouse)) {
        total += recursiveFind(neighbor.getKey(), neighbor.getValue(), visited);
      }
    }

    return total;
  }

  private void union(int[] pipeLayout) {
    int house1 = pipeLayout[0] - 1;
    int house2 = pipeLayout[1] - 1;
    parentUnion(house1, house2);
    Map<Integer, Integer> piping1 = graph.get(house1);
    Map<Integer, Integer> piping2 = graph.get(house2);
    int pipingCost = piping1.containsKey(house2) ? Math.min(piping1.get(house2), pipeLayout[2]) : pipeLayout[2];
    piping1.put(house2, pipingCost);
    piping2.put(house1, pipingCost);
  }

  public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
    parentMapping = new int[n];
    rank = new int[n];
    for (int i = 0; i < n; i++) {
      parentMapping[i] = i;
      rank[i] = 1;
      graph.put(i, new HashMap<>());
    }

    for (int i = 0; i < pipes.length; i++) {
      int[] pipeLayout = pipes[i];
      union(pipeLayout);
    }

    Map<Integer, Integer> minimums = new HashMap<>();

    for (int i = 0; i < wells.length; i++) {
      int parent = find(i);
      int minCost = minimums.getOrDefault(parent, -1);

      int cost = recursiveFind(i, wells[i], new HashSet<>());
      minCost = minCost == -1 ? cost : Math.min(minCost, cost);
      minimums.put(parent, minCost);
    }

    return minimums.values().stream().reduce(0, Integer::sum);
  }

}
