package com.examplehub.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    private static int getNex(int number) {
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += remainder * remainder;
            number /= 10;
        }
        return sum;
    }
    public static boolean solution1(int number) {
        Set<Integer> set = new HashSet<>();
        while (number != 1 && !set.contains(number)) {
            set.add(number);
            number = getNex(number);
        }
        return number == 1;
    }

    public static boolean solution2(int number) {
        int slowRunner = number;
        int fastRunner = getNex(number);
        while (slowRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNex(slowRunner);
            fastRunner = getNex(getNex(fastRunner));
        }
        return slowRunner == 1;
    }
}
