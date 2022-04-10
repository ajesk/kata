package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.trees.BinaryTreePreorderedTraversal;
import io.acode.leetcode.datastructures.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreePreorderedTraversalTest {
  BinaryTreePreorderedTraversal target = new BinaryTreePreorderedTraversal();

  @Test
  public void testBasic() {
    TreeNode node = new TreeNode(1);

    assertEquals(List.of(1), target.preorderTraversal(node));
  }

  @Test
  public void testWithSingularChild() {
    TreeNode node1 = new TreeNode(1, new TreeNode(2), null);
    TreeNode node2 = new TreeNode(1, null, new TreeNode(3));

    assertEquals(List.of(1, 2), target.preorderTraversal(node1));
    assertEquals(List.of(1, 3), target.preorderTraversal(node2));
  }

  @Test
  public void testWithBothChildren() {
    TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    assertEquals(List.of(1, 2, 3), target.preorderTraversal(node));
  }

  @Test
  public void testMultiDepth() {
    TreeNode node = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));

    assertEquals(List.of(1, 3, 2), target.preorderTraversal(node));
  }
}
