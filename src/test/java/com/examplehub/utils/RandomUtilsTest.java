package com.examplehub.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomUtilsTest {

  @Test
  void testRandomInts() {

    try {
      int[] ints = RandomUtils.randomInts(50, -50, 10);
      fail(); /* will not happen */
    } catch (IllegalArgumentException e) {
      assertTrue(true); /* will happen */
    }

    int[] ints = RandomUtils.randomInts(-50, 50, 100);
    for (int anInt : ints) {
      assertTrue(anInt >= -50 && anInt <= 50);
    }
    assertTrue(true);
  }

  @Test
  void testRandomDoubles() {
    try {
      double[] ints = RandomUtils.randomDoubles(50, -50, 10);
      fail(); /* will not happen */
    } catch (IllegalArgumentException e) {
      assertTrue(true); /* will happen */
    }

    double[] doubles = RandomUtils.randomDoubles(-50, 50, 100);
    for (double anDouble : doubles) {
      assertTrue(anDouble >= -50 && anDouble <= 50);
    }
    assertTrue(true);
  }

  @Test
  void testRandomLetters() {
    assert RandomUtils.randomLetters(8).length() == 8;
  }
}
