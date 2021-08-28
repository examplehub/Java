package com.examplehub.basics.condition;

import java.util.Scanner;

public class IfElseifElse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please input a number:");
    int number = scanner.nextInt();
    if (number > 0) {
      System.out.println(number + " is positive number");
    } else if (number < 0) {
      System.out.println(number + " is negative number");
    } else {
      System.out.println("input is zero");
    }

    System.out.println("Please input a day:");
    int day = scanner.nextInt();

    if (day == 1) {
      System.out.println("Monday");
    } else if (day == 2) {
      System.out.println("Tuesday");
    } else if (day == 3) {
      System.out.println("Wednesday");
    } else if (day == 4) {
      System.out.println("Thursday");
    } else if (day == 5) {
      System.out.println("Friday");
    } else if (day == 6) {
      System.out.println("Saturday");
    } else if (day == 7) {
      System.out.println("Sunday");
    } else {
      System.out.println("Invalid day");
    }
  }
}
