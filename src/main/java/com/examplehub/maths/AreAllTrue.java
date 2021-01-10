package com.examplehub.maths;

public class AreAllTrue {

  /**
   * Test if an boolean array are all true.
   *
   * @param array the array to be tested.
   * @return true if all elements of array are ture, otherwise false.
   */
  public static boolean areAllTrue(boolean[] array) {
    for (boolean bool : array) {
      if (!bool) {
        return false;
      }
    }
    return true;
  }
}
