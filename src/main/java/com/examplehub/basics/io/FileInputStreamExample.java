package com.examplehub.basics.io;

import java.io.*;

public class FileInputStreamExample {
  public static void readFile(String filename) throws IOException {
    InputStream inputStream = null;
    try {
      inputStream = new FileInputStream(filename);
      int read;
      while ((read = inputStream.read()) != -1) {
        System.out.print((char) read);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      assert inputStream != null;
      inputStream.close();
    }
  }

  public static void readFileWithTryRecourse(String filename) throws FileNotFoundException {
    try (InputStream inputStream = new FileInputStream(filename)) {
      int read;
      while ((read = inputStream.read()) != -1) {
        System.out.print((char) read);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void readFileWithBuffer(String filename) throws IOException {
    try (InputStream inputStream = new FileInputStream(filename)) {
      byte[] buffer = new byte[1024];
      int readBytes;
      while ((readBytes = inputStream.read(buffer)) != -1) {
        for (int i = 0; i < readBytes; i++) {
          System.out.print((char) buffer[i]);
        }
      }
    }
  }
}
