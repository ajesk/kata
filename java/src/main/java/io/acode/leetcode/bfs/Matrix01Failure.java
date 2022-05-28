package io.acode.leetcode.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Matrix01Failure {
  int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
  int rows;
  int columns;

  public int bfs(int y, int x, int[][] mat) {
    Queue<List<Integer>> cells = new LinkedList<>();
    cells.offer(List.of(y, x));
    cells.offer(null);
    int count = 1;

    while (!cells.isEmpty()) {
      List<Integer> next = cells.poll();
      if (next == null) {
        if (cells.isEmpty()) return -1;
        count++;
        cells.offer(null);
        continue;
      }

      for (int[] direction : directions) {
        int modY = direction[0] + next.get(0);
        int modX = direction[1] + next.get(1);
        if (modY >= 0 && modY < rows && modX >= 0 && modX < columns) {
          if (mat[modY][modX] == 0) return count;
          cells.offer(List.of(modY, modX));
        }
      }
    }
    return count;
  }

  public int[][] updateMatrix(int[][] mat) {
    rows = mat.length;
    columns = mat[0].length;
    int[][] result = new int[rows][columns];

    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < columns; x++) {
        if (mat[y][x] == 1) {
          result[y][x] = bfs(y, x, mat);
        }
      }
    }
    return result;
  }
}
