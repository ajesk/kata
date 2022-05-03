package io.acode.leetcode.graph;

import java.util.*;
import java.util.stream.Collectors;

public class SmallestStringWithSwaps {
  private int[] graph;
  private int[] rank;
  private char[] chars;

  private void init(String s) {
    int size = s.length();
    graph = new int[size];
    rank = new int[size];
    for (int i = 0; i < size; i++) {
      graph[i] = i;
      rank[i] = 1;
    }
    chars = s.toCharArray();
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
      } else if (rank[rootY] > rank[rootX]) {
        graph[rootX] = rootY;
      } else {
        graph[rootY] = rootX;
        rank[rootY] += 1;
      }
    }
  }

  public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
    if (s.length() == 1) return s;
    init(s);

    Map<Integer, Set<Integer>> groups = new HashMap<>();

    // build groups
    for (List<Integer> pair : pairs) {
      union(pair.get(0), pair.get(1));
    }

    for (int i = 0; i < graph.length; i++) {
      int parent = find(i);
      groups.computeIfAbsent(parent, k -> new HashSet<>());
      groups.get(parent).add(i);
    }

    // sort indexes
    groups.forEach((i, group) -> groups.put(i, group.stream()
      .sorted(Comparator.comparingInt(o -> chars[o]))
      .collect(Collectors.toCollection(LinkedHashSet::new))));

    String result = "";
    // reassemble string
    for (int i = 0; i < s.length(); i++) {
      int parent = find(i);
      Set<Integer> group = groups.get(parent);
      int next = group != null ? group.iterator().next() : i;
      result += chars[next];
      if (group != null) group.remove(next);
    }
    return result;
  }
}
