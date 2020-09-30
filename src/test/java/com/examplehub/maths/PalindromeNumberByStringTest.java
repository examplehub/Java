package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberByStringTest {
    @Test
    void testPalindromeNumberByString() {
        int[] palindromeNumbers = {-12321, -11, -1, 0, 1, 11, 12321, 1111111, 123454321};
        for (int number : palindromeNumbers) {
            assertTrue(PalindromeNumberByString.isPalindrome(number));
        }

        assertFalse(PalindromeNumberByString.isPalindrome(-12));
        assertFalse(PalindromeNumberByString.isPalindrome(10));
        assertFalse(PalindromeNumberByString.isPalindrome(123));
    }
}