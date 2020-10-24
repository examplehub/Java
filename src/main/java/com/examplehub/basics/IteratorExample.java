package com.examplehub.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
  public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      arrayList.add(i);
    }

    /*
     * 1
     * 2
     * 3
     * 4
     * 5
     */
    Iterator<Integer> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() % 2 == 0) {
        iterator.remove();
      }
    }

    /*
     * [1, 3, 5]
     */
    System.out.println(arrayList);
  }
}
