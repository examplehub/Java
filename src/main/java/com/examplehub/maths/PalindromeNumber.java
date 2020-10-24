package com.examplehub.maths;

public class PalindromeNumber {

  /**
   * Test if a number is palindrome number.
   *
   * @param number the number to be checked.
   * @return {@code true} if the given number is palindrome number, otherwise {@code false}.
   */
  public static boolean isPalindrome(int number) {
    int origin = number = Math.abs(number);
    int reversedNumber = 0;
    while (number != 0) {
      reversedNumber = reversedNumber * 10 + number % 10;
      number /= 10;
    }
    return reversedNumber == origin;
  }
}
