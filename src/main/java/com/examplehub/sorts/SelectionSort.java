package com.examplehub.sorts;

public class SelectionSort implements Sort{

    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; ++i) {
            int minIndex = i; /* index of min value */
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minIndex = i; /* index of min value */
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
