package com.examplehub.sorts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.examplehub.domain.Student;
import com.examplehub.utils.RandomUtils;
import com.examplehub.utils.SortUtils;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private Sort sort;

    @BeforeEach
    public void before() {
        sort = new BubbleSort();
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
        //sort by total score, chinese, math, english
        for (Student item : students) {
            System.out.format("id:%d, totalScore:%d, Chinese:%d, math:%d, english:%d\n",
                    item.getId(),
                    item.getChinese() + item.getMath() + item.getEnglish(),
                    item.getChinese(),
                    item.getMath(),
                    item.getEnglish());
            System.out.println(item);
        }
        assertEquals("Student{id=4, Chinese=100, math=100, english=100}", students[0].toString());
        assertEquals("Student{id=2, Chinese=100, math=99, english=98}", students[1].toString());
        assertEquals("Student{id=1, Chinese=98, math=99, english=100}", students[2].toString());
        assertEquals("Student{id=3, Chinese=100, math=98, english=99}", students[3].toString());
        assertEquals("Student{id=5, Chinese=99, math=99, english=99}", students[4].toString());
    }
}
