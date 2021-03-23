package com.examplehub.basics;

public class BreakWithLabel {
    public static void main(String[] args) {
        label:
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                System.out.println("i = " + i + ", j = " + j);
                if (j == 2) {
                    break label;
                }
            }
        }
        /*
         * output:
         * i = 1, j = 1
         * i = 1, j = 2
         */
    }
}
