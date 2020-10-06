package com.examplehub.basics;

public class WrapperClassExample {
    public static void main(String[] args) {
        Character character = 'A';

        /*
         * A
         */
        System.out.println(character);
        /*
         * A
         */
        System.out.println(character.charValue());

        Integer integer = 100;

        /*
         * 100
         */
        System.out.println(integer);

        /*
         * 100
         */
        System.out.println(integer.intValue());

        /*
         * 100.0
         */
        System.out.println(integer.doubleValue());
    }
}
