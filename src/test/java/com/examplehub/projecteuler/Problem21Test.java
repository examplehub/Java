package com.examplehub.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem21Test {

  @Test
  void test() {
    assertEquals(504, Problem21.solution1(1000));
    assertEquals(31626, Problem21.solution1(10000));
  }
}
