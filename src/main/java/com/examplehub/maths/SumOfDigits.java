package com.examplehub.maths;

public class SumOfDigits {

    /**
     * Sum of digits.
     *
     * @param number the number.
     * @return the sum of digits.
     */
    public static int sumOfDigits(long number) {
        number = Math.abs(number);
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    /**
     * Sum of digits using byte array.
     *
     * @param number the number.
     * @return the sum of digits.
     */
    public static int sumOfDigitsSecond(int number) {
        byte[] bytes = (Math.abs(number) + "").getBytes();
        int sum = 0;
        for (byte temp : bytes) {
            sum += temp - '0';
        }
        return sum;
    }

    /**
     * Sum of digits using recursion.
     *
     * @param number the number.
     * @return the sum of digits.
     */
    public static int sumOfDigitsRecursion(int number) {
        number = Math.abs(number);
        return number < 10 ? number : number % 10 + sumOfDigits(number / 10);
    }
}
