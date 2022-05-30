package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathInBinaryMatrixTest {
  private ShortestPathInBinaryMatrix target = new ShortestPathInBinaryMatrix();

  @Test
  public void testBasic() {
    assertEquals(-1, target.shortestPathBinaryMatrix(new int[][]{{1}}));
    assertEquals(1, target.shortestPathBinaryMatrix(new int[][]{{0}}));
  }

  @Test
  public void testTwoByTwo() {
    assertEquals(2, target.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}}));
    assertEquals(2, target.shortestPathBinaryMatrix(new int[][]{{0, 0}, {0, 0}}));
    assertEquals(-1, target.shortestPathBinaryMatrix(new int[][]{{1, 0}, {0, 0}}));
    assertEquals(-1, target.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 1}}));
  }

  @Test
  public void testThreeByThree() {
    assertEquals(-1, target.shortestPathBinaryMatrix(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    assertEquals(-1, target.shortestPathBinaryMatrix(new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    assertEquals(3, target.shortestPathBinaryMatrix(new int[][]{{0, 1, 1}, {1, 0, 1}, {1, 1, 0}}));
    assertEquals(4, target.shortestPathBinaryMatrix(new int[][]{{0, 0, 1}, {1, 1, 0}, {1, 1, 0}}));
    assertEquals(4, target.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
  }

  @Test
  public void testBackwardsNonsense() {
    assertEquals(14, target.shortestPathBinaryMatrix(new int[][]
      {
        {0, 1, 1, 0, 0, 0},
        {0, 1, 0, 1, 1, 0},
        {0, 1, 1, 0, 1, 0},
        {0, 0, 0, 1, 1, 0},
        {1, 1, 1, 1, 1, 0},
        {1, 1, 1, 1, 1, 0}
      }));
  }
}
