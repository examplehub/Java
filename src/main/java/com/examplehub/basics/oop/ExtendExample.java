package com.examplehub.basics.oop;

public class ExtendExample extends ParentClass {
  private double height;

  public ExtendExample(String name, int age, double height) {
    super(name, age);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}

class ParentClass {
  private String name;
  private int age;

  public ParentClass(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public ParentClass() {}

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
