package com.examplehub.datastructures.stack;

import java.util.Stack;

public class Infix2Postfix {
  public static String infix2PostFix(String infixExpression) throws Exception {
    if (!BalancedParentheses.isBalanced(infixExpression)) {
      throw new Exception("invalid expression");
    }
    StringBuilder output = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    for (char element : infixExpression.toCharArray()) {
      if (Character.isLetterOrDigit(element)) {
        output.append(element);
      } else if (element == '(') {
        stack.push(element);
      } else if (element == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          output.append(stack.pop());
        }
        stack.pop();
      } else {
        while (!stack.isEmpty() && precedence(element) <= precedence(stack.peek())) {
          output.append(stack.pop());
        }
        stack.push(element);
      }
    }
    while (!stack.isEmpty()) {
      output.append(stack.pop());
    }
    return output.toString();
  }

  private static int precedence(char operator) {
    switch (operator) {
      case '+':
      case '-':
        return 0;
      case '*':
      case '/':
        return 1;
      case '^':
        return 2;
      default:
        return -1;
    }
  }
}
