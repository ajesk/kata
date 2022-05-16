package io.acode.leetcode.graph;

import java.util.*;

public class NetworkDelayTime {

  Map<Integer, Integer> shortestDistance;
  Map<Integer, Integer> previousVertex;
  Map<Integer, Map<Integer, Integer>> graph;

  private void init(int[][] times) {
    shortestDistance = new HashMap<>();
    previousVertex = new HashMap<>();
    graph = new HashMap<>();
    for (int[] time : times) {
      int source = time[0];
      int target = time[1];
      int value = time[2];

      graph.computeIfAbsent(source, k -> new HashMap<>());
      graph.get(source).put(target, value);
    }
  }

  public int networkDelayTime(int[][] times, int n, int k) {
    if (n == 1) return 0;
    init(times);
    Queue<Integer> nodes = new LinkedList<>();
    shortestDistance.put(k, 0);
    nodes.add(k);

    while (!nodes.isEmpty()) {
      int previousNode = nodes.remove();
      int previousNodeValue = shortestDistance.get(previousNode);

      for (Map.Entry<Integer, Integer> currentEdge : graph.getOrDefault(previousNode, Collections.emptyMap()).entrySet()) {
        int currentValue = shortestDistance.getOrDefault(currentEdge.getKey(), Integer.MAX_VALUE);
        int tryValue = currentEdge.getValue() + previousNodeValue;

        if (tryValue < currentValue) {
          shortestDistance.put(currentEdge.getKey(), tryValue);
          nodes.add(currentEdge.getKey());
        }
      }
    }

    if (shortestDistance.size() < n) return -1;
    return shortestDistance.values().stream().max(Comparator.comparingInt(x -> x)).get();
  }
}
