package com.examplehub.basics;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        /*
         * numbers[0] = 1
         * numbers[1] = 2
         * numbers[2] = 3
         * numbers[3] = 4
         * numbers[4] = 5
         */
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[4] = " + numbers[4]);

        /*
         * array index is out of bounds
         */
        //System.out.println(numbers[-1]);
        //System.out.println(numbers[5]);


        /*
         * numbers[0] = 1
         * numbers[1] = 2
         * numbers[2] = 3
         * numbers[3] = 4
         * numbers[4] = 5
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        /*
         * length of numbers = 5
         */
        System.out.println("length of numbers = " + numbers.length);

        /*
         * numbers[0] = 1
         * numbers[1] = 2
         * numbers[2] = 3
         * numbers[3] = 4
         * numbers[4] = 5
         */
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        /*
         * numbers[4] = 5
         * numbers[3] = 4
         * numbers[2] = 3
         * numbers[1] = 2
         * numbers[0] = 1
         */
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        /*
         * 12345
         */
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();

        /*
         * [1, 2, 3, 4, 5]
         */
        System.out.println(Arrays.toString(numbers));



        String[] company = {"Google", "Facebook", "Amazon", "Microsoft"};

        /*
         * company[0] = Google
         * company[1] = Facebook
         * company[2] = Amazon
         * company[3] = Microsoft
         */
        for (int i = 0; i < company.length; i++) {
            System.out.println("company[" + i + "] = " + company[i]);
        }

        /*
         * Google
         * Facebook
         * Amazon
         * Microsoft
         */
        for (String c : company) {
            System.out.println(c);
        }

        /*
         * [Google, Facebook, Amazon, Microsoft]
         */
        System.out.println(Arrays.toString(company));

        int[][] twoDimensionalNumbers = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9},
                {10, 11, 12, 13, 14, 15}
        };

        /*
         * total rows  = 4
         */
        System.out.println("total rows  = " + twoDimensionalNumbers.length);

        /*
         * row 0 length = 3
         * row 1 length = 4
         * row 2 length = 2
         * row 3 length = 6
         */
        for (int i = 0; i < twoDimensionalNumbers.length; i++) {
            System.out.println("row " + i + " length = " + twoDimensionalNumbers[i].length);
        }

        /*
         * row 0 = 1 2 3
         * row 1 = 4 5 6 7
         * row 2 = 8 9
         * row 3 = 10 11 12 13 14 15
         */
        for (int i = 0; i < twoDimensionalNumbers.length; i++) {
            System.out.print("row " + i + " = ");
            for (int j = 0; j < twoDimensionalNumbers[i].length; j++) {
                System.out.print(twoDimensionalNumbers[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * row 0 = [1, 2, 3]
         * row 1 = [4, 5, 6, 7]
         * row 2 = [8, 9]
         * row 3 = [10, 11, 12, 13, 14, 15]
         */
        for (int i = 0; i < twoDimensionalNumbers.length; i++) {
            System.out.println("row " + i + " = " + Arrays.toString(twoDimensionalNumbers[i]));
        }

        /*
         * 1 2 3
         * 4 5 6 7
         * 8 9
         * 10 11 12 13 14 15
         */
        for (int[] ints : twoDimensionalNumbers) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        /*
         * [1, 2, 3]
         * [4, 5, 6, 7]
         * [8, 9]
         * [10, 11, 12, 13, 14, 15]
         */
        for (int[] ints : twoDimensionalNumbers) {
            System.out.println(Arrays.toString(ints));
        }


        int length = 5;
        int[] array = new int[length];
        for (int i = 0; i < 5; i++) {
            array[i] = i + 1;
        }

        /*
         * [1, 2, 3, 4, 5]
         */
        System.out.println(Arrays.toString(array));

    }
}
