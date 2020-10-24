package com.examplehub.conversions;

public class DecimalToHex {
  public static String toHex(int number) {
    char[] hexTable = {
      '0', '1', '2', '3',
      '4', '5', '6', '7',
      '8', '9', 'a', 'b',
      'c', 'd', 'e', 'f'
    };

    boolean isNegative = number < 0;
    number = Math.abs(number);
    StringBuilder result = new StringBuilder();
    do {
      result.append(hexTable[number % 16]);
      number /= 16;
    } while (number != 0);
    return isNegative ? result.append("-").reverse().toString() : result.reverse().toString();
  }
}
