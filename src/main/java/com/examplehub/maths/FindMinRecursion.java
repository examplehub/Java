package com.examplehub.maths;

public class FindMinRecursion {

    /**
     * Find min value in array using recursion.
     *
     * @param numbers the numbers to find.
     * @param length  the length of array.
     * @return min value in given array.
     */
    public static int min(int[] numbers, int length) {
        if (length == 1) {
            return numbers[0];
        }
        int temp = min(numbers, length - 1);
        return Math.min(numbers[length - 1], temp);
    }

    /**
     * Find min value in array using recursion.
     *
     * @param numbers the numbers to find.
     * @param left    the left index of sub array.
     * @param right   the right index of sub array.
     * @return min value in given array.
     */
    public static int min(int[] numbers, int left, int right) {
        if (right == left) {
            return numbers[right];
        }
        int middle = (left + right) >> 1;
        int leftMin = min(numbers, left, middle); /* find min in range[left, middle] */
        int rightMin = min(numbers, middle + 1, right); /* find min in range[middle + 1, right] */
        return Math.min(leftMin, rightMin);
    }
}
