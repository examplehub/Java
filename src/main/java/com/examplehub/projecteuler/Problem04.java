package com.examplehub.projecteuler;

import com.examplehub.maths.PalindromeNumber;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * <p>
 * link: https://projecteuler.net/problem=4
 */
public class Problem04 {
    public static int solution1() {
        for (int i = 999 * 999; i >= 10000; i--) {
            if (PalindromeNumber.isPalindrome(i)) {
                for (int firstNumber = 999; firstNumber >= 100; firstNumber--) {
                    int secondNumber = i / firstNumber;
                    if (secondNumber >= 100 && secondNumber <= 999 && firstNumber * secondNumber == i) {
                        System.out.println(firstNumber);
                        System.out.println(secondNumber);
                        return i;
                    }
                }
            }
        }
        return -1; /* not found */
    }
}
