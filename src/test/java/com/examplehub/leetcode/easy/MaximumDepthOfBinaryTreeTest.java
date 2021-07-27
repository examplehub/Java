package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;
import com.examplehub.leetcode.utils.BinaryTreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {
    @Test
    void testSolution1() {
        TreeNode root = BinaryTreeUtils.createTree(new int[]{3, 9, 20, -1, -1, 15, 7}, 0);
        assertEquals(3, MaximumDepthOfBinaryTree.solution1(root));

        root = BinaryTreeUtils.createTree(new int[]{}, 0);
        assertEquals(0, MaximumDepthOfBinaryTree.solution1(root));

        root = BinaryTreeUtils.createTree(new int[]{1, -1, 2}, 0);
        assertEquals(2, MaximumDepthOfBinaryTree.solution1(root));

        root = BinaryTreeUtils.createTree(new int[]{0}, 0);
        assertEquals(1, MaximumDepthOfBinaryTree.solution1(root));
    }

    @Test
    void testSolution2() {
        TreeNode root = BinaryTreeUtils.createTree(new int[]{3, 9, 20, -1, -1, 15, 7}, 0);
        assertEquals(3, MaximumDepthOfBinaryTree.solution2(root));

//        root = BinaryTreeUtils.createTree(new int[]{}, 0);
//        assertEquals(0, MaximumDepthOfBinaryTree.solution2(root));
//
//        root = BinaryTreeUtils.createTree(new int[]{1, -1, 2}, 0);
//        assertEquals(2, MaximumDepthOfBinaryTree.solution2(root));
//
//        root = BinaryTreeUtils.createTree(new int[]{0}, 0);
//        assertEquals(1, MaximumDepthOfBinaryTree.solution2(root));
    }

}