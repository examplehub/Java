package com.examplehub.projecteuler;

import com.examplehub.maths.EvenCheck;

/** https://projecteuler.net/problem=2 */
public class Problem02 {

  public static int solution1(int n) {
    int sum = 0;
    int first = 1;
    int second = 2;
    while (first <= n) {
      if (EvenCheck.isEvenFaster(first)) {
        sum += first;
      }
      System.out.println("first = " + first + " second = " + second);
      int temp = first + second;
      first = second;
      second = temp;
    }
    return sum;
  }
}
