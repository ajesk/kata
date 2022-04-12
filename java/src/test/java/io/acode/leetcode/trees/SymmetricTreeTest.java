package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SymmetricTreeTest {
  SymmetricTree target = new SymmetricTree();

  @Test
  public void testBasic() {
    assertTrue(target.isSymmetric(null));
    assertTrue(target.isSymmetric(new TreeNode()));
    assertFalse(target.isSymmetric(new TreeNode(1, null, new TreeNode())));
    assertFalse(target.isSymmetric(new TreeNode(1,  new TreeNode(), null)));
  }

  @Test
  public void testMultiLevelEqual() {
    assertTrue(target.isSymmetric(new TreeNode(0, new TreeNode(1), new TreeNode(1))));
    assertTrue(target.isSymmetric(new TreeNode(0, new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(2)))));
    assertTrue(target.isSymmetric(new TreeNode(0, new TreeNode(1, new TreeNode(2), new TreeNode(3)), new TreeNode(1, new TreeNode(3), new TreeNode(2)))));
  }

  @Test
  public void testMultiLevelsNotEquals() {
    assertFalse(target.isSymmetric(new TreeNode(0, new TreeNode(1), new TreeNode(2))));
    assertFalse(target.isSymmetric(new TreeNode(0, new TreeNode(1, null, new TreeNode(5)), new TreeNode(1, null, new TreeNode(6)))));
  }
}
