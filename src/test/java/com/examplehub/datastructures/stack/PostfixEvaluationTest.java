package com.examplehub.datastructures.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PostfixEvaluationTest {
  @Test
  void testEvaluate() throws Exception {
    assertEquals(5, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("3+2")));
    assertEquals(6, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("1+(2+3)")));
    assertEquals(29, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("(3+4)*5-6")));
    assertEquals(4, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("3-4+5")));
    assertEquals(-17, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("3-4*5")));
    assertEquals(0, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("1*2/3")));
    assertEquals(-3, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("(1+2)*3/4-5")));
    assertEquals(5, PostfixEvaluation.evaluate(Infix2Postfix.infix2PostFix("1+2^3-4")));
  }
}
