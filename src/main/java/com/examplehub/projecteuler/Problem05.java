package com.examplehub.projecteuler;

/**
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
