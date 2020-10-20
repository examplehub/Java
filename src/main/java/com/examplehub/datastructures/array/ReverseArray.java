package com.examplehub.datastructures.array;

public class ReverseArray {

    /**
     * Reverse a array.
     *
     * @param array the array to be reversed.
     */
    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
