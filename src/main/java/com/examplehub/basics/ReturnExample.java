package com.examplehub.basics;

public class ReturnExample {
  public static void main(String[] args) {
    System.out.println(test(15, 10)); /* 1 */
    System.out.println(test(10, 15)); /* -1 */
    System.out.println(test(10, 10)); /* 0 */
  }

  private static int test(int test, int target) {
    if (test > target) {
      return 1;
    }
    if (test < target) {
      return -1;
    }
    return 0;
  }
}
