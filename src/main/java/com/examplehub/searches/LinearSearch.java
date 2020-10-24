package com.examplehub.searches;

public class LinearSearch implements Search {

  /**
   * Linear search algorithm.
   *
   * @param numbers the numbers to be searched.
   * @param key the key value to be searched.
   * @return index of {@code key} value if found, otherwise -1.
   */
  @Override
  public int search(int[] numbers, int key) {
    for (int i = 0; i < numbers.length; ++i) {
      if (key == numbers[i]) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Generic linear search algorithm.
   *
   * @param array the array to be searched.
   * @param key the key object to be searched.
   * @param <T> the class of the objects in the array.
   * @return index of {@code key} if found, otherwise -1.
   */
  @Override
  public <T extends Comparable<T>> int search(T[] array, T key) {
    for (int i = 0; i < array.length; ++i) {
      if (key.compareTo(array[i]) == 0) {
        return i;
      }
    }
    return -1;
  }
}
