package com.examplehub.sorts;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.utils.RandomUtils;
import com.examplehub.utils.SortUtils;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortTest {
  private Sort sort;

  @BeforeEach
  public void before() {
    sort = new MergeSort();
  }

  @Test
  void testSort() {
    int[] numbers = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
    sort.sort(numbers);
    assertTrue(Arrays.equals(numbers, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

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
