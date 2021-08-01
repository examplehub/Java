package com.examplehub.sorts;

import com.examplehub.utils.SortUtils;

public class SelectionSortRecursion implements Sort {

  @Override
  public void sort(int[] numbers) {
    selectionSort(numbers, numbers.length);
  }

  /**
   * Selection sort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   * @param len the len of sub array.
   */
  private void selectionSort(int[] numbers, int len) {
    if (len > 1) {
      int maxIndex = len - 1;
      for (int j = len - 2; j >= 0; j--) {
        if (numbers[j] > numbers[maxIndex]) {
          maxIndex = j;
        }
      }
      if (maxIndex != len - 1) {
        SortUtils.swap(numbers, len - 1, maxIndex);
      }
      selectionSort(numbers, len - 1);
    }
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    selectionSort(array, array.length);
  }

  /**
   * Generic SelectionSort algorithm implements.
   *
   * @param numbers the array to be sorted.
   * @param len the length of sub array.
   * @param <T> the class of the objects in the array.
   */
  private <T extends Comparable<T>> void selectionSort(T[] numbers, int len) {
    if (len > 1) {
      int maxIndex = len - 1;
      for (int j = len - 2; j >= 0; j--) {
        if (numbers[j].compareTo(numbers[maxIndex]) > 0) {
          maxIndex = j;
        }
      }
      if (maxIndex != len - 1) {
        SortUtils.swap(numbers, len - 1, maxIndex);
      }
      selectionSort(numbers, len - 1);
    }
  }
}
