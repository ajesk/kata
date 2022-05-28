package io.acode.leetcode.bfs;

import java.util.*;

public class Matrix01 {
  private final int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  public int[][] updateMatrix(int[][] mat) {
    int rows = mat.length;
    int columns = mat[0].length;
    int[][] result = new int[rows][columns];
    boolean[][] visited = new boolean[rows][columns];
    Queue<List<Integer>> visiting = new LinkedList<>();

    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < columns; x++) {
        if (mat[y][x] == 0) {
          visiting.offer(List.of(y, x));
          visited[y][x] = true;
        }
      }
    }

    visiting.offer(null);
    int count = 1;
    while (!visiting.isEmpty()) {
      List<Integer> next = visiting.poll();
      if (next == null) {
        count++;
        if (!visiting.isEmpty()) visiting.offer(null);
        continue;
      }

      for (int[] direction : directions) {
        int modY = direction[0] + next.get(0);
        int modX = direction[1] + next.get(1);
        if (modY >= 0 && modY < rows && modX >= 0 && modX < columns && !visited[modY][modX]) {
          result[modY][modX] = count;
          visited[modY][modX] = true;
          visiting.offer(List.of(modY, modX));
        }
      }
    }
    return result;
  }
}
