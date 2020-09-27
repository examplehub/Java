package com.examplehub.sorts;

public class BubbleSort {

    /**
     * BubbleSort algorithm implements.
     *
     * @param numbers the numbers to be sorted.
     */
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < numbers.length - 1 - i; ++j) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Generic BubbleSort algorithm implements.
     *
     * @param array the array to be sorted.
     * @param <T>   the class of the objects in the array.
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; ++j) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
