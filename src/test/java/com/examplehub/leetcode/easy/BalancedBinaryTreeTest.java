package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.leetcode.utils.BinaryTreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {
    @Test
    void testSolution1() {
        TreeNode root = BinaryTreeUtils.createTree(new int[]{3, 9, 20, -1, -1, 15, 7}, 0);
        assertTrue(BalancedBinaryTree.solution1(root));

        root = BinaryTreeUtils.createTree(new int[]{1, 2, 2, 3, 3, -1, -1, 4, 4}, 0);
        assertFalse(BalancedBinaryTree.solution1(root));

        root = BinaryTreeUtils.createTree(new int[]{}, 0);
        assertTrue(BalancedBinaryTree.solution1(root));

    }
}