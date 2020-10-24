package com.examplehub.sorts;

import com.examplehub.utils.SortUtils;

public class QuickSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    quickSort(numbers, 0, numbers.length - 1);
  }

  /**
   * QuickSort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   */
  public void quickSort(int[] numbers, int left, int right) {
    if (left >= right) {
      return;
    }
    int pivot = numbers[right]; /* pick last element as pivot */
    /* begin partition */
    int i = left; /* left pointer */
    int j = right - 1; /* right pointer */
    while (i <= j) {
      while (numbers[i] < pivot) {
        i++; /* move i forward */
      }
      while (j >= 0 && numbers[j] >= pivot) {
        j--; /* move j backward */
      }
      if (i < j) {
        SortUtils.swap(numbers, i, j);
        i++;
        j--;
      }
    }

    SortUtils.swap(numbers, i, right);

    quickSort(numbers, left, i - 1);
    quickSort(numbers, i + 1, right);
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    quickSort(array, 0, array.length - 1);
  }

  public static <T extends Comparable<T>> void quickSort(T[] array, int left, int right) {
    if (left >= right) {
      return;
    }
    T pivot = array[right]; /* pick last element as pivot */
    /* begin partition */
    int i = left; /* left pointer */
    int j = right - 1; /* right pointer */
    while (i <= j) {
      while (array[i].compareTo(pivot) < 0) {
        i++; /* move i forward */
      }
      while (j >= 0 && array[j].compareTo(pivot) >= 0) {
        j--; /* move j backward */
      }
      if (i < j) {
        SortUtils.swap(array, i, j);
        i++;
        j--;
      }
    }

    SortUtils.swap(array, i, right);

    quickSort(array, left, i - 1);
    quickSort(array, i + 1, right);
  }
}
