package com.examplehub.matrix;

import com.examplehub.maths.SumToN;

public class LowerTriangleMatrix {
  public static int[] storeTriangleMatrix(int[][] src) {
    int length = SumToN.sum(src.length);
    int[] dest = new int[length];

    int k = 0;
    for (int i = 0; i < src.length; i++) {
      for (int j = 0; j <= i; j++) {
        dest[k++] = src[i][j];
      }
    }
    return dest;
  }

  public static int get(int[] dest, int i, int j) {
    if (i < j) {
      return 0;
    }
    return dest[SumToN.sum(i) + j];
  }
}
