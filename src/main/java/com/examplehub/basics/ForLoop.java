package com.examplehub.basics;

public class ForLoop {
  public static void main(String[] args) {

    /* output: ########## */
    for (int i = 1; i <= 10; ++i) {
      System.out.print("#");
    }
    System.out.println("\n");

    /* output: 11111 */
    for (int i = 1; i <= 5; ++i) {
      System.out.print(1);
    }
    System.out.println("\n");

    /* output: 22222 */
    for (int i = 5; i >= 1; --i) {
      System.out.print(2);
    }
    System.out.println("\n");

    /* output: 12345 */
    for (int i = 1; i <= 5; ++i) {
      System.out.print(i);
    }
    System.out.println("\n");

    /* output: 246810 */
    for (int i = 2; i <= 10; i += 2) {
      System.out.print(i);
    }
    System.out.println("\n");

    /* output: 9630 */
    for (int i = 9; i >= 0; i -= 3) {
      System.out.print(i);
    }
    System.out.println("\n");

    /*
     * output:
     * i = 0, j = 5
     * i = 1, j = 4
     * i = 2, j = 3
     */
    for (int i = 0, j = 5; i < j; i++, j--) {
      System.out.println("i = " + i + ", j = " + j);
    }

    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }

    /* output: 12345 */
    for (int i = 0; i < numbers.length; ++i) {
      System.out.print(numbers[i]);
    }
    System.out.println("\n");

    /* output: 12345 */
    for (int number : numbers) {
      System.out.print(number);
    }
    System.out.println("\n");

    /*
     * 1 2 3 4 5
     */
    int x = 0;
    while (true) {
      x++;
      System.out.print(x + "");
      if (x == 5) {
        break;
      }
    }
    System.out.println();

    /*
     * 1 2 3 4 5
     */
    int i = 0;
    do {
      i++;
      System.out.print(i + "");
      if (i == 5) {
        break;
      }
    } while (true);
    System.out.println();

    /* infinite loop */
    /*
    for (; ; ) {
        do some work
    }
    */

  }
}
