package com.examplehub.matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortMatrixTest {
  @Test
  void test() {
    int[][] matrix = {
      {1, 3, 5},
      {2, 4, 6},
      {7, 8, 9, 10}
    };
    SortMatrix.sort(matrix);

    int value = 1;
    for (int[] ints : matrix) {
      for (int number : ints) {
        System.out.println(number);
        assertEquals(value++, number);
      }
    }
  }
}
