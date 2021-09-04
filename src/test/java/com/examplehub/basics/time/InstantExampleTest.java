package com.examplehub.basics.time;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class InstantExampleTest {
  @Test
  void test() {
    Instant now = Instant.now();
    System.out.println(now);
    System.out.println(now.toEpochMilli());
    System.out.println(now.getEpochSecond());
  }
}