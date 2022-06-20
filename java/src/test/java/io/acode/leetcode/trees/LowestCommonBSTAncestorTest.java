package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LowestCommonBSTAncestorTest {
  LowestCommonBSTAncestor target = new LowestCommonBSTAncestor();

  @Test
  void testBasic() {
    TreeNode node = new TreeNode(1);

    assertEquals(node, target.lowestCommonAncestor(node, node, node));
    assertNull(target.lowestCommonAncestor(null, null, null));
  }

  @Test
  void testSingleDescendant() {
    TreeNode root = new TreeNode(2, new TreeNode(1), null);
    assertEquals(root, target.lowestCommonAncestor(root, root, root.left));
  }

  @Test
  void testWhereChildrenAreDirectDescendants() {
    TreeNode child1 = new TreeNode(1);
    TreeNode child2 = new TreeNode(3);
    TreeNode test = new TreeNode(2, child1, child2);

    assertEquals(test, target.lowestCommonAncestor(test, child1, child2));
  }

  @Test
  void testWhereParentIsAnAncestor() {
    TreeNode child1 = new TreeNode(1);
    TreeNode child2 = new TreeNode(3);
    TreeNode test = new TreeNode(2, child1, child2);

    assertEquals(test, target.lowestCommonAncestor(test, test, child1));
  }

  @Test
  void testLeetcode() {
    TreeNode child1 = new TreeNode(2,
      new TreeNode(0),
      new TreeNode(4,
        new TreeNode(3),
        new TreeNode(5)));
    TreeNode child2 = new TreeNode(8,
      new TreeNode(7),
      new TreeNode(9));
    TreeNode root = new TreeNode(6,
      child1,
      child2);

    assertEquals(root, target.lowestCommonAncestor(root, child1, child2));
  }

  @Test
  void testLeetcode2() {
    TreeNode child3 = new TreeNode(4,
      new TreeNode(3),
      new TreeNode(5));
    TreeNode child1 = new TreeNode(2,
      new TreeNode(0),
      child3);
    TreeNode child2 = new TreeNode(8,
      new TreeNode(7),
      new TreeNode(9));
    TreeNode root = new TreeNode(6,
      child1,
      child2);

    assertEquals(child1, target.lowestCommonAncestor(root, child1, child3));
  }
}
