package com.examplehub.dynamicprogramming;

/** https://en.wikipedia.org/wiki/Lucas_number */
public class LucasDP {

  /**
   * Return nth lucas number using dynamic programming.
   *
   * @param n the nth.
   * @return the nth number of lucas series.
   */
  public static int lucas(int n) {
    if (n == 0) {
      return 2;
    }
    int[] lucasNumbers = new int[n + 1];
    lucasNumbers[0] = 2;
    lucasNumbers[1] = 1;
    for (int i = 2; i <= n; i++) {
      lucasNumbers[i] = lucasNumbers[i - 1] + lucasNumbers[i - 2];
    }
    return lucasNumbers[n];
  }
}
