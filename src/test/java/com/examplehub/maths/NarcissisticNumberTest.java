package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NarcissisticNumberTest {
  @Test
  void test() {
    for (int i = 0; i <= 9; ++i) {
      assertTrue(NarcissisticNumber.isNarcissisticNumber(i));
      assertTrue(NarcissisticNumber.isNarcissisticNumber(-i));
    }

    assertTrue(NarcissisticNumber.isNarcissisticNumber(153));
    assertTrue(NarcissisticNumber.isNarcissisticNumber(370));
    assertTrue(NarcissisticNumber.isNarcissisticNumber(371));
    assertTrue(NarcissisticNumber.isNarcissisticNumber(407));
    assertTrue(NarcissisticNumber.isNarcissisticNumber(1634));
    assertTrue(NarcissisticNumber.isNarcissisticNumber(8208));
    assertTrue(NarcissisticNumber.isNarcissisticNumber(9474));
  }
}
