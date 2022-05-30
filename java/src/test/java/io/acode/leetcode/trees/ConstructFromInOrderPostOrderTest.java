package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructFromInOrderPostOrderTest {

  ConstructFromInOrderPostOrder target = new ConstructFromInOrderPostOrder();

  @Test
  public void basicTest() {
    int[] inOrder = new int[]{1};
    int[] postOrder = new int[]{1};

    assertEquals(new TreeNode(1).toString(), target.buildTree(inOrder, postOrder).toString());
  }

  @Test
  public void testTwoValues() {
    int[] inOrder = new int[]{1, 2};
    int[] postOrder = new int[]{2, 1};

    assertEquals(new TreeNode(1, null, new TreeNode(2)), target.buildTree(inOrder, postOrder));
  }

  @Test
  public void testThreeValuesRightSide() {
    int[] inOrder = new int[]{2, 1, 3};
    int[] postOrder = new int[]{2, 3, 1};

    assertEquals(new TreeNode(1, new TreeNode(2),
        new TreeNode(3)),
      target.buildTree(inOrder, postOrder));
  }

  @Test
  public void leetCodeTest() {
    int[] inOrder = new int[]{9, 3, 15, 20, 7};
    int[] postOrder = new int[]{9, 15, 7, 20, 3};

    TreeNode expectedResult =
      new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20,
          new TreeNode(15),
          new TreeNode(7)));
    assertEquals(expectedResult, target.buildTree(inOrder, postOrder));
  }

  @Test
  public void leetCodeTest2() {
    int[] inOrder = new int[]{1,2,3,4};
    int[] postOrder = new int[]{2,1,4,3};

    assertEquals(new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4)),
      target.buildTree(inOrder, postOrder));
  }
}
