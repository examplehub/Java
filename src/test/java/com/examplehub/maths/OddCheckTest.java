package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.examplehub.utils.RandomUtils;
import org.junit.jupiter.api.Test;

class OddCheckTest {

  @Test
  void isOdd() {
    for (int i = -99; i <= 99; i += 2) {
      assertTrue(OddCheck.isOdd(i));
    }
  }

  @Test
  void isOddFaster() {
    for (int i = -99; i <= 99; i += 2) {
      assertTrue(OddCheck.isOddFaster(i));
    }
  }

  void testSpeed() {
    int[] ints = RandomUtils.randomInts(-1000, 1000, Integer.MAX_VALUE);

    long startTime = System.nanoTime();
    for (int j : ints) {
      boolean isOdd = OddCheck.isOdd(j);
    }
    long slowTime = System.nanoTime() - startTime;

    startTime = System.nanoTime();
    for (int anInt : ints) {
      boolean isOdd = OddCheck.isOddFaster(anInt);
    }
    long fasterTime = System.nanoTime() - startTime;

    assertTrue(fasterTime < slowTime);
  }
}
