package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/n-th-tribonacci-number/
 */
public class NthTribonacciNumber {
    public static int solution1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return solution1(n - 1) + solution1(n - 2) + solution1(n - 3);
        }
    }
}
