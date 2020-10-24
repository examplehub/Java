package com.examplehub.searches;

public interface Search {
  int search(int[] numbers, int key);

  <T extends Comparable<T>> int search(T[] array, T key);
}
