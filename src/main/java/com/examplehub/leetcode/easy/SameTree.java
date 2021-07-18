package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;

/** https://leetcode.com/problems/same-tree/ */
public class SameTree {
  public static boolean solution1(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val != q.val) {
      return false;
    }
    return solution1(p.left, q.left) && solution1(p.right, q.right);
  }
}
