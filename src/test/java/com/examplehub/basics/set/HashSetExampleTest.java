package com.examplehub.basics.set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class HashSetExampleTest {
  @Test
  void testAdd() {
    Set<Integer> set = new HashSet<>();
    assertTrue(set.add(2));
    assertFalse(set.add(2));
    assertTrue(set.add(3));
    assertTrue(set.add(1));
    assertEquals("[1, 2, 3]", set.toString());
  }

  @Test
  void testRemove() {
    Set<Integer> set = new HashSet<>();
    set.add(2);
    set.add(3);
    set.add(1);
    assertTrue(set.remove(2));
    assertTrue(set.remove(1));
    assertFalse(set.remove(1));
    assertEquals("[3]", set.toString());
  }

  @Test
  void testClear() {
    Set<Integer> set = new HashSet<>();
    set.add(2);
    set.add(3);
    set.add(1);
    assertEquals("[1, 2, 3]", set.toString());

    set.clear();
    assertEquals("[]", set.toString());
  }
}
