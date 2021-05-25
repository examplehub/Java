package com.examplehub.maths;

public class ProductOfArray {

    /**
     * Return the product of numbers.
     * @param nums the numbers.
     * @return the product of numbers.
     */
    public static int product(int... nums) {
        int product = 1;
        for (int num : nums) {
            product *= num;
        }
        return product;
    }
}
