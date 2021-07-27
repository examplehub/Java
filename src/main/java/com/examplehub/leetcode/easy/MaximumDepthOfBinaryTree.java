package com.examplehub.leetcode.easy;

import com.examplehub.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    public static int solution1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = solution1(root.left);
        int rightHeight = solution1(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int solution2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int answer = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                assert node != null;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            answer++;
        }
        return answer;
    }
}
