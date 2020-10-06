package com.examplehub.basics;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C");
        linkedList.add("HTML");

        /*
         * [Java, Python, C, HTML]
         */
        System.out.println(linkedList);

        /*
         * 1 nth = Java
         * 2 nth = Python
         * 3 nth = C
         * 4 nth = HTML
         */
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println((i + 1) + " nth = " + linkedList.get(i));
        }

        /*
         * Java
         * Python
         * C
         * HTML
         */
        for (String item : linkedList) {
            System.out.println(item);
        }

        linkedList.addFirst("Go");
        linkedList.addLast("C++");

        /*
         * [Go, Java, Python, C, HTML, C++]
         */
        System.out.println(linkedList);

        /*
         * Go
         */
        System.out.println(linkedList.remove());

        /*
         * Java
         */
        System.out.println(linkedList.removeFirst());

        /*
         * C++
         */
        System.out.println(linkedList.removeLast());

        /*
         * [Python, C, HTML]
         */
        System.out.println(linkedList);
    }
}
