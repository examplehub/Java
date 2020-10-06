package com.examplehub.projecteuler;

/**
 * https://projecteuler.net/problem=9
 */
public class Problem09 {

    public static int solution1(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                int c = n - a - b;
                if (b < c && (a * a + b * b == c * c)) {
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
