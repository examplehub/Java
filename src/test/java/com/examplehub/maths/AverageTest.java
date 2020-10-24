package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTest {

  @Test
  void testAverage() {
    assertEquals(12.0, Average.average(new double[] {3, 6, 9, 12, 15, 18, 21}));
    assertEquals(5.5, Average.average(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    assertEquals(3.3, Average.average(new double[] {1.1, 2.2, 3.3, 4.4, 5.5}));
  }
}
