package com.examplehub.leetcode.easy;

import com.examplehub.datastructures.binarytree.Node;
import com.examplehub.leetcode.TreeNode;

/** https://leetcode.com/problems/path-sum/ */
public class PathSum {
  public static boolean solution1(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.val == sum && root.left == null && root.right == null) {
      return true;
    }
    return solution1(root.left, sum - root.val) || solution1(root.right, sum - root.val);
  }
}
