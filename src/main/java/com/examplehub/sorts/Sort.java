package com.examplehub.sorts;

public interface Sort {
    void sort(int[] numbers);

    <T extends Comparable<T>> void sort(T[] array);
}
