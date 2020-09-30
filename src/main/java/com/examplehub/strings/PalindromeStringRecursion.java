package com.examplehub.strings;

public class PalindromeStringRecursion {

    /**
     * Test if a string is palindrome string or not using recursion.
     *
     * @param s the string to be checked.
     * @return {@code true} if the string is palindrome string, otherwise {@code false}.
     */
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}
