package com.examplehub.strings;

public class ReplaceWhiteSpace {

  public static String solution1(String original, String str) {
    return original.replace(" ", str);
  }

  public static String solution2(String original, String str) {
    char[] chars = new char[original.length() * 3];
    int size = 0;
    for (char ch : original.toCharArray()) {
      if (ch != ' ') {
        chars[size++] = ch;
      } else {
        for (char temp : str.toCharArray()) {
          chars[size++] = temp;
        }
      }
    }
    return String.valueOf(chars);
  }
}
