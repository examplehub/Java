package com.examplehub.sorts;

public class InsertionSortRecursion implements Sort {
  @Override
  public void sort(int[] numbers) {
    sortRecursion(numbers, 1);
  }

  /**
   * InsertionSort algorithm implements using recursion.
   *
   * @param numbers the numbers to be sorted.
   * @param index the index of the insert value.
   */
  public void sortRecursion(int[] numbers, int index) {
    if (index == numbers.length) {
      return;
    }
    int insertValue = numbers[index];
    int i = index - 1;
    while (i >= 0 && insertValue < numbers[i]) {
      numbers[i + 1] = numbers[i];
      i--;
    }
    if (i != index - 1) {
      numbers[i + 1] = insertValue;
    }
    sortRecursion(numbers, index + 1);
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    sortRecursion(array, 1);
  }

  /**
   * Generic InsertionSort algorithm implements using recursion.
   *
   * @param array the array to be sorted.
   * @param index the index of the insert value.
   * @param <T> the class of the objects in the array.
   */
  public <T extends Comparable<T>> void sortRecursion(T[] array, int index) {
    if (index == array.length) {
      return;
    }
    T insertValue = array[index];
    int i = index - 1;
    while (i >= 0 && insertValue.compareTo(array[i]) < 0) {
      array[i + 1] = array[i];
      i--;
    }
    if (i != index - 1) {
      array[i + 1] = insertValue;
    }
    sortRecursion(array, index + 1);
  }
}
