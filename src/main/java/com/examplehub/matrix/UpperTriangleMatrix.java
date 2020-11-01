package com.examplehub.matrix;

import com.examplehub.maths.SumToN;

public class UpperTriangleMatrix {
  public static int[] storeTriangleMatrix(int[][] src) {
    int length = SumToN.sum(src.length);
    int[] dest = new int[length];
    int k = 0;
    for (int i = 0; i < src.length; i++) {
      for (int j = i; j < src.length; j++) {
        dest[k++] = src[i][j];
      }
    }
    return dest;
  }

  public static int get(int[] dest, int i, int j) {
    if (i > j) {
      return 0;
    }
    int index = dest.length - SumToN.sum(i) - j; // TODO
    return dest[index];
  }
}
