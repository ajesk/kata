package io.acode.leetcode.graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AllPathsToTargetBFSTest {
  AllPathsToTargetBFS target = new AllPathsToTargetBFS();

  @Test
  public void testBasic() {
    assertEquals(List.of(List.of(0, 1)), target.allPathsSourceTarget(new int[][]{{1}, {}}));
  }

  @Test
  public void testThreeNodes() {
    assertEquals(List.of(List.of(0, 1, 2)), target.allPathsSourceTarget(new int[][]{{1}, {2}, {}}));
  }

  @Test
  public void testThreeNodesTwoPaths() {
    assertEquals(List.of(List.of(0, 2), List.of(0, 1, 2)), target.allPathsSourceTarget(new int[][]{{1, 2}, {2}, {}}));
  }

  @Test
  public void testLeetExample1() {
    assertEquals(List.of(List.of(0, 1, 3), List.of(0, 2, 3)), target.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}}));
  }

  @Test
  public void testLeetExample2() {
    assertEquals(
      List.of(List.of(0, 4), List.of(0, 3, 4), List.of(0, 1, 4), List.of(0, 1, 3, 4), List.of(0, 1, 2, 3, 4)),
      target.allPathsSourceTarget(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}}));
  }

  @Test
  public void testFailedLeet() {
    assertEquals(List.of(List.of(0, 2, 1, 3)), target.allPathsSourceTarget(new int[][]{{2}, {3}, {1}, {}}));
  }
}
