package com.examplehub.designpatterns.template;

public abstract class Calculator {
  public int calculate(String expression, String operator) {
    String[] operators = expression.split(operator);
    return calculate(Integer.parseInt(operators[0]), Integer.parseInt(operators[1]));
  }

  public abstract int calculate(int a, int b);
}
