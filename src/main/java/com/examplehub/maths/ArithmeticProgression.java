package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Arithmetic_progression
 */
public class ArithmeticProgression {

    /**
     * Get nth item.
     *
     * @param firstItem        the initial term of an arithmetic progression.
     * @param commonDifference the common difference of successive members.
     * @param nth              the nth term of the sequence.
     * @return the nth tern.
     */
    public static int getNth(int firstItem, int commonDifference, int nth) {
        return firstItem + (nth - 1) * commonDifference;
    }

    /**
     * Sum of n items of arithmetic progression.
     *
     * @param firstItem        the initial term of an arithmetic progression.
     * @param commonDifference the common difference of successive members.
     * @param n                the numbers of arithmetic progression.
     * @return sum of arithmetic progression.
     */
    public static int sum(int firstItem, int commonDifference, int n) {
        return (2 * firstItem + (n - 1) * commonDifference) * n / 2;
    }
}