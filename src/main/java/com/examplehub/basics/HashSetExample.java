package com.examplehub.basics;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("HTML");
        hashSet.add("C");

        /*
         * [Java, C, HTML, Python]
         */
        System.out.println(hashSet);

        hashSet.add("Java");

        /*
         * [Java, C, HTML, Python]
         */
        System.out.println(hashSet);

        /*
         * Java
         * C
         * HTML
         * Python
         */
        for (String item : hashSet) {
            System.out.println(item);
        }

        /*
         * true
         */
        System.out.println(hashSet.contains("Java"));

        /*
         * true
         */
        System.out.println(hashSet.remove("Java"));

        /*
         * [C, HTML, Python]
         */
        System.out.println(hashSet);

        hashSet.clear();

        /*
         * []
         */
        System.out.println(hashSet);
    }
}
