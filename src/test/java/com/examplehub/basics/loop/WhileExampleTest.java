package com.examplehub.basics.loop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WhileExampleTest {
  @Test
  void testCount() {
    int count = 1;
    while (count < 5) {
      count++;
    }
    assertEquals(5, count);

    count = 10;
    while (count > 5) {
      count--;
    }
    assertEquals(5, count);
  }

  @Test
  void testSum() {
    /*
     * sum: 1 + 2 + 3 + 4 + 5
     */
    int i = 1;
    int sum = 0;
    while (i <= 100) {
      sum += i;
      i++;
    }
    assertEquals(5050, sum);

    /*
     * sum: 10 + 11 + 12 + 13 + ... + 20
     */
    sum = 0;
    i = 10;
    int limit = 20;
    while (i <= limit) {
      sum = sum + i;
      i++;
    }
    assertEquals(165, sum);
  }

  @Test
  void testNonInflateLoop() {
    int i = 0;
    while (i >= 0) {
      i++;
    }
    assertTrue(true);
    assertEquals(Integer.MIN_VALUE, i);
  }
}
