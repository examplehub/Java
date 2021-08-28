package com.examplehub.basics.oop;

public class AbstractClassExample {

}

abstract class People {
    public abstract String say();
}

class Student extends People {

    @Override
    public String say() {
        return "Student.say";
    }
}

class Teacher extends People {

    @Override
    public String say() {
        return "Teacher.eat";
    }
}
