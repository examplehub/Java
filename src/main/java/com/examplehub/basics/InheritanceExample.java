package com.examplehub.basics;

public class InheritanceExample {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.bark(); /* barking... */
    dog.eat(); /* eating... */
  }
}

class Animal {
  public void eat() {
    System.out.println("eating...");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("barking...");
  }
}
