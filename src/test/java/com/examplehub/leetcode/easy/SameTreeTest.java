package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.leetcode.utils.BinaryTreeUtils;
import org.junit.jupiter.api.Test;

class SameTreeTest {
  @Test
  void testSolution1() {
    TreeNode firstTree = BinaryTreeUtils.createTree(new int[] {1, 2, 3}, 0);
    TreeNode secondTree = BinaryTreeUtils.createTree(new int[] {1, 2, 3}, 0);
    assertTrue(SameTree.solution1(firstTree, secondTree));

    firstTree = BinaryTreeUtils.createTree(new int[] {1, 2}, 0);
    secondTree = BinaryTreeUtils.createTree(new int[] {1, -1, 2}, 0);
    assertFalse(SameTree.solution1(firstTree, secondTree));

    firstTree = BinaryTreeUtils.createTree(new int[] {1, 2, 1}, 0);
    secondTree = BinaryTreeUtils.createTree(new int[] {1, 1, 2}, 0);
    assertFalse(SameTree.solution1(firstTree, secondTree));

    assertFalse(SameTree.solution1(null, firstTree));
    assertFalse(SameTree.solution1(null, secondTree));
  }
}
