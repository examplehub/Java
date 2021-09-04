package com.examplehub.basics.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class LocalDateTimeExampleTest {
  @Test
  void test() {
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDate: " + localDate);
    System.out.println("localTime: " + localTime);
    System.out.println("localDateTime: " + localDateTime);
  }

  @Test
  void test2() {
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDate localDate = localDateTime.toLocalDate();
    LocalTime localTime = localDateTime.toLocalTime();
    System.out.println("localDate: " + localDate);
    System.out.println("localTime: " + localTime);
    System.out.println("localDateTime: " + localDateTime);
  }

  @Test
  void test3() {
    LocalDate d2 = LocalDate.of(2019, 11, 30);
    LocalTime t2 = LocalTime.of(15, 16, 17);
    LocalDateTime dt2 = LocalDateTime.of(2019, 11, 30, 15, 16, 17);
    LocalDateTime dt3 = LocalDateTime.of(d2, t2);
    System.out.println(d2);
    System.out.println(t2);
    System.out.println(dt2);
    System.out.println(dt3);
  }
}
