package com.examplehub.conversions;

public class BinaryToDecimal {

  /**
   * Convert binary string to decimal.
   *
   * @param binary the binary string.
   * @return decimal of a binary string.
   */
  public static int toDecimal(String binary) {
    int sum = 0;
    boolean isNegative = binary.charAt(0) == '-';
    binary = (isNegative ? binary.substring(1) : binary);
    int k = binary.length();
    for (char digit : binary.toCharArray()) {
      sum += (digit - '0') * (int) Math.pow(2, --k);
    }
    return isNegative ? -sum : sum;
  }
}
