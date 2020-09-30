package com.examplehub.maths;

public class AbsoluteValue {

    /**
     * Returns the absolute value of a {@code long} value.
     *
     * @param a the argument whose absolute value is to be determined.
     * @return the absolute value of the argument.
     */
    public static int absoluteValue(int a) {
        return a < 0 ? -a : a;
    }
}
