package com.examplehub.basics;

public class Break {
    public static void main(String[] args) {

        /*
         * 1 2 3 4
         */
        for (int i = 1; i <= 10; ++i) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * 100 99 98 97 96 95 94 93 92 91
         */
        for (int i = 100; i >= 1; --i) {
            if (i == 90) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * case 2 is executed
         */
        int num = Integer.parseInt("2");
        switch (num) {
            case 1:
                System.out.println("case 1 is executed");
                break;
            case 2:
                System.out.println("case 2 is executed");
                break;
            case 3:
                System.out.println("case 3 is executed");
                break;
            default:
                System.out.println("default is executed");
                break;
        }
    }
}
