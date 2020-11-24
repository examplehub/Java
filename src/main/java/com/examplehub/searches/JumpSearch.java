package com.examplehub.searches;

public class JumpSearch implements Search {
  @Override
  public int search(int[] numbers, int key) {
    int length = numbers.length;
    int steps = (int) Math.floor(Math.sqrt(length));
    int prev = 0;
    while (numbers[Math.min(steps, length) - 1] < key) {
      prev = steps;
      steps += (int) Math.floor(Math.sqrt(length));
      if (prev >= length) {
        return -1;
      }
    }
    while (numbers[prev] < key) {
      prev++;
      if (prev == Math.min(steps, length)) {
        return -1;
      }
    }
    if (numbers[prev] == key) {
      return prev;
    }
    return -1;
  }

  @Override
  public <T extends Comparable<T>> int search(T[] array, T key) {
    return 0;
  }
}
