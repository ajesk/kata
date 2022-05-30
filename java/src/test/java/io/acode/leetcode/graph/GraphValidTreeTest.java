package io.acode.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphValidTreeTest {
  GraphValidTree target = new GraphValidTree();

  @Test
  public void testBasic() {
    assertTrue(target.validTree(1, new int[][]{}));
  }

  @Test
  public void testSingleConnection() {
    assertTrue(target.validTree(2, new int[][]{{0, 1}}));
  }

  @Test
  public void ifMultipleGroupsExistFalse() {
    assertFalse(target.validTree(2, new int[][]{}));
  }

  @Test
  public void shouldBeFalseWhenCycleExists() {
    assertFalse(target.validTree(3, new int[][]{{0,1},{1,2},{2,0}}));
  }
}
