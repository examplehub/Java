package com.examplehub.maths;

public class GetTheFirstDigit {

    /**
     * Get the first digit of a number.
     *
     * @param number the number to be checked.
     * @return the first digit of given number.
     */
    public static int firstDigit(int number) {
        number = Math.abs(number);
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }

    /**
     * Get the first digit of a number using string.
     *
     * @param number the number to be checked.
     * @return the first digit of given number.
     */
    public static int firstDigitByString(int number) {
        number = Math.abs(number);
        return Integer.parseInt(("" + number).substring(0, 1));
    }
}
