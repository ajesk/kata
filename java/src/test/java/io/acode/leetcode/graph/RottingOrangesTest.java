package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOrangesTest {
  private RottingOranges target = new RottingOranges();

  @Test
  public void testBasic() {
    assertEquals(0, target.orangesRotting(new int[][]{{0}}));
    assertEquals(0, target.orangesRotting(new int[][]{{2}}));
    assertEquals(-1, target.orangesRotting(new int[][]{{1}}));
  }

  @Test
  public void testTwoNoActions() {
    assertEquals(0, target.orangesRotting(new int[][]{{2}, {2}}));
    assertEquals(0, target.orangesRotting(new int[][]{{2}, {0}}));
    assertEquals(0, target.orangesRotting(new int[][]{{0}, {0}}));
    assertEquals(-1, target.orangesRotting(new int[][]{{1}, {0}}));
  }

  @Test
  public void testSimpleAction() {
    assertEquals(1, target.orangesRotting(new int[][]{{1}, {2}}));
    assertEquals(1, target.orangesRotting(new int[][]{{2}, {1}}));
    assertEquals(1, target.orangesRotting(new int[][]{{2, 1}}));
  }

  @Test
  public void testLeetScenario() {
    assertEquals(4, target.orangesRotting(new int[][]{
      {2, 1, 1},
      {1, 1, 0},
      {0, 1, 1}
    }));

    assertEquals(-1, target.orangesRotting(new int[][]{
      {2, 1, 1},
      {0, 1, 1},
      {1, 0, 1}
    }));
  }
}
