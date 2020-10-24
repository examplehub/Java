package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {
  @Test
  void testPalindromeString() {
    String[] palindromeString = {"", "1", "a", "aa", "aba", "abc11cba", "amanaplanacanalpanama"};
    for (String item : palindromeString) {
      assertTrue(PalindromeString.isPalindrome(item));
    }

    assertFalse(PalindromeString.isPalindrome("abc"));
    assertFalse(PalindromeString.isPalindrome("root"));
  }
}
