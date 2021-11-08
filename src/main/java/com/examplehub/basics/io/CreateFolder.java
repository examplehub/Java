package com.examplehub.basics.io;

import java.io.File;

public class CreateFolder {
  public static boolean createFolder(String path) {
    File file = new File(path);
    return file.mkdir();
  }
}
