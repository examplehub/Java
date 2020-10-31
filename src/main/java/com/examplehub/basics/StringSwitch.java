package com.examplehub.basics;

public class StringSwitch {
  public static void main(String[] args) {
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    /*
     * output:
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     */
    for (String day : days) {
      switch (day) {
        case "Monday":
          System.out.println(1);
          break;
        case "Tuesday":
          System.out.println(2);
          break;
        case "Wednesday":
          System.out.println(3);
          break;
        case "Thursday":
          System.out.println(4);
          break;
        case "Friday":
          System.out.println(5);
          break;
        case "Saturday":
          System.out.println(6);
          break;
        case "Sunday":
          System.out.println(7);
          break;
      }
    }
  }
}
