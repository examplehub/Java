package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {
  @Test
  void testPalindromeNumber() {
    int[] palindromeNumbers = {-12321, -11, -1, 0, 1, 11, 12321, 1111111, 123454321};
    for (int number : palindromeNumbers) {
      assertTrue(PalindromeNumber.isPalindrome(number));
    }

    assertFalse(PalindromeNumber.isPalindrome(-12));
    assertFalse(PalindromeNumber.isPalindrome(10));
    assertFalse(PalindromeNumber.isPalindrome(123));
  }
}
