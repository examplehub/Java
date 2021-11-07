package com.examplehub.basics.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class CollectionsExampleTest {
  @Test
  void testMax() {
    List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
    assertEquals(6, Collections.max(list));
  }

  @Test
  void testMin() {
    List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
    assertEquals(1, Collections.min(list));
  }

  @Test
  void testReverse() {
    List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
    Collections.reverse(list);
    assertEquals("[6, 4, 2, 5, 3, 1]", list.toString());
  }

  @Test
  void testSwap() {
    List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
    Collections.swap(list, 0, list.size() - 1);
    assertTrue(list.get(0) == 6 && list.get(list.size() - 1) == 1);
  }

  @Test
  void testSort() {
    List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
    Collections.sort(list);
    assertEquals("[1, 2, 3, 4, 5, 6]", list.toString());
  }

  @Test
  void testShuffle() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    Collections.shuffle(list);
    System.out.println(list);
  }

  @Test
  void testCopy() {
    List<Integer> src = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> dist = Arrays.asList(new Integer[src.size()]);
    Collections.copy(dist, src);
    assertEquals("[1, 2, 3, 4, 5, 6]", dist.toString());
  }
}
