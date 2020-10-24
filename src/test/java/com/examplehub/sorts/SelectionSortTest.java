package com.examplehub.sorts;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.utils.RandomUtils;
import com.examplehub.utils.SortUtils;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
  private Sort sort;

  @BeforeEach
  public void before() {
    sort = new SelectionSort();
  }

  @Test
  void testSort() {
    int[] ints = RandomUtils.randomInts(-50, 50, 100);
    sort.sort(ints);
    assertTrue(SortUtils.isSorted(ints));
  }

  @Test
  void sortInteger() {
    Integer[] integers =
        Arrays.stream(RandomUtils.randomInts(-50, 50, 100)).boxed().toArray(Integer[]::new);
    sort.sort(integers);
    assertTrue(SortUtils.isSorted(integers));
  }
}
