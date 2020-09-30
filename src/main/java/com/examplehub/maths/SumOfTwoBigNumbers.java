package com.examplehub.maths;

import java.math.BigDecimal;

public class SumOfTwoBigNumbers {

    /**
     * Calculate sum of two big numbers.
     *
     * @param s1 the first number.
     * @param s2 the second number.
     * @return sum of the given two numbers.
     */
    public static String sum(String s1, String s2) {
        BigDecimal numberOne = new BigDecimal(s1);
        BigDecimal numberTwo = new BigDecimal(s2);
        BigDecimal sum = numberOne.add(numberTwo);
        return sum.toString();
    }

    /**
     * Calculate sum of two big numbers manually.
     *
     * @param s1 the first number.
     * @param s2 the second number.
     * @return sum of the given two numbers.
     */
    public static String sumOf(String s1, String s2) {
        char[] bytes1 = s1.toCharArray();
        char[] bytes2 = s2.toCharArray();
        int i1 = bytes1.length - 1;
        int i2 = bytes2.length - 1;
        int carry = 0;

        StringBuilder builder = new StringBuilder();
        while (i1 >= 0 || i2 >= 0) {
            int sum = carry + (i1 != -1 ? bytes1[i1] - '0' : 0) + (i2 != -1 ? bytes2[i2] - '0' : 0);
            carry = sum / 10;
            builder.append(sum % 10);
            System.out.println(i1 + ":" + i2);
            if (i1 >= 0) {
                i1--;
            }
            if (i2 >= 0) {
                i2--;
            }
        }
        return carry != 0 ? builder.append(carry).reverse().toString() : builder.reverse().toString();
    }
}
