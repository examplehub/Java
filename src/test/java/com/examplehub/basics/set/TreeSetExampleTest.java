package com.examplehub.basics.set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class TreeSetExampleTest {
  @Test
  void testTreeSet() {
    Set<String> set = new TreeSet<>();
    set.add("B");
    set.add("A");
    set.add("C");
    set.add("D");
    assertEquals("[A, B, C, D]", set.toString());
  }
}
