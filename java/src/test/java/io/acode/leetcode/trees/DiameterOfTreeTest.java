package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterOfTreeTest {
  DiameterOfTree target = new DiameterOfTree();

  @Test
  void testBasic() {
    assertEquals(0, target.diameterOfBinaryTree(null));
    assertEquals(0, target.diameterOfBinaryTree(new TreeNode(1)));
  }

  @Test
  void testTwoNode() {
    assertEquals(1, target.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2), null)));
    assertEquals(1, target.diameterOfBinaryTree(new TreeNode(1, null, new TreeNode(2))));
  }

  @Test
  void testThreeNode() {
    assertEquals(2, target.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    assertEquals(2, target.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null)));
  }

  @Test
  void testMaxDiameterNotThroughRoot() {
    assertEquals(4, target.diameterOfBinaryTree(
        new TreeNode(1,
          new TreeNode(2,
            new TreeNode(3, new TreeNode(4), null),
            new TreeNode(5, new TreeNode(6), null)),
          null)
      )
    );
  }

  @Test
  void testLeet() {
    assertEquals(3, target.diameterOfBinaryTree(
      new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(3))
    ));
  }
}
