package com.examplehub.basics;


import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        /*
         * 0123456789
         */
        arrayList.forEach(System.out::print);
        System.out.println();

        /*
         * 0
         * 1
         * 4
         * 9
         * 16
         * 25
         * 36
         * 49
         * 64
         * 81
         */
        arrayList.forEach(number -> System.out.println(number * number));

        arrayList.removeIf(number -> number % 2 == 0);

        /*
         * [1, 3, 5, 7, 9]
         */
        System.out.println(arrayList);
    }
}
