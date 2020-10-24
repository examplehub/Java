package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.examplehub.utils.RandomUtils;
import org.junit.jupiter.api.Test;

class EvenCheckTest {

  @Test
  void isEven() {
    for (int i = -100; i <= 100; i += 2) {
      assertTrue(EvenCheck.isEven(i));
    }
  }

  @Test
  void isEvenFaster() {
    for (int i = -100; i <= 100; i += 2) {
      assertTrue(EvenCheck.isEvenFaster(i));
    }
  }

  void testSpeed() {
    int[] ints = RandomUtils.randomInts(-1000, 1000, Integer.MAX_VALUE);

    long startTime = System.nanoTime();
    for (int j : ints) {
      boolean isEven = EvenCheck.isEven(j);
    }
    long slowTime = System.nanoTime() - startTime;

    startTime = System.nanoTime();
    for (int anInt : ints) {
      boolean isEven = EvenCheck.isEven(anInt);
    }
    long fasterTime = System.nanoTime() - startTime;

    assertTrue(fasterTime < slowTime);
  }
}
