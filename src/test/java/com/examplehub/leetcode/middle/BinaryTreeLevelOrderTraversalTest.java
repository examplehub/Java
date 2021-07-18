package com.examplehub.leetcode.middle;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.leetcode.utils.BinaryTreeUtils;
import com.examplehub.utils.TreeUtils;
import org.junit.jupiter.api.Test;

class BinaryTreeLevelOrderTraversalTest {
  @Test
  void testSolution1() {
    TreeNode root = BinaryTreeUtils.createTree(new int[]{3, 9, 20, -1, -1, 15, 7}, 0);
    assertEquals("[[3], [9, 20], [15, 7]]", BinaryTreeLevelOrderTraversal.solution1(root).toString());

    root = BinaryTreeUtils.createTree(new int[]{1}, 0);
    assertEquals("[[1]]", BinaryTreeLevelOrderTraversal.solution1(root).toString());
  }
}
