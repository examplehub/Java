package com.examplehub.datastructures.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

  @Test
  void testMerge() {
    int[] firstArray = {1, 3, 5, 7, 9};
    int[] secondArray = {2, 4, 6, 8, 10};
    assertArrayEquals(
        IntStream.range(1, 11).toArray(), MergeSortedArray.merge(firstArray, secondArray));
  }
}
