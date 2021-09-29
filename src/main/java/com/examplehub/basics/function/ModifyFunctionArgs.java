package com.examplehub.basics.function;

public class ModifyFunctionArgs {
  static class MyObj {
    public int age = -1;
  }

  public static void modify(int num, String str, Integer integer, int[] array, MyObj obj) {
    num = num + 1;
    str = "<" + str + ">";
    integer = integer + 1;
    array[0] = -array[0];
    obj.age = -obj.age;
  }
}
