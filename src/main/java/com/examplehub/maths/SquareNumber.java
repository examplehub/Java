package com.examplehub.maths;

public class SquareNumber {

    /**
     * Test if a number is square number or not.
     *
     * @param number the number to checked.
     * @return {@code true} if given {@code number} is square number, otherwise {@code false}.
     */
    public static boolean isSquareNumber(int number) {
        return number >= 0 && (int) Math.sqrt(number) * (int) Math.sqrt(number) == number;
    }
}
