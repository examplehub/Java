package com.examplehub.utils;

public class SortUtils {

  /**
   * Test if the array is sorted.
   *
   * @param array the array to be check.
   * @return {@code true} if given array is sorted, otherwise {@code false}.
   */
  public static boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; ++i) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Test if the generic array is sorted.
   *
   * @param array the array to be checked.
   * @param <T> the class of the objects in the array.
   * @return {@code true} if given array is sorted, otherwise {@code true}.
   */
  public static <T extends Comparable<T>> boolean isSorted(T[] array) {
    for (int i = 0; i < array.length - 1; ++i) {
      if (array[i].compareTo(array[i + 1]) > 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Swapped array elements at different index.
   *
   * @param numbers the numbers to be swapped.
   * @param i the first index.
   * @param j the second index.
   */
  public static void swap(int[] numbers, int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }

  /**
   * Generic swapped array elements at different index.
   *
   * @param numbers the numbers to be swapped.
   * @param i the first index.
   * @param j the second index.
   * @param <T> the class of the objects in the array.
   */
  public static <T extends Comparable<T>> void swap(T[] numbers, int i, int j) {
    T temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}
