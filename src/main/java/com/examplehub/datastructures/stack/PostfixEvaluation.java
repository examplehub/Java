package com.examplehub.datastructures.stack;

import java.util.Stack;

public class PostfixEvaluation {
  /**
   * Postfix expression evaluation.
   *
   * @param postfix the postfix to be evaluated.
   * @return result of postfix expression.
   */
  public static int evaluate(String postfix) {
    Stack<Integer> result = new Stack<>();
    for (int i = 0; i < postfix.length(); ++i) {
      if (Character.isDigit(postfix.charAt(i))) {
        result.push(Integer.valueOf("" + postfix.charAt(i)));
      } else {
        int secondNumber = result.pop();
        int firstNumber = result.pop();
        switch (postfix.charAt(i)) {
          case '+':
            result.push(firstNumber + secondNumber);
            break;
          case '-':
            result.push(firstNumber - secondNumber);
            break;
          case '*':
            result.push(firstNumber * secondNumber);
            break;
          case '/':
            result.push(firstNumber / secondNumber);
            break;
          case '^':
            result.push((int) Math.pow(firstNumber, secondNumber));
            break;
        }
      }
    }
    return result.pop();
  }
}
