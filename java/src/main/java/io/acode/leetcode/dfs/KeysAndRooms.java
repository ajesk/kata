package io.acode.leetcode.dfs;

import java.util.List;
import java.util.Stack;

public class KeysAndRooms {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];
    visited[0] = true;
    Stack<Integer> roomsToVisit = new Stack<>();
    roomsToVisit.push(0);

    while (!roomsToVisit.isEmpty()) {
      int currentRoom = roomsToVisit.pop();
      List<Integer> keys = rooms.get(currentRoom);

      for (int key : keys) {
        if (!visited[key]) {
          visited[key] = true;
          roomsToVisit.push(key);
        }
      }
    }

    for (boolean visitedRoom : visited) {
      if (!visitedRoom) return false;
    }
    return true;
  }
}
