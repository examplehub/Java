package com.examplehub.basics;

public class DataType {
  public static void main(String[] args) {
    byte flag = 1;
    System.out.println(flag);
    System.out.println(Byte.SIZE);

    char num = 'a';
    System.out.println(num);
    System.out.println(Character.SIZE);

    short age = 123;
    System.out.println(age);
    System.out.println(Short.SIZE);

    int number = 123456;
    System.out.println(number);
    System.out.println(Integer.SIZE);

    long bigNumber = 123456789;
    System.out.println(bigNumber);
    System.out.println(Long.SIZE);

    float pi = 3.1415926f;
    System.out.println(pi);
    System.out.println(Float.SIZE);

    double price = 2.50;
    System.out.println(price);
    System.out.println(Double.SIZE);

    boolean swapped = true;
    System.out.println(swapped);

    boolean yesOrNo = false;
    System.out.println(yesOrNo);

    String name = "Java";
    System.out.println(name);
  }
}
