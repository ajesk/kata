package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSumTest {
  PathSum pathSum = new PathSum();

  @Test
  public void basicNegativeTests() {
    assertFalse(pathSum.hasPathSum(new TreeNode(), 1));
    assertFalse(pathSum.hasPathSum(null, 1));
    assertFalse(pathSum.hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
  }

  @Test
  public void basicPositive() {
    assertTrue(pathSum.hasPathSum(new TreeNode(1), 1));
    assertTrue(pathSum.hasPathSum(new TreeNode(5,
      new TreeNode(4,
        new TreeNode(11,
          new TreeNode(7),
          new TreeNode(2)), null),
      new TreeNode(8,
        new TreeNode(13),
        new TreeNode(4,
          null,
          new TreeNode(1)))), 22));
  }

  @Test
  public void shouldBeFalseWhenOnlyTheRootEquals() {
    assertFalse(pathSum.hasPathSum(new TreeNode(1, new TreeNode(2), null), 1));

  }
}
