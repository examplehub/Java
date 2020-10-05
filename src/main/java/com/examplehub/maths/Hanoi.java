package com.examplehub.maths;

public class Hanoi {

    /**
     * Hanoi tower algorithm.
     *
     * @param numberOfPlates the number of plates.
     * @param from           origin
     * @param to             destination
     * @param tempTower      temp tower
     */
    public static void move(int numberOfPlates, String from, String to, String tempTower) {
        if (numberOfPlates != 0) {
            move(numberOfPlates - 1, from, tempTower, to);
            System.out.printf("move from %s to %s%n", from, to);
            move(numberOfPlates - 1, tempTower, to, from);
        }
    }
}
