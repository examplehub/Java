package com.examplehub.basics;

public class Continue {
  public static void main(String[] args) {

    /*
     * 1 3 4 5
     */
    for (int i = 1; i <= 5; ++i) {
      if (i == 2) {
        continue;
      }
      System.out.print(i + " ");
    }
    System.out.println();

    /*
     * 1 3 5 7 9
     */
    for (int i = 1; i <= 10; ++i) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.print(i + " ");
    }
    System.out.println();

    /*
     * 2 4 6 8
     */
    int i = 1;
    while (i < 10) {
      if (i % 2 == 1) {
        i++;
        continue;
      }
      System.out.print(i + " ");
      i++;
    }
    System.out.println();

    /*
     * 2 4 6 8 10
     */
    i = 1;
    do {
      if (i % 2 == 1) {
        i++;
        continue;
      }
      System.out.print(i + " ");
      i++;
    } while (i <= 10);
    System.out.println();
  }
}
