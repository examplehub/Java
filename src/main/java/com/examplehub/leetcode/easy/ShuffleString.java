package com.examplehub.leetcode.easy;

/** https://leetcode.com/problems/shuffle-string/ */
public class ShuffleString {

  public static String solution1(String s, int[] indices) {
    char[] chars = new char[s.length()];
    for (int i = 0; i < indices.length; ++i) {
      chars[indices[i]] = s.charAt(i);
    }
    return new String(chars);
  }
}
