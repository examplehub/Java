package com.examplehub.basics.number;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class BigIntegerExampleTest {
  @Test
  void testInit() {
    BigInteger bigInteger = new BigInteger("1234567891011121314151617181920");
    assertEquals("1234567891011121314151617181920", bigInteger.toString());
  }

  @Test
  void testAdd() {
    BigInteger i1 = new BigInteger("1234567891011121314151617181920");
    BigInteger i2 = new BigInteger("1234567891011121314151617181920");
    assertEquals("2469135782022242628303234363840", i1.add(i2).toString());
  }

  @Test
  void testPow() {
    BigInteger bigInteger = new BigInteger("123456789");
    assertEquals("1881676371789154860897069", bigInteger.pow(3).toString());
    bigInteger = new BigInteger("1234567891011121314151617181920");
    assertEquals(
        "1881676376412480405375011631213584661038332261704414240874801542371684441105634548133888000",
        bigInteger.pow(3).toString());
  }

  @Test
  void testMultiply() {
    BigInteger b1 = new BigInteger("123456789");
    BigInteger b2 = new BigInteger("987654321");
    assertEquals("121932631112635269", b1.multiply(b2).toString());
  }

  @Test
  void testDivide() {
    BigInteger b1 = new BigInteger("1234567891011121314151617181920");
    BigInteger b2 = new BigInteger("12345678910");
    assertEquals("100000000000900826453", b1.divide(b2).toString());
  }

  @Test
  void testValueExact() {
    BigInteger bigInteger = new BigInteger("123456789");
    assertEquals(123456789, bigInteger.intValue());
    assertEquals(123456789, bigInteger.intValueExact());
    assertEquals(123456789, bigInteger.longValueExact());

    BigInteger i1 = new BigInteger("1234567891011121314151617181920");
    try {
      long val = i1.longValueExact();
      fail();
    } catch (ArithmeticException e) {
      assertTrue(true);
    }
  }
}
