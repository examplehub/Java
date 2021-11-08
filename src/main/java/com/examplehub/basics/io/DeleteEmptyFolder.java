package com.examplehub.basics.io;

public class DeleteEmptyFolder {
  public static boolean delete(String folderPath) {
    return DeleteFile.deleteFile(folderPath);
  }
}
