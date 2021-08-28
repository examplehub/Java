package com.examplehub.basics;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class EnumExampleTest {
    @Test
    void test() {
        WeekDay day = WeekDay.FRI;
        assertTrue(day == WeekDay.FRI);
        assertFalse(day == WeekDay.MON);
        assertEquals(WeekDay.FRI, day);

        WeekDay day1 = WeekDay.FRI;
        assertTrue(day == day1);
    }
    @Test
    void testName() {
        WeekDay day = WeekDay.FRI;
        assertEquals("FRI", day.name());
    }

    @Test
    void testOrdinal() {
        WeekDay day = WeekDay.FRI;
        assertEquals(5, day.ordinal());
    }


    @Test
    void testInit() {
        enum Color {
            RED(0, "red color"),
            BLACK(1, "black color"),
            WHITE(2, "white color");

            private final int colorValue;
            private final String colorDesc;

            Color(int colorValue, String colorDes) {
                this.colorValue = colorValue;
                this.colorDesc = colorDes;
            }

            @Override
            public String toString() {
                return this.colorDesc;
            }
        }
        assertEquals(0, Color.RED.ordinal());
        assertEquals(1, Color.BLACK.ordinal());
        assertEquals(2, Color.WHITE.ordinal());
        assertEquals("white color", Color.WHITE.toString());
    }

    @Test
    void testSwitch() {
        enum WeekDay {
            SUN, MON, TUE, WED, THU, FRI, SAT
        }
        WeekDay day = WeekDay.FRI;
        int result = -1;
        switch (day) {
            case SUN -> result = 7;
            case MON -> result = 1;
            case TUE -> result = 2;
            case WED -> result = 3;
            case THU -> result = 4;
            case FRI -> result = 5;
            case SAT -> result = 6;
            default -> result = 0;
        }
        assertEquals(5, result);
    }
}