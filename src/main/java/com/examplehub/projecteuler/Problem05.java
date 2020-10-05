package com.examplehub.projecteuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * <p>
 * link: https://projecteuler.net/problem=5
 */
public class Problem05 {

    public static long solution1(int n) {
        for (int i = n; ; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j != 0) {
                    break;
                }
                if (j == n) {
                    return i;
                }
            }
        }
    }
}
