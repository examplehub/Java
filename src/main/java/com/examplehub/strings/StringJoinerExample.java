package com.examplehub.strings;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static String example1() {
        StringJoiner stringJoiner = new StringJoiner("->");
        stringJoiner.add("Java");
        stringJoiner.add("Python");
        stringJoiner.add("C");
        return stringJoiner.toString();
    }

    public static String example2() {
        StringJoiner stringJoiner = new StringJoiner("->", "[", "]");
        stringJoiner.add("Java");
        stringJoiner.add("Python");
        stringJoiner.add("C");
        return stringJoiner.toString();
    }
}
