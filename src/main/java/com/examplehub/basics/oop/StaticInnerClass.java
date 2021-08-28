package com.examplehub.basics.oop;

public class StaticInnerClass {
    private static String name = "JACK";

    static class InnerClass {
        String sayHi() {
            return "Hi, " + name;
        }
    }
}
