package com.examplehub.sorts;

public class MergeSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    mergeSort(numbers, 0, numbers.length - 1);
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    mergeSort(array, 0, array.length - 1);
  }

  /**
   * Merge sort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   * @param left the left index of sub array.
   * @param right the right index of sub array.
   */
  public static void mergeSort(int[] numbers, int left, int right) {
    if (left < right) {
      int middle = (left + right) >> 1;
      mergeSort(numbers, left, middle);
      mergeSort(numbers, middle + 1, right);
      merge(numbers, left, middle, right);
    }
  }

  /**
   * Generic MergeSort algorithm implements.
   *
   * @param array the array to be sorted.
   * @param left the left index of sub array.
   * @param right the right index of sub array.
   * @param <T> the class of the objects in the array.
   */
  public static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
    if (left < right) {
      int middle = (left + right) >> 1;
      mergeSort(array, left, middle);
      mergeSort(array, middle + 1, right);
      merge(array, left, middle, right);
    }
  }

  /**
   * @param numbers the numbers to be merged.
   * @param left the left index of first sub array.
   * @param middle the right index of second sub array.
   * @param right the right index of second sub array.
   */
  public static void merge(int[] numbers, int left, int middle, int right) {
    int i = left;
    int j = middle + 1;
    int k = left;
    while (i <= middle && j <= right) {
      if (numbers[i] <= numbers[j]) {
        numbers[k++] = numbers[i++];
      } else {
        numbers[k++] = numbers[j++];
      }
    }
    while (i <= middle) {
      numbers[k++] = numbers[i++];
    }

    while (j <= right) {
      numbers[k++] = numbers[j++];
    }
  }

  /**
   * Generic merge two sub sorted numbers.
   *
   * @param array the array to be sorted.
   * @param left the left index of first sub array.
   * @param middle the right index of second sub array.
   * @param right the right index of second sub array.
   * @param <T> the class of the objects in the array.
   */
  public static <T extends Comparable<T>> void merge(T[] array, int left, int middle, int right) {
    int i = left;
    int j = middle + 1;
    int k = left;
    while (i <= middle && j <= right) {
      if (array[i].compareTo(array[j]) <= 0) {
        array[k++] = array[i++];
      } else {
        array[k++] = array[j++];
      }
    }
    while (i <= middle) {
      array[k++] = array[i++];
    }

    while (j <= right) {
      array[k++] = array[j++];
    }
  }
}
