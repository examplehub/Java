package com.examplehub.leetcode.middle;

/** https://leetcode.com/problems/valid-sudoku/ */
public class ValidSudoku {
  public static boolean solution1(char[][] board) {

    // travel all rows to check
    for (int i = 0; i < 9; i++) {
      int[] digitTable = new int[10];
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.') {
          digitTable[board[i][j] - '0']++;
        }
      }
      if (containsRepeat(digitTable)) {
        return false;
      }
    }

    // travel all columns to check
    for (int i = 0; i < 9; i++) {
      int[] digitTable = new int[10];
      for (int j = 0; j < 9; j++) {
        if (board[j][i] != '.') {
          digitTable[board[j][i] - '0']++;
        }
      }
      if (containsRepeat(digitTable)) {
        return false;
      }
    }
    // travel all sub-box
    // TODO
    return true;
  }

  public static boolean containsRepeat(int[] table) {
    for (int num : table) {
      if (num > 1) {
        return true;
      }
    }
    return false;
  }

  public static boolean solution2(char[][] board) {
    int[][] rows = new int[9][9];
    int[][] cols = new int[9][9];
    int[][][] subBoxes = new int[3][3][9];
    for (int i = 0; i < 9; ++i) {
      for (int j = 0; j < 9; ++j) {
        if (board[i][j] != '.') {
          int index = board[i][j] - '1';
          rows[i][index]++;
          cols[j][index]++;
          subBoxes[i / 3][j / 3][index]++;
          if (rows[i][index] > 1 || cols[j][index] > 1 || subBoxes[i / 3][j / 3][index] > 1) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
