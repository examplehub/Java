package com.examplehub.basics.oop;

public class ReadJavaBeanProperties {}

class MyBean {
  private String name;
  private int age;

  public MyBean() {}

  public MyBean(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
