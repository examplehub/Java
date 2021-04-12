package com.examplehub.searches;

public class BinarySearch implements Search {

  /**
   * Binary search algorithm.
   *
   * @param numbers the numbers to be searched.
   * @param key the key to be searched.
   * @return index of {@code key} value if found, otherwise -1.
   */
  @Override
  public int search(int[] numbers, int key) {
    int left = 0;
    int right = numbers.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (key == numbers[mid]) {
        return mid;
      } else if (key > numbers[mid]) {
        left = mid + 1; /* search at right sub array */
      } else {
        right = mid - 1; /* search at left sub array */
      }
    }
    return -1;
  }

  /**
   * Generic binary search algorithm.
   *
   * @param array the array to be searched.
   * @param key the key object to be searched.
   * @param <T> the class of the objects in the array.
   * @return index of {@code key} if found, otherwise -1.
   */
  @Override
  public <T extends Comparable<T>> int search(T[] array, T key) {
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (key.compareTo(array[mid]) == 0) {
        return mid;
      } else if (key.compareTo(array[mid]) > 0) {
        left = mid + 1; /* search at right sub array */
      } else {
        right = mid - 1; /* search at left sub array */
      }
    }
    return -1;
  }
}
