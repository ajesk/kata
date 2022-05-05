package io.acode.leetcode.graph;

import java.util.*;

public class EvaluateDivision {
  private HashMap<String, HashMap<String, Double>> graph = new HashMap<>();

  private Set<String> visited;

  private double backTrackEval(String parent, String target, double product) {
    visited.add(parent);

    Map<String, Double> neighbors = graph.get(parent);
    double result = -1.0;

    if (neighbors.containsKey(target)) {
      result = product * neighbors.get(target);
    } else {
      for (Map.Entry<String, Double> pair : neighbors.entrySet()) {
        String next = pair.getKey();
        if (!visited.contains(next)) {
          result = backTrackEval(next, target, product * pair.getValue());
        }
        if (result != -1.0) break;
      }
    }

    visited.remove(parent);
    return result;
  }

  private void union(double quotient, String value1, String value2) {
    graph.computeIfAbsent(value1, k -> new HashMap<>());
    graph.computeIfAbsent(value2, k -> new HashMap<>());

    graph.get(value1).put(value2, quotient);
    graph.get(value2).put(value1, 1 / quotient);
  }

  public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    for (int i = 0; i < equations.size(); i++) {
      double quotient = values[i];
      List<String> equation = equations.get(i);
      union(quotient, equation.get(0), equation.get(1));
    }

    double[] results = new double[queries.size()];

    for (int i = 0; i < queries.size(); i++) {
      List<String> query = queries.get(i);
      String parent = query.get(0);
      String target = query.get(1);
      if (!graph.containsKey(parent) || !graph.containsKey(target)) results[i] = -1;
      else if (parent.equals(target)) results[i] = 1;
      else {
        visited = new HashSet<>();
        results[i] = backTrackEval(parent, target, 1);
      }
    }

    return results;
  }

}
