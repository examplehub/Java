package com.examplehub.maths;

import com.examplehub.utils.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FindMaxRecursionTest {

  private int[] numbers;

  @BeforeEach
  void setup() {
    numbers = RandomUtils.randomInts(-50, 50, 50);
  }

  @Test
  void test() {
    int max = FindMaxRecursion.max(numbers, numbers.length);
    for (int number : numbers) {
      assertTrue(max >= number);
    }

    int left = 0;
    int right = numbers.length - 1;
    max = FindMaxRecursion.max(numbers, left, right);
    for (int number : numbers) {
      assertTrue(max >= number);
    }
  }
}
