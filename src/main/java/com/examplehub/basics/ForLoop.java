package com.examplehub.basics;

public class ForLoop {
    public static void main(String[] args) {

        /* output: ########## */
        for (int i = 1; i <= 10; ++i) {
            System.out.print("#");
        }
        System.out.println("\n");

        /* output: 11111 */
        for (int i = 1; i <= 5; ++i) {
            System.out.print(1);
        }
        System.out.println("\n");

        /* output: 22222 */
        for (int i = 5; i >= 1; --i) {
            System.out.print(2);
        }
        System.out.println("\n");

        /* output: 12345 */
        for (int i = 1; i <= 5; ++i) {
            System.out.print(i);
        }
        System.out.println("\n");

        /* output: 246810 */
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i);
        }
        System.out.println("\n");

        /* output: 9630 */
        for (int i = 9; i >= 0; i -= 3) {
            System.out.print(i);
        }
        System.out.println("\n");

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        /* output: 12345 */
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i]);
        }
        System.out.println("\n");

        /* output: 12345 */
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println("\n");

        /* infinite loop */
        /*
        for (; ; ) {
            do some work
        }
        */
        
    }
}
