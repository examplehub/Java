package com.examplehub.basics.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeFormatExampleTest {
  @Test
  void test() {
    LocalDateTime localDateTime = LocalDateTime.of(2099, Month.DECEMBER, 30, 23, 59, 59);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    assertEquals("2099-12-30 23:59:59", formatter.format(localDateTime));
  }
}