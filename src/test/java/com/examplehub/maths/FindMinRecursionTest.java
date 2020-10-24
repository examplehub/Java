package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.examplehub.utils.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMinRecursionTest {

  private int[] numbers;

  @BeforeEach
  void setup() {
    numbers = RandomUtils.randomInts(-50, 50, 50);
  }

  @Test
  void test() {
    int min = FindMinRecursion.min(numbers, numbers.length);
    for (int number : numbers) {
      assertTrue(min <= number);
    }

    int left = 0;
    int right = numbers.length - 1;
    min = FindMinRecursion.min(numbers, left, right);
    for (int number : numbers) {
      assertTrue(min <= number);
    }
  }
}
