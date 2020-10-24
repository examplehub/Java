package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.examplehub.utils.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMinTest {
  private int[] numbers;

  @BeforeEach
  public void setup() {
    numbers = RandomUtils.randomInts(-50, 50, 100);
  }

  @Test
  void testFindMax() {
    int min = FindMin.findMin(numbers);
    for (int number : numbers) {
      assertTrue(min <= number);
    }
  }

  @Test
  void testFindMaxSecond() {
    int min = FindMin.findMinSecond(numbers);
    for (int number : numbers) {
      assertTrue(min <= number);
    }
  }
}
