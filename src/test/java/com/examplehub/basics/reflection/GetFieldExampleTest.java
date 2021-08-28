package com.examplehub.basics.reflection;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class GetFieldExampleTest {
    class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public String hi() {
            return "hi";
        }
    }

    class Student extends Person {
        public int score;
        private int grade;

        public Student(String name) {
            super(name);
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }

    @Test
    void testGetField() throws NoSuchFieldException {
        Class stuCls = Student.class;
        assertEquals("score",
                stuCls.getField("score").getName());

        assertEquals("name",
                stuCls.getField("name").getName());
        assertEquals("grade",
                stuCls.getDeclaredField("grade").getName());
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Object obj = new Person("Jack");
        Class cls = obj.getClass();
        Field field = cls.getDeclaredField("name");
        assertEquals("Jack", field.get(obj));
    }

    @Test
    void testSetFiledValue() throws NoSuchFieldException, IllegalAccessException {
        Object obj = new Person("Jack");
        Class cls = obj.getClass();
        Field field = cls.getDeclaredField("name");
        assertEquals("Jack", field.get(obj).toString());

        field.set(obj, "Tom");
        assertEquals("Tom", field.get(obj).toString());
    }

    @Test
    void testGetFunction() throws NoSuchMethodException {
        Class stuClass = Student.class;
        assertEquals("getScore", stuClass.getDeclaredMethod("getScore").getName());
        assertEquals("setScore", stuClass.getMethod("setScore", int.class).getName());
        assertEquals("getGrade", stuClass.getDeclaredMethod("getGrade").getName());
        assertEquals("setGrade", stuClass.getMethod("setGrade", int.class).getName());
        assertEquals("getName", stuClass.getMethod("getName").getName());
        assertEquals("setName", stuClass.getMethod("setName", String.class).getName());
    }
}