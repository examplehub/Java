package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SortArrayByParityTest {
  @Test
  void testSolution1() {
    int[] nums = {3, 1, 2, 4};
    assertEquals(
        Arrays.toString(SortArrayByParity.solution1(nums)),
        Arrays.toString(new int[] {2, 4, 3, 1}));
  }
}
