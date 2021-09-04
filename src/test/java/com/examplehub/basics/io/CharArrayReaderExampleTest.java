package com.examplehub.basics.io;

import com.examplehub.utils.StringUtils;
import org.junit.jupiter.api.Test;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

import static org.junit.jupiter.api.Assertions.*;

class CharArrayReaderExampleTest {
    @Test
    void test() throws IOException {
        try (Reader reader = new CharArrayReader("hello".toCharArray())){
            char[] chars = new char[1024];
            int len = reader.read(chars);
            assertEquals("hello", StringUtils.toString(chars, 0, len));
        }
    }
}