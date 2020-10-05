package com.examplehub.basics;

public class FunctionRecursion {

    public static void main(String[] args) {

        /*
         * 1+2+3+...+10 = 55
         */
        System.out.println("1+2+3+...+10 = " + sum(10));

        /*
         * 1+2+3+...100 = 5050
         */
        System.out.println("1+2+3+...100 = " + sum(100));

        /*
         * 1*2*3*4*5 = 120
         */
        System.out.println("1*2*3*4*5 = " + factorial(5));

        /*
         * 1*2*3*4*5*6 = 720
         */
        System.out.println("1*2*3*4*5*6 = " + factorial(6));

        /*
         * pow(2, 3) = 8
         */
        System.out.println("pow(2, 3) = " + power(2, 3));

        /*
         * pow(2, 10) = 1024
         */
        System.out.println("pow(2, 10) = " + power(2, 10));
    }

    public static int sum(int n) {
        return n == 0 ? 0 : n + sum(n - 1);
    }

    public static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    public static int power(int n, int k) {
        return k == 0 ? 1 : n * power(n, k - 1);
    }
}
