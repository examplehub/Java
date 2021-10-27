package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSumII {
  private static List<List<Integer>> result = new ArrayList<>();
  private static List<Integer> path = new ArrayList<>();
  public static List<List<Integer>> doSolution1(TreeNode root, int targetNum) {
    deepFirstSearch(root, targetNum);
    return result;
  }

  private static void deepFirstSearch(TreeNode root, int targetNum) {
    if (root == null) {
      return;
    }
    path.add(root.val);
    targetNum -= root.val;
    if (root.left == null && root.right == null && targetNum == 0) {
      result.add(new ArrayList<>(path));
    }
    deepFirstSearch(root.left, targetNum);
    deepFirstSearch(root.right, targetNum);
    path.remove(path.size() - 1);
  }
}
