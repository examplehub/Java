package com.examplehub.maths;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {
  @Test
  void test() {
    assertEquals(
        Arrays.toString(new int[] {5, -1, 4, 5, -1}),
        Arrays.toString(NextGreaterElement.nextGreater(new int[] {2, 5, 3, 4, 5})));
  }
}
