package io.acode.leetcode;

import io.acode.leetcode.datastructures.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreePostOrderedTraversalTest {
  BinaryTreePostOrderedTraversal target = new BinaryTreePostOrderedTraversal();

  @Test
  public void testBasic() {
    TreeNode node = new TreeNode(1);

    assertEquals(List.of(1), target.postOrderTraversal(node));
  }

  @Test
  public void testWithSingularChild() {
    TreeNode node1 = new TreeNode(1, new TreeNode(2), null);
    TreeNode node2 = new TreeNode(1, null, new TreeNode(3));

    assertEquals(List.of(2, 1), target.postOrderTraversal(node1));
    assertEquals(List.of(3, 1), target.postOrderTraversal(node2));
  }

  @Test
  public void testWithBothChildren() {
    TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    assertEquals(List.of(2, 3, 1), target.postOrderTraversal(node));
  }

  @Test
  public void testMultiDepth() {
    TreeNode node = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));

    assertEquals(List.of(2, 3, 1), target.postOrderTraversal(node));
  }
}
