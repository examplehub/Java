package com.examplehub.basics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionExampleTest {
  @Test
  void test() {
    assert 3 + 2 == 5;

    try {
      assert 3 + 2 != 5 : "error msg";
      fail();
    } catch (AssertionError error) {
      assertTrue(true);
      assertEquals("error msg", error.getMessage());
    }
  }
}
