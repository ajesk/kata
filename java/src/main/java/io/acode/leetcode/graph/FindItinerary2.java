package io.acode.leetcode.graph;

import java.util.*;

// This solution works until there is a partial itinerary. If more than one ticket does not have
// a connecting flight. This algo falls apart. It requires additional backtracking to make that one
// work.
public class FindItinerary2 {
  Map<String, LinkedList<String>> graph;
  LinkedList<String> visited;

  public List<String> findItinerary(List<List<String>> tickets) {
    graph = new HashMap<>();
    visited = new LinkedList<>();
    init(tickets);

    buildItinerary("JFK");
    return visited;
  }


  private void buildItinerary(String origin) {

    if (graph.containsKey(origin)) {
      LinkedList<String> destinationList = graph.get(origin);

      while (!destinationList.isEmpty()) {
        buildItinerary(destinationList.pollFirst());
      }
    }

    visited.offerFirst(origin);
  }

  private void init(List<List<String>> tickets) {
    for (List<String> ticket : tickets) {
      String source = ticket.get(0);
      String destination = ticket.get(1);
      graph.computeIfAbsent(source, k -> new LinkedList<>());
      graph.get(source).add(destination);
    }

    graph.forEach((k, v) -> Collections.sort(v));
  }
}
