package com.examplehub.leetcode.middle;

import java.math.BigInteger;

/** https://leetcode.com/problems/multiply-strings/ */
public class MultiplyStrings {
  public static String solution1(String num1, String num2) {
    return String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
  }

  public static String solution2(String num1, String num2) {
    BigInteger multiply = new BigInteger(num1).multiply(new BigInteger(num2));
    return multiply.toString(10);
  }

  public static String solution3(String num1, String num2) {
    // TODO
    return "";
  }
}
