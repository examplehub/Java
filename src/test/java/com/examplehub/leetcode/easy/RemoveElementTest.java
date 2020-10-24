package com.examplehub.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

  @Test
  void testSolution1() {
    int[] ints = new int[] {3, 2, 2, 3};
    assertEquals(2, RemoveElement.solution1(ints, 3));
    assertTrue(ints[0] == 2 && ints[1] == 2);

    ints = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
    assertEquals(5, RemoveElement.solution1(ints, 2));
    int[] newInts = {0, 1, 3, 0, 4};
    for (int i = 0; i < newInts.length; i++) {
      assertEquals(ints[i], newInts[i]);
    }
  }

  @Test
  void testSolution2() {
    int[] ints = new int[] {3, 2, 2, 3};
    assertEquals(2, RemoveElement.solution2(ints, 3));
    assertTrue(ints[0] == 2 && ints[1] == 2);

    ints = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
    assertEquals(5, RemoveElement.solution2(ints, 2));
    int[] newInts = {0, 1, 3, 0, 4};
    for (int i = 0; i < newInts.length; i++) {
      assertEquals(ints[i], newInts[i]);
    }
  }
}
