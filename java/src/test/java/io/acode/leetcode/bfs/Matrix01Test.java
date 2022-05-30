package io.acode.leetcode.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Matrix01Test {
  Matrix01 target = new Matrix01();

  @Test
  public void testBasic() {
    assertArrayEquals(new int[][]{{0}}, target.updateMatrix(new int[][]{{0}}));
  }

  @Test
  public void testSimpleNextTo() {
    assertArrayEquals(new int[][]{{0, 1}}, target.updateMatrix(new int[][]{{0, 1}}));
    assertArrayEquals(new int[][]{{0}, {1}}, target.updateMatrix(new int[][]{{0}, {1}}));
  }

  @Test
  public void testTwoAway() {
    assertArrayEquals(new int[][]{{0, 1, 2}}, target.updateMatrix(new int[][]{{0, 1, 1}}));
  }

  @Test
  public void testTwoDirectional() {
    assertArrayEquals(new int[][]{{0, 1}, {1, 0}}, target.updateMatrix(new int[][]{{0, 1}, {1, 0}}));
  }

  @Test
  public void test3By3SingularValue() {
    assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}},
      target.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
  }

  @Test
  public void test3By3WithT() {
    assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}},
      target.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}));
  }

  @Test
  public void testBigBoi() {
    target.updateMatrix(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},
      {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},
      {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},
      {1, 1, 1}, {0, 0, 0}});
  }
}
