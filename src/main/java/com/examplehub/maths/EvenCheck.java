package com.examplehub.maths;

public class EvenCheck {

    /**
     * Check if a number is even or not using modulus operator.
     *
     * @param number the number to be checked.
     * @return {@code true} if the given number is even, otherwise {@code false}.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Check if a number is even or not using & operator.
     *
     * @param number the number to be checked.
     * @return {@code true} if the given number is even, otherwise {@code false}.
     */
    public static boolean isEvenFaster(int number) {
        return (number & 1) == 0;
    }
}
