package com.examplehub.basics.time;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class LocalDateTimeExampleTest {
  @Test
  void testInit() {
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDate: " + localDate);
    System.out.println("localTime: " + localTime);
    System.out.println("localDateTime: " + localDateTime);
  }

  @Test
  void testOf() {
    LocalDate localDate = LocalDate.of(2019, 11, 30);
    LocalTime localTime = LocalTime.of(15, 16, 17);
    LocalDateTime localDateTime = LocalDateTime.of(2019, 11, 30, 15, 16, 17);

    assertEquals(2019, localDate.getYear());
    assertEquals(11, localDate.getMonth().getValue());
    assertEquals(30, localDate.getDayOfMonth());

    assertEquals(15, localTime.getHour());
    assertEquals(16, localTime.getMinute());
    assertEquals(17, localTime.getSecond());

    assertEquals(2019, localDateTime.getYear());
    assertEquals(11, localDateTime.getMonthValue());
    assertEquals(30, localDateTime.getDayOfMonth());
    assertEquals(15, localDateTime.getHour());
    assertEquals(16, localDateTime.getMinute());
    assertEquals(17, localDateTime.getSecond());
  }
}
