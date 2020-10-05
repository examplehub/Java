package com.examplehub.maths;

public class SumToNRecursion {

    /**
     * Sum from 1 to n using recursion
     *
     * @param n the limitation.
     * @return sum of 1 to n.
     */
    public static int sum(int n) {
        return n == 0 ? 0 : n + sum(n - 1);
    }
}
