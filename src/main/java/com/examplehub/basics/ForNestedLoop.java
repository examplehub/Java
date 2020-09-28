package com.examplehub.basics;

public class ForNestedLoop {
    public static void main(String[] args) {

        /*
         * ####
         * ####
         * ####
         */
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("#");
            }
            System.out.println("\n");
        }

        /*
         * Outer loop iteration 1
         * i = 1; j = 1
         * i = 1; j = 2
         * i = 1; j = 3
         * i = 1; j = 4
         * Outer loop iteration 2
         * i = 2; j = 1
         * i = 2; j = 2
         * i = 2; j = 3
         * i = 2; j = 4
         * Outer loop iteration 3
         * i = 3; j = 1
         * i = 3; j = 2
         * i = 3; j = 3
         * i = 3; j = 4
         */
        for (int i = 1; i <= 3; ++i) {

            System.out.println("Outer loop iteration " + i);

            for (int j = 1; j <= 4; ++j) {
                System.out.println("i = " + i + "; j = " + j);
            }
        }

        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + j);
            }
            System.out.println();
        }

        /*
         * 1*1=1
         * 1*2=2	2*2=4
         * 1*3=3	2*3=6	3*3=9
         * 1*4=4	2*4=8	3*4=12	4*4=16
         * 1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
         * 1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
         * 1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
         * 1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64
         * 1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81
         */
        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }

        /*
         * A
         * AB
         * ABC
         * ABCD
         * ABCDE
         */
        for (int i = 1; i <= 5; i++) {
            char letter = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(letter++);
            }
            System.out.println();
        }

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
