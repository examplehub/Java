package com.examplehub.basics.oop;

public class FunctionOverriding {
  public static void main(String[] args) {
    Vehicle bike = new Bike();
    bike.run(); /* Bike is running. */
  }
}

class Vehicle {
  public void run() {
    System.out.println("Vehicle is running.");
  }
}

class Bike extends Vehicle {
  @Override
  public void run() {
    System.out.println("Bike is running.");
  }
}
