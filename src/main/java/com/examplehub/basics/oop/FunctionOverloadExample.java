package com.examplehub.basics.oop;

public class FunctionOverloadExample {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public int sum(int a, int b, int c, int d) {
        return sum(sum(a, b), sum(c, d));
    }

    public double sum(double a, double b) {
        return a + b;
    }
}
