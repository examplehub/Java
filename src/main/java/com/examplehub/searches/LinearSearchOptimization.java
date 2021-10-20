package com.examplehub.searches;

public class LinearSearchOptimization implements Search {

  /**
   * Linear search algorithm.
   *
   * @param numbers the numbers to be searched.
   * @param key     the key value t o be searched.
   * @return index of {@code key} value if found, otherwise -1.
   */
  @Override
  public int search(int[] numbers, int key) {
    if (numbers.length == 0) {
      return -1;
    }
    if (key == numbers[0]) {
      return 0;
    }
    numbers[0] = key;
    int index = numbers.length - 1;
    while (key != numbers[index]) {
      index--;
    }
    return index == 0 ? -1 : index;
  }

  /**
   * Generic linear search algorithm.
   *
   * @param array the array to be searched.
   * @param key   the key object to be searched.
   * @param <T>   the class of the objects in the array.
   * @return index of {@code key} if found, otherwise -1.
   */
  @Override
  public <T extends Comparable<T>> int search(T[] array, T key) {
    if (array.length == 0) {
      return -1;
    }
    if (key.compareTo(array[0]) == 0) {
      return 0;
    }
    array[0] = key;
    int index = array.length - 1;
    while (key.compareTo(array[index]) != 0) {
      index--;
    }
    return index == 0 ? -1 : index;
  }
}
