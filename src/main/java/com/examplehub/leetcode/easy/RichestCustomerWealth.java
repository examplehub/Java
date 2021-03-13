package com.examplehub.leetcode.easy;

import com.examplehub.maths.SumOfArray;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {
    public static int solution1(int[][] accounts) {
        int max = SumOfArray.sum(accounts[0]);
        for (int i = 1; i < accounts.length; ++i) {
            int temp = SumOfArray.sum(accounts[i]);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
