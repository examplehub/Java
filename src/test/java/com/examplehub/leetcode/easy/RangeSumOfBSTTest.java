package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.utils.TreeUtils;
import org.junit.jupiter.api.Test;

class RangeSumOfBSTTest {
  @Test
  void testSolution1() {
    TreeNode root = TreeUtils.createBST(10, 5, 15, 3, 7, 13, 18, 1, 6);
    assertEquals(23, RangeSumOfBST.solution1(root, 6, 10));

    root = TreeUtils.createBST(10, 5, 15, 3, 7, 18);
    assertEquals(32, RangeSumOfBST.solution1(root, 7, 15));
  }

  @Test
  void testSolution2() {
    TreeNode root = TreeUtils.createBST(10, 5, 15, 3, 7, 13, 18, 1, 6);
    assertEquals(23, RangeSumOfBST.solution2(root, 6, 10));

    root = TreeUtils.createBST(10, 5, 15, 3, 7, 18);
    assertEquals(32, RangeSumOfBST.solution2(root, 7, 15));
  }
}
