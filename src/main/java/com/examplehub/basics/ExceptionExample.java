package com.examplehub.basics;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        /*
         * Index 5 out of bounds for length 5
         */
        try {
            System.out.println(numbers[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        /*
         * ArithmeticException
         * Finished
         */
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }finally {
            System.out.println("Finished");
        }


        /*
         * divisor is zero
         */
        try {
            int result = divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("divisor is zero");
        }
        return a / b;
    }
}
