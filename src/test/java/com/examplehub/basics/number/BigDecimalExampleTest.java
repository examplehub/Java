package com.examplehub.basics.number;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;

class BigDecimalExampleTest {
  @Test
  void testArithmetic() {
    BigDecimal bd = new BigDecimal("123456.789");
    assertEquals("246913.578", bd.add(bd).toString());
    assertEquals("0.000", bd.subtract(bd).toString());
    assertEquals("15241578750.190521", bd.multiply(bd).toString());
    assertEquals("1.000", bd.divide(bd, RoundingMode.HALF_UP).toString());
    assertEquals("24691.358", bd.divide(new BigDecimal("5.0"), RoundingMode.HALF_UP).toString());
  }

  @Test
  void testScale() {
    assertEquals(2, new BigDecimal("123.45").scale());
    assertEquals(4, new BigDecimal("123.4567").scale());
    assertEquals(0, new BigDecimal("123").scale());
  }

  @Test
  void testStripTrailingZeros() {
    assertEquals(4, new BigDecimal("123.4500").scale());
    assertEquals(2, new BigDecimal("123.4500").stripTrailingZeros().scale());

    assertEquals(0, new BigDecimal("1234500").scale());
    assertEquals(-2, new BigDecimal("1234500").stripTrailingZeros().scale());
  }

  @Test
  void testSetScale() {
    assertEquals(
        "123.4568", new BigDecimal("123.45678910").setScale(4, RoundingMode.UP).toString());
    assertEquals(
        "123.45", new BigDecimal("123.45678910").setScale(2, RoundingMode.DOWN).toString());
  }

  @Test
  void testEqual() {
    BigDecimal d1 = new BigDecimal("123.456");
    BigDecimal d2 = new BigDecimal("123.45600");
    assertNotEquals(d1, d2);

    assertEquals(d1, d2.stripTrailingZeros());
    assertTrue(d1.compareTo(d2) == 0);
  }
}
