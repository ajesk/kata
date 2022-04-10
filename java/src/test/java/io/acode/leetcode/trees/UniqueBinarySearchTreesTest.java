package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.trees.UniqueBinarySearchTrees;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueBinarySearchTreesTest {
  UniqueBinarySearchTrees target = new UniqueBinarySearchTrees();

  @Test
  public void testBasic() {
    assertEquals(1, target.numTrees(1));
    assertEquals(2, target.numTrees(2));
    assertEquals(5, target.numTrees(3));
    assertEquals(14, target.numTrees(4));
    assertEquals(42, target.numTrees(5));
  }
}
