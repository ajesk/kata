package io.acode.leetcode.graph;

import java.util.*;

public class ShortestPathInBinaryMatrix {

  public int shortestPathBinaryMatrix(int[][] grid) {
    Queue<List<Integer>> paths = new LinkedList<>();
    boolean[][] visited = new boolean[grid.length][grid.length];
    paths.add(List.of(0, 0, 1));

    while (!paths.isEmpty()) {
      List<Integer> currentTrial = paths.remove();
      int x = currentTrial.get(0);
      int y = currentTrial.get(1);
      int moves = currentTrial.get(2);
      if (grid[x][y] == 1 || visited[x][y]) continue;
      visited[x][y] = true;

      if (x == grid.length - 1 && x == y) {
        return moves;
      }

      boolean moveXUp = x < grid.length - 1;
      boolean moveYUp = y < grid.length - 1;
      boolean moveXDown = x > 0;
      boolean moveYDown = y > 0;

      if (moveXDown) {
        paths.add(List.of(x - 1, y, moves + 1));
        if (moveYDown) paths.add(List.of(x - 1, y - 1, moves + 1));
        if (moveYUp) paths.add(List.of(x - 1, y + 1, moves + 1));
      }
      if (moveXUp) {
        paths.add(List.of(x + 1, y, moves + 1));
        if (moveYUp) paths.add(List.of(x + 1, y + 1, moves + 1));
        if (moveYDown) paths.add(List.of(x + 1, y - 1, moves + 1));
      }
      if (moveYDown) paths.add(List.of(x, y - 1, moves + 1));
      if (moveYUp) paths.add(List.of(x, y + 1, moves + 1));
    }

    return -1;
  }
}
