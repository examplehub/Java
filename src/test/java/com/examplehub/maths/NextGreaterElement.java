package com.examplehub.maths;

public class NextGreaterElement {

  /**
   * Calculate next greater element of array.
   *
   * @param array the array to be searched.
   * @return next greater element array.
   */
  public static int[] nextGreater(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int nextGreater = -1;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] > array[i]) {
          nextGreater = array[j];
          break;
        }
      }
      array[i] = nextGreater;
    }
    return array;
  }
}
