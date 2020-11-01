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
    char[] binaryChar = (isNegative ? binary.substring(1) : binary).toCharArray();
    for (int i = 0; i < binaryChar.length; i++) {
      sum = sum + Character.getNumericValue(binaryChar[i]) * (int) Math.pow(2, binaryChar.length - 1 - i);
    }
    return isNegative ? -sum : sum;
  }
}
