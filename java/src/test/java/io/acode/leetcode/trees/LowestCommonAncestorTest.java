package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LowestCommonAncestorTest {
  LowestCommonAncestor target = new LowestCommonAncestor();

  @Test
  public void testBasic() {
    TreeNode node = new TreeNode(1);

    assertEquals(node, target.lowestCommonAncestor(node, node, node));
    assertNull(target.lowestCommonAncestor(null, null, null));
  }

  @Test
  public void testWithTwoValues() {
    TreeNode childTest = new TreeNode(2);
    TreeNode test1 = new TreeNode(1, new TreeNode(2), null);
    TreeNode test2 = new TreeNode(1, null, new TreeNode(2));

    assertEquals(test1, target.lowestCommonAncestor(test1, childTest, test1));
    assertEquals(test2, target.lowestCommonAncestor(test2, test2, childTest));
  }

  @Test
  public void testWhereChildrenAreDirectDescendents() {
    TreeNode child1 = new TreeNode(2);
    TreeNode child2 = new TreeNode(3);
    TreeNode test = new TreeNode(1, child1, child2);

    assertEquals(test, target.lowestCommonAncestor(test, child1, child2));
  }

  @Test
  public void testLeetcode() {
    TreeNode child1 = new TreeNode(5);
    TreeNode child2 = new TreeNode(4);
    TreeNode root = new TreeNode(3,
      new TreeNode(5,
        new TreeNode(6),
        new TreeNode(2,
          new TreeNode(7),
          new TreeNode(4))
      ),
      new TreeNode(1,
        new TreeNode(0),
        new TreeNode(8)));

    assertEquals(child1.val, target.lowestCommonAncestor(root, child1, child2).val);

  }
}
