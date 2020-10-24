package com.examplehub.datastructures.array;

public class MergeSortedArray {
  public static int[] merge(int[] firstArray, int[] secondArray) {

    int[] result = new int[firstArray.length + secondArray.length];
    int i = 0; /* index of first array */
    int j = 0; /* index of second array */
    int k = 0; /* index of result array */

    while (i < firstArray.length && j < secondArray.length) {
      if (firstArray[i] <= secondArray[j]) {
        result[k++] = firstArray[i++];
      } else {
        result[k++] = secondArray[j++];
      }
    }

    while (i < firstArray.length) {
        /* store left element of first array */
      result[k++] = firstArray[i++];
    }

    while (j < secondArray.length) {
        /* store left element of second array */
      result[k++] = secondArray[j++];
    }
    return result;
  }
}
