package com.examplehub.sorts;

import com.examplehub.utils.SortUtils;

public class HeapSort implements Sort{

  @Override
  public void sort(int[] numbers) {
    heapInsert(numbers);
    int length = numbers.length;
    while (length > 1) {
      SortUtils.swap(numbers, 0, --length);
      heapify(numbers, 0, length);
    }
  }

  public void heapInsert(int[] numbers) {
    for (int i = 0; i < numbers.length; ++i) {
      int currentIndex = i;
      int parentIndex = (currentIndex - 1) / 2;
      while (numbers[currentIndex] > numbers[parentIndex]) {
        SortUtils.swap(numbers, currentIndex, parentIndex);
        currentIndex = parentIndex;
        parentIndex = (currentIndex - 1) / 2;
      }
    }
  }

  public void heapify(int[] numbers, int index, int length) {
    int leftIndex = 2 * index + 1;
    int rightIndex = 2 * index + 2;
    while (leftIndex < length) {
      int maxIndex = index;
      if (numbers[leftIndex] > numbers[maxIndex]) {
        maxIndex = leftIndex;
      }
      if (rightIndex < length && numbers[rightIndex] > numbers[maxIndex]) {
        maxIndex = rightIndex;
      }
      if (maxIndex == index) {
        break;
      }
      SortUtils.swap(numbers, maxIndex, index);
      index = maxIndex;
      leftIndex = 2 * index + 1;
      rightIndex = 2 * index + 2;
    }
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    heapInsert(array);
    int length = array.length;
    while (length > 1) {
      SortUtils.swap(array, 0, --length);
      heapify(array, 0, length);
    }
  }

  public <T extends Comparable<T>>void heapInsert(T[] numbers) {
    for (int i = 0; i < numbers.length; ++i) {
      int currentIndex = i;
      int parentIndex = (currentIndex - 1) / 2;
      while (numbers[currentIndex].compareTo(numbers[parentIndex]) > 0) {
        SortUtils.swap(numbers, currentIndex, parentIndex);
        currentIndex = parentIndex;
        parentIndex = (currentIndex - 1) / 2;
      }
    }
  }

  public <T extends Comparable<T>> void heapify(T[] numbers, int index, int length) {
    int leftIndex = 2 * index + 1;
    int rightIndex = 2 * index + 2;
    while (leftIndex < length) {
      int maxIndex = index;
      if (numbers[leftIndex].compareTo(numbers[maxIndex]) > 0) {
        maxIndex = leftIndex;
      }
      if (rightIndex < length && numbers[rightIndex].compareTo(numbers[maxIndex]) > 0) {
        maxIndex = rightIndex;
      }
      if (maxIndex == index) {
        break;
      }
      SortUtils.swap(numbers, maxIndex, index);
      index = maxIndex;
      leftIndex = 2 * index + 1;
      rightIndex = 2 * index + 2;
    }
  }
}
