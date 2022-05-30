package io.acode.leetcode.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WallsAndGatesTest {
  WallsAndGates target = new WallsAndGates();

  @Test
  public void testBasic() {
    int[][] test = new int[][]{{-1}};
    target.wallsAndGates(test);
    assertArrayEquals(new int[][]{{-1}}, test);
  }

  @Test
  public void testSimpleGrid() {
    int[][] test = new int[][]{{0, 500}};
    target.wallsAndGates(test);
    assertArrayEquals(new int[][]{{0, 1}}, test);

    test = new int[][]{{500, 0}};
    target.wallsAndGates(test);
    assertArrayEquals(new int[][]{{1, 0}}, test);

    test = new int[][]{{0}, {500}};
    target.wallsAndGates(test);
    assertArrayEquals(new int[][]{{0}, {1}}, test);

    test = new int[][]{{500}, {0}};
    target.wallsAndGates(test);
    assertArrayEquals(new int[][]{{1}, {0}}, test);

    test = new int[][]{{500}, {-1}};
    target.wallsAndGates(test);
    assertArrayEquals(new int[][]{{500}, {-1}}, test);
  }

  @Test
  public void testLeetExample() {
    int[][] test = new int[][]{
      {2147483647, -1, 0, 2147483647},
      {2147483647, 2147483647, 2147483647, -1},
      {2147483647, -1, 2147483647, -1},
      {0, -1, 2147483647, 2147483647}};
    target.wallsAndGates(test);
    assertArrayEquals(new int[][]{{3, -1, 0, 1}, {2, 2, 1, -1}, {1, -1, 2, -1}, {0, -1, 3, 4}}, test);
  }
}
