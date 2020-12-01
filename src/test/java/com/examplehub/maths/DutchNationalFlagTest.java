package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DutchNationalFlagTest {
  @Test
  void test() {
    int[] array = {1, 0, 2, 0, 1, 1, 2, 0};
    DutchNationalFlag.sort(array);
    for (int i = 0; i < array.length; ++i) {
      if (i <= 2) {
        assertEquals(array[i], 0);
      } else if (i <= 5) {
        assertEquals(array[i], 1);
      } else {
        assertEquals(array[i], 2);
      }
    }
  }
}
