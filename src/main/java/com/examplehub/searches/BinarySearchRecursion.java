package com.examplehub.searches;

import com.examplehub.maths.MiddleIndexCalculate;

public class BinarySearchRecursion implements Search {

  @Override
  public int search(int[] numbers, int key) {
    return search(numbers, 0, numbers.length - 1, key);
  }

  /**
   * Binary search algorithm using recursion.
   *
   * @param numbers the numbers to be searched.
   * @param left the left index of left sub array.
   * @param right the right index of right sub array.
   * @param key the key to be searched.
   * @return index of {@code key} value if found, otherwise -1.
   */
  public int search(int[] numbers, int left, int right, int key) {
    if (left > right) {
      return -1;
    }
    int mid = MiddleIndexCalculate.middle(left, right);
    if (key == numbers[mid]) {
      return mid;
    } else if (key > numbers[mid]) {
      return search(numbers, mid + 1, right, key); /* search at right sub array */
    } else {
      return search(numbers, left, mid - 1, key); /* search at left sub array */
    }
  }

  @Override
  public <T extends Comparable<T>> int search(T[] array, T key) {
    return search(array, 0, array.length - 1, key);
  }

  /**
   * Generic binary search algorithm using recursion.
   *
   * @param array the array to be searched.
   * @param left the left index of left sub array.
   * @param right the right index of right sub array.
   * @param key the key object to be searched.
   * @param <T> the class of the objects in the array.
   * @return index of {@code key} if found, otherwise -1.
   */
  public <T extends Comparable<T>> int search(T[] array, int left, int right, T key) {
    if (left > right) {
      return -1;
    }
    int mid = MiddleIndexCalculate.middle(left, right);
    if (key.compareTo(array[mid]) == 0) {
      return mid;
    } else if (key.compareTo(array[mid]) > 0) {
      return search(array, mid + 1, right, key); /* search at right sub array */
    } else {
      return search(array, left, mid - 1, key); /* search at left sub array */
    }
  }
}
