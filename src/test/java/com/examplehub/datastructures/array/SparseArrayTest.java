package com.examplehub.datastructures.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SparseArrayTest {
  @Test
  void testWrite() {
    int[][] origin = {
      {11, 22, 0, 0, 0, 0, 0},
      {0, 33, 44, 0, 0, 0, 0},
      {0, 0, 55, 66, 77, 0, 0},
      {0, 0, 0, 0, 0, 88, 0},
      {0, 0, 0, 0, 0, 0, 99}
    };

    int[][] compression =
        new int[][] {
          {5, 7, 9},
          {0, 0, 11},
          {0, 1, 22},
          {1, 1, 33},
          {1, 2, 44},
          {2, 2, 55},
          {2, 3, 66},
          {2, 4, 77},
          {3, 5, 88},
          {4, 6, 99}
        };
    assertTrue(Arrays.deepEquals(compression, SparseArray.write(origin)));
  }

  @Test
  void testRead() {
    int[][] origin = {
      {11, 22, 0, 0, 0, 0, 0},
      {0, 33, 44, 0, 0, 0, 0},
      {0, 0, 55, 66, 77, 0, 0},
      {0, 0, 0, 0, 0, 88, 0},
      {0, 0, 0, 0, 0, 0, 99}
    };

    int[][] compression =
        new int[][] {
          {5, 7, 9},
          {0, 0, 11},
          {0, 1, 22},
          {1, 1, 33},
          {1, 2, 44},
          {2, 2, 55},
          {2, 3, 66},
          {2, 4, 77},
          {3, 5, 88},
          {4, 6, 99}
        };
    assertTrue(Arrays.deepEquals(origin, SparseArray.read(compression)));
  }

  @Test
  void testWriteRead() {
    int[][] origin = {
      {11, 22, 0, 0, 0, 0, 0},
      {0, 33, 44, 0, 0, 0, 0},
      {0, 0, 55, 66, 77, 0, 0},
      {0, 0, 0, 0, 0, 88, 0},
      {0, 0, 0, 0, 0, 0, 99}
    };

    int[][] compression =
        new int[][] {
          {5, 7, 9},
          {0, 0, 11},
          {0, 1, 22},
          {1, 1, 33},
          {1, 2, 44},
          {2, 2, 55},
          {2, 3, 66},
          {2, 4, 77},
          {3, 5, 88},
          {4, 6, 99}
        };
    assertTrue(Arrays.deepEquals(origin, SparseArray.read(SparseArray.write(origin))));
  }
}
