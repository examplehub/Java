package com.examplehub.maths;

public class Ceil {
  public static int ceil(double number) {
    return number - (int) number <= 0 ? (int) number : (int) number + 1;
  }
}
