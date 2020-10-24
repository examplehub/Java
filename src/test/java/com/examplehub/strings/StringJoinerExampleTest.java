package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringJoinerExampleTest {

  @Test
  void example1() {
    assertEquals(StringJoinerExample.example1(), "Java->Python->C");
  }

  @Test
  void example2() {
    assertEquals(StringJoinerExample.example2(), "[Java->Python->C]");
  }
}
