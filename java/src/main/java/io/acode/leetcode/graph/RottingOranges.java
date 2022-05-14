package io.acode.leetcode.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottingOranges {
  public int orangesRotting(int[][] grid) {
    int dayCount = 0;
    int freshCount = 0;
    Queue<List<Integer>> rotQueue = new LinkedList<>();

    for (int y = 0; y < grid.length; y++) {
      for (int x = 0; x < grid[y].length; x++) {
        int cell = grid[y][x];
        if (cell == 1) {
          freshCount++;
        } else if (cell == 2) {
          rotQueue.add(List.of(y - 1, x, 1));
          rotQueue.add(List.of(y + 1, x, 1));
          rotQueue.add(List.of(y, x - 1, 1));
          rotQueue.add(List.of(y, x + 1, 1));
        }
      }
    }

    while (!rotQueue.isEmpty()) {
      List<Integer> currentOrange = rotQueue.remove();

      int y = currentOrange.get(0);
      int x = currentOrange.get(1);
      int count = currentOrange.get(2);

      if (y < 0 || y > grid.length - 1 || x < 0 || x > grid[0].length - 1) continue;

      if (grid[y][x] == 1) {
        grid[y][x] = 2;
        freshCount--;
        dayCount = Math.max(dayCount, count);

        rotQueue.add(List.of(y - 1, x, count + 1));
        rotQueue.add(List.of(y + 1, x, count + 1));
        rotQueue.add(List.of(y, x - 1, count + 1));
        rotQueue.add(List.of(y, x + 1, count + 1));
      }
    }

    return freshCount == 0 ? dayCount : -1;
  }
}
