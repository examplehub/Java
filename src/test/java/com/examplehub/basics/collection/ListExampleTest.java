package com.examplehub.basics.collection;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListExampleTest {
  @Test
  void testAdd() {
    List<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    assertEquals("[1, 2, 3]", list.toString());
  }

  @Test
  void testAddAll() {
    List<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");

    List<String> list2 = new LinkedList<>();
    list2.add("4");
    list2.add("5");
    list2.add("6");

    list.addAll(list2);
    assertEquals("[1, 2, 3, 4, 5, 6]", list.toString());
  }

  @Test
  void testGet() {
    List<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    for (int i = 0; i < 3; ++i) {
      assertEquals(i + 1 + "", list.get(i));
    }
  }

  @Test
  void testSet() {
    List<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");

    assertEquals("2", list.set(1, "22"));
    assertEquals("22", list.get(1));
  }

  @Test
  void testRemove() {
    List<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");

    for (int i = 1; i <= 3; ++i) {
      assertEquals(i + "", list.remove(0));
    }
    assertEquals("[]", list.toString());
  }
}
