package com.examplehub.maths;

public class AbsoluteMin {

    /**
     * Calculate absolute min value.
     *
     * @param numbers the numbers to be checked.
     * @return absolute min value.
     */
    public static int absoluteMin(int[] numbers) {
        int absMin = Math.abs(numbers[0]);
        int number = numbers[0];
        for (int temp : numbers) {
            if (Math.abs(temp) < absMin) {
                absMin = Math.abs(temp);
                number = temp;
            }
        }
        return number;
    }
}
