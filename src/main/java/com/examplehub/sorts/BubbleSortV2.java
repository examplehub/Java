package com.examplehub.sorts;

import com.examplehub.utils.SortUtils;

public class BubbleSortV2 implements Sort {

  /**
   * BubbleSort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   */
  public void sort(int[] numbers) {
    int n = numbers.length - 1;
    while (n != 0) {
      int lastSwapIdx = 0;
      for (int i = 0; i < n; ++i) {
        if (numbers[i] > numbers[i + 1]) {
          SortUtils.swap(numbers, i, i + 1);
          lastSwapIdx = i;
        }
      }
      n = lastSwapIdx;
    }
  }

  /**
   * Generic BubbleSort algorithm implements.
   *
   * @param array the array to be sorted.
   * @param <T> the class of the objects in the array.
   */
  public <T extends Comparable<T>> void sort(T[] array) {
    int n = array.length - 1;
    while (n != 0) {
      int lastSwapIdx = 0;
      for (int i = 0; i < n; ++i) {
        if (array[i].compareTo(array[i + 1]) > 0) {
          SortUtils.swap(array, i, i + 1);
          lastSwapIdx = i;
        }
      }
      n = lastSwapIdx;
    }
  }
}
