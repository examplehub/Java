package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndexOutOfBoundsExceptionExampleTest {
  @Test
  void testArrayAccess() {
    int[] nums = {1, 2, 3, 4, 5};
    try {
      int sum = 0;
      for (int i = 0; i <= nums.length; ++i) {
        sum += nums[i];
      }
      System.out.println("sum = " + sum);
      fail();
    } catch (IndexOutOfBoundsException e) {
      assertTrue(true);
    }
  }
}
