package com.examplehub.datastructures.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

  @Test
  void testMerge() {
    int[] firstArray = {1, 3, 5, 7, 9};
    int[] secondArray = {2, 4, 6, 8, 10};
    assertArrayEquals(IntStream.range(1, 11).toArray(), MergeSortedArray.merge(firstArray, secondArray));
  }
}
