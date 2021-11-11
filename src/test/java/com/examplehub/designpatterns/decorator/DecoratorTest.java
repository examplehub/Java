package com.examplehub.designpatterns.decorator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DecoratorTest {
  @Test
  @Disabled
  void test() {
    Readable readable = new Machine();
    readable.read(); // I'm reading

    /*
     * I'm reading
     * I not have enough power
     */
    Decorator decorator = new Decorator(readable);
    decorator.read();
  }
}