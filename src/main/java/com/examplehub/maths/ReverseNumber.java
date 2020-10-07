package com.examplehub.maths;

public class ReverseNumber {

    /**
     * Reverse a number.
     *
     * @param number the number to be reversed.
     * @return the reversed number of given number.
     */
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
}
