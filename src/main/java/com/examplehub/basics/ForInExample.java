package com.examplehub.basics;

import java.util.ArrayList;
import java.util.List;

public class ForInExample {
  public static void main(String[] args) {
    int[] numbers = {5, 55, 555, 5555, 55555};
    /*
     * 5
     * 55
     * 555
     * 5555
     * 55555
     */
    for (int number : numbers) {
      System.out.println(number);
    }

    /*
     * E
     * H
     */
    for (char ch : "ExampleHub".toCharArray()) {
      if (Character.isUpperCase(ch)) {
        System.out.println(ch);
      }
    }

    /*
     * Java
     * Python
     * C
     */
    List<String> books =
        new ArrayList<String>() {
          {
            add("Java");
            add("Python");
            add("C");
          }
        };
    for (String book : books) {
      System.out.println(book);
    }
  }
}
