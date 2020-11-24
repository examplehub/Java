package com.examplehub.searches;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JumpSearchTest {
  private Search search;

  @BeforeEach
  void setup() {
    search = new JumpSearch();
  }

  @Test
  void testLinearSearch() {
    int[] ints = IntStream.range(0, 10).toArray();
    for (int i = 0; i < ints.length; ++i) {
      assertEquals(i, search.search(ints, i));
    }
    assertEquals(-1, search.search(ints, 10));
    assertEquals(-1, search.search(ints, 100));
    assertEquals(-1, search.search(ints, -1));
  }
}
