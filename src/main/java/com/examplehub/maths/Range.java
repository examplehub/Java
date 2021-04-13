package com.examplehub.maths;

import java.util.ArrayList;
import java.util.List;

public class Range {
    public static int[] range(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            numbers.add(i);
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }

    public static int[] range(int start, int end) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = start; i < end; ++i) {
            numbers.add(i);
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }

    public static int[] range(int start, int end, int step) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = start; i < end; i += step) {
            numbers.add(i);
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
