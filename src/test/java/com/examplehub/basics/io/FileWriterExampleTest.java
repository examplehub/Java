package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterExampleTest {
    @Test
    void testWrite() throws IOException {
        String fileName = "example.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write("hello");
        }
        assertEquals("hello", FileReaderExample.read(fileName));
        Files.deleteIfExists(Paths.get("example.txt"));
    }
}