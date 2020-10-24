package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HanoiTest {

  @Test
  void test() {
    Hanoi.move(5, "A", "B", "C");
  }
}
