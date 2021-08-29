package com.examplehub.basics.oop;

public class StaticFieldFunctionExample {
  private static int count;
  private int num;

  public StaticFieldFunctionExample() {
    num++;
    count++;
  }

  public static int getCount() {
    return count;
  }

  public int getNum() {
    return num;
  }
}
