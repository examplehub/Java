package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Narcissistic_number
 */
public class NarcissisticNumber {

    /**
     * Test if a number is a narcissistic number.
     *
     * @param number the number to be checked.
     * @return {@code true} if the given number is narcissistic number, otherwise {@code false}.
     */
    public static boolean isNarcissisticNumber(int number) {
        int sum = 0;
        int copy = number;
        int digits = CountDigits.countDigits(number);
        while (number != 0) {
            sum += (int) Math.pow(number % 10, digits);
            number /= 10;
        }
        return copy == sum;
    }
}
