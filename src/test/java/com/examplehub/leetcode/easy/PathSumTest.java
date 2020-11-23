package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.examplehub.datastructures.binarytree.Node;
import org.junit.jupiter.api.Test;

class PathSumTest {
  @Test
  void testSolution1() {
    Node<Integer> root = new Node<>(5);
    root.left = new Node<>(4);
    root.right = new Node<>(8);
    root.left.left = new Node<>(11);
    root.right.left = new Node<>(13);
    root.right.right = new Node<>(4);
    root.left.left.left = new Node<>(7);
    root.left.left.right = new Node<>(2);
    root.right.right.right = new Node<>(1);

    assertTrue(PathSum.solution1(root, 22));
    assertTrue(PathSum.solution1(root, 26));
    assertFalse(PathSum.solution1(root, 100));
  }
}
