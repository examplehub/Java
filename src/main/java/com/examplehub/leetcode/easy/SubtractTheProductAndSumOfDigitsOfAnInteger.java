package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static int solution1(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int remainder = n % 10;
            product *= remainder;
            sum += remainder;
            n /= 10;
        }
        return product - sum;
    }
}
