package io.acode.leetcode.bfs;

public class FloodFill {
  int[][] movement = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
  int height;
  int width;

  private void dfs(int[][] image, int y, int x, int oldColor, int newColor) {
    for (int[] direction : movement) {
      int moveY = direction[0] + y;
      int moveX = direction[1] + x;

      if (moveY >= 0 && moveY < height && moveX >= 0 && moveX < width && image[moveY][moveX] == oldColor) {
        image[moveY][moveX] = newColor;
        dfs(image, moveY, moveX, oldColor, newColor);
      }
    }
  }

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldColor = image[sr][sc];
    if (oldColor == newColor) return image;
    image[sr][sc] = newColor;
    width = image[0].length;
    height = image.length;

    dfs(image, sr, sc, oldColor, newColor);
    return image;
  }
}
