package com.examplehub.basics.file;

public class DeleteEmptyFolder {
  public static boolean delete(String folderPath) {
    return DeleteFile.deleteFile(folderPath);
  }
}
