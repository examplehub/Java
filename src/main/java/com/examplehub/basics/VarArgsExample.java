package com.examplehub.basics;

public class VarArgsExample {
    public static void main(String[] args) {
        System.out.println("1 + 2 = " + add(1, 2)); /* 1 + 2 = 3 */
        System.out.println("1 + 2 + 3 = " + add(1, 2, 3));
        System.out.println("1 + 2 + 3 + 4 = " + add(1, 2, 3, 4));
    }

    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
