package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

  @Test
  void testPrimeFactors() {
    assertTrue(Arrays.equals(new int[] {2}, PrimeFactors.primeFactors(2)));
    assertTrue(Arrays.equals(new int[] {2, 2, 3}, PrimeFactors.primeFactors(12)));
    assertTrue(Arrays.equals(new int[] {3, 3, 5, 7}, PrimeFactors.primeFactors(315)));
  }
}
