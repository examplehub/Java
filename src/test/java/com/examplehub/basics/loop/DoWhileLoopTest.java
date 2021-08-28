package com.examplehub.basics.loop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoWhileLoopTest {
  @Test
  void testCount() {
    int count = 1;
    do {
      count++;
    } while (count < 5);
    assertEquals(5, count);

    count = 5;
    do {
      count--;
    } while (count > 0);
    assertEquals(0, count);
  }

  @Test
  void testSum() {
    int sum = 0;
    int i = 1;
    do {
      sum += i;
      i++;
    } while (i <= 100);
    assertEquals(5050, sum);

    i = 10;
    sum = 0;
    int limit = 20;
    do {
      sum = sum + i;
      i++;
    } while (i <= limit);
    assertEquals(165, sum);
  }
}
