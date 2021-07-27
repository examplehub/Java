package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;
import java.util.*;

public class BinaryTreeInorderTraversal {

  public static void inOrder(TreeNode root, List<Integer> inOrderPath) {
    if (root != null) {
      inOrder(root.left, inOrderPath);
      inOrderPath.add(root.val);
      inOrder(root.right, inOrderPath);
    }
  }

  public static List<Integer> solution1(TreeNode root) {
    List<Integer> inOrderPath = new ArrayList<>();
    inOrder(root, inOrderPath);
    return inOrderPath;
  }

  public static List<Integer> solution2(TreeNode root) {
    List<Integer> inOrderPath = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while (cur != null || !stack.isEmpty()) {
      while (cur != null) {
        stack.push(cur);
        cur = cur.left;
      }
      cur = stack.pop();
      inOrderPath.add(cur.val);
      cur = cur.right;
    }
    return inOrderPath;
  }
}
