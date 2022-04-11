package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.TreeNode;

import java.util.Arrays;

public class ConstructFromInOrderPostOrder {
  private int indexOf(int[] arr, int num) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) return i;
    }
    throw new RuntimeException();
  }

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    if (inorder.length == 0) return null;
    if (inorder.length == 1) return new TreeNode(inorder[0]);

    int top = postorder[postorder.length - 1];
    int inOrderPivot = indexOf(inorder, top);

    int[] leftIn = Arrays.copyOfRange(inorder, 0, inOrderPivot);
    int[] leftPost = Arrays.copyOfRange(postorder, 0, inOrderPivot);
    int[] rightIn = Arrays.copyOfRange(inorder, inOrderPivot + 1, inorder.length);
    int[] rightPost = Arrays.copyOfRange(postorder, inOrderPivot, postorder.length - 1);

    return new TreeNode(top, buildTree(leftIn, leftPost), buildTree(rightIn, rightPost));
  }
}
