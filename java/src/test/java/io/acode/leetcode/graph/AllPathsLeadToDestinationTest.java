package io.acode.leetcode.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AllPathsLeadToDestinationTest {
  AllPathsLeadToDestination target = new AllPathsLeadToDestination();

  @Test
  public void testBasic() {
    assertTrue(target.leadsToDestination(1, new int[][]{}, 0, 0));
  }

  @Test
  public void testSimpleTwoNode() {
    assertTrue(target.leadsToDestination(2, new int[][]{{0, 1}}, 0, 1));
    assertFalse(target.leadsToDestination(2, new int[][]{{0, 1}}, 1, 0));
  }

  @Test
  public void testThreeNodeTree() {
    assertFalse(target.leadsToDestination(3, new int[][]{{0, 1}, {0, 2}}, 0, 1));
    assertFalse(target.leadsToDestination(3, new int[][]{{0, 1}, {0, 2}}, 0, 2));
    assertFalse(target.leadsToDestination(3, new int[][]{{0, 1}, {0, 2}}, 2, 1));
  }

  @Test
  public void testLeetFourNodeTwoWayCycle() {
    assertFalse(target.leadsToDestination(4, new int[][]{{0, 1}, {0, 3}, {1, 2}, {2, 1}}, 0, 3));
  }

  @Test
  public void testLeetAllDestinations() {
    assertTrue(target.leadsToDestination(4, new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}}, 0, 3));
  }

  @Test
  public void testLeetFail() {
    assertFalse(target.leadsToDestination(2, new int[][]{{0, 1}, {1, 1}}, 0, 1));
  }

  @Test
  public void testLeetFail2() {
    assertTrue(target.leadsToDestination(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 3}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}, 0, 4));
  }
}
