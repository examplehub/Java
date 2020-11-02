package com.examplehub.strings;

public class RemoveWhiteSpace {

  /**
   * Remove all whitespace of a string.
   *
   * @param s the string to be removed whitespace.
   * @return string no whitespace.
   */
  public static String removeWhitespace(String s) {
    return s.replaceAll("\\s+", "");
  }
}
