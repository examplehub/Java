package com.examplehub.maths;

/**
 * https://en.wikipedia.org/wiki/Mode_(statistics)
 */
public class Mode {

    /**
     * Calculate mode value.
     *
     * @param numbers the numbers to be checked.
     * @return mode value.
     */
    public static int mode(int[] numbers) {
        int maxCount = 0;
        int number = 0;
        for (int k : numbers) {
            int count = 0;
            for (int i : numbers) {
                if (i == k) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                number = k;
            }
        }
        return number;
    }
}
