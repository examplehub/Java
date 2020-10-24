package com.examplehub.maths;

public class LeapYear {

  /**
   * Test if a year is leap year.
   *
   * @param year the year to be checked.
   * @return {@code true} if the year is leap year, otherwise {@code false}.
   */
  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
}
