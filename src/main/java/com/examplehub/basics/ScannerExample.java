package com.examplehub.basics;

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int intNumber = sc.nextInt();
    System.out.println("int number = " + intNumber);

    float floatNumber = sc.nextFloat();
    System.out.println("float number = " + floatNumber);

    double doubleNumber = sc.nextDouble();
    System.out.println("double number = " + doubleNumber);

    boolean bool = sc.nextBoolean();
    System.out.println("bool = " + bool);

    String string = sc.next();
    System.out.println("string = " + string);

    char character = sc.next().charAt(0);
    System.out.println("character = " + character);


    sc.close();
  }
}
