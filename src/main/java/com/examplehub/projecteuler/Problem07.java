package com.examplehub.projecteuler;

import com.examplehub.maths.PrimeCheck;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 * <p>
 * link: https://projecteuler.net/problem=7
 */
public class Problem07 {

    public static long solution(int n) {
        int count = 0;
        int i;
        for (i = 2; count != n; i++) {
            if (PrimeCheck.isPrime(i)) {
                count++;
            }
        }
        return i - 1;
    }
}
