package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class RangeTest {
  @Test
  void testRange() {
    assertTrue(Arrays.equals(new int[] {0, 1, 2, 3, 4}, Range.range(5)));
    assertTrue(Arrays.equals(new int[] {10, 11, 12, 13, 14, 15}, Range.range(10, 16)));
    assertTrue(Arrays.equals(new int[] {1, 3, 5, 7, 9}, Range.range(1, 10, 2)));
  }
}
