package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeCheckTest {

  @Test
  void isPrime() {
    assertFalse(PrimeCheck.isPrime(-1));
    assertFalse(PrimeCheck.isPrime(0));
    assertFalse(PrimeCheck.isPrime(1));

    for (int i = 4; i <= 100; i += 2) {
      assertFalse(PrimeCheck.isPrime(i));
    }

    assertTrue(PrimeCheck.isPrime(2));
    assertTrue(PrimeCheck.isPrime(3));
    assertTrue(PrimeCheck.isPrime(5));
    assertTrue(PrimeCheck.isPrime(7));
    assertTrue(PrimeCheck.isPrime(97));
  }
}
