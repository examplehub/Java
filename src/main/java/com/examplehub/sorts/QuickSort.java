package com.examplehub.sorts;

public class QuickSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    quickSort(numbers, 0, numbers.length - 1);
  }

  private int partition(int[] number, int left, int right) {
    int pivot = number[left];
    while (left != right) {
      while (left != right && number[right] >= pivot) {
        right--;
      }
      number[left] = number[right];
      while (left != right && number[left] <= pivot) {
        left++;
      }
      number[right] = number[left];
    }
    number[left] = pivot;
    return left;
  }

  /**
   * QuickSort algorithm implements.
   *
   * @param numbers the numbers to be sorted.
   */
  public void quickSort(int[] numbers, int left, int right) {
    if (left < right) {
      int pivotIndex = partition(numbers, left, right);
      quickSort(numbers, left, pivotIndex - 1);
      quickSort(numbers, pivotIndex + 1, right);
    }
  }

  /**
   * Generic quickSort algorithm implements.
   *
   * @param array the array to be sorted.
   * @param <T> the class of the objects in the array.
   */
  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    quickSort(array, 0, array.length - 1);
  }

  private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
    T pivot = array[left];
    while (left != right) {
      while (left != right && array[right].compareTo(pivot) >= 0) {
        right--;
      }
      array[left] = array[right];
      while (left != right && array[left].compareTo(pivot) <= 0) {
        left++;
      }
      array[right] = array[left];
    }
    array[left] = pivot;
    return left;
  }

  public static <T extends Comparable<T>> void quickSort(T[] array, int left, int right) {
    if (left < right) {
      int pivotIndex = partition(array, left, right);
      quickSort(array, left, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, right);
    }
  }
}
