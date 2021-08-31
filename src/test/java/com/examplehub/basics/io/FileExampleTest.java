package com.examplehub.basics.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileExampleTest {
    @Test
    void testPath() throws IOException {
        File file = new File("../example.txt");
        assertEquals("../example.txt", file.getPath());
        //assertEquals("/Users/cswiki/Workspace/Github/examplehub/Java/../example.txt", file.getAbsolutePath());
        //assertEquals("/Users/cswiki/Workspace/Github/examplehub/example.txt", file.getCanonicalPath());
    }

    @Test
    void testSeparator () {
        assertEquals("/", File.separator);
    }
}