package com.examplehub.basics.condition;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please input first number:");
    int firstNumber = scanner.nextInt();
    System.out.println("Please input second number:");
    int secondNumber = scanner.nextInt();

    if (firstNumber == secondNumber) {
      System.out.println(firstNumber + " == " + secondNumber);
    } else {
      System.out.println(firstNumber + " != " + secondNumber);
    }
  }
}
