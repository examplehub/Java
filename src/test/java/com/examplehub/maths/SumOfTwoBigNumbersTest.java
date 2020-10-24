package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfTwoBigNumbersTest {

  @Test
  void sum() {
    assertEquals("100", SumOfTwoBigNumbers.sum("40", "60"));
    assertEquals("1000000000000", SumOfTwoBigNumbers.sum("400000000000", "600000000000"));

    assertEquals(
        SumOfTwoBigNumbers.sum("1234567891011121314151617", "1234567891011121314151617"),
        "2469135782022242628303234");
  }

  @Test
  void sumOf() {
    assertEquals("1000000000000", SumOfTwoBigNumbers.sumOf("400000000000", "600000000000"));
    assertEquals(
        SumOfTwoBigNumbers.sumOf("1234567891011121314151617", "1234567891011121314151617"),
        "2469135782022242628303234");
  }
}
