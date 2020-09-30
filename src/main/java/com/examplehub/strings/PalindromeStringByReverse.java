package com.examplehub.strings;

public class PalindromeStringByReverse {
    /**
     * Test if a string is palindrome string or not using reversing string.
     *
     * @param s the string to be checked.
     * @return {@code true} if the string is palindrome string, otherwise {@code false}.
     */
    public static boolean isPalindrome(String s) {
        return s.equals(ReverseString.reverse(s));
    }
}
