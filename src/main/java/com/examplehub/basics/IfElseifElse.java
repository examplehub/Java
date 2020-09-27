package com.examplehub.basics;

public class IfElseifElse {
    public static void main(String[] args) {
        int a = 3; /* change data to test */
        if (a > 0) {
            System.out.println("it is positive number");
        } else if (a < 0) {
            System.out.println("it is negative number");
        } else {
            System.out.println("it is zero");
        }

        int day = 6; /* change data to test */
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
