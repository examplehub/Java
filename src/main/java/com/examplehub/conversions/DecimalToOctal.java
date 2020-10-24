package com.examplehub.conversions;

public class DecimalToOctal {
  public static String toOctal(int number) {
    boolean isNegative = number < 0;
    number = Math.abs(number);
    StringBuilder result = new StringBuilder();
    do {
      result.append(number % 8);
      number /= 8;
    } while (number != 0);
    return isNegative ? result.append("-").reverse().toString() : result.reverse().toString();
  }
}
