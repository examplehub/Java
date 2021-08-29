package com.examplehub.basics.oop;

public class Function {
  public static void main(String[] args) {

    Function function = new Function();

    /*
     * Hello World
     */
    function.sayHello();

    /*
     * My name is Java
     */
    function.printInfo("Java");

    /*
     * My name is Java. My age is 20
     */
    function.printInfo("Java", 20);

    /*
     * 2^2 = 4
     */
    System.out.println("2^2 = " + function.square(2));

    /*
     * 10^2 = 100
     */
    System.out.println("10^2 = " + function.square(10));

    /*
     * sum(3, 4) = 7
     */
    System.out.println("sum(3, 4) = " + function.sum(3, 4));

    /*
     * sum(1, 2, 3) = 6
     */
    System.out.println("sum(1, 2, 3) = " + function.sum(1, 2, 3));

    /*
     * sum(1, 2, 3, 4) = 10
     */
    System.out.println("sum(1, 2, 3, 4) = " + function.sum(1, 2, 3, 4));

    /*
     * sum(1.5, 2.3) = 3.8
     */
    System.out.println("sum(1.5, 2.3) = " + function.sum(1.5f, 2.3f));

    /*
     * sum(1.5, 2.3) = 3.8
     */
    System.out.println("sum(1.5, 2.3) = " + function.sum(1.5, 2.3));

    /*
     * 1! = 1
     */
    System.out.println("1! = " + function.factorial(1));

    /*
     * 5! = 120
     */
    System.out.println("5! = " + function.factorial(5));
  }

  public void sayHello() {
    System.out.println("Hello World");
  }

  public void printInfo(String name) {
    System.out.println("My name is " + name);
  }

  public void printInfo(String name, int age) {
    System.out.println("My name is " + name + ". My age is " + age);
  }

  public int square(int a) {
    return a * a;
  }

  public int sum(int a, int b) {
    return a + b;
  }

  public int sum(int a, int b, int c) {
    return a + b + c;
  }

  public int sum(int a, int b, int c, int d) {
    return sum(a, b) + sum(c, d);
  }

  public float sum(float a, float b) {
    return a + b;
  }

  public double sum(double a, double b) {
    return a + b;
  }

  public int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }
}
