package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeStringByReverseTest {
  @Test
  void test() {
    String[] palindromeString = {"", "1", "a", "aa", "aba", "abc11cba", "amanaplanacanalpanama"};
    for (String item : palindromeString) {
      assertTrue(PalindromeStringByReverse.isPalindrome(item));
    }

    assertFalse(PalindromeStringByReverse.isPalindrome("abc"));
    assertFalse(PalindromeStringByReverse.isPalindrome("root"));
  }
}
