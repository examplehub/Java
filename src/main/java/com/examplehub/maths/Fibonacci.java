package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Fibonacci_number
 */
public class Fibonacci {

    /**
     * Get nth item of fibonacci sequence.
     *
     * @param n the nth
     * @return the nth item of fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; ++i) {
            int c = first + second;
            first = second;
            second = c;
        }
        return first;
    }
}
