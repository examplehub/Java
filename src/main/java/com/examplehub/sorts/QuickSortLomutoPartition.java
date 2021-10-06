package com.examplehub.sorts;

import com.examplehub.utils.SortUtils;

/** https://en.wikipedia.org/wiki/Quicksort#Lomuto_partition_scheme */
public class QuickSortLomutoPartition implements Sort {

  @Override
  public void sort(int[] numbers) {
    quickSort(numbers, 0, numbers.length - 1);
  }

  private int partition(int[] number, int left, int right) {
    int pivot = number[right];
    for (int j = left; j < right; ++j) {
      if (number[j] < pivot) {
        SortUtils.swap(number, left++, j);
      }
    }
    SortUtils.swap(number, left, right);
    return left;
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
   * @param <T> the class of the objects in the array.
   */
  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    quickSort(array, 0, array.length - 1);
  }

  private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
    T pivot = array[right];
    for (int j = left; j < right; j++) {
      if (array[j].compareTo(pivot) < 0) {
        SortUtils.swap(array, j, left++);
      }
    }
    SortUtils.swap(array, left, right);
    return left;
  }

  public static <T extends Comparable<T>> void quickSort(T[] array, int left, int right) {
    if (left < right) {
      int pivotIndex = partition(array, left, right);
      quickSort(array, left, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, right);
    }
  }
}
