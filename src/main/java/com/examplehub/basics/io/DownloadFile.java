package com.examplehub.basics.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DownloadFile {
    public static boolean solution1(String url, String to) throws MalformedURLException {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(url).openStream())) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(to));
            byte[] bytes = new byte[1024];
            int readBytes;
            while ((readBytes = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, readBytes);
                bufferedOutputStream.flush();
            }
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean solution2(String url, String to) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(url).openStream());
        Files.copy(bufferedInputStream, Paths.get(to), StandardCopyOption.REPLACE_EXISTING);
        bufferedInputStream.close();
        return true;
    }
}
