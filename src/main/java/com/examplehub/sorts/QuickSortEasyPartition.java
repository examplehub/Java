package com.examplehub.sorts;

public class QuickSortEasyPartition implements Sort {

    @Override
    public void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private int partition(int[] number, int left, int right) {
        int len = right - left + 1;
        int[] temp = new int[len];
        int j = 0;
        int k = len - 1;
        int pivot = number[left];
        for (int i = left + 1; i <= right; i++) {
            if (number[i] <= pivot) {
                temp[j] = number[i];
                j++;
            } else {
                temp[k] = number[i];
                k--;
            }
        }
        temp[j] = pivot;
        System.arraycopy(temp, 0, number, left, len);
        return left + j;
    }

    /**
     * QuickSort algorithm implements.
     *
     * @param numbers the numbers to be sorted.
     */
    public void quickSort(int[] numbers, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(numbers, left, right);
            quickSort(numbers, left, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, right);
        }
    }

    /**
     * Generic quickSort algorithm implements.
     *
     * @param array the array to be sorted.
     * @param <T>   the class of the objects in the array.
     */
    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        int len = right - left + 1;

        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Comparable[len];
        int j = 0;
        int k = len - 1;
        T pivot = array[left];
        for (int i = left + 1; i <= right; i++) {
            if (array[i].compareTo(pivot) <= 0) {
                temp[j] = array[i];
                j++;
            } else {
                temp[k] = array[i];
                k--;
            }
        }
        temp[j] = pivot;
        System.arraycopy(temp, 0, array, left, len);
        return left + j;
    }

    public static <T extends Comparable<T>> void quickSort(T[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }
}
