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
}
