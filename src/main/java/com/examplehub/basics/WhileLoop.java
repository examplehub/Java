package com.examplehub.basics;

public class WhileLoop {
    public static void main(String[] args) {
        /*
         * Syntax
         * while (condition) {
         *   // code block to be executed
         * }
         */

        /*
         * #####
         */
        int i = 1;
        while (i <= 5) {
            System.out.print("#");
            i++;
        }
        System.out.println();

        /*
         * 1 2 3 4 5 6 7 8 9 10
         */
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        /*
         * 2 4 6 8 10
         */
        i = 2;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        /*
         * 100 95 90 85 80
         */
        i = 100;
        while (i >= 80) {
            System.out.print(i + " ");
            i -= 5;
        }
        System.out.println();

        /*
         * 1 3 5 7 9 2 4 6 8 10
         */
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        /*
        while (true) {
            infinite loop
        }
        */

        /*
         * 1+2+3+4...+100 = 5050
         */
        int sum = 0;
        i = 1;
        while (i <= 100) {
            sum += i;
            ++i;
        }
        System.out.println("1+2+3+4...+100 = " + sum);
    }
}
