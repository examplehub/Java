package com.examplehub.basics.generic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericExampleTest {
    @Test
    void testNoGeneric() {
        List list = new ArrayList();
        list.add("hello");
        list.add(123);
        list.add(12.34);
        assertEquals("[hello, 123, 12.34]", list.toString());

        assertEquals("hello", (String) list.get(0));
        assertEquals(123, (int) list.get(1));
        assertEquals(12.34, (double) list.get(2));

        try {
            String num = (String) list.get(1);
            fail();
        } catch (ClassCastException e) {
            assertTrue(true);
        }
    }

    @Test
    void testGenericList() {
        List<String> list = new ArrayList<>();
        list.add("java");
        //list.add(123); //compile error
        list.add("python");
        assertEquals("[java, python]", list.toString());
    }

    @Test
    void testGenericInterface() {
        class Student implements Comparable<Student>{
            private String name;
            private int age;
            @Override
            public int compareTo(Student o) {
                return Integer.compare(this.age, o.age);
            }

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        assertTrue(new Student("jack", 20).compareTo(new Student("tom", 21)) < 0);
        assertTrue(new Student("jack", 22).compareTo(new Student("tom", 21)) > 0);
        assertTrue(new Student("jack", 20).compareTo(new Student("tom", 20)) == 0);

        String[] languages = {"java", "python", "cpp"};
        Arrays.sort(languages);
        assertEquals("[cpp, java, python]", Arrays.toString(languages));
    }
}