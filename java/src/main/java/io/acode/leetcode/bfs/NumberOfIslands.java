package io.acode.leetcode.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfIslands {
  private boolean[][] visited;
  private int totalRows;
  private int totalColumns;
  private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

  public int numIslands(char[][] grid) {
    totalRows = grid.length;
    totalColumns = grid[0].length;
    int islands = 0;
    visited = new boolean[totalRows][totalColumns];

    for (int y = 0; y < totalRows; y++) {
      for (int x = 0; x < totalColumns; x++) {
        if (!visited[y][x] && grid[y][x] == '1') {
          islands++;
          exploreIsland(grid, y, x);
        }
        visited[y][x] = true;
      }
    }
    return islands;
  }

  private void exploreIsland(char[][] grid, int row, int col) {
    Queue<List<Integer>> islandQueue = new LinkedList<>();

    islandQueue.offer(List.of(row, col));

    while (!islandQueue.isEmpty()) {
      List<Integer> currentCoord = islandQueue.poll();

      for (int[] direction : directions) {
        int y = currentCoord.get(0) + direction[0];
        int x = currentCoord.get(1) + direction[1];

        if (y < 0 || y > totalRows - 1 || x < 0 || x > totalColumns - 1) continue;
        if (!visited[y][x] && grid[y][x] == '1') {
          visited[y][x] = true;
          islandQueue.offer(List.of(y, x));
        }
      }
    }
  }
}
