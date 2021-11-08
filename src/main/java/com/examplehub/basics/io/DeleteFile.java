package com.examplehub.basics.io;

import java.io.File;

public class DeleteFile {
  public static boolean deleteFile(String path) {
    File file = new File(path);
    return file.delete();
  }
}
