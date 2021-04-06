package com.examplehub.sorts;

public class InsertionSort implements Sort {

  /**
   * InsertionSort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   */
  public void sort(int[] numbers) {
    for (int i = 1; i < numbers.length; ++i) {
      int insertValue = numbers[i];
      int j;
      for (j = i - 1; j >= 0 && insertValue < numbers[j]; --j) {
        numbers[j + 1] = numbers[j];
      }
      if (j != i - 1) {
        numbers[j + 1] = insertValue;
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
      T insertValue = array[i];
      int j;
      for (j = i - 1; j >= 0 && insertValue.compareTo(array[j]) < 0; --j) {
        array[j + 1] = array[j];
      }
      if (j != i - 1) {
        array[j + 1] = insertValue;
      }
    }
  }
}
