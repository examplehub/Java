package com.examplehub.designpatterns.template;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void testPlus() {
    Calculator calculator = new Plus();
    assertEquals(5, calculator.calculate("2+3", "\\+"));
  }

  @Test
  void testMinus() {
    Calculator calculator = new Minus();
    assertEquals(-1, calculator.calculate("2-3", "-"));
  }
}
