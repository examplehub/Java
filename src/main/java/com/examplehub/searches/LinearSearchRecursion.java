package com.examplehub.searches;

public class LinearSearchRecursion implements Search {

    @Override
    public int search(int[] numbers, int key) {
        return search(numbers, numbers.length, key);
    }

    /**
     * Linear search algorithm using recursion.
     *
     * @param numbers the numbers to be searched.
     * @param length  the length of sub numbers.
     * @param key     the key value to be searched.
     * @return index of {@code key} value if found, otherwise -1.
     */
    public int search(int[] numbers, int length, int key) {
        if (length == 0) {
            return -1;
        } else if (key == numbers[length - 1]) {
            return length - 1;
        } else {
            return search(numbers, length - 1, key);
        }
    }


    @Override
    public <T extends Comparable<T>> int search(T[] array, T key) {
        return search(array, array.length, key);
    }

    /**
     * Generic linear search algorithm using recursion.
     *
     * @param array  the array to be searched.
     * @param key    the key object to be searched.
     * @param length the length of sub
     * @param <T>    the class of the objects in the array.
     * @return index of {@code key} if found, otherwise -1.
     */
    public <T extends Comparable<T>> int search(T[] array, int length, T key) {
        if (length == 0) {
            return -1;
        } else if (key.compareTo(array[length - 1]) == 0) {
            return length - 1;
        } else {
            return search(array, length - 1, key);
        }
    }
}
