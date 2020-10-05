package com.examplehub.projecteuler;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * <p>
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
