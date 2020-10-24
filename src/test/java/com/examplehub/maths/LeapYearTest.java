package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

  @Test
  void testLeapYear() {
    assertTrue(LeapYear.isLeapYear(1600));
    assertTrue(LeapYear.isLeapYear(2000));
    assertFalse(LeapYear.isLeapYear(1700));
    assertFalse(LeapYear.isLeapYear(1800));
    assertFalse(LeapYear.isLeapYear(1900));
  }
}
