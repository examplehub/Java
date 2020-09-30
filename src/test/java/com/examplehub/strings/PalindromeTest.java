package com.examplehub.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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