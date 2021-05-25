package com.examplehub.leetcode.easy;

import com.examplehub.maths.ProductOfArray;

/**
 * https://leetcode.com/problems/sign-of-the-product-of-an-array/
 */
public class SignOfTheProductOfAnArray {
    public static int solution1(int... nums) {
        return Integer.compare(ProductOfArray.product(nums), 0);
    }

    public static int solution2(int... nums) {
        int result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            int sign = num < 0 ? -1 : 1;
            result = result * sign;
        }
        return Integer.compare(result, 0);
    }
}
