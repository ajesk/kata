package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvertBinaryTreeTest {
  InvertBinaryTree target = new InvertBinaryTree();

  @Test
  public void basicInvert() {
    assertNull(target.invertTree(null));
    assertEquals(new TreeNode(1), target.invertTree(new TreeNode(1)));
  }

  @Test
  public void singleChildNode() {
    assertEquals(new TreeNode(1, null, new TreeNode(2)),
      target.invertTree(new TreeNode(1, new TreeNode(2), null)));
  }

  @Test
  public void dualChildren() {
    assertEquals(new TreeNode(1, new TreeNode(3), new TreeNode(2)),
      target.invertTree(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
  }

  @Test
  public void leetCodeTest() {
    TreeNode test = new TreeNode(4,
      new TreeNode(2,
        new TreeNode(1),
        new TreeNode(3)),
      new TreeNode(7,
        new TreeNode(6),
        new TreeNode(9)));
    TreeNode result = new TreeNode(4,
      new TreeNode(7,
        new TreeNode(9),
        new TreeNode(6)),
      new TreeNode(2,
        new TreeNode(3),
        new TreeNode(1)));

    assertEquals(result, target.invertTree(test));
  }
}
