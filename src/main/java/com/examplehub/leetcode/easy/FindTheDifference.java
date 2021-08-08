package com.examplehub.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

/** https://leetcode.com/problems/find-the-difference/ */
public class FindTheDifference {
  public static char solution1(String s, String t) {
    char[] firstChars = s.toCharArray();
    char[] secondChars = t.toCharArray();
    Arrays.sort(firstChars);
    Arrays.sort(secondChars);
    for (int i = 0; i < firstChars.length; ++i) {
      if (firstChars[i] != secondChars[i]) {
        return secondChars[i];
      }
    }
    return secondChars[secondChars.length - 1];
  }

  public static char solution2(String s, String t) {
    int[] countTab = new int[26];
    for (char ch : s.toCharArray()) {
      countTab[ch - 'a']++;
    }
    for (char ch : t.toCharArray()) {
      countTab[ch - 'a']--;
      if (countTab[ch - 'a'] < 0) {
        return ch;
      }
    }
    return ' ';
  }

  public static char solution3(String s, String t) {
    int sum = 0;
    for (char ch : t.toCharArray()) {
      sum += ch;
    }
    for (char ch : s.toCharArray()) {
      sum -= ch;
    }
    return (char) sum;
  }

  public static char solution4(String s, String t) {
    int ret = 0;
    for (int i = 0; i < s.length(); ++i) {
      ret ^= s.charAt(i);
    }
    for (int i = 0; i < t.length(); ++i) {
      ret ^= t.charAt(i);
    }
    return (char) ret;
  }

  public static char solution5(String s, String t) {
    s = s + t;
    HashSet<Character> set = new HashSet<>();
    for (char ch : s.toCharArray()) {
      if (set.contains(ch)) {
        set.remove(ch);
      } else {
        set.add(ch);
      }
    }
    for (char ch : set) {
      return ch;
    }
    return ' ';
  }
}
