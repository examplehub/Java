package com.examplehub.sorts;

import com.examplehub.utils.SortUtils;

public class BubbleSortRecursion implements Sort {
  @Override
  public void sort(int[] numbers) {
    sortRecursion(numbers, numbers.length);
  }

  /**
   * BubbleSort algorithm implements using recursion.
   *
   * @param numbers the numbers to be sorted.
   * @param length the length of numbers.
   */
  public void sortRecursion(int[] numbers, int length) {
    boolean swapped = false;
    for (int i = 0; i < length - 1; ++i) {
      if (numbers[i] > numbers[i + 1]) {
        SortUtils.swap(numbers, i, i + 1);
        swapped = true;
      }
    }
    if (swapped) {
      sortRecursion(numbers, length - 1);
    }
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    sortRecursion(array, array.length);
  }

  /**
   * Generic BubbleSort algorithm implements using recursion.
   *
   * @param array the array to be sorted.
   * @param length the length of array.
   * @param <T> the class of the objects in the array.
   */
  public <T extends Comparable<T>> void sortRecursion(T[] array, int length) {
    boolean swapped = false;
    for (int i = 0; i < length - 1; ++i) {
      if (array[i].compareTo(array[i + 1]) > 0) {
        SortUtils.swap(array, i, i + 1);
        swapped = true;
      }
    }
    if (swapped) {
      sortRecursion(array, length - 1);
    }
  }
}
