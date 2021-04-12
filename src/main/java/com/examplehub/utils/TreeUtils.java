package com.examplehub.utils;

import com.examplehub.leetcode.TreeNode;

public class TreeUtils {
  public static TreeNode createBST(int... numbers) {
    TreeNode root = null;
    for (int number : numbers) {
      root = insertBST(root, number);
    }
    return root;
  }

  public static TreeNode insertBST(TreeNode root, int number) {
    if (root == null) {
      root = new TreeNode(number);
    } else if (number < root.val) {
      root.left = insertBST(root.left, number);
    } else {
      root.right = insertBST(root.right, number);
    }
    return root;
  }
}
