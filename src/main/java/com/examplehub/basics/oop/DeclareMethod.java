package com.examplehub.basics.oop;

public class DeclareMethod {
    private String name;
    private int age;

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

    public String intro() {
        return "I'm " + name + ". I'm " + age;
    }
}
