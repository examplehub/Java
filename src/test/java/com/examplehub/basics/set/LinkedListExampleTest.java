package com.examplehub.basics.set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class LinkedListExampleTest {
  @Test
  void testAdd() {
    Set<Integer> set = new LinkedHashSet<>();
    assertTrue(set.add(2));
    assertFalse(set.add(2));
    assertTrue(set.add(3));
    assertTrue(set.add(1));
    assertEquals("[2, 3, 1]", set.toString());
  }
}
