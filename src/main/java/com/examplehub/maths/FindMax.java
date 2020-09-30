package com.examplehub.maths;

import java.util.Arrays;

public class FindMax {

    /**
     * Find max value in array.
     *
     * @param numbers the numbers to be find.
     * @return max value of numbers.
     */
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMaxSecond(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }
}
