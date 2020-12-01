package com.examplehub.basics;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
  public static void main(String[] args) {
    ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
    map.put(1, "Java");
    map.put(2, "Go");
    map.put(3, "Python");
    System.out.println(map); /* {1=Java, 2=Go, 3=Python} */

    map.putIfAbsent(3, "python");
    System.out.println(map); /* {1=Java, 2=Go, 3=Python} */
    map.putIfAbsent(4, "HTML");
    System.out.println(map); /* {1=Java, 2=Go, 3=Python, 4=HTML} */

    map.replace(4, "HTML5");
    System.out.println(map); /* {1=Java, 2=Go, 3=Python, 4=HTML5} */

    System.out.print("all keys: ");
    for (int key : map.keySet()) {
      System.out.print(key + " ");
    }
    System.out.println(); /* all keys: 1 2 3 4  */

    /*
    key = 1, value = Java
    key = 2, value = Go
    key = 3, value = Python
    key = 4, value = HTML5
    */
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(
          "key = ".concat(entry.getKey() + "").concat(", value = ").concat(entry.getValue()));
    }

    System.out.println(map.get(3)); /* Python */
    System.out.println(map.getOrDefault(100, "Default value")); /* Default value */

    System.out.println(map.remove(3)); /* Python */
    System.out.println(map.remove(1, "Java")); /* true */
    System.out.println(map); /* {2=Go, 4=HTML5} */
    map.clear();
    System.out.println(map); /* {} */
  }
}
