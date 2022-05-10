package io.acode.leetcode.graph;

import java.util.*;

// This solution works until there is a partial itinerary. If more than one ticket does not have
// a connecting flight. This algo falls apart. It requires additional backtracking to make that one
// work.
public class FindItinerary {
  Map<String, Map<String, Integer>> graph;
  Stack<String> visited;

  public List<String> findItinerary(List<List<String>> tickets) {
    graph = new HashMap<>();
    visited = new Stack<>();
    init(tickets);

    buildItinerary("JFK", tickets.size() + 1);
    return visited.stream().toList();
  }


  private boolean buildItinerary(String location, int numberOfDestinations) {
    visited.push(location);
    if (visited.size() == numberOfDestinations) return true;

    Map<String, Integer> possibleDestinations = graph.get(location);

    for (Map.Entry<String, Integer> destination : possibleDestinations.entrySet()) {
      if (destination.getValue() == 0) continue;
      possibleDestinations.put(destination.getKey(), destination.getValue() - 1);
      if (buildItinerary(destination.getKey(), numberOfDestinations)) return true;
      possibleDestinations.put(destination.getKey(), destination.getValue() + 1);
    }

    visited.pop();
    return false;
  }

  private void init(List<List<String>> tickets) {
    for (List<String> ticket : tickets) {
      String source = ticket.get(0);
      String destination = ticket.get(1);

      graph.computeIfAbsent(source, k -> new TreeMap<>());
      Map<String, Integer> destinations = graph.get(source);
      destinations.putIfAbsent(destination, 0);
      destinations.put(destination, destinations.get(destination) + 1);
    }
  }
}
