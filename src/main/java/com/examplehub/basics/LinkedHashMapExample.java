package com.examplehub.basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
  public static void main(String[] args) {
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "Java");
    map.put(2, "C");
    map.put(3, "Python");
    System.out.println(map); /* {1=Java, 2=C, 3=Python} */

    /*
     * key = 1, value = Java
     * key = 2, value = C
     * key = 3, value = Python
     */
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(
          "key = ".concat(entry.getKey() + "").concat(", value = ").concat(entry.getValue()));
    }
  }
}
