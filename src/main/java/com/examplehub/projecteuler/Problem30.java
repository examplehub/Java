package com.examplehub.projecteuler;

/** https://projecteuler.net/problem=30 */
public class Problem30 {

  public static int solution1() {
    int sum = 0;
    for (int i = 2; i <= 1000000; i++) {
      int number = i;
      int tempSum = 0;
      while (number != 0) {
        tempSum = (int) (tempSum + Math.pow(number % 10, 5));
        number /= 10;
      }
      if (tempSum == i) {
        sum += i;
      }
    }
    return sum;
  }
}
