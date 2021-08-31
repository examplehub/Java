package com.examplehub.basics.io;

import java.io.InputStream;

public class ReadClasspathFile {
    public static void main(String[] args) {
        InputStream inputStream = ReadClasspathFile.class.getResourceAsStream("default.properties");
        System.out.println(inputStream);
    }
}
