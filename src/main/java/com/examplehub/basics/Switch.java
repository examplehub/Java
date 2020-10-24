package com.examplehub.basics;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please input your score (0-100):");
    int score = scanner.nextInt();

    if (score < 0 || score > 100) {
      System.out.println("Invalid score");
    } else {
      char level;
      switch (score / 10) {
        case 10:
        case 9:
          level = 'A';
          break;
        case 8:
          level = 'B';
          break;
        case 7:
          level = 'C';
          break;
        case 6:
          level = 'D';
          break;
        default:
          level = 'E';
          break;
      }
      System.out.println(score + " is level " + level);
    }
  }
}
