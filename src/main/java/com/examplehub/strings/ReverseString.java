package com.examplehub.strings;

public class ReverseString {

  /**
   * Reverse a string.
   *
   * @param s the string.
   * @return the string reversed.
   */
  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}
