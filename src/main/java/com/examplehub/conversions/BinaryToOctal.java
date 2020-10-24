package com.examplehub.conversions;

public class BinaryToOctal {

  /**
   * Convert binary string to octal string.
   *
   * @param binaryString the binary string.
   * @return octal string of a binary string.
   */
  public static String toOctal(String binaryString) {
    StringBuilder builder = new StringBuilder(binaryString);
    if (binaryString.length() % 3 != 0) {
      // just wok on jdk 11+
      // builder.append("0".repeat(3 - binaryString.length() % 3));
      binaryString =
          (binaryString.length() % 3 == 1 ? builder.insert(0, "00") : builder.insert(0, "0"))
              .toString();
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < binaryString.length() / 3; i++) {
      result.append(BinaryToDecimal.toDecimal(binaryString.substring(3 * i, 3 * i + 3)));
    }
    return result.toString();
  }
}
