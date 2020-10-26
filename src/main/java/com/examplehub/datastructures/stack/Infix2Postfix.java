package com.examplehub.datastructures.stack;

import com.examplehub.matrix.Precedences;

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
        if (!stack.isEmpty())stack.pop();
      } else {
        while (!stack.isEmpty() && Precedences.compare(element + "", stack.peek() + "") >= 0) {
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
}
