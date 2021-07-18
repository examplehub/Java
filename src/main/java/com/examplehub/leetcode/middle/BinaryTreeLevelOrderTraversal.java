package com.examplehub.leetcode.middle;

import com.examplehub.leetcode.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** https://leetcode.com/problems/binary-tree-level-order-traversal/ */
public class BinaryTreeLevelOrderTraversal {
  public static List<List<Integer>> solution1(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int count = queue.size();
      List<Integer> list = new ArrayList<>();
      while (count > 0) {
        TreeNode node = queue.poll();
        assert node != null;
        list.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
        count--;
      }
      result.add(list);
    }
    return result;
  }
}
