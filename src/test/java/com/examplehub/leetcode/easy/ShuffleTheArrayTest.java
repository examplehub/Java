package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShuffleTheArrayTest {
  @Test
  void testSolution1() {
    int[] nums = {2, 5, 1, 3, 4, 7};
    ShuffleTheArray.solution1(nums, 3);
    assertEquals(Arrays.toString(nums), Arrays.toString(new int[] {2, 3, 5, 4, 1, 7}));
  }
}
