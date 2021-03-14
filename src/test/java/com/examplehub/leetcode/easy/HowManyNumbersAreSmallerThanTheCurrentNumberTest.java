package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {
  @Test
  void testSolution1() {
    int[] nums = {8, 1, 2, 2, 3};
    assertEquals(
        Arrays.toString(HowManyNumbersAreSmallerThanTheCurrentNumber.solution1(nums)),
        Arrays.toString(new int[] {4, 0, 1, 1, 3}));

    nums = new int[] {6, 5, 4, 8};
    assertEquals(
        Arrays.toString(HowManyNumbersAreSmallerThanTheCurrentNumber.solution1(nums)),
        Arrays.toString(new int[] {2, 1, 0, 3}));

    nums = new int[] {7, 7, 7, 7};
    assertEquals(
        Arrays.toString(HowManyNumbersAreSmallerThanTheCurrentNumber.solution1(nums)),
        Arrays.toString(new int[] {0, 0, 0, 0}));
  }
}
