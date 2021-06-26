package com.examplehub.basics.file;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateFolderTest {
    @Test
    void test() {
        String path = "example_folder";
        assertTrue(CreateFolder.createFolder(path));
    }
}