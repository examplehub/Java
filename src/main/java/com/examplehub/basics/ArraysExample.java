package com.examplehub.basics;

import java.util.Arrays;

public class ArraysExample {
  public static void main(String[] args) {
    int[] unSorted = {1, 3, 5, 7, 9, 2, 4, 6, 8};
    Arrays.sort(unSorted);

    /*
     * [1, 2, 3, 4, 5, 6, 7, 8, 9]
     */
    System.out.println(Arrays.toString(unSorted));

    /*
     * 0	1	2	3	4	5	6	7	8
     */
    for (int key : unSorted) {
      System.out.print(Arrays.binarySearch(unSorted, key) + "\t");
    }
    System.out.println();
  }
}
