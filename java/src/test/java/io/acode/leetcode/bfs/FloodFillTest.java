package io.acode.leetcode.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class FloodFillTest {
  FloodFill target = new FloodFill();

  @Test
  public void testBasic() {
    assertArrayEquals(new int[][]{{1}}, target.floodFill(new int[][]{{1}}, 0, 0, 1));
  }

  @Test
  public void testSimpleTransition() {
    assertArrayEquals(new int[][]{{2}}, target.floodFill(new int[][]{{1}}, 0, 0, 2));
  }

  @Test
  public void testMultipleTransition() {
    assertArrayEquals(new int[][]{{2, 2}}, target.floodFill(new int[][]{{1, 1}}, 0, 0, 2));
    assertArrayEquals(new int[][]{{2, 2}}, target.floodFill(new int[][]{{1, 1}}, 0, 1, 2));
    assertArrayEquals(new int[][]{{2}, {2}}, target.floodFill(new int[][]{{1}, {1}}, 0, 0, 2));
    assertArrayEquals(new int[][]{{2}, {2}}, target.floodFill(new int[][]{{1}, {1}}, 1, 0, 2));
  }

  @Test
  public void testLeaveThreeneyAlone() {
    assertArrayEquals(new int[][]{{3, 2, 2}}, target.floodFill(new int[][]{{3, 1, 1}}, 0, 1, 2));
    assertArrayEquals(new int[][]{{3, 2, 2}}, target.floodFill(new int[][]{{3, 1, 1}}, 0, 2, 2));
  }

  @Test
  public void testMultiLevel() {
    assertArrayEquals(new int[][]{{3, 2, 2}, {2, 4, 2}, {2, 2, 2}},
      target.floodFill(new int[][]{{3, 1, 1}, {1, 4, 1}, {1, 1, 1}}, 0, 1, 2));
  }

  @Test
  public void testLeet() {
    assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}},
      target.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
    assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
      target.floodFill(new int[][]{{3, 3, 3}, {3, 3, 3}, {3, 3, 3}}, 0, 1, 0));
  }
}
