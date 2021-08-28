package com.examplehub.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.examplehub.basics.chars.StringJoinerExample;
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
