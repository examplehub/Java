package com.examplehub.sorts;

import com.examplehub.domain.Student;
import com.examplehub.utils.RandomUtils;
import com.examplehub.utils.SortUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HeapSortTest {

  private Sort sort;

  @BeforeEach
  public void before() {
    sort = new HeapSort();
  }

  @Test
  void testSort() {
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

  @Test
  void testComparable() {
    Student[] students = new Student[5];
    students[0] = new Student(1, 98, 99, 100);
    students[1] = new Student(2, 100, 99, 98);
    students[2] = new Student(3, 100, 98, 99);
    students[3] = new Student(4, 100, 100, 100);
    students[4] = new Student(5, 99, 99, 99);
    sort.sort(students);
    assertTrue(SortUtils.isSorted(students));
  }
}
