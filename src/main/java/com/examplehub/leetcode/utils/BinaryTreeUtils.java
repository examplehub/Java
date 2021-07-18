package com.examplehub.leetcode.utils;

import com.examplehub.leetcode.TreeNode;

public class BinaryTreeUtils {
  public static TreeNode createTree(int[] nodes, int i) {
    int numberOfNodes = nodes.length;
    if (i >= numberOfNodes || nodes[i] == -1) {
      return null;
    }
    TreeNode root = new TreeNode(nodes[i]);
    root.left = createTree(nodes, i * 2 + 1);
    root.right = createTree(nodes, i * 2 + 2);
    return root;
  }
}
