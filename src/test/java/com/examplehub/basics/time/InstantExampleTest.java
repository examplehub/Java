package com.examplehub.basics.time;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import org.junit.jupiter.api.Test;

class InstantExampleTest {
  @Test
  void test() {
    Instant now = Instant.now();
    System.out.println(now);
    System.out.println(now.toEpochMilli());
    System.out.println(now.getEpochSecond());
  }
}
