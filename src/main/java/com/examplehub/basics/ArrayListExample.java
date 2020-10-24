package com.examplehub.basics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("C");
    arrayList.add("HTML");

    /*
     * 4
     */
    System.out.println(arrayList.size());

    /*
     * arrayList[0] = Java
     * arrayList[1] = Python
     * arrayList[2] = C
     * arrayList[3] = HTML
     */
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.format("arrayList[%d] = %s\n", i, arrayList.get(i));
    }

    /*
     * Java
     * Python
     * C
     * HTML
     */
    for (String s : arrayList) {
      System.out.println(s);
    }

    /*
     * [Java, Python, C, HTML]
     */
    System.out.println(arrayList);

    /*
     * Java
     */
    System.out.println(arrayList.set(0, "java"));

    /*
     * java
     */
    System.out.println(arrayList.get(0));

    /*
     * java
     */
    System.out.println(arrayList.remove(0));

    /*
     * [Python, C, HTML]
     */
    System.out.println(arrayList);

    Collections.sort(arrayList);

    /*
     * [C, HTML, Python]
     */
    System.out.println(arrayList);

    /*
     * true
     */
    System.out.println(arrayList.contains("Python"));

    /*
     * false
     */
    System.out.println(arrayList.contains("python"));

    arrayList.clear();
    /*
     * []
     */
    System.out.println(arrayList);

    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 5; i >= 1; i--) {
      numbers.add(i);
    }

    /*
     * [5, 4, 3, 2, 1]
     */
    System.out.println(numbers);

    Collections.sort(numbers);

    /*
     * [1, 2, 3, 4, 5]
     */
    System.out.println(numbers);
  }
}
