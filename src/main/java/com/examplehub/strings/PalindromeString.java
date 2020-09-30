package com.examplehub.strings;

public class PalindromeString {

    /**
     * Test if a string is palindrome string.
     *
     * @param s the string to be checked.
     * @return {@code true} if the string is palindrome string, otherwise {@code false}.
     */
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ++i, --j) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
