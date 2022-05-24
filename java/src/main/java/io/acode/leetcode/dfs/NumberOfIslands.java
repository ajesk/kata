package io.acode.leetcode.dfs;

public class NumberOfIslands {
  private boolean[][] visited;
  private int sizeY;
  private int sizeX;
  private int[][] directions = new int[][]{
    {0, 1},
    {0, -1},
    {1, 0},
    {-1, 0}
  };

  private void searchIslandDfs(char[][] grid, int y, int x) {
    for (int[] direction : directions) {
      int yMod = direction[0] + y;
      int xMod = direction[1] + x;
      if (
        yMod >= 0 && yMod < sizeY &&
          xMod >= 0 && xMod < sizeX &&
          !visited[yMod][xMod] &&
          grid[yMod][xMod] == '1'
      ) {
        visited[yMod][xMod] = true;
        searchIslandDfs(grid, yMod, xMod);
      }
    }
  }

  public int numIslands(char[][] grid) {
    int count = 0;
    sizeY = grid.length;
    sizeX = grid[0].length;
    visited = new boolean[sizeY][sizeX];

    for (int y = 0; y < sizeY; y++) {
      for (int x = 0; x < sizeX; x++) {
        if (!visited[y][x]) {
          visited[y][x] = true;
          if (grid[y][x] == '1') {
            count++;
            searchIslandDfs(grid, y, x);
          }
        }
      }
    }
    return count;
  }
}
