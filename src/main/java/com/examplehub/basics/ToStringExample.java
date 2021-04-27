package com.examplehub.basics;

public class ToStringExample {
    public static void main(String[] args) {
        Student stuJack = new Student(1001, "Jack", 23, 'M');
        System.out.println(stuJack.toString()); /* Student{id=1001, name='Jack', age=23, sex=M} */

        Student stuTim = new Student(1002, "Tim", 20, 'W');
        System.out.println(stuTim.toString()); /* Student{id=1002, name='Tim', age=20, sex=W} */

    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private char sex;

    public Student(int id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
