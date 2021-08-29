package com.examplehub.basics.oop;

public class InnerClassExample {}

class OuterClass {
  private final String name;

  public OuterClass(String name) {
    this.name = name;
  }

  class InnerClass {
    public String sayHi() {
      return "Hi, " + OuterClass.this.name;
    }
  }

  public String getName() {
    return name;
  }
}
