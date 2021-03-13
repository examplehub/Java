package com.examplehub.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {
    @Test
    void test() {
        int[][] account = new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        };
        assertEquals(RichestCustomerWealth.solution1(account),6);

        account = new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        };
        assertEquals(RichestCustomerWealth.solution1(account), 10);
    }
}