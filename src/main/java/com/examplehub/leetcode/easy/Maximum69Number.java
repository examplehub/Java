package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
public class Maximum69Number {
    public static int solution1(int num) {
        StringBuilder builder = new StringBuilder(num + "");
        int maxNumber = num;
        for (int i = 0; i < builder.length(); ++i) {
            StringBuilder copyBuilder = new StringBuilder(builder);
            builder.setCharAt(i, '9');
            int newNumber = Integer.parseInt(builder.toString());
            if ( newNumber > maxNumber) {
                maxNumber = newNumber;
            }
            builder = copyBuilder;
        }
        return maxNumber;
    }
}
