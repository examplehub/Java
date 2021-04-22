package com.examplehub.datastructures.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {
  @Test
  void testReverse() {
    int[] array = IntStream.range(1, 6).toArray();
    ReverseArray.reverse(array);
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, array);
  }
}
