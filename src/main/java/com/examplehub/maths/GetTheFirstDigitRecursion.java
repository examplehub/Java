package com.examplehub.maths;

public class GetTheFirstDigitRecursion {

  public static int firstDigit(int number) {
    number = Math.abs(number);
    return number < 10 ? number : firstDigit(number / 10);
  }
}
