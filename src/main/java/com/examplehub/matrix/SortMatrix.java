package com.examplehub.matrix;

import java.util.Arrays;

public class SortMatrix {
  public static void sort(int[][] matrix) {
    int size = 0;
    for (int[] ints : matrix) {
      size += ints.length;
    }

    int[] temp = new int[size];
    int count = 0;
    for (int[] ints : matrix) {
      for (int number : ints) {
        temp[count++] = number;
      }
    }
    Arrays.sort(temp);

    count = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = temp[count++];
      }
    }
  }
}
