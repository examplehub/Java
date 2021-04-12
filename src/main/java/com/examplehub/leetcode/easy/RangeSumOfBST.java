package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumOfBST {

    public static int solution1(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        } else {
            if (root.val >= low && root.val <= high) {
                return root.val + solution1(root.left, low, high) + solution1(root.right, low, high);
            } else {
                return solution1(root.left, low, high) + solution1(root.right, low, high);
            }
        }
    }

    public static int solution2(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return solution2(root.left, low, high);
        } else if (root.val < low) {
            return solution2(root.right, low, high);
        } else {
            return root.val + solution2(root.left, low, high) + solution2(root.right, low, high);
        }
    }
}
