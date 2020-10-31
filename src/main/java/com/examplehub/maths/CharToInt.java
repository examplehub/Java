package com.examplehub.maths;

public class CharToInt {

  /**
   * Convert a char ('0' - '9') to int number.
   *
   * @param ch the digit char.
   * @return int number.
   */
  public static int toInt(char ch) {
    return ch - '0';
  }

  /**
   * Convert a char ('0' - '9') to int number using build-in function.
   *
   * @param ch the digit char.
   * @return int number.
   */
  public static int toInt2(char ch) {
    return Character.getNumericValue(ch);
  }

  /**
   * Convert a char ('0' - '9') to int number using build-in function.
   *
   * @param ch the digit char.
   * @return int number.
   */
  public static int toInt3(char ch) {
    return Integer.parseInt(String.valueOf(ch));
  }
}
