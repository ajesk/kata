package io.acode.leetcode.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PathExistsInGraphBFSTest {

  PathExistsInGraphBFS target = new PathExistsInGraphBFS();

  @Test
  public void testBasic() {
    assertTrue(target.validPath(1, new int[][]{}, 0, 0));
    assertTrue(target.validPath(2, new int[][]{}, 1, 1));
  }

  @Test
  public void testTwoNodesWithoutConnection() {
    assertFalse(target.validPath(2, new int[][]{}, 0, 1));
  }

  @Test
  public void twoNodesWithConnectionShouldBeTrue() {
    assertTrue(target.validPath(2, new int[][]{{0, 1}}, 1, 0));
    assertTrue(target.validPath(2, new int[][]{{0, 1}}, 0, 1));
  }

  @Test
  public void testThreeNodesConnected() {
    assertTrue(target.validPath(3, new int[][]{{0, 1}, {1, 2}}, 0, 2));
    assertTrue(target.validPath(3, new int[][]{{0, 1}, {0, 2}}, 0, 2));
  }

  @Test
  public void testTwoDistinctGraphs() {
    assertFalse(target.validPath(3, new int[][]{{0, 1}}, 2, 0));
    assertFalse(target.validPath(3, new int[][]{{0, 1}}, 1, 2));
  }

  @Test
  public void testLeetExample() {
    assertFalse(target.validPath(6, new int[][]{{0, 1}, {0,2}, {3,5}, {5,4}, {4,3}}, 0, 5));
    assertFalse(target.validPath(6, new int[][]{{0, 1}, {0,2}, {3,5}, {5,4}, {4,3}}, 1, 3));
    assertTrue(target.validPath(6, new int[][]{{0, 1}, {0,2}, {3,5}, {5,4}, {4,3}}, 1, 2));
    assertTrue(target.validPath(6, new int[][]{{0, 1}, {0,2}, {3,5}, {5,4}, {4,3}}, 3, 5));
  }
}
