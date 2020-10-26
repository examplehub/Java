package com.examplehub.matrix;

/** https://en.wikipedia.org/wiki/Order_of_operations */
public class Precedences {
  private static int getPrecedences(String operator) {
    switch (operator) {
      case ",":
        return 0;
      case "=":
      case "+=":
      case "-=":
      case "*=":
      case "/=":
      case "%=":
      case "&=":
      case "|=":
      case "^=":
      case "<<=":
      case ">>=":
        return 1;
      case "?:":
        return 2;
      case "||":
        return 3;
      case "&&":
        return 4;
      case "|":
        return 5;
      case "^":
        return 6;
      case "&":
        return 7;
      case "==":
      case "!=":
        return 8;
      case "<":
      case "<=":
      case ">":
      case ">=":
        return 9;
      case "<<":
      case ">>":
        return 10;
      case "+":
      case "-":
        return 11;
      case "*":
      case "/":
      case "%":
        return 12;
      case "!":
      case "~":
        return 13;
      case "(":
      case ")":
      case "[":
      case "]":
      case "->":
      case ".":
        return 14;
      default:
        return -1;
    }
  }

  public static int compare(String firstOperator, String secondOperator) {
    return Integer.compare(getPrecedences(firstOperator), getPrecedences(secondOperator));
  }
}
