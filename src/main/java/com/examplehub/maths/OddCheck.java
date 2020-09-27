package com.examplehub.maths;

public class OddCheck {

    /**
     * Check if a number is odd or not using modulus operator.
     *
     * @param number the number to be checked.
     * @return {@code true} if the given number is odd, otherwise {@code false}.
     */
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    /**
     * Check if a number is odd or not using & operator.
     *
     * @param number the number to be checked.
     * @return {@code true} if the given number is odd, otherwise {@code false}.
     */
    public static boolean isOddFaster(int number) {
        return (number & 1) != 0;
    }
}
