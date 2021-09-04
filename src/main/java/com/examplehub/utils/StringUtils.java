package com.examplehub.utils;

public class StringUtils {
  public static String toString(char[] chars, int offset, int len) {
    StringBuilder builder = new StringBuilder();
    for (int i = offset; i < offset + len; ++i) {
      builder.append(chars[i]);
    }
    return builder.toString();
  }

  public static String toString(byte[] bytes, int offset, int len) {
    StringBuilder builder = new StringBuilder();
    for (int i = offset; i < offset + len; ++i) {
      builder.append(bytes[i]);
    }
    return builder.toString();
  }
}
