package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.leetcode.utils.BinaryTreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @Test
    void testSolution1() {
        TreeNode root = BinaryTreeUtils.createTree(new int[]{1, 2, 2, 3, 4, 4, 3}, 0);
        assertTrue(SymmetricTree.solution1(root));
    }

    @Test
    void testSolution2() {
        TreeNode root = BinaryTreeUtils.createTree(new int[]{1, 2, 2, 3, 4, 4, 3}, 0);
        assertTrue(SymmetricTree.solution2(root));
    }
}