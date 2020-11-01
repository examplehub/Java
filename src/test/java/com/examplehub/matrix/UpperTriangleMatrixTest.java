package com.examplehub.matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpperTriangleMatrixTest {
  @Test
  void test() {
    int[][] matrix = {
      {1, 4, 1},
      {0, 6, 4},
      {0, 0, 1}
    };

    int[] dest = UpperTriangleMatrix.storeTriangleMatrix(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        //        assertEquals(matrix[i][j], UpperTriangleMatrix.get(dest, i, j)); TODO
      }
    }
  }
}
