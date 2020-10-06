package com.examplehub.datastructures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @Test
    void testArrayList() {
        ArrayList<String> arrayList = new ArrayList<>(10);
        assertTrue(arrayList.isEmpty());
        assertEquals(0, arrayList.size());
        assertEquals("[]", arrayList.toString());

        try {
            arrayList.remove();
            fail(); /* this should will not happen */
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true); /* this should will happen */
        }

        for (int i = 1; i <= 5; ++i) {
            assertTrue(arrayList.add(i + ""));
        }
        assertEquals("[1, 2, 3, 4, 5]", arrayList.toString());

        arrayList.add(0, "0");
        arrayList.add(4, "444");
        assertEquals("[0, 1, 2, 3, 444, 4, 5]", arrayList.toString());

        assertEquals("444", arrayList.remove(4));
        assertEquals("0", arrayList.remove(0));
        assertEquals(5, arrayList.size());
        assertEquals("[1, 2, 3, 4, 5]", arrayList.toString());

        arrayList.clear();
        assertEquals(0, arrayList.size());
        assertTrue(arrayList.isEmpty());
    }

    @Test
    void testGrow() {
        ArrayList<String> arrayList = new ArrayList<>(5);
        for (int i = 1; i <= 7; i++) {
            arrayList.add(i + "");
        }
        assertEquals(7, arrayList.size());
        assertEquals("[1, 2, 3, 4, 5, 6, 7]", arrayList.toString());
    }
}