package com.examplehub.maths;

import java.util.Arrays;

public class FindMin {

    /**
     * Find min value in array.
     *
     * @param numbers the numbers to be find.
     * @return min value of numbers.
     */
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMinSecond(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }
}
