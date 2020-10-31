package com.examplehub.datastructures.stack;

import com.examplehub.strings.RemoveWhiteSpace;

public class ExpressionEvaluation {

  /**
   * Expression evaluation algorithms.
   *
   * @param expression the expression to be calculated.
   * @return result of expression.
   * @throws Exception if {@code expression} is invalid.
   */
  public static int evaluate(String expression) throws Exception {

    return PostfixEvaluation.evaluate(
        Infix2Postfix.infix2PostFix(RemoveWhiteSpace.removeWhitespace(expression)));
  }
}
