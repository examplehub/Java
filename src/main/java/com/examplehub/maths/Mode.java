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
        int modeNumber = 0;
        for (int number : numbers) {
            int count = 0;
            for (int temp : numbers) {
                if (temp == number) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                modeNumber = number;
            }
        }
        return modeNumber;
    }
}
