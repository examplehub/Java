package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.leetcode.utils.BinaryTreeUtils;
import org.junit.jupiter.api.Test;

class PathSumTest {
  @Test
  void testSolution1() {
    TreeNode root =
        BinaryTreeUtils.createTree(new int[] {5, 4, 8, 11, 0, 13, 4, 7, 2, 0, 0, 0, 1}, 0);
    assertTrue(PathSum.solution1(root, 22));
    assertTrue(PathSum.solution1(root, 26));
    assertFalse(PathSum.solution1(root, 100));
  }
}
