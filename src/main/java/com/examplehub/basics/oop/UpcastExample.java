package com.examplehub.basics.oop;

public class UpcastExample extends UpClass{
    private int height;
    public UpcastExample(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
class UpClass {
    private String name;
    private int age;

    public UpClass(String name, int age) {
        this.name = name;
        this.age = age;
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
}
