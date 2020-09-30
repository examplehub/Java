package com.examplehub.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeStringRecursionTest {

    @Test
    void test() {
        String[] palindromeString = {"", "1", "a", "aa", "aba", "abc11cba", "amanaplanacanalpanama"};
        for (String item : palindromeString) {
            assertTrue(PalindromeStringRecursion.isPalindrome(item));
        }

        assertFalse(PalindromeStringRecursion.isPalindrome("abc"));
        assertFalse(PalindromeStringRecursion.isPalindrome("root"));
    }
}