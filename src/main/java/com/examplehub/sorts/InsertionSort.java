package com.examplehub.sorts;

public class InsertionSort implements Sort {

  /**
   * InsertionSort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   */
  public void sort(int[] numbers) {
    for (int i = 1; i < numbers.length; ++i) {
      int j = i - 1;
      int key = numbers[i];
      while (j >= 0 && key < numbers[j]) {
        numbers[j + 1] = numbers[j];
        --j;
      }
      if (j != i - 1) {
        numbers[j + 1] = key;
      }
    }
  }

  /**
   * Generic InsertionSort algorithm implements.
   *
   * @param array the array to be sorted.
   * @param <T> the class of the objects in the array.
   */
  public <T extends Comparable<T>> void sort(T[] array) {
    for (int i = 1; i < array.length; ++i) {
      int j = i - 1;
      T key = array[i];
      while (j >= 0 && key.compareTo(array[j]) < 0) {
        array[j + 1] = array[j];
        --j;
      }
      array[j + 1] = key;
    }
  }
}
