package com.examplehub.conversions;

public class BinaryToHexadecimal {
  public static String toHexadecimal(String binaryString) {
    char[] hexTable = {
      '0', '1', '2', '3',
      '4', '5', '6', '7',
      '8', '9', 'A', 'B',
      'C', 'D', 'E', 'F'
    };
    if (binaryString.length() % 4 == 1) {
      binaryString = "000" + binaryString;
    } else if (binaryString.length() % 4 == 2) {
      binaryString = "00" + binaryString;
    } else if (binaryString.length() % 4 == 3) {
      binaryString = "0" + binaryString;
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < binaryString.length() / 4; i++) {
      builder.append(hexTable[BinaryToDecimal.toDecimal(binaryString.substring(4 * i, 4 * i + 4))]);
    }
    return builder.toString();
  }
}
