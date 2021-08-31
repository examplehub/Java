package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class RecursionPrintDirectoryTest {
    @Test
    void test1() {
        RecursionPrintDirectory.printFiles(new File("src/main/java"));
    }

}