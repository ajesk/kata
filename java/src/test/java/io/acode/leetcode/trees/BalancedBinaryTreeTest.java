package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeTest {
  BalancedBinaryTree target = new BalancedBinaryTree();

  @Test
  void testBasic() {
    assertTrue(target.isBalanced(new TreeNode()));
  }

  @Test
  void test2Levels() {
    assertTrue(target.isBalanced(new TreeNode(1, new TreeNode(2), null)));
    assertTrue(target.isBalanced(new TreeNode(1, null, new TreeNode(3))));
    assertTrue(target.isBalanced(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
  }

  @Test
  void test3Levels() {
    assertFalse(target.isBalanced(
      new TreeNode(1,
        new TreeNode(2,
          new TreeNode(3),
          null),
        null)));
    ;
    assertTrue(target.isBalanced(
      new TreeNode(1,
        new TreeNode(2,
          new TreeNode(3),
          null),
        new TreeNode(4))));
  }

  @Test
  void testLeetExample() {
    assertFalse(target.isBalanced(
        new TreeNode(1,
          new TreeNode(2,
            new TreeNode(3,
              new TreeNode(4),
              new TreeNode(4)),
            new TreeNode(3)),
          new TreeNode(2))
      )
    );
  }
}
