package com.examplehub.projecteuler;

public class Problem01 {

    public static int solution1(int n) {
        int sum = 0;
        for (int i = 1; i < n; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
