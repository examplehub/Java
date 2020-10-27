package com.examplehub.datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Infix2PostfixTest {
  @Test
  void testInfix2Postfix() throws Exception {
    assertEquals("32+", Infix2Postfix.infix2PostFix("3+2"));
    assertEquals("123++", Infix2Postfix.infix2PostFix("1+(2+3)"));
    assertEquals("34+5*6-", Infix2Postfix.infix2PostFix("(3+4)*5-6"));
    assertEquals("34-5+", Infix2Postfix.infix2PostFix("3-4+5"));
    assertEquals("345*-", Infix2Postfix.infix2PostFix("3-4*5"));
    assertEquals("12*3/", Infix2Postfix.infix2PostFix("1*2/3"));
    assertEquals("12+3*4/5-", Infix2Postfix.infix2PostFix("(1+2)*3/4-5"));
    assertEquals("abc*+de*f+g*+", Infix2Postfix.infix2PostFix("a+b*c+(d*e+f)*g"));
    assertEquals("xy^5z*/2+", Infix2Postfix.infix2PostFix("x^y/(5*z)+2"));
  }
}
