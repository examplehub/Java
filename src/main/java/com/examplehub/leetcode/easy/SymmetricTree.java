package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.strings.PalindromeString;
import java.util.List;

/** https://leetcode.com/problems/symmetric-tree/ */
public class SymmetricTree {
  public static boolean solution1(TreeNode root) {
    List<Integer> inOrderPath = BinaryTreeInorderTraversal.solution1(root);
    StringBuilder builder = new StringBuilder();
    for (Integer number : inOrderPath) {
      builder.append(number);
    }
    return PalindromeString.isPalindrome(builder.toString());
  }

  public static boolean doSolution2(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    if (left.val != right.val) {
      return false;
    }
    return doSolution2(left.left, right.right) && doSolution2(left.right, right.left);
  }

  public static boolean solution2(TreeNode root) {
    if (root == null) {
      return true;
    }
    return doSolution2(root.left, root.right);
  }
}
