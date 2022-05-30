package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkDelayTimeTest {
  NetworkDelayTime target = new NetworkDelayTime();

  @Test
  public void testBasic() {
    assertEquals(0, target.networkDelayTime(new int[][]{}, 1, 1));
    assertEquals(-1, target.networkDelayTime(new int[][]{}, 2, 1));
    assertEquals(-1, target.networkDelayTime(new int[][]{{2, 1, 1}}, 2, 1));
  }

  @Test
  public void testSingularConnection() {
    assertEquals(1, target.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1));
  }

  @Test
  public void testThreeNodesInAChain() {
    assertEquals(2, target.networkDelayTime(new int[][]{{1, 2, 1}, {2, 3, 1}}, 3, 1));
  }

  @Test
  public void testCompetingSimplePaths() {
    assertEquals(2, target.networkDelayTime(new int[][]{{1, 2, 1}, {1, 3, 2}}, 3, 1));
    assertEquals(3, target.networkDelayTime(new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 4, 2}}, 4, 1));
  }

  @Test
  public void testDijkstasBaseLeetExample() {
    assertEquals(2, target.networkDelayTime(new int[][]{{1, 2, 1}, {1, 3, 1}, {1, 4, 3}, {2, 4, 2}, {2, 5, 1}, {3, 4, 1}, {4, 5, 2}}, 5, 1));
  }
}
