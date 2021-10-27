package com.examplehub.sorts;

import com.examplehub.utils.SortUtils;

public class BubbleSort implements Sort {

  /**
   * BubbleSort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   */
  public void sort(int[] numbers) {
    for (int i = 1; i < numbers.length; ++i) {
      boolean swapped = false;
      for (int j = 0; j < numbers.length - i; ++j) {
        if (numbers[j] > numbers[j + 1]) {
          SortUtils.swap(numbers, j, j + 1);
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
   * @param <T> the class of the objects in the array.
   */
  public <T extends Comparable<T>> void sort(T[] array) {
    for (int i = 1; i < array.length; ++i) {
      boolean swapped = false;
      for (int j = 0; j < array.length - i; ++j) {
        if (array[j].compareTo(array[j + 1]) > 0) {
          SortUtils.swap(array, j, j + 1);
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }
}
