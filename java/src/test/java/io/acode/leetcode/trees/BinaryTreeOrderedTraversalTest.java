package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeOrderedTraversalTest {
  BinaryTreeOrderedTraversal target = new BinaryTreeOrderedTraversal();

  @Test
  public void testBasic() {
    TreeNode node = new TreeNode(1);

    assertEquals(List.of(1), target.inorderTraversal(node));
  }

  @Test
  public void testWithSingularChild() {
    TreeNode node1 = new TreeNode(1, new TreeNode(2), null);
    TreeNode node2 = new TreeNode(1, null, new TreeNode(3));

    assertEquals(List.of(2, 1), target.inorderTraversal(node1));
    assertEquals(List.of(1, 3), target.inorderTraversal(node2));
  }

  @Test
  public void testWithBothChildren() {
    TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    assertEquals(List.of(2, 1, 3), target.inorderTraversal(node));
  }

  @Test
  public void testMultiDepth() {
    TreeNode node = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));

    assertEquals(List.of(1, 2, 3), target.inorderTraversal(node));
  }

  @Test
  public void testBasicIter() {
    TreeNode node = new TreeNode(1);

    assertEquals(List.of(1), target.inorderTraversalInterative(node));
  }

  @Test
  public void testWithSingularChildIter() {
    TreeNode node1 = new TreeNode(1, new TreeNode(2), null);
    TreeNode node2 = new TreeNode(1, null, new TreeNode(3));

    assertEquals(List.of(2, 1), target.inorderTraversalInterative(node1));
    assertEquals(List.of(1, 3), target.inorderTraversalInterative(node2));
  }

  @Test
  public void testWithBothChildrenIter() {
    TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    assertEquals(List.of(2, 1, 3), target.inorderTraversalInterative(node));
  }

  @Test
  public void testMultiDepthIter() {
    TreeNode node = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));

    assertEquals(List.of(1, 2, 3), target.inorderTraversalInterative(node));
  }
}
