package com.examplehub.conversions;

import com.examplehub.maths.Power;

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
        for (int i = binaryChar.length - 1; i >= 0; i--) {
            sum = sum + (binaryChar[i] - '0') * (int) Power.pow(2, binaryChar.length - 1 - i);
        }
        return isNegative ? -sum : sum;
    }
}
