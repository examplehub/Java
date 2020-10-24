package com.examplehub.conversions;

public class DecimalToBinary {
  public static String toBinary(int number) {
    boolean isNegative = number < 0;
    number = Math.abs(number);
    StringBuilder result = new StringBuilder();
    do {
      result.append(number % 2);
      number /= 2;
    } while (number != 0);
    return isNegative ? result.append("-").reverse().toString() : result.reverse().toString();
  }
}
