package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {
  MaximumDepthOfBinaryTree target = new MaximumDepthOfBinaryTree();

  @Test
  public void basicTest() {
    assertEquals(0, target.maxDepth(null));
  }

  @Test
  public void testSingularValue() {
    assertEquals(1, target.maxDepth(new TreeNode(1)));
  }

  @Test
  public void test2Layers() {
    assertEquals(2, target.maxDepth(new TreeNode(1, new TreeNode(2), null)));
  }

  @Test
  public void testCompetingBranches() {
    assertEquals(3, target.maxDepth(new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)))));
  }
}
