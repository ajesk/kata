package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;

import java.util.*;

public class SerializeAndDeserialize {
  public String serialize(TreeNode root) {
    return String.join(",",serializeHelper(root));
  }

  public List<String> serializeHelper(TreeNode root) {
    if (root == null) return Collections.singletonList("#");

    List<String> list = new ArrayList<>();
    list.add(String.valueOf(root.val));
    list.addAll(serializeHelper(root.left));
    list.addAll(serializeHelper(root.right));
    return list;
  }

  // Decodes your encoded data to tree.
  int index = 0;
  public TreeNode deserialize(String data) {
    return deserialize(data.split(","));
  }

  public TreeNode deserialize(String[] arr) {
    if(arr[index].equals("#"))
      return null;
    TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
    index++;
    root.left = deserialize(arr);
    index++;
    root.right = deserialize(arr);
    return root;
  }
}
