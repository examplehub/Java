package com.examplehub.projecteuler;

import com.examplehub.maths.PrimeCheck;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 * <p>
 * link: https://projecteuler.net/problem=10
 */
public class Problem10 {
    public static long solution1(int n) {
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (PrimeCheck.isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
