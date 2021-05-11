package com.examplehub.sorts;

public class ShellSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    for (int length = numbers.length, gap = length >> 1; gap > 0; gap >>= 1) {
      for (int i = gap; i < length; ++i) {
        int insertValue = numbers[i];
        int j;
        for (j = i - gap; j >= 0 && insertValue < numbers[j]; j -= gap) {
          numbers[j + gap] = numbers[j];
        }
        if (j != i - gap) {
          numbers[j + gap] = insertValue;
        }
      }
    }
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    for (int length = array.length, gap = length >> 1; gap > 0; gap >>= 1) {
      for (int i = gap; i < length; ++i) {
        T insertValue = array[i];
        int j;
        for (j = i - gap; j >= 0 && insertValue.compareTo(array[j]) < 0; j -= gap) {
          array[j + gap] = array[j];
        }
        if (j != i - gap) {
          array[j + gap] = insertValue;
        }
      }
    }
  }
}
