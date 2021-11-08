package com.examplehub.basics.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class ClassCastExceptionExampleTest {
  @Test
  void testClassCast() {
    try {
      String[] strArray = new String[]{"John", "Snow"};
      ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
      System.out.println("String list: " + strList);
    } catch (ClassCastException e) {
      assertTrue(true);
    }
  }
}