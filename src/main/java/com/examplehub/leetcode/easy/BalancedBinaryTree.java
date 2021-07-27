package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    public static boolean solution1(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(MaximumDepthOfBinaryTree.solution1(root.left) - MaximumDepthOfBinaryTree.solution1(root.right)) <= 1 && solution1(root.left) && solution1(root.right);
    }
}
