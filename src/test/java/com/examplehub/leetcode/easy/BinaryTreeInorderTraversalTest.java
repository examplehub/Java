package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.leetcode.utils.BinaryTreeUtils;
import org.junit.jupiter.api.Test;

class BinaryTreeInorderTraversalTest {
  @Test
  void testSolution1() {
    TreeNode root = BinaryTreeUtils.createTree(new int[] {1, -1, 2, -1, -1, 3}, 0);
    assertEquals("[1, 3, 2]", BinaryTreeInorderTraversal.solution1(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {}, 0);
    assertEquals("[]", BinaryTreeInorderTraversal.solution1(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {1}, 0);
    assertEquals("[1]", BinaryTreeInorderTraversal.solution1(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {1, 2}, 0);
    assertEquals("[2, 1]", BinaryTreeInorderTraversal.solution1(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {1, -1, 2}, 0);
    assertEquals("[1, 2]", BinaryTreeInorderTraversal.solution1(root).toString());
  }

  @Test
  void testSolution2() {
    TreeNode root = BinaryTreeUtils.createTree(new int[] {1, -1, 2, -1, -1, 3}, 0);
    assertEquals("[1, 3, 2]", BinaryTreeInorderTraversal.solution2(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {}, 0);
    assertEquals("[]", BinaryTreeInorderTraversal.solution2(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {1}, 0);
    assertEquals("[1]", BinaryTreeInorderTraversal.solution2(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {1, 2}, 0);
    assertEquals("[2, 1]", BinaryTreeInorderTraversal.solution2(root).toString());

    root = BinaryTreeUtils.createTree(new int[] {1, -1, 2}, 0);
    assertEquals("[1, 2]", BinaryTreeInorderTraversal.solution2(root).toString());
  }
}
