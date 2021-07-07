package com.examplehub.strings;

/**
 * str = "abc", sub = "ab", return true str = "abcbca", sub = "bc", return false str = "abc", sub =
 * "ac", return false
 */
public class JustAppearOneTime {

  public static boolean solution1(String str, String sub) {
    int firstIndex = str.indexOf(sub);
    int lastIndex = str.lastIndexOf(sub);
    return firstIndex != -1 && firstIndex == lastIndex;
  }
}
