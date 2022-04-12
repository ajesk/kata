package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.TreeNode;

import java.util.Arrays;

public class ConstructFromInOrderPreOrder {
  private int indexOf(int[] arr, int num) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) return i;
    }
    throw new RuntimeException();
  }

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (inorder.length == 0) return null;
    if (inorder.length == 1) return new TreeNode(inorder[0]);

    int top = preorder[0];
    int inOrderPivot = indexOf(inorder, top);

    int[] leftIn = Arrays.copyOfRange(inorder, 0, inOrderPivot);
    int[] leftPre = Arrays.copyOfRange(preorder, 1, inOrderPivot + 1);
    int[] rightIn = Arrays.copyOfRange(inorder, inOrderPivot + 1, inorder.length);
    int[] rightPre = Arrays.copyOfRange(preorder, inOrderPivot + 1, preorder.length);

    return new TreeNode(top, buildTree(leftPre, leftIn), buildTree(rightPre, rightIn));
  }
}
