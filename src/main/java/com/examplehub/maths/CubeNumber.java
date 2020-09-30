package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Cube_(algebra)
 */
public class CubeNumber {

    /**
     * Test if a number is cube number or not.
     *
     * @param number the number to checked.
     * @return {@code true} if given {@code number} is cube number, otherwise {@code false}.
     */
    public static boolean isCubeNumber(int number) {
        number = Math.abs(number);
        for (int i = 0; i <= number; ++i) {
            if (i * i * i == number) {
                return true;
            }
        }
        return false;
    }
}
