package com.examplehub.basics.system;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SystemExampleTest {
  @Test
  void testCurrentTime() {
    long startTime = System.currentTimeMillis();
    int sum = 0;
    for (int i = 1; i <= 100; ++i) {
      sum += i;
    }
    assertEquals(5050, sum);
    long endTime = System.currentTimeMillis();
    assertTrue(endTime >= startTime);
  }
}
