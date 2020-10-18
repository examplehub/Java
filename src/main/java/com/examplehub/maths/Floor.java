package com.examplehub.maths;

public class Floor {
    public static int floor(double number) {
        return number - (int) number >= 0 ? (int) number : (int) number - 1;
    }
}
