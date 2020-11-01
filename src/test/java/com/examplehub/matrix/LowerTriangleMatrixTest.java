package com.examplehub.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerTriangleMatrixTest {
  @Test
  void test() {
    int[][] matrix = {
      {1, 0, 0},
      {2, 8, 0},
      {4, 9, 7}
    };

    int[] dest = LowerTriangleMatrix.storeTriangleMatrix(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        assertEquals(matrix[i][j], LowerTriangleMatrix.get(dest, i, j));
      }
    }
  }
}
