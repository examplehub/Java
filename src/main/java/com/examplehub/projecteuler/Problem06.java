package com.examplehub.projecteuler;

import com.examplehub.maths.SumToN;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * <p>
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
 * 3025 - 385 = 2640
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem06 {
    public static long solution1(int n) {
        long sumOfSquares = 0;
        for (int i = 1; i <= n; ++i) {
            sumOfSquares  = (long) (sumOfSquares + Math.pow(i, 2));
        }

        long squareOfSum = (long) Math.pow(SumToN.sum(n), 2);
        return squareOfSum - sumOfSquares;
    }
}
