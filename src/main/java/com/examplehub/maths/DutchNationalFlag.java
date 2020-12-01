package com.examplehub.maths;

/** https://en.wikipedia.org/wiki/Dutch_national_flag_problem */
public class DutchNationalFlag {

  public static void sort(int[] array) {
    int readFlags = 0;
    int whiteFlags = 0;
    int blueFlags = 0;
    for (int number : array) {
      if (number == 0) {
        readFlags++;
      } else if (number == 1) {
        whiteFlags++;
      } else {
        blueFlags++;
      }
    }

    for (int i = 0; i < array.length; ++i) {
      if (readFlags > 0) {
        array[i] = 0;
        readFlags--;
      } else if (whiteFlags > 0) {
        array[i] = 1;
        whiteFlags--;
      } else if (blueFlags > 0) {
        array[i] = 2;
        blueFlags--;
      }
    }
  }
}
