package com.examplehub.basics.io;

import com.examplehub.utils.StringUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {
    public static String read(String filename) throws IOException {
        try (Reader reader = new FileReader(filename)) {
            char[] chars = new char[1024];
            StringBuilder builder = new StringBuilder();
            int len;
            while ((len = reader.read(chars)) != -1) {
                builder.append(StringUtils.toString(chars, 0, len));
            }
            return builder.toString();
        }
    }
}
