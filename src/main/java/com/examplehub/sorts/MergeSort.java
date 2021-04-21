package com.examplehub.sorts;

import com.examplehub.maths.MiddleIndexCalculate;

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
      int middle = MiddleIndexCalculate.middle(left, right);
      mergeSort(numbers, left, middle);
      mergeSort(numbers, middle + 1, right);
      merge(numbers, left, right);
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
      merge(array, left, right);
    }
  }

  /**
   * @param numbers the numbers to be merged.
   * @param left the left index of first sub array.
   * @param right the right index of second sub array.
   */
  public static void merge(int[] numbers, int left, int right) {
    int middle = (left + right) >> 1;
    int i = left;
    int j = middle + 1;
    int k = 0;
    int len = right - left + 1;
    int[] temp = new int[len];
    while (i <= middle && j <= right) {
      if (numbers[i] <= numbers[j]) {
        temp[k++] = numbers[i++];
      } else {
        temp[k++] = numbers[j++];
      }
    }
    while (i <= middle) {
      temp[k++] = numbers[i++];
    }

    while (j <= right) {
      temp[k++] = numbers[j++];
    }
    for (int number : temp) {
      numbers[left++] = number;
    }
  }

  /**
   * Generic merge two sub sorted numbers.
   *
   * @param array the array to be sorted.
   * @param left the left index of first sub array.
   * @param right the right index of second sub array.
   * @param <T> the class of the objects in the array.
   */
  public static <T extends Comparable<T>> void merge(T[] array, int left, int right) {
    int middle = (left + right) >> 1;
    int i = left;
    int j = middle + 1;
    int k = 0;
    @SuppressWarnings("unchecked")
    T[] tempArray = (T[]) new Comparable[right - left + 1];
    while (i <= middle && j <= right) {
      if (array[i].compareTo(array[j]) <= 0) {
        tempArray[k++] = array[i++];
      } else {
        tempArray[k++] = array[j++];
      }
    }
    while (i <= middle) {
      tempArray[k++] = array[i++];
    }

    while (j <= right) {
      tempArray[k++] = array[j++];
    }

    for (T temp : tempArray) {
      array[left++] = temp;
    }
  }
}
