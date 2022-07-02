package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBinarySearchTreeTest {
  ValidateBinarySearchTree target = new ValidateBinarySearchTree();

  @Test
  void testBasic() {
    assertTrue(target.isValidBST(new TreeNode(1)));
    assertTrue(target.isValidBST(null));
  }

  @Test
  void testSingleNodeLessThan() {
    assertTrue(target.isValidBST(new TreeNode(2, new TreeNode(1), null)));
    assertFalse(target.isValidBST(new TreeNode(2, null, new TreeNode(1))));
  }

  @Test
  void testDoubleNode() {
    assertTrue(target.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    assertFalse(target.isValidBST(new TreeNode(2, new TreeNode(3), new TreeNode(1))));
  }

  @Test
  void testHiddenNodeScenario() {
    assertFalse(target.isValidBST(new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode(6)), null)));
    assertFalse(target.isValidBST(new TreeNode(3, null, new TreeNode(4, new TreeNode(2), null))));
  }

  @Test
  void testLeet() {
    assertFalse(target.isValidBST(new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
  }

  @Test
  void leetFailure() {
    assertTrue(target.isValidBST(new TreeNode(-2147483648, null, new TreeNode(2147483647))));
    assertFalse(target.isValidBST(new TreeNode(2, new TreeNode(2), new TreeNode(2))));
  }

  @Test
  void testBasic2() {
    assertTrue(target.isValidBST2(new TreeNode(1)));
    assertTrue(target.isValidBST2(null));
  }

  @Test
  void testSingleNodeLessThan2() {
    assertTrue(target.isValidBST2(new TreeNode(2, new TreeNode(1), null)));
    assertFalse(target.isValidBST2(new TreeNode(2, null, new TreeNode(1))));
  }

  @Test
  void testDoubleNode2() {
    assertTrue(target.isValidBST2(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    assertFalse(target.isValidBST2(new TreeNode(2, new TreeNode(3), new TreeNode(1))));
  }

  @Test
  void testHiddenNodeScenario2() {
    assertFalse(target.isValidBST2(new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode(6)), null)));
    assertFalse(target.isValidBST2(new TreeNode(3, null, new TreeNode(4, new TreeNode(2), null))));
  }

  @Test
  void testLeet2() {
    assertFalse(target.isValidBST2(new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
  }

  @Test
  void leetFailure2() {
    assertTrue(target.isValidBST2(new TreeNode(-2147483648, null, new TreeNode(2147483647))));
    assertFalse(target.isValidBST2(new TreeNode(2, new TreeNode(2), new TreeNode(2))));
  }
}
