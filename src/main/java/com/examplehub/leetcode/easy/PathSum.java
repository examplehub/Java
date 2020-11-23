package com.examplehub.leetcode.easy;

import com.examplehub.datastructures.binarytree.Node;

public class PathSum {
  public static boolean solution1(Node<Integer> node, int sum) {
    if (node == null) {
      return false;
    }
    if (node.value == sum && node.left == null && node.right == null) {
      return true;
    }
    return solution1(node.left, sum - node.value) || solution1(node.right, sum - node.value);
  }
}
