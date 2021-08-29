package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CatchExceptionTest {
  @Test
  void testCatchArithmeticException() {
    int a = 3;
    int b = 0;
    try {
      int division = a / b;
      fail();
    } catch (ArithmeticException e) {
      assertEquals("/ by zero", e.getMessage());
      assertTrue(true);
    }
  }

  @Test
  void testFunctionThrowException() {
    assertEquals(2.0, CatchException.divide(10, 5));
    try {
      double result = CatchException.divide(3, 0);
      fail();
    } catch (ArithmeticException e) {
      assertTrue(true);
      assertEquals("division is zero", e.getMessage());
    }
  }

  @Test
  void testFinally() {
    try {
      Integer integer = null;
      integer.toString();
      fail();
    } catch (NullPointerException nullPointerException) {
      assertTrue(true);
    } finally {
      /* do some work */
      assertTrue(true);
    }
  }

  @Test
  void testMultiException() {
    int result = 0;
    try {
      int a = Integer.parseInt("123a");
      int b = 0;
      result = a / b;
    } catch (ArithmeticException | NumberFormatException exception) {
      if (exception instanceof NumberFormatException) {
        result = 1;
      } else {
        result = 2;
      }
    } catch (Exception e) {
      result = 3;
    } finally {
      assertTrue(true);
      assertEquals(1, result);
    }
  }
}
