package com.examplehub.datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Infix2PostfixTest {
  @Test
  void testInfix2Postfix() throws Exception {
    assertEquals("32+", Infix2Postfix.infix2PostFix("3+2"));
    assertEquals("123++", Infix2Postfix.infix2PostFix("1+(2+3)"));
//    assertEquals("124*5/+7-36/+", Infix2Postfix.infix2PostFix("124*5/+7-36/+"));
//    assertEquals("123/*", Infix2Postfix.infix2PostFix("1*2/3"));
//    assertEquals("", Infix2Postfix.infix2PostFix("a+b*c+(d*e+f)*g"));
    //BUG TODO
  }
}
