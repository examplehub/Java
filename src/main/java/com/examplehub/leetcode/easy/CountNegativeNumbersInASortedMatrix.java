package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class CountNegativeNumbersInASortedMatrix {
    public static int solution1(int[][] grid) {
        int countNegative = 0;
        for (int[] columns : grid) {
            for (int num : columns) {
                if (num < 0) {
                    countNegative++;
                }
            }
        }
        return countNegative;
    }
}
