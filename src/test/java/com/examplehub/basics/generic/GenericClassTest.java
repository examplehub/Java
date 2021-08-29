package com.examplehub.basics.generic;

import com.sun.jdi.Value;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericClassTest {
    @Test
    void testWriteGenericClass() {
        class MyBean<T> {
            T value;

            public T getValue() {
                return value;
            }

            public void setValue(T value) {
                this.value = value;
            }
        }
        MyBean<Integer> bean1 = new MyBean<>();
        bean1.setValue(123);
        assertEquals(123, bean1.getValue());
    }

}