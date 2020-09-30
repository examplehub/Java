package com.examplehub.basics;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * do
         * {
         *    statement(s);
         * } while(condition);
         */

        /*
         * just run a time
         */
        /*
        int i = 1;
        do {
            System.out.print("just run a time");
        } while (i > 1);
        */

        /*
         * **********
         */
        int i = 1;
        do {
            System.out.print("*");
            i++;
        } while (i <= 10);
        System.out.println();

        /*
         * 1 2 3 4 5 6 7 8 9 10
         */
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();

        /*
         * 2 4 6 8 10
         */
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 10);
        System.out.println();

        /*
         * 10 9 8 7 6 5
         */
        i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 5);
        System.out.println();

        /*
        do {
            infinite loop
        } while (true);
        */

        /*
         * 5! = 6
         */
        i = 1;
        int fact = 1;
        do {
            fact *= i;
            i++;
        }while (i <= 5);
        System.out.println("5! = " + fact);

        /*
         * numbers[0] + numbers[1] + ... + numbers[4] = 15
         */
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        System.out.println("numbers[0] + numbers[1] + ... + numbers[4] = " + sum);
    }
}
