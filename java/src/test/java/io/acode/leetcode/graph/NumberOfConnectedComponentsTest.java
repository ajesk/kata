package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfConnectedComponentsTest {

  NumberOfConnectedComponents target = new NumberOfConnectedComponents();
  @Test
  public void testBasic() {
    assertEquals(1, target.countComponents(1, new int[][]{}));
  }

  @Test
  public void testTwoNodesUnconnected() {
    assertEquals(2, target.countComponents(2, new int[][]{}));
  }

  @Test
  public void testTwoNodesConnected() {
    assertEquals(1, target.countComponents(2, new int[][]{{0,1}}));
  }
}
