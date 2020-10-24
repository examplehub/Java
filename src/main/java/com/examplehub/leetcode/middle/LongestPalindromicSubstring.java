package com.examplehub.leetcode.middle;

import com.examplehub.strings.PalindromeString;

public class LongestPalindromicSubstring {

  /**
   * Calculate longest palindrome substring.
   *
   * @param s the string.
   * @return longest palindrome substring.
   */
  public static String solution1(String s) {
    int maxLength = 0;
    String longestPalindrome = null;
    for (int i = 0; i < s.length(); ++i) {
      for (int j = i + 1; j <= s.length(); ++j) {
        String subString = s.substring(i, j);
        if (PalindromeString.isPalindrome(subString) && subString.length() > maxLength) {
          maxLength = subString.length();
          longestPalindrome = subString;
        }
      }
    }
    return longestPalindrome;
  }
}
