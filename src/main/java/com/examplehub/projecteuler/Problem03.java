package com.examplehub.projecteuler;

import com.examplehub.maths.PrimeCheck;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 * <p>
 * link: https://projecteuler.net/problem=3
 */
public class Problem03 {
    public static long solution1(long n) {
        for (long i = n; i >= 2; i--) {
            if (n % i == 0 && PrimeCheck.isPrime(i)) {
                return i;
            }
        }
        return -1; /* not found */
    }
}
