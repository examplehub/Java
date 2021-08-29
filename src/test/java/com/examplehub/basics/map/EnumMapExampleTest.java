package com.examplehub.basics.map;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumMapExampleTest {
    @Test
    void testEnumMap() {
        enum Color {
            WHITE,
            BLACK,
            RED
        }
        Map<Color, String> map = new EnumMap<>(Color.class);
        map.put(Color.BLACK, "black color");
        map.put(Color.WHITE, "white color");
        map.put(Color.RED, "red color");
        assertEquals("{WHITE=white color, BLACK=black color, RED=red color}", map.toString());
        assertEquals("black color", map.get(Color.BLACK));
    }
}