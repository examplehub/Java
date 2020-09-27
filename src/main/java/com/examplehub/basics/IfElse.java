package com.examplehub.basics;

public class IfElse {
    public static void main(String[] args) {
        int a = 3; /* change data to test */
        int b = 4; /* change data to test */
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }

        if (true) {
            System.out.println("this will happen");
        }else {
            System.out.println("this will not happen");
        }

        if (false) {
            System.out.println("this will not happen");
        } else {
            System.out.println("this will happen");
        }
    }
}