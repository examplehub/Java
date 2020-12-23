package com.examplehub.leetcode.middle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SortColorTest {
  @Test
  void testSolution1() {
    int[] array = {2, 0, 2, 1, 1, 0};
    SortColor.solution1(array);
    assertEquals(Arrays.toString(array), Arrays.toString(new int[] {0, 0, 1, 1, 2, 2}));

    int[] array1 = {2, 0, 1};
    SortColor.solution1(array1);
    assertEquals(Arrays.toString(array1), Arrays.toString(new int[] {0, 1, 2}));

    int[] array2 = {1};
    SortColor.solution1(array2);
    assertEquals(Arrays.toString(array2), Arrays.toString(new int[] {1}));
  }
}
