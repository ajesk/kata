package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructFromInOrderPreOrderTest {

  ConstructFromInOrderPreOrder target = new ConstructFromInOrderPreOrder();

  @Test
  public void basicTest() {
    int[] preOrder = new int[]{1};
    int[] inOrder = new int[]{1};

    assertEquals(new TreeNode(1).toString(), target.buildTree(preOrder, inOrder).toString());
  }

  @Test
  public void testTwoValues() {
    int[] preOrder = new int[]{1, 2};
    int[] inOrder = new int[]{2, 1};

    assertEquals(new TreeNode(1, new TreeNode(2), null), target.buildTree(preOrder, inOrder));
  }

  @Test
  public void testThreeValuesRightSide() {
    int[] preOrder = new int[]{1, 2, 3};
    int[] inOrder = new int[]{2, 1, 3};

    assertEquals(new TreeNode(1, new TreeNode(2),
        new TreeNode(3)),
      target.buildTree(preOrder, inOrder));
  }

  @Test
  public void leetCodeTest() {
    int[] preOrder = new int[]{3, 9, 20, 15, 7};
    int[] inOrder = new int[]{9, 3, 15, 20, 7};

    TreeNode expectedResult =
      new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20,
          new TreeNode(15),
          new TreeNode(7)));
    assertEquals(expectedResult, target.buildTree(preOrder, inOrder));
  }

  @Test
  public void leetCodeTest2() {
    int[] preOrder = new int[]{3,1,2,4};
    int[] inOrder = new int[]{1,2,3,4};

    assertEquals(new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4)),
      target.buildTree(preOrder, inOrder));
  }
}
