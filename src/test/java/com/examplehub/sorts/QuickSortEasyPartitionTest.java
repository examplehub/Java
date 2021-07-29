package com.examplehub.sorts;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.utils.RandomUtils;
import com.examplehub.utils.SortUtils;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuickSortEasyPartitionTest {
  private Sort sort;

  @BeforeEach
  public void before() {
    sort = new QuickSortEasyPartition();
  }

  @Test
  void testQuickSort() {
    int[] ints = RandomUtils.randomInts(-50, 50, 100);
    sort.sort(ints);
    assertTrue(SortUtils.isSorted(ints));
  }

  @Test
  void testSortIntegers() {
    Integer[] integers =
        Arrays.stream(RandomUtils.randomInts(-50, 50, 100)).boxed().toArray(Integer[]::new);
    sort.sort(integers);
    assertTrue(SortUtils.isSorted(integers));
  }

  @Test
  void testSortedDoubles() {
    Double[] doubles = new Double[100];
    double[] tempDoubles = RandomUtils.randomDoubles(-50, 50, 100);
    for (int i = 0; i < doubles.length; ++i) {
      doubles[i] = tempDoubles[i];
    }
    sort.sort(doubles);
    assertTrue(SortUtils.isSorted(doubles));
  }
}
