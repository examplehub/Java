package com.examplehub.leetcode.middle;

/** https://leetcode.com/problems/search-a-2d-matrix/ */
public class SearchA2dMatrix {
  public static boolean solution1(int[][] matrix, int target) {
    for (int[] rows : matrix) {
      for (int item : rows) {
        if (target == item) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean solution2(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    int rows = matrix.length;
    int columns = matrix[0].length;
    for (int row = 0, col = columns - 1; row < rows && col >= 0; ) {
      int number = matrix[row][col];
      if (number == target) {
        return true;
      } else if (number < target) {
        row++;
      } else {
        col--;
      }
    }
    return false;
  }
}
