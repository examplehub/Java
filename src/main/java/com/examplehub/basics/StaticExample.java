package com.examplehub.basics;

public class StaticExample {
  public static void main(String[] args) {
    StaticTest staticTest = new StaticTest();
    StaticTest.increment();
    System.out.println(StaticTest.count); /* 1 */
    staticTest.method(); /* normal method */
    System.out.println(StaticTest.count); /* 2 */
  }
}

class StaticTest {
  public static int count = 0;

  public static void increment() {
    count++;
  }

  public void method() {
    increment();
    System.out.println("normal method");
  }
}
