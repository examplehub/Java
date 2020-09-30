package com.examplehub.maths;

import com.examplehub.strings.PalindromeString;

public class PalindromeNumberByString {

    /**
     * Test if a number is palindrome number by converting the number to string.
     *
     * @param number the number to be checked.
     * @return {@code true} if the given number is palindrome number, otherwise {@code false}.
     */
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        return PalindromeString.isPalindrome(number + "");
    }
}
