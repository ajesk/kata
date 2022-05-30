package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelOrderTraversalTest {
  BinaryTreeLevelOrderTraversal target = new BinaryTreeLevelOrderTraversal();

  @Test
  public void testBasic() {
    TreeNode testNode = new TreeNode(1);
    assertEquals(List.of(List.of(1)), target.levelOrder(testNode));
  }

  @Test
  public void test2Layers() {
    TreeNode testNode = new TreeNode(1, new TreeNode(2), null);
    TreeNode testNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    assertEquals(List.of(List.of(1), List.of(2)), target.levelOrder(testNode));
    assertEquals(List.of(List.of(1), List.of(2, 3)), target.levelOrder(testNode2));
  }

  @Test
  public void testNull() {
    assertEquals(List.of(), target.levelOrder(null));
  }
}
