package com.examplehub.basics.encrypt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashAlgoExampleTest {
  @Test
  void testGetHash() {
    assertEquals(0x5e918d2, "hello".hashCode());
    assertEquals(0x7a9d88e8, "hello, java".hashCode());
    assertEquals(0xa0dbae2f, "hello, bob".hashCode());
  }

  @Test
  void testCollision() {
    assertEquals(0x7460e8c0, "AaAaAa".hashCode());
    assertEquals(0x7460e8c0, "BBAaBB".hashCode());
  }
}
